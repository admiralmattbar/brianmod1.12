/*
 * This class contains the interface for how the proxy works so you can reference it for the client side and server side.
 */

package org.educraft.brianface.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
abstract public class CommonProxy
{
	public void registerItemRenderer(Item item, int meta, String id){}
	public void registerVariantRenderer(Item item, int meta, String filename, String id){}
}
