// Date: 7/25/2014 2:47:35 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.raizunne.miscellany.block.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class modelAdvReactBrewerOLD extends ModelBase
{
  //fields
    ModelRenderer Base_Top;
    ModelRenderer Base_Bottom;
    ModelRenderer Column;
    ModelRenderer Bar_1;
    ModelRenderer Bar_2;
    ModelRenderer Bar_3;
    ModelRenderer Notch_1;
    ModelRenderer Notch_2;
    ModelRenderer Notch_3;
    ModelRenderer Notch_4;
  
  public modelAdvReactBrewerOLD()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Base_Top = new ModelRenderer(this, 0, 15);
      Base_Top.addBox(-4F, 15F, -4F, 8, 1, 8);
      Base_Top.setRotationPoint(0F, 0F, 0F);
      Base_Top.setTextureSize(128, 64);
      Base_Top.mirror = true;
      setRotation(Base_Top, 0F, 0F, 0F);
      Base_Bottom = new ModelRenderer(this, 0, 0);
      Base_Bottom.addBox(-6F, 16F, -6F, 12, 1, 12);
      Base_Bottom.setRotationPoint(0F, 0F, 0F);
      Base_Bottom.setTextureSize(128, 64);
      Base_Bottom.mirror = true;
      setRotation(Base_Bottom, 0F, 0F, 0F);
      Column = new ModelRenderer(this, 0, 26);
      Column.addBox(0F, 0F, 0F, 4, 6, 4);
      Column.setRotationPoint(-2F, 9F, -2F);
      Column.setTextureSize(128, 64);
      Column.mirror = true;
      setRotation(Column, 0F, 0F, 0F);
      Bar_1 = new ModelRenderer(this, 50, 11);
      Bar_1.addBox(-6F, 0F, 0F, 12, 1, 2);
      Bar_1.setRotationPoint(0F, 8F, -1F);
      Bar_1.setTextureSize(128, 64);
      Bar_1.mirror = true;
      setRotation(Bar_1, 0F, 0F, 0F);
      Bar_2 = new ModelRenderer(this, 50, 4);
      Bar_2.addBox(0F, 0F, 0F, 2, 1, 5);
      Bar_2.setRotationPoint(-1F, 8F, -6F);
      Bar_2.setTextureSize(128, 64);
      Bar_2.mirror = true;
      setRotation(Bar_2, 0F, 0F, 0F);
      Bar_3 = new ModelRenderer(this, 50, 4);
      Bar_3.addBox(0F, 0F, 0F, 2, 1, 5);
      Bar_3.setRotationPoint(-1F, 8F, 1F);
      Bar_3.setTextureSize(128, 64);
      Bar_3.mirror = true;
      setRotation(Bar_3, 0F, 0F, 0F);
      Notch_1 = new ModelRenderer(this, 50, 0);
      Notch_1.addBox(0F, 0F, 0F, 1, 1, 2);
      Notch_1.setRotationPoint(-6F, 7F, -1F);
      Notch_1.setTextureSize(128, 64);
      Notch_1.mirror = true;
      setRotation(Notch_1, 0F, 0F, 0F);
      Notch_2 = new ModelRenderer(this, 50, 0);
      Notch_2.addBox(0F, 0F, 0F, 1, 1, 2);
      Notch_2.setRotationPoint(1F, 7F, 5F);
      Notch_2.setTextureSize(128, 64);
      Notch_2.mirror = true;
      setRotation(Notch_2, 0F, -1.570796F, 0F);
      Notch_3 = new ModelRenderer(this, 50, 0);
      Notch_3.addBox(0F, 0F, 0F, 1, 1, 2);
      Notch_3.setRotationPoint(5F, 7F, -1F);
      Notch_3.setTextureSize(128, 64);
      Notch_3.mirror = true;
      setRotation(Notch_3, 0F, 0F, 0F);
      Notch_4 = new ModelRenderer(this, 50, 0);
      Notch_4.addBox(0F, 0F, 0F, 1, 1, 2);
      Notch_4.setRotationPoint(1F, 7F, -6F);
      Notch_4.setTextureSize(128, 64);
      Notch_4.mirror = true;
      setRotation(Notch_4, 0F, -1.570796F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base_Top.render(f5);
    Base_Bottom.render(f5);
    Column.render(f5);
    Bar_1.render(f5);
    Bar_2.render(f5);
    Bar_3.render(f5);
    Notch_1.render(f5);
    Notch_2.render(f5);
    Notch_3.render(f5);
    Notch_4.render(f5);
  }
  
  public void renderModel(float f){
	  Base_Top.render(f);
	  Base_Bottom.render(f);
	  Column.render(f);
	  Bar_1.render(f);
	  Bar_2.render(f);
	  Bar_3.render(f);
	  Notch_1.render(f);
	  Notch_2.render(f);
	  Notch_3.render(f);
	  Notch_4.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}