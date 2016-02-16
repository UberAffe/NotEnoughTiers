package net.modifiers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class DamageEnhancer extends INetModifier{
	
	public static final DamageEnhancer instance = new DamageEnhancer();
	
	private DamageEnhancer()
	{
		tierTag = "net_damageenhancer_tier";
		pointsTag = "net_damageenhancer_points";
	}
	
	@Override
	public boolean addPoints(int amount, ItemStack itemStack) 
	{
		if(itemStack != null && ItemSword.class.isInstance(itemStack.getItem()))
			return super.addPoints(amount, itemStack);
		return false;
	}

	public void doEffect(LivingHurtEvent event) {
		if(!event.source.isExplosion())
		{
			Entity source = event.source.getEntity();
			if(EntityPlayer.class.isInstance(source))
			{
				EntityPlayer player = (EntityPlayer)source;
				ItemStack held =player.getHeldItem();
				
				if(held != null && held.hasTagCompound())
				{
					NBTTagCompound tags = held.getTagCompound();
					if(tags.hasKey(tierTag))
					{
						event.ammount += tags.getInteger(tierTag);
					}
				}
			}
		}
	}

}
