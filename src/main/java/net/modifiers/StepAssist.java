package net.modifiers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class StepAssist extends INetModifier{

	public static final StepAssist instance = new StepAssist();
	
	private StepAssist()
	{
		tierTag = "net_stepassist_tier";
		pointsTag = "net_stepassist_points";
	}
	
	@Override
	public boolean addPoints(int amount, ItemStack itemStack) 
	{
		if(itemStack != null && ItemArmor.class.isInstance(itemStack.getItem()) && ((ItemArmor)itemStack.getItem()).armorType == 1)
			return super.addPoints(amount, itemStack);
		return false;
	}

	public void doEffect(EntityPlayer player, ItemStack itemStack) {
		// TODO Auto-generated method stub
		
	}
}
