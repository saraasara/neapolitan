package com.teamabnormals.neapolitan.core.other;

import com.teamabnormals.neapolitan.core.Neapolitan;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Neapolitan.MOD_ID)
public class NeapolitanGeneration {

//	@SubscribeEvent
//	public static void onBiomeLoad(BiomeLoadingEvent event) {
//		ResourceLocation name = event.getName();
//		Biome.BiomeCategory category = event.getCategory();
//
//		if (name == null) return;
//
//		ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, name);
//
//		if (category.equals(Biome.BiomeCategory.PLAINS) && NeapolitanConfig.COMMON.strawberryBushGenerationChance.get() > 0)
//			generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NeapolitanPlacedFeatures.PATCH_STRAWBERRY_BUSH);
//
//		if (category.equals(Biome.BiomeCategory.FOREST) && NeapolitanConfig.COMMON.adzukiSproutsGenerationChance.get() > 0)
//			generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NeapolitanPlacedFeatures.PATCH_ADZUKI_SPROUTS);
//
//		if (category.equals(Biome.BiomeCategory.SAVANNA) && NeapolitanConfig.COMMON.vanillaVineGenerationChance.get() > 0)
//			generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NeapolitanPlacedFeatures.PATCH_VANILLA_VINE);
//
//		if (category.equals(Biome.BiomeCategory.EXTREME_HILLS) && NeapolitanConfig.COMMON.mintPondGenerationChance.get() > 0)
//			generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NeapolitanPlacedFeatures.MINT_POND);
//
//		if (event.getClimate().precipitation.equals(Precipitation.RAIN)) {
//			if (category.equals(Biome.BiomeCategory.BEACH) && NeapolitanConfig.COMMON.bananaPlantBeachGeneration.get())
//				generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NeapolitanPlacedFeatures.BANANA_PLANT_BEACH);
//
//			if (category.equals(Biome.BiomeCategory.JUNGLE) && NeapolitanConfig.COMMON.bananaPlantJungleGeneration.get()) {
//				if (name.getPath().contains("rainforest")) {
//					if (BiomeDictionary.hasType(key, BiomeDictionary.Type.FOREST))
//						generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NeapolitanPlacedFeatures.BANANA_PLANT_RARE);
//					else
//						generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NeapolitanPlacedFeatures.BANANA_PLANT_VERY_RARE);
//				} else if (!DataUtil.matchesKeys(name, Biomes.SPARSE_JUNGLE))
//					generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NeapolitanPlacedFeatures.BANANA_PLANT_JUNGLE);
//				else
//					generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NeapolitanPlacedFeatures.BANANA_PLANT_RARE);
//			}
//		}
//	}
}