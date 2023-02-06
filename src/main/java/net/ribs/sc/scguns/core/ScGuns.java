package net.ribs.sc.scguns.core;


import com.mrcrayfish.guns.client.KeyBinds;
import com.mrcrayfish.guns.client.SpecialModels;
import com.mrcrayfish.guns.init.ModItems;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.ribs.sc.scguns.core.block.BlockRegistry;
import net.ribs.sc.scguns.core.config.Config;
import net.ribs.sc.scguns.core.datagen.ModRecipeGenerator;
import net.ribs.sc.scguns.core.entity.ModEntityTypes;
import net.ribs.sc.scguns.core.entity.TraumaUnitEntity;
import net.ribs.sc.scguns.core.entity.client.*;
import net.ribs.sc.scguns.core.fluid.ModFluidTypes;
import net.ribs.sc.scguns.core.fluid.ModFluids;
import net.ribs.sc.scguns.core.registry.ItemRegistry;
import net.ribs.sc.scguns.core.registry.SoundRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.ribs.sc.scguns.core.world.feature.ModConfiguredFeatures;
import net.ribs.sc.scguns.core.world.feature.ModPlacedFeatures;
import software.bernie.geckolib3.GeckoLib;


@Mod(ScGuns.ID)
public class ScGuns {
    public static final String ID = "scguns";
    public static final CreativeModeTab GROUP = new ScGunsTab(ID);

    public ScGuns() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.clientConfig);


        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);
        ItemRegistry.ITEMS.register(bus);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntityTypes.register(modEventBus);
        GeckoLib.initialize();
        MinecraftForge.EVENT_BUS.register(this);
        BlockRegistry.register(modEventBus);
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);
        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);


        SoundRegistry.SOUNDS.register(bus);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            bus.addListener(KeyBinds::registerKeyMappings);
            bus.addListener(SpecialModels::registerAdditional);
        });

        bus.addListener(this::gatherData);
    }

    private void gatherData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(event.includeServer(), new ModRecipeGenerator(generator));
    }
    @Mod.EventBusSubscriber(modid = ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            EntityRenderers.register(ModEntityTypes.COGMINION.get(), CogMinionRenderer::new);
            EntityRenderers.register(ModEntityTypes.TRAININGDUMMY.get(), TrainingDummyRenderer::new);
            EntityRenderers.register(ModEntityTypes.TRAUMAUNIT.get(), TraumaUnitRenderer::new);
            EntityRenderers.register(ModEntityTypes.DEFECTIVETRAUMAUNIT.get(), DefectiveTraumaUnitRenderer::new);
            EntityRenderers.register(ModEntityTypes.SUPPLYSCAMP.get(), SupplyScampRenderer::new);
            EntityRenderers.register(ModEntityTypes.RAILWAYBANDIT.get(), RailwayBanditRenderer::new);
            EntityRenderers.register(ModEntityTypes.HATRAILWAYBANDIT.get(), HatRailwayBanditRenderer::new);
            EntityRenderers.register(ModEntityTypes.CLUBRAILWAYBANDIT.get(), ClubRailwayBanditRenderer::new);
            EntityRenderers.register(ModEntityTypes.GIRLRAILWAYBANDIT.get(), GirlRailwayBanditRenderer::new);
            EntityRenderers.register(ModEntityTypes.FATTYRAILWAYBANDIT.get(), FattyRailwayBanditRenderer::new);
            EntityRenderers.register(ModEntityTypes.RAILWAYBANDITCHIEF.get(), RailwayBanditChiefRenderer::new);
            EntityRenderers.register(ModEntityTypes.COGKNIGHT.get(), CogKnightRenderer::new);
            EntityRenderers.register(ModEntityTypes.GUNRAILWAYBANDIT.get(), GunRailwayBanditRenderer::new);
            EntityRenderers.register(ModEntityTypes.BROKENMININGUNIT.get(), BrokenMiningUnitRenderer::new);
            EntityRenderers.register(ModEntityTypes.BROKENGRINDERUNIT.get(), BrokenGrinderUnitRenderer::new);
            EntityRenderers.register(ModEntityTypes.SKYCARRIER.get(), SkyCarrierRenderer::new);
            EntityRenderers.register(ModEntityTypes.KILNMAN.get(), KilnManRenderer::new);
            EntityRenderers.register(ModEntityTypes.DISSIDENT.get(), DissidentRenderer::new);
            EntityRenderers.register(ModEntityTypes.ADJUDICATOR.get(), AdjudicatorRenderer::new);
            EntityRenderers.register(ModEntityTypes.SUBJUGATOR.get(), SubjugatorRenderer::new);
            EntityRenderers.register(ModEntityTypes.BOUNDONE.get(), BoundOneRenderer::new);
            EntityRenderers.register(ModEntityTypes.WOOLMAN.get(), WoolManRenderer::new);
            EntityRenderers.register(ModEntityTypes.BANDIT_PROJECTILE.get(), ThrownItemRenderer::new);
        }


    }

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ASTRAL_OIL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ASTRAL_OIL.get(), RenderType.translucent());

        }

}
