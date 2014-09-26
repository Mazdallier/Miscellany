package com.raizunne.miscellany.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

import com.raizunne.miscellany.MiscItems;
import com.raizunne.miscellany.Miscellany;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MiscellanyEventHandler {

	private static EntityPlayer player;

	@SubscribeEvent
	public void onLivingUpdateEntity(LivingUpdateEvent event){
		if(event.entity instanceof EntityPlayer){
			player = (EntityPlayer)event.entity;
		}
		//REDSTONIC JETBOOTS
		if(event.entity instanceof EntityPlayer){
			boolean equipped = false;
			ItemStack boots = player.inventory.armorInventory[0];
			if(boots!=null){
				if(boots.getItem() == MiscItems.redstonicBoots){	
					player.stepHeight = 1;
					player.capabilities.setPlayerWalkSpeed(0.15F);
					player.jumpMovementFactor = 0.05F;
					equipped=true;	
				}
			}
			if(equipped==true && boots.getItem()!=MiscItems.redstonicBoots){
				player.stepHeight=player.stepHeight-1F;
				player.capabilities.setPlayerWalkSpeed(player.capabilities.getWalkSpeed()-0.15F);
				player.jumpMovementFactor = player.jumpMovementFactor - 0.05F;
				equipped=false;
			}	
		}
		//FLIGHT POTION
		if(event.entity instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer)event.entity;
			boolean world = event.entity.worldObj.isRemote;
			boolean flying = false;
			if(player.isPotionActive(MiscItems.flightPotion.getId())){
				player.capabilities.allowFlying=true;
				flying=true;
				if(player.getActivePotionEffect(MiscItems.flightPotion).getDuration()==200){
					if(!world){
						player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.YELLOW + "Flight about to end! Floor it!"));
					}
				}
				if(player.getActivePotionEffect(MiscItems.flightPotion).getDuration()==1){
					if(!player.capabilities.isCreativeMode){
						player.capabilities.isFlying=false;
						player.capabilities.allowFlying=false;
						player.sendPlayerAbilities();
					}
				}
			}
		}
		
		//KNOWLEDGE POTION
		if(event.entity instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer)event.entity;
			boolean world = event.entity.worldObj.isRemote;
			boolean active;
			if(player.isPotionActive(MiscItems.knowledgePotion.getId())){
				active=true;
				player.addExperience(5);
				if(player.getActivePotionEffect(MiscItems.knowledgePotion).getDuration()==1){
					player.experienceLevel=0;
					player.removePotionEffect(MiscItems.knowledgePotion.getId());
				}
			}
		}
	}
	
	public void onPlayerLogin(EntityPlayer player){
		if(!player.getEntityData().getBoolean("hasPamphlet")){
			if(!player.worldObj.isRemote){
				player.inventory.addItemStackToInventory(new ItemStack(MiscItems.pamphlet));
				player.getEntityData().setBoolean("hasPamphlet", true);
				player.addChatComponentMessage(new ChatComponentText("Miscellany welcomes you to a new world of Minecraft"));
				player.addChatComponentMessage(new ChatComponentText("Have a nice stay."));
			}			
		}else{
			player.addChatComponentMessage(new ChatComponentText("Welcome Back!"));
		}
	}
}


