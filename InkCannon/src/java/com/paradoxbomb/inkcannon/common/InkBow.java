//main item for the mod

package com.paradoxbomb.inkcannon.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class InkBow extends Item
{
	public InkBow(String unlocalizedName)
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}

}
