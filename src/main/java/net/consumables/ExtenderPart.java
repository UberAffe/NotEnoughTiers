package net.consumables;

import net.minecraft.item.Item;
import net.utils.CommonRefs;

public class ExtenderPart extends Item{
	
	public static final String name = "extenderpart";
	
	public ExtenderPart()
	{
		setUnlocalizedName(CommonRefs.MODID + "_" + name);
		setTextureName(CommonRefs.MODID + ":" + name);
	}
}
