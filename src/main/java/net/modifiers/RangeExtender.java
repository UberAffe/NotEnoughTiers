package net.modifiers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RangeExtender extends INetModifier{

	//private static final String tierTag = "net_rangeextender_tier";
	//private static final String pointsTag = "net_rangeextender_points";
	public static RangeExtender instance = new RangeExtender();
	private static final String inUseTag = "net_rangeextender_inuse";
	
	private RangeExtender()
	{
		tierTag = "net_rangeextender_tier";
		pointsTag = "net_rangeextender_points";
	}
	
	@Override
	public boolean addPoints(int amount, ItemStack itemStack) 
	{
		if(itemStack != null && ItemArmor.class.isInstance(itemStack.getItem()) && ((ItemArmor)itemStack.getItem()).armorType == 1)
			return super.addPoints(amount, itemStack);
		return false;
	}

	public void doEffect(EntityPlayer player, ItemStack itemStack) {
		if(player != null && itemStack != null && ItemArmor.class.isInstance(itemStack.getItem()))
		{
			if(hasModifier(itemStack) && !inUse(itemStack))
			{
				
			}
		}
	}

	private boolean inUse(ItemStack itemStack) {
		return (itemStack != null && itemStack.hasTagCompound() && itemStack.getTagCompound().hasKey(inUseTag))? itemStack.getTagCompound().getBoolean(inUseTag) : false;
	}
}

/* 
     @Override
    public void extendRange(Entity entity, float amount) {
        super.extendRange(entity, amount);
        Minecraft mc = Minecraft.getMinecraft();
        EntityPlayer player = mc.thePlayer;
        if (entity == player) {
            if (Loader.isModLoaded("Botania")) {
                BotaniaIntegration.extendRange(entity, amount);
            } else {
                if (!(mc.playerController instanceof SteamcraftPlayerController)) {
                    GameType type = ReflectionHelper.getPrivateValue(PlayerControllerMP.class, mc.playerController, new String[]{"currentGameType", "field_78779_k", "k"});
                    NetHandlerPlayClient net = ReflectionHelper.getPrivateValue(PlayerControllerMP.class, mc.playerController, new String[]{"netClientHandler", "field_78774_b", "b"});
                    SteamcraftPlayerController controller = new SteamcraftPlayerController(mc, net);
                    controller.setGameType(type);
                    mc.playerController = controller;
                }

                ((SteamcraftPlayerController) mc.playerController).setReachDistanceExtension(((SteamcraftPlayerController) mc.playerController).getReachDistanceExtension() + amount);

            }
        }
    }
    
 @SideOnly(Side.CLIENT)
    public void updateRangeClient(LivingEvent.LivingUpdateEvent event) {
        EntityLivingBase entity = event.entityLiving;
        if (entity == Minecraft.getMinecraft().thePlayer) {
//			if (!worldStartUpdate && entity.getEquipmentInSlot(3) != null && entity.getEquipmentInSlot(3).getItem() instanceof ItemExosuitArmor) {
//				ItemExosuitArmor chest = (ItemExosuitArmor) entity.getEquipmentInSlot(3).getItem();
//				if (chest.hasUpgrade(entity.getEquipmentInSlot(3), SteamcraftItems.extendoFist)) {
//
//					Steamcraft.proxy.extendRange(entity,Config.extendedRange);
//				}
//			}
            worldStartUpdate = true;

            //Steamcraft.proxy.extendRange(entity,1.0F);
            boolean wearing = false;
            if (entity.getEquipmentInSlot(3) != null && entity.getEquipmentInSlot(3).getItem() instanceof ItemExosuitArmor) {
                ItemExosuitArmor chest = (ItemExosuitArmor) entity.getEquipmentInSlot(3).getItem();
                if (chest.hasUpgrade(entity.getEquipmentInSlot(3), SteamcraftItems.extendoFist)) {
                    Steamcraft.proxy.checkRange(entity);

                    wearing = true;
                }
            }
//			if (wearing && !lastWearing && entity.worldObj.isRemote) {
//				Steamcraft.proxy.extendRange(entity,Config.extendedRange);
//			}
            if (!wearing && lastWearing && entity.worldObj.isRemote) {
                Steamcraft.proxy.extendRange(entity, -Config.extendedRange);
            }
            lastWearing = wearing;
        }
    }
    */
