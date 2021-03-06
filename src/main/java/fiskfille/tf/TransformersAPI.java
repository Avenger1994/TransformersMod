package fiskfille.tf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.item.Item;

import com.google.common.collect.Lists;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import fiskfille.tf.client.displayable.Displayable;
import fiskfille.tf.common.transformer.base.Transformer;

/**
 * @author gegy1000, FiskFille
 */
public class TransformersAPI
{
    private static List<Transformer> transformers = new ArrayList<Transformer>();
    private static Map<Item, Displayable> displayables = new HashMap<Item, Displayable>();
    private static List<Item> displayablesServer = Lists.newArrayList();

    /**
     * Used to register the specified Transformer.
     * 
     * @param transformer The Transformer registered.
     */
    public static void registerTransformer(Transformer transformer)
    {
        if (!transformers.contains(transformer))
        {
            transformers.add(transformer);
        }
        else
        {
            System.err.println("[TransformersAPI] " + transformer.getName() + " has already been registered!");
        }
    }

    /**
     * @returns a list of registered Transformers.
     */
    public static List<Transformer> getTransformers()
    {
        return transformers;
    }
    
    /**
     * @returns a list of default TransformersMod characters.
     */
    public static List<Transformer> getDefaultTransformers()
    {
    	List<Transformer> list = Lists.newArrayList();
    	list.add(TransformerManager.transformerSkystrike);
    	list.add(TransformerManager.transformerPurge);
    	list.add(TransformerManager.transformerVurp);
    	list.add(TransformerManager.transformerSubwoofer);
    	list.add(TransformerManager.transformerCloudtrap);
        return list;
    }

    /**
     * Gets an instance of a Transformer by name.
     * 
     * @param name The name of the Transformer
     * @return the Transformer with the specified name, or null if there is none.
     */
    public static Transformer getTransformerByName(String name)
    {
        for (Transformer transformer : transformers)
        {
            if (transformer.getName().equals(name))
            {
                return transformer;
            }
        }

        return null;
    }

    /**
     * Used to register the specified Displayable.
     * 
     * @param item The item to be assigned to.
     * @param displayable The Displayable registered.
     */
    public static void registerDisplayable(Item item, Class<? extends Displayable> displayableClass)
    {
        Side side = FMLCommonHandler.instance().getSide();
        
        if (side == Side.CLIENT)
        {
            try
            {
                Displayable displayable = displayableClass.newInstance();
                displayables.put(item, displayable);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            displayablesServer.add(item);
        }
    }

    /**
     * @returns a list of registered Displayables.
     */
    public static Map<Item, Displayable> getDisplayables()
    {
        return displayables;
    }

    /**
     * @param item The item to get the Displayable for.
     * @return the Displayable for the specific item.
     */
    public static Displayable getDisplayableFor(Item item)
    {
        for (Map.Entry<Item, Displayable> e : displayables.entrySet())
        {
            if (e.getKey() == item)
            {
                return e.getValue();
            }
        }

        return null;
    }
    
    /**
     * @param item The item to query
     * @return if the specific item has a Displayable on the client side.
     */
    public static boolean hasDisplayable(Item item)
    {
        Side side = FMLCommonHandler.instance().getSide();
        
        if (side == Side.CLIENT)
        {
            return getDisplayableFor(item) != null;
        }
        else
        {
            return displayablesServer.contains(item);
        }
    }
}
