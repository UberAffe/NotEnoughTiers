package net.consumables;

import net.minecraft.item.Item;
import net.utils.CommonRefs;

public class FurnacePart extends Item{
	
	public static final String name = "furnacepart";
	
	public FurnacePart()
	{
		setUnlocalizedName(CommonRefs.MODID + "_" + name);
		setTextureName(CommonRefs.MODID + ":" + name);
	}

}
