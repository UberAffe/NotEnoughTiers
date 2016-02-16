package net.modifiers;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public abstract class INetModifier {
	
	protected String tierTag;
	protected String pointsTag;
	
	public boolean addPoints(int amount, ItemStack itemStack)
	{
		if(!itemStack.hasTagCompound())
			itemStack.setTagCompound(new NBTTagCompound());
		NBTTagCompound nbt = itemStack.getTagCompound();
		int points = amount;
		int tier = 0;
		if(nbt.hasKey(pointsTag))
			points = nbt.getInteger(pointsTag) + amount;
		if(nbt.hasKey(tierTag))
			tier = nbt.getInteger(tierTag);
		int pointsToNextTier = (int) Math.pow(2, tier);
		while(points >= pointsToNextTier)
		{
			points -= pointsToNextTier;
			tier++;
			pointsToNextTier *= 2;
		}
		nbt.setInteger(tierTag, tier);
		nbt.setInteger(pointsTag, points);
		return true;
	}
	
	public int getTier(ItemStack itemStack) {
		return (itemStack != null && itemStack.hasTagCompound() && itemStack.getTagCompound().hasKey(tierTag)) ? itemStack.getTagCompound().getInteger(tierTag) : -1;
	}

	public int getPoints(ItemStack itemStack) {
		return (itemStack != null && itemStack.hasTagCompound() && itemStack.getTagCompound().hasKey(pointsTag)) ? itemStack.getTagCompound().getInteger(pointsTag) : -1;
	}

	public boolean hasModifier(ItemStack itemStack) {
		return (itemStack != null && itemStack.hasTagCompound() && itemStack.getTagCompound().hasKey(pointsTag));
	}
}
