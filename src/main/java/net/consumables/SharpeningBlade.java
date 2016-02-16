package net.consumables;

import net.minecraft.item.Item;
import net.utils.CommonRefs;

public class SharpeningBlade extends Item{
	
	public static final String name = "sharpeningblade";
	
	public SharpeningBlade()
	{
		setUnlocalizedName(CommonRefs.MODID + "_" + name);
		setTextureName(CommonRefs.MODID + ":" + name);
	}

}
