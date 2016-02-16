package net.consumables;

import net.minecraft.item.Item;
import net.utils.CommonRefs;

public class LightPart extends Item{

	public static final String name = "lightpart";
	
	public LightPart()
	{
		setUnlocalizedName(CommonRefs.MODID + "_" + name);
		setTextureName(CommonRefs.MODID + ":" + name);
	}
}
