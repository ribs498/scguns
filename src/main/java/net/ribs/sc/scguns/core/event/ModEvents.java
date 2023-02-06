package net.ribs.sc.scguns.core.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.*;
import net.ribs.sc.scguns.core.entity.RailwayBanditEntity;


public class ModEvents {
    @Mod.EventBusSubscriber(modid = ScGuns.ID)
    public static class ForgeEvents {
        @Mod.EventBusSubscriber(modid = ScGuns.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
        public static class ModEventBusEvents {
            @SubscribeEvent
            public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
                event.put(ModEntityTypes.COGMINION.get(), CogMinionEntity.setAttributes());
                event.put(ModEntityTypes.TRAININGDUMMY.get(), TrainingDummyEntity.setAttributes());
                event.put(ModEntityTypes.TRAUMAUNIT.get(), TraumaUnitEntity.setAttributes());
                event.put(ModEntityTypes.DEFECTIVETRAUMAUNIT.get(), DefectiveTraumaUnitEntity.setAttributes());
                event.put(ModEntityTypes.SUPPLYSCAMP.get(), SupplyScampEntity.setAttributes());
                event.put(ModEntityTypes.RAILWAYBANDIT.get(), RailwayBanditEntity.setAttributes());
                event.put(ModEntityTypes.HATRAILWAYBANDIT.get(), HatRailwayBanditEntity.setAttributes());
                event.put(ModEntityTypes.CLUBRAILWAYBANDIT.get(), ClubRailwayBanditEntity.setAttributes());
                event.put(ModEntityTypes.GIRLRAILWAYBANDIT.get(), GirlRailwayBanditEntity.setAttributes());
                event.put(ModEntityTypes.FATTYRAILWAYBANDIT.get(), FattyRailwayBanditEntity.setAttributes());
                event.put(ModEntityTypes.RAILWAYBANDITCHIEF.get(), RailwayBanditChiefEntity.setAttributes());
                event.put(ModEntityTypes.COGKNIGHT.get(), CogKnightEntity.setAttributes());
                event.put(ModEntityTypes.GUNRAILWAYBANDIT.get(), GunRailwayBanditEntity.setAttributes());
                event.put(ModEntityTypes.BROKENMININGUNIT.get(), BrokenMiningUnitEntity.setAttributes());
                event.put(ModEntityTypes.BROKENGRINDERUNIT.get(), BrokenGrinderUnitEntity.setAttributes());
                event.put(ModEntityTypes.SKYCARRIER.get(), SkyCarrierEntity.setAttributes());
                event.put(ModEntityTypes.KILNMAN.get(), KilnManEntity.setAttributes());
                event.put(ModEntityTypes.DISSIDENT.get(), DissidentEntity.setAttributes());
                event.put(ModEntityTypes.ADJUDICATOR.get(), AdjudicatorEntity.setAttributes());
                event.put(ModEntityTypes.SUBJUGATOR.get(), SubjugatorEntity.setAttributes());
                event.put(ModEntityTypes.BOUNDONE.get(), BoundOneEntity.setAttributes());
                event.put(ModEntityTypes.WOOLMAN.get(), WoolManEntity.setAttributes());
            }


        }
    }
}