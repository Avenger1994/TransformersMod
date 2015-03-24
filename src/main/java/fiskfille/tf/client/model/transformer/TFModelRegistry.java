package fiskfille.tf.client.model.transformer;

import java.util.HashMap;
import java.util.Map;

import javax.vecmath.Vector3f;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelRenderer;
import fiskfille.tf.TransformerManager;
import fiskfille.tf.client.model.transformer.ModelChildBase.Biped;
import fiskfille.tf.client.model.transformer.vehicle.ModelCloudtrapVehicle;
import fiskfille.tf.client.model.transformer.vehicle.ModelPurgeVehicle;
import fiskfille.tf.client.model.transformer.vehicle.ModelSkystrikeVehicle;
import fiskfille.tf.client.model.transformer.vehicle.ModelSubwooferVehicle;
import fiskfille.tf.client.model.transformer.vehicle.ModelVehicleBase;
import fiskfille.tf.client.model.transformer.vehicle.ModelVurpVehicle;
import fiskfille.tf.common.transformer.TransformerCloudtrap;
import fiskfille.tf.common.transformer.TransformerPurge;
import fiskfille.tf.common.transformer.TransformerSkystrike;
import fiskfille.tf.common.transformer.TransformerSubwoofer;
import fiskfille.tf.common.transformer.TransformerVurp;
import fiskfille.tf.common.transformer.base.Transformer;

public class TFModelRegistry
{
    private static Map<Transformer, TransformerModel> models = new HashMap<Transformer, TransformerModel>();
    
    public static void registerModel(Transformer transformer, Biped model, ModelVehicleBase vehicleModel, ModelRenderer arm, ModelRenderer backside, Vector3f itemOffset, Vector3f capeOffset)
    {
        TransformerModel transformerModel = new TransformerModel(model, vehicleModel, arm, backside);
        
        if(itemOffset != null)
            transformerModel.itemOffset = itemOffset;
        if(capeOffset != null)
            transformerModel.capeOffset = capeOffset;
        
        models.put(transformer, transformerModel);
    }
    
    public static TransformerModel getModel(Transformer transformer)
    {
        return models.get(transformer);
    }
    
    public static void registerModels()
    {
        ModelCloudtrap modelCloudtrap = new ModelCloudtrap();
        ModelPurge modelPurge = new ModelPurge();
        ModelSkystrike modelSkystrike = new ModelSkystrike();
        ModelSubwoofer modelSubwoofer = new ModelSubwoofer();
        ModelVurp modelVurp = new ModelVurp();
        
        TFModelRegistry.registerModel(TransformerManager.transformerCloudtrap, modelCloudtrap, new ModelCloudtrapVehicle(), null, null, null, null);
        TFModelRegistry.registerModel(TransformerManager.transformerPurge, modelPurge, new ModelPurgeVehicle(), modelPurge.lowerArm1, modelPurge.chest, new Vector3f(0.05F, 0F, 0.1F), new Vector3f(0F, -0.2F, 0.1F));
        TFModelRegistry.registerModel(TransformerManager.transformerSkystrike, modelSkystrike, new ModelSkystrikeVehicle(), modelSkystrike.lowerArmR1, modelSkystrike.chest1, new Vector3f(0F, 0.1F, 0.15F), new Vector3f(0F, 0.2F, 0.25F));
        TFModelRegistry.registerModel(TransformerManager.transformerSubwoofer, modelSubwoofer, new ModelSubwooferVehicle(), modelSubwoofer.lowerarmR1, modelSubwoofer.chestmain3, new Vector3f(0.05F, -0.1F, 0.05F), new Vector3f(0.18F, 0F, -0.01F));
        TFModelRegistry.registerModel(TransformerManager.transformerVurp, modelVurp, new ModelVurpVehicle(), modelVurp.lowerArmR, modelVurp.torsobase, new Vector3f(0.05F, -0.1F, 0.05F), new Vector3f(0F, -0.2F, 0.1F));
    }
}
