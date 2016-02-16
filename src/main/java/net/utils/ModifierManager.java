package net.utils;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.modifiers.DamageEnhancer;
import net.modifiers.RangeExtender;
import net.modifiers.StepAssist;

public class ModifierManager {

	@SubscribeEvent
	public void LivingHurtEvent(LivingHurtEvent event)
	{
		DamageEnhancer.instance.doEffect(event);
	}
	
	//@SubscribeEvent
	public void PlayerTickEvent(PlayerTickEvent event)
	{
		EntityPlayer player = event.player;
		ItemStack chestStack = player.getCurrentArmor(1);
		ItemStack bootStack = player.getCurrentArmor(3);
		RangeExtender.instance.doEffect(player, chestStack);
		StepAssist.instance.doEffect(player, bootStack);
	}
}
