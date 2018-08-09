package org.educraft.brianface.util;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.List;

public class BiomeHandler {

    //Creates a list of all Biomes in the game. The comments at the bottom shows the order.
    public static List<Biome> BIOME_LIST = ForgeRegistries.BIOMES.getValues();

    public static Biome[] BIOME_ARRAY = BIOME_LIST.toArray(new Biome[BIOME_LIST.size()]);

    public static Biome[] OVERWORLD_ARRAY;


    public static List<Biome> GREEN_LIST;
    public static List<Biome> OVERWORLD_LIST;
    public static List<Biome> NETHER_LIST;
    public static List<Biome> END_LIST;

    public static Biome[] getAllBiomes(){
        return BIOME_ARRAY;
    }

    public static Biome[] getOverworldBiomes(){
        for(int i=0; i < BIOME_LIST.size(); i++){
            if(i != 8 && i != 9){
                OVERWORLD_LIST.add(BIOME_ARRAY[i]);
            }
        }
        return OVERWORLD_LIST.toArray(new Biome[OVERWORLD_LIST.size()]);
    }

/*
0 net.minecraft.world.biome.BiomeOcean@77e6053
1 net.minecraft.world.biome.BiomePlains@2a21cbe7
2 net.minecraft.world.biome.BiomeDesert@4fbc516f
3 net.minecraft.world.biome.BiomeHills@7bdb4d69
4 net.minecraft.world.biome.BiomeForest@48c3a0ef
5 net.minecraft.world.biome.BiomeTaiga@e2f6e13
6 net.minecraft.world.biome.BiomeSwamp@48f4264e
7 net.minecraft.world.biome.BiomeRiver@533d7c61
8 net.minecraft.world.biome.BiomeHell@6949cead
9 net.minecraft.world.biome.BiomeEnd@361f1647
10 net.minecraft.world.biome.BiomeOcean@51172948
11 net.minecraft.world.biome.BiomeRiver@6f2a3b37
12 net.minecraft.world.biome.BiomeSnow@2d3111a1
13 net.minecraft.world.biome.BiomeSnow@6f2864c3
14 net.minecraft.world.biome.BiomeMushroomIsland@1f70bce5
15 net.minecraft.world.biome.BiomeMushroomIsland@3ae91ab3
16 net.minecraft.world.biome.BiomeBeach@3fc5d397
17 net.minecraft.world.biome.BiomeDesert@25c8c71e
18 net.minecraft.world.biome.BiomeForest@57867d96
19 net.minecraft.world.biome.BiomeTaiga@1a7a21d0
20 net.minecraft.world.biome.BiomeHills@bb21063
21 net.minecraft.world.biome.BiomeJungle@3a4cb483
22 net.minecraft.world.biome.BiomeJungle@4d770bcd
23 net.minecraft.world.biome.BiomeJungle@fe156f4
24 net.minecraft.world.biome.BiomeOcean@79b4cff
25 net.minecraft.world.biome.BiomeStoneBeach@2d705998
26 net.minecraft.world.biome.BiomeBeach@28a3fc34
27 net.minecraft.world.biome.BiomeForest@7582a16b
28 net.minecraft.world.biome.BiomeForest@4dd752e8
29 net.minecraft.world.biome.BiomeForest@62c46e53
30 net.minecraft.world.biome.BiomeTaiga@55317c63
31 net.minecraft.world.biome.BiomeTaiga@35d81657
32 net.minecraft.world.biome.BiomeTaiga@42ef5216
33 net.minecraft.world.biome.BiomeTaiga@3180aee
34 net.minecraft.world.biome.BiomeHills@5d94ac8a
35 net.minecraft.world.biome.BiomeSavanna@104cfb24
36 net.minecraft.world.biome.BiomeSavanna@5340ccb9
37 net.minecraft.world.biome.BiomeMesa@174cb0d8
38 net.minecraft.world.biome.BiomeMesa@3ac406d4
39 net.minecraft.world.biome.BiomeMesa@72646d16
40 net.minecraft.world.biome.BiomeVoid@2f39b534
41 net.minecraft.world.biome.BiomePlains@60fbc34d
42 net.minecraft.world.biome.BiomeDesert@7736c41e
43 net.minecraft.world.biome.BiomeHills@5f911d24
44 net.minecraft.world.biome.BiomeForest@3de383f7
45 net.minecraft.world.biome.BiomeTaiga@33ccead
46 net.minecraft.world.biome.BiomeSwamp@42ebece0
47 net.minecraft.world.biome.BiomeSnow@15c4b1a4
48 net.minecraft.world.biome.BiomeJungle@341964d0
49 net.minecraft.world.biome.BiomeJungle@51b59d58
50 net.minecraft.world.biome.BiomeForestMutated@7c5d36c3
51 net.minecraft.world.biome.BiomeForestMutated@31de27c
52 net.minecraft.world.biome.BiomeForest@7ebfe01a
53 net.minecraft.world.biome.BiomeTaiga@154b0748
54 net.minecraft.world.biome.BiomeTaiga@35c00c
55 net.minecraft.world.biome.BiomeTaiga@6cd7dc74
56 net.minecraft.world.biome.BiomeHills@6d695ec4
57 net.minecraft.world.biome.BiomeSavannaMutated@e4ef4c0
58 net.minecraft.world.biome.BiomeSavannaMutated@5ca8bd01
59 net.minecraft.world.biome.BiomeMesa@7b10472e
60 net.minecraft.world.biome.BiomeMesa@70e5737f
61 net.minecraft.world.biome.BiomeMesa@9746157
 */





}
