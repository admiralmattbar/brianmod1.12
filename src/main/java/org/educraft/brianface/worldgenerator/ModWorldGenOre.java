package org.educraft.brianface.worldgenerator;

import java.util.Random;

import net.minecraft.world.gen.IChunkGenerator;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import org.educraft.brianface.blocks.ModOre;
import org.educraft.brianface.init.BlockInit;
import org.educraft.brianface.util.EnumHandler;

public class ModWorldGenOre implements IWorldGenerator {
	private WorldGenerator over_brain, over_boyan, over_boob, brian_ore;
	
	public ModWorldGenOre(){
		brian_ore = new WorldGenMinable(BlockInit.BRIAN_ORE.getDefaultState(), 12); //Generates material_ore in batches of no more than 12.
		over_brain = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(ModOre.VARIANT, EnumHandler.EnumType.BRAIN), 7);
		over_boyan = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(ModOre.VARIANT, EnumHandler.EnumType.BOYAN), 7);
		over_boob = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(ModOre.VARIANT, EnumHandler.EnumType.BOOB), 7);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		//int blockX = chunkX * 16; //To be used in below function brianBushGenerator
		//int blockZ = chunkZ * 16;
		
		switch (world.provider.getDimension()) {
		case 0: //Overworld
			modOreGenerator(this.brian_ore, world, random, chunkX, chunkZ, 100, 0, 128);
			modOreGenerator(this.over_brain, world, random, chunkX, chunkZ, 50, 10, 100);
			modOreGenerator(this.over_boyan, world, random, chunkX, chunkZ, 50, 10, 100);
			modOreGenerator(this.over_boob, world, random, chunkX, chunkZ, 50, 10, 100);
			break;
		case -1: //Nether
			
			break;
		case 1: //End
			
			break;
		}
	}
	
	private void modOreGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}

	/*private void brianBushGenerator(World world, Random rand, int blockX, int blockZ){
		WorldGenerator gen_brian_bush = new WorldGenBrianBushes();
		BiomeType biome = world.getBiomeGenForCoords(gen_brian_bush);  //figuring this out
	}
	*/
	public static int getGroundFromAbove(World world, int x, int z){
		int y = 255;
		boolean foundGround = false;
		while(!foundGround && y-- >=0){
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = blockAt == Blocks.DIRT || blockAt == Blocks.GRASS;
		}
		return y;
	}

}