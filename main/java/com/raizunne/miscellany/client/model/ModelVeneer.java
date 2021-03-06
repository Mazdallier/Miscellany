package com.raizunne.miscellany.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelVeneer - 
 * Created using Tabula 4.0.2
 */
public class ModelVeneer extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape6;
    public ModelRenderer shape7;

    public ModelVeneer() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.shape4 = new ModelRenderer(this, 0, 22);
        this.shape4.setRotationPoint(-6.0F, 16.0F, 0.0F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1);
        this.shape2 = new ModelRenderer(this, 0, 16);
        this.shape2.setRotationPoint(-6.0F, 14.0F, 0.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1);
        this.shape5 = new ModelRenderer(this, 14, 16);
        this.shape5.setRotationPoint(2.0F, 14.0F, 0.0F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1);
        this.shape3 = new ModelRenderer(this, 0, 19);
        this.shape3.setRotationPoint(-6.0F, 15.0F, 0.0F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1);
        this.shape7 = new ModelRenderer(this, 14, 22);
        this.shape7.setRotationPoint(4.0F, 16.0F, 0.0F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 12, 14, 1);
        this.shape6 = new ModelRenderer(this, 14, 19);
        this.shape6.setRotationPoint(3.0F, 15.0F, 0.0F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape4.render(f5);
        this.shape2.render(f5);
        this.shape5.render(f5);
        this.shape3.render(f5);
        this.shape7.render(f5);
        this.shape1.render(f5);
        this.shape6.render(f5);
    }
    
    public void renderModel(float f5){
    	this.shape4.render(f5);
        this.shape2.render(f5);
        this.shape5.render(f5);
        this.shape3.render(f5);
        this.shape7.render(f5);
        this.shape1.render(f5);
        this.shape6.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
