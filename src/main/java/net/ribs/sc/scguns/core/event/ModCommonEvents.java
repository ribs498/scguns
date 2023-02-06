package net.ribs.sc.scguns.core.event;

import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.*;

@Mod.EventBusSubscriber(modid = ScGuns.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonEvents {
    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        SpawnPlacements.register(ModEntityTypes.COGMINION.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, CogMinionEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.TRAUMAUNIT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, TraumaUnitEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.DEFECTIVETRAUMAUNIT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, DefectiveTraumaUnitEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.TRAININGDUMMY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, TrainingDummyEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.CLUBRAILWAYBANDIT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, ClubRailwayBanditEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.RAILWAYBANDIT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, RailwayBanditEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.GIRLRAILWAYBANDIT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, GirlRailwayBanditEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.SUPPLYSCAMP.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, SupplyScampEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.COGKNIGHT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, CogKnightEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.GUNRAILWAYBANDIT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, GunRailwayBanditEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.BROKENMININGUNIT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, BrokenMiningUnitEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.BROKENGRINDERUNIT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, BrokenGrinderUnitEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.SKYCARRIER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, SkyCarrierEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.DISSIDENT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, DissidentEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.ADJUDICATOR.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, AdjudicatorEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.SUBJUGATOR.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, SubjugatorEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.BOUNDONE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, BoundOneEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.WOOLMAN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, WoolManEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.FATTYRAILWAYBANDIT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, FattyRailwayBanditEntity::canSpawn);
        SpawnPlacements.register(ModEntityTypes.HATRAILWAYBANDIT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, HatRailwayBanditEntity::canSpawn);
    }
}