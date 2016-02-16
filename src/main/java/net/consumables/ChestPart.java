package net.consumables;

import net.minecraft.item.Item;
import net.utils.CommonRefs;

public class ChestPart extends Item{
	
	public static final String name = "";
	
	public ChestPart()
	{
		setUnlocalizedName(CommonRefs.MODID + "_" + name);
		setTextureName(CommonRefs.MODID + ":" + name);
	}

}
