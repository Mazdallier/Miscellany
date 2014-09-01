package com.raizunne.miscellany.block.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.raizunne.miscellany.Miscellany;
import com.raizunne.miscellany.block.model.modelAdvReactBrewer;
import com.raizunne.miscellany.block.model.modelAdvReactBrewerOLD;
import com.raizunne.miscellany.block.model.modelPresent;
import com.raizunne.miscellany.tileentities.TileEntityAdvReactBrewer;

public class RenderAdvReactBrewer extends TileEntitySpecialRenderer{

	private static final ResourceLocation texture = new ResourceLocation(Miscellany.MODID + ":" + "textures/model/AdvReactBrewer.png");
	
	private modelAdvReactBrewer model;
	
	public RenderAdvReactBrewer() {
		this.model = new modelAdvReactBrewer();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.88F, (float)z + 0.5F);
			GL11.glScalef(1.25F, 1.25F, 1.25F);
			GL11.glRotatef(180, 0F, 0F, 1F);
			this.bindTexture(texture);
			GL11.glPushMatrix();
				this.model.renderModel(0.0625F);
			GL11.glPopMatrix();
		GL11.glPopMatrix();
		
		TileEntityAdvReactBrewer brewer = (TileEntityAdvReactBrewer)tileentity;
		ItemStack slot1 = brewer.getStackInSlot(0);
		ItemStack slot2 = brewer.getStackInSlot(1);
		ItemStack slot3 = brewer.getStackInSlot(2);
		ItemStack slot4 = brewer.getStackInSlot(3);
		
		for(int i=0; i<brewer.getSizeInventory(); i++){
			
			if(slot1!=null){
				GL11.glPushMatrix();
				EntityItem entItem = new EntityItem(Minecraft.getMinecraft().thePlayer.getEntityWorld(), 0D, 0D, 0D, slot1);
				entItem.hoverStart = 0.0F;
				RenderItem.renderInFrame = true;
				GL11.glTranslatef((float)x + 0.5F, (float)y + 0.8F, (float)z + 0.08F);
				GL11.glRotatef(45, 0, -45, 0);
				GL11.glScalef(0.7F, 0.7F, 0.7F);
				RenderManager.instance.renderEntityWithPosYaw(entItem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
				RenderItem.renderInFrame = true;
				GL11.glPopMatrix();
			}
			if(slot2!=null){
				GL11.glPushMatrix();
				EntityItem entItem = new EntityItem(Minecraft.getMinecraft().thePlayer.getEntityWorld(), 0D, 0D, 0D, slot2);
				entItem.hoverStart = 0.0F;
				RenderItem.renderInFrame = true;
				GL11.glTranslatef((float)x + 0.9F, (float)y + 0.8F, (float)z + 0.5F);
				GL11.glScalef(0.7F, 0.7F, 0.7F);
				GL11.glRotatef(90, 1, 90, 1);
				RenderManager.instance.renderEntityWithPosYaw(entItem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
				RenderItem.renderInFrame = true;
				GL11.glPopMatrix();
			}
			if(slot3!=null){
				GL11.glPushMatrix();
				EntityItem entItem = new EntityItem(Minecraft.getMinecraft().thePlayer.getEntityWorld(), 0D, 0D, 0D, slot3);
				entItem.hoverStart = 0.0F;
				RenderItem.renderInFrame = true;
				GL11.glTranslatef((float)x + 0.5F, (float)y + 0.8F, (float)z + 0.9F);
				GL11.glScalef(0.7F, 0.7F, 0.7F);
				GL11.glRotatef(45, 0, 90, 0);
				RenderManager.instance.renderEntityWithPosYaw(entItem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
				RenderItem.renderInFrame = true;
				GL11.glPopMatrix();
			}
			if(slot4!=null){
				GL11.glPushMatrix();
				EntityItem entItem = new EntityItem(Minecraft.getMinecraft().thePlayer.getEntityWorld(), 0D, 0D, 0D, slot4);
				entItem.hoverStart = 0.0F;
				RenderItem.renderInFrame = true;
				GL11.glTranslatef((float)x + 0.5F, (float)y + 1F, (float)z + 0.5F);
				GL11.glScalef(0.8F, 0.8F, 0.8F);
				GL11.glRotatef(90, 1, 90, 1);
				RenderManager.instance.renderEntityWithPosYaw(entItem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
				RenderItem.renderInFrame = true;
				GL11.glPopMatrix();
			}
			
		}
	}
	
	
}
