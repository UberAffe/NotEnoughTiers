package net;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.utils.CommonProxy;
import net.utils.CommonRefs;

@Mod(name = CommonRefs.NAME, modid = CommonRefs.MODID)
public class NotEnoughItems {
	
	@Instance(CommonRefs.MODID)
	public static NotEnoughItems instance;
	
	@SidedProxy(serverSide = CommonRefs.SERVERPROXY, clientSide = CommonRefs.CLIENTPROXY)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit();
	}
}
