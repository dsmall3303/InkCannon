//class to register items for registration with the renderer

package com.paradoxbomb.inkcannon.client.render;

import com.paradoxbomb.inkcannon.LogHelper;
import com.paradoxbomb.inkcannon.Main;
import com.paradoxbomb.inkcannon.common.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister 
{
	public static String modid = Main.MODID;
	public static void registerItemRenderer()
	{
		LogHelper.debug("Registering items for mod Ink Cannon...");
		reg(ModItems.testItem, 0);
		reg(ModItems.inkBow, 0);
		LogHelper.debug("Item registration complete");
	}
	
	public static void reg(Item item, int meta)		
	{
		//method for registering a model file for an item; takes three parameters:
		//�item for registration
		//�metadata for the render
		//�location of the model file, which itself takes two parameters:
		//	�item identifier in the format modname:unlocalizedName
		//	�String "inventory"
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
