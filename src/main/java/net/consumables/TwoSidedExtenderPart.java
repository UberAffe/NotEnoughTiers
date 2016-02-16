package net.consumables;

import net.minecraft.item.Item;
import net.utils.CommonRefs;

public class TwoSidedExtenderPart extends Item{
	
	public static final String name = "twosidedextenderpart";
	
	public TwoSidedExtenderPart()
	{
		setUnlocalizedName(CommonRefs.MODID + "_" + name);
		setTextureName(CommonRefs.MODID + ":" + name);
	}
}
