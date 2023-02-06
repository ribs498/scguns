package net.ribs.sc.scguns.core.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ribs.sc.scguns.core.ScGuns;


public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ScGuns.ID);

    public static final RegistryObject<EntityType<CogMinionEntity>> COGMINION =
            ENTITY_TYPES.register("cog_minion",
                    () -> EntityType.Builder.of(CogMinionEntity::new, MobCategory.MONSTER)
                            .sized(0.5f, 1.9f)
                            .build(new ResourceLocation(ScGuns.ID, "cog_minion").toString()));

    public static final RegistryObject<EntityType<TrainingDummyEntity>> TRAININGDUMMY =
            ENTITY_TYPES.register("training_dummy",
                    () -> EntityType.Builder.of(TrainingDummyEntity::new, MobCategory.MONSTER)
                            .sized(0.7f, 2.1f)
                            .build(new ResourceLocation(ScGuns.ID, "training_dummy").toString()));
    public static final RegistryObject<EntityType<WoolManEntity>> WOOLMAN =
            ENTITY_TYPES.register("wool_man",
                    () -> EntityType.Builder.of(WoolManEntity::new, MobCategory.MONSTER)
                            .sized(0.5f, 1.5f)
                            .build(new ResourceLocation(ScGuns.ID, "wool_man").toString()));
    public static final RegistryObject<EntityType<BoundOneEntity>> BOUNDONE =
            ENTITY_TYPES.register("bound_one",
                    () -> EntityType.Builder.of(BoundOneEntity::new, MobCategory.MONSTER)
                            .sized(1.3f, 3.0f)
                            .build(new ResourceLocation(ScGuns.ID, "bound_one").toString()));
    public static final RegistryObject<EntityType<BrokenMiningUnitEntity>> BROKENMININGUNIT =
            ENTITY_TYPES.register("broken_mining_unit",
                    () -> EntityType.Builder.of(BrokenMiningUnitEntity::new, MobCategory.MONSTER)
                            .sized(0.7f, 1.6f)
                            .build(new ResourceLocation(ScGuns.ID, "broken_mining_unit").toString()));

    public static final RegistryObject<EntityType<BrokenGrinderUnitEntity>> BROKENGRINDERUNIT =
            ENTITY_TYPES.register("broken_grinder_unit",
                    () -> EntityType.Builder.of(BrokenGrinderUnitEntity::new, MobCategory.MONSTER)
                            .sized(0.7f, 1.9f)
                            .build(new ResourceLocation(ScGuns.ID, "broken_grinder_unit").toString()));

    public static final RegistryObject<EntityType<TraumaUnitEntity>> TRAUMAUNIT =
            ENTITY_TYPES.register("trauma_unit",
                    () -> EntityType.Builder.of(TraumaUnitEntity::new, MobCategory.MONSTER)
                            .sized(1.2f, 1.9f)
                            .build(new ResourceLocation(ScGuns.ID, "trauma_unit").toString()));

    public static final RegistryObject<EntityType<DefectiveTraumaUnitEntity>> DEFECTIVETRAUMAUNIT =
            ENTITY_TYPES.register("defective_trauma_unit",
                    () -> EntityType.Builder.of(DefectiveTraumaUnitEntity::new, MobCategory.MONSTER)
                            .sized(1.2f, 1.9f)
                            .build(new ResourceLocation(ScGuns.ID, "defective_trauma_unit").toString()));
    public static final RegistryObject<EntityType<AdjudicatorEntity>> ADJUDICATOR =
            ENTITY_TYPES.register("adjudicator",
                    () -> EntityType.Builder.of(AdjudicatorEntity::new, MobCategory.MONSTER)
                            .sized(0.8f, 1.8f)
                            .build(new ResourceLocation(ScGuns.ID, "adjudicator").toString()));

    public static final RegistryObject<EntityType<SubjugatorEntity>> SUBJUGATOR =
            ENTITY_TYPES.register("subjugator",
                    () -> EntityType.Builder.of(SubjugatorEntity::new, MobCategory.MONSTER)
                            .sized(0.8f, 1.8f)
                            .build(new ResourceLocation(ScGuns.ID, "subjugator").toString()));
    public static final RegistryObject<EntityType<SupplyScampEntity>> SUPPLYSCAMP =
            ENTITY_TYPES.register("supply_scamp",
                    () -> EntityType.Builder.of(SupplyScampEntity::new, MobCategory.CREATURE)
                            .sized(1.2f, 1.2f)
                            .build(new ResourceLocation(ScGuns.ID, "supply_scamp").toString()));

    public static final RegistryObject<EntityType<RailwayBanditEntity>> RAILWAYBANDIT =
            ENTITY_TYPES.register("railway_bandit",
                    () -> EntityType.Builder.of(RailwayBanditEntity::new, MobCategory.MONSTER)
                            .sized(0.8f, 2.0f)
                            .build(new ResourceLocation(ScGuns.ID, "railway_bandit").toString()));
    public static final RegistryObject<EntityType<HatRailwayBanditEntity>> HATRAILWAYBANDIT =
            ENTITY_TYPES.register("hat_railway_bandit",
                    () -> EntityType.Builder.of(HatRailwayBanditEntity::new, MobCategory.MONSTER)
                            .sized(0.8f, 2.2f)
                            .build(new ResourceLocation(ScGuns.ID, "hat_railway_bandit").toString()));

    public static final RegistryObject<EntityType<ClubRailwayBanditEntity>> CLUBRAILWAYBANDIT =
            ENTITY_TYPES.register("club_railway_bandit",
                    () -> EntityType.Builder.of(ClubRailwayBanditEntity::new, MobCategory.MONSTER)
                            .sized(0.8f, 1.9f)
                            .build(new ResourceLocation(ScGuns.ID, "club_railway_bandit").toString()));

    public static final RegistryObject<EntityType<GirlRailwayBanditEntity>> GIRLRAILWAYBANDIT =
            ENTITY_TYPES.register("girl_railway_bandit",
                    () -> EntityType.Builder.of(GirlRailwayBanditEntity::new, MobCategory.MONSTER)
                            .sized(0.8f, 1.9f)
                            .build(new ResourceLocation(ScGuns.ID, "girl_railway_bandit").toString()));

    public static final RegistryObject<EntityType<FattyRailwayBanditEntity>> FATTYRAILWAYBANDIT =
            ENTITY_TYPES.register("fatty_railway_bandit",
                    () -> EntityType.Builder.of(FattyRailwayBanditEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 2.6f)
                            .build(new ResourceLocation(ScGuns.ID, "fatty_railway_bandit").toString()));

    public static final RegistryObject<EntityType<RailwayBanditChiefEntity>> RAILWAYBANDITCHIEF =
            ENTITY_TYPES.register("railway_bandit_chief",
                    () -> EntityType.Builder.of(RailwayBanditChiefEntity::new, MobCategory.MONSTER)
                            .sized(1.1f, 2.7f)
                            .build(new ResourceLocation(ScGuns.ID, "railway_bandit_chief").toString()));

    public static final RegistryObject<EntityType<CogKnightEntity>> COGKNIGHT =
            ENTITY_TYPES.register("cog_knight",
                    () -> EntityType.Builder.of(CogKnightEntity::new, MobCategory.MONSTER)
                            .sized(1.1f, 1.9f)
                            .build(new ResourceLocation(ScGuns.ID, "cog_knight").toString()));

    public static final RegistryObject<EntityType<GunRailwayBanditEntity>> GUNRAILWAYBANDIT =
            ENTITY_TYPES.register("gun_railway_bandit",
                    () -> EntityType.Builder.of(GunRailwayBanditEntity::new, MobCategory.MONSTER)
                            .sized(0.8f, 1.9f)
                            .build(new ResourceLocation(ScGuns.ID, "gun_railway_bandit").toString()));
    public static final RegistryObject<EntityType<SkyCarrierEntity>> SKYCARRIER =
            ENTITY_TYPES.register("sky_carrier",
                    () -> EntityType.Builder.of(SkyCarrierEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 1.9f)
                            .build(new ResourceLocation(ScGuns.ID, "sky_carrier").toString()));
    public static final RegistryObject<EntityType<KilnManEntity>> KILNMAN =
            ENTITY_TYPES.register("kiln_man",
                    () -> EntityType.Builder.of(KilnManEntity::new, MobCategory.MONSTER)
                            .sized(1.6f, 2.9f)
                            .build(new ResourceLocation(ScGuns.ID, "kiln_man").toString()));
    public static final RegistryObject<EntityType<DissidentEntity>> DISSIDENT =
            ENTITY_TYPES.register("dissident",
                    () -> EntityType.Builder.of(DissidentEntity::new, MobCategory.MONSTER)
                            .sized(1.6f, 1.9f)
                            .build(new ResourceLocation(ScGuns.ID, "sky_carrier").toString()));
    public static final RegistryObject<EntityType<BanditEntityProjectile>> BANDIT_PROJECTILE = register("projectile_bandit",
            EntityType.Builder.<BanditEntityProjectile>of(BanditEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(false)
                    .setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(BanditEntityProjectile::new).sized(0.005f, 0.005f));


    private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return ENTITY_TYPES.register(registryname, () -> entityTypeBuilder.build(registryname));
    }
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
