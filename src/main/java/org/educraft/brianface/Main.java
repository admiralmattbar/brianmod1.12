/*
 * This is the main class for the mod. All of the things you make have to be initialized and registered here. This also
 * helps you with your proxy settings so that you do not crash the game when you run a server with this mod.
 */

package org.educraft.brianface;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import org.educraft.brianface.proxy.CommonProxy;
import org.educraft.brianface.recipes.ModRecipes;
import org.educraft.brianface.util.Reference;
import org.educraft.brianface.util.RegisterHandler;
import org.educraft.brianface.worldgenerator.ModWorldGenOre;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Mod.Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RegisterHandler.preInitRegistries();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) 
	{
		ModRecipes.init();
		RegisterHandler.initRegistires();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{

	}

}