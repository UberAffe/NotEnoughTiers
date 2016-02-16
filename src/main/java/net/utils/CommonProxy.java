package net.utils;

import cpw.mods.fml.common.registry.GameRegistry;
import net.consumables.ChestPart;
import net.consumables.Consumables;
import net.consumables.ExtenderPart;
import net.consumables.FurnacePart;
import net.consumables.InterfacePart;
import net.consumables.LightPart;
import net.consumables.SharpeningBlade;
import net.consumables.TwoSidedExtenderPart;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CommonProxy {

	public void preInit()
	{
		GameRegistry.registerItem(Consumables.chestpart, ChestPart.name);
		GameRegistry.registerItem(Consumables.extenderpart, ExtenderPart.name);
		GameRegistry.registerItem(Consumables.furnacepart, FurnacePart.name);
		GameRegistry.registerItem(Consumables.interfacepart, InterfacePart.name);
		GameRegistry.registerItem(Consumables.lightpart, LightPart.name);
		GameRegistry.registerItem(Consumables.twosidedextenderpart, TwoSidedExtenderPart.name);
		GameRegistry.registerItem(Consumables.sharpeningblade, SharpeningBlade.name);
	}
	
	public void init()
	{
		GameRegistry.addRecipe(new ItemStack(Consumables.chestpart), "XXX","XCX","XXX",'X', Blocks.log, 'C', Blocks.chest);
		GameRegistry.addRecipe(new ItemStack(Consumables.extenderpart), "I I"," D ","I I",'I',Items.iron_ingot,'D',Items.diamond);
		GameRegistry.addRecipe(new ItemStack(Consumables.furnacepart), "CIC","IFI","CIC",'C',Blocks.cobblestone,'I',Blocks.iron_bars,'F',Blocks.furnace);
		GameRegistry.addRecipe(new ItemStack(Consumables.interfacepart), "PIP","ICI","PIP",'P',Blocks.planks,'I',Blocks.iron_bars,'C',Blocks.crafting_table);
		GameRegistry.addRecipe(new ItemStack(Consumables.lightpart), " T ","TPT"," T ",'T', Blocks.torch,'P',Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(Consumables.twosidedextenderpart), "SS","EE",'S',Items.slime_ball,'E',Consumables.extenderpart);
		GameRegistry.addRecipe(new ItemStack(Consumables.twosidedextenderpart), "S S","E E",'S',Items.slime_ball,'E',Consumables.extenderpart);
		GameRegistry.addRecipe(new ItemStack(Consumables.sharpeningblade), "F F","DFD"," D ",'F',Items.flint,'D',Items.diamond);
	}
	
	public void postInit(){}
}
