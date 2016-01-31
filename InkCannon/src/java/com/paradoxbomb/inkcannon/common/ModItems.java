/*
 * file to hold the common collection of items implemented in the mod
 */

package com.paradoxbomb.inkcannon.common;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems 
{
	public static Item testItem;
	public static Item inkBow;

	public static void createItems()
	{
		//registerItem takes two parameters: a new item that is passed the unlocalized name of the item, and the registry name
		//of the item. By convention, the regsitry name is the same as the unlocalized name.
		GameRegistry.registerItem(testItem = new TestItem("testItem"), "testItem");	
		GameRegistry.registerItem(inkBow = new InkBow("inkBow"), "inkBow");	
	}
}