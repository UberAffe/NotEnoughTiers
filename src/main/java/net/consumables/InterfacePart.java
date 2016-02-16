package net.consumables;

import net.minecraft.item.Item;
import net.utils.CommonRefs;

public class InterfacePart extends Item{

	public static final String name = "interfacepart";
	
	public InterfacePart()
	{
		setUnlocalizedName(CommonRefs.MODID + "_" + name);
		setTextureName(CommonRefs.MODID + ":" + name);
	}
}
