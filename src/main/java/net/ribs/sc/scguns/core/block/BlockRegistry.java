package net.ribs.sc.scguns.core.block;


import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.block.custom.*;
import net.ribs.sc.scguns.core.fluid.ModFluids;
import net.ribs.sc.scguns.core.registry.BlockTab;
import net.ribs.sc.scguns.core.registry.ItemRegistry;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ScGuns.ID);

    public static final RegistryObject<Block> BLOCKOFRAWSULFUR = registerBlock("block_of_raw_sulfur", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);

    public static final RegistryObject<Block> SULFURORE = registerBlock("sulfur_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NETHERSULFUR = registerBlock("nether_sulfur", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> DEEPSLATESULFURORE = registerBlock("deepslate_sulfur_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> END_STONE_ETHERIUM_ORE = registerBlock("end_stone_etherium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(6, 9)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> BLOCKOFVEHEMENTCOAL = registerBlock("block_of_vehement_coal", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> TINORE = registerBlock("tin_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> DEEPSLATETINORE = registerBlock("deepslate_tin_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> OILORE = registerBlock("oil_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> DEEPSLATEOILORE = registerBlock("deepslate_oil_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COPPER_SCRAP_PILE = registerBlock("copper_scrap_pile", () -> new CopperScrapPileBlock(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops().noOcclusion()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> GOLD_SCRAP_PILE = registerBlock("gold_scrap_pile", () -> new GoldScrapPileBlock(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops().noOcclusion()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> BRASS_SCRAP_PILE = registerBlock("brass_scrap_pile", () -> new BrassScrapPileBlock(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops().noOcclusion()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> IRON_SCRAP_PILE = registerBlock("iron_scrap_pile", () -> new IronScrapPileBlock(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops().noOcclusion()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> STEEL_SCRAP_PILE = registerBlock("steel_scrap_pile", () -> new SteelScrapPileBlock(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops().noOcclusion()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> ZINC_SCRAP_PILE = registerBlock("zinc_scrap_pile", () -> new ZincScrapPileBlock(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops().noOcclusion()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> BLOCKOFTINBRONZE = registerBlock("block_of_tin_bronze", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> OIL_GEYSER = registerBlock("oil_geyser", () -> new OilGeyser(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops().noOcclusion()), BlockTab.SCBLOCKS);


    public static final RegistryObject<Block> RAWTINBLOCK = registerBlock("raw_tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> TINBLOCK = registerBlock("tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> SCORCHEDBRONZEBLOCK = registerBlock("scorched_bronze_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWALUMINUMBRICKS = registerBlock("raw_aluminum_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWALUMINUMBRICKSLAB = registerBlock("raw_aluminum_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWALUMINUMBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWALUMINUMBRICKSTAIRS = registerBlock("raw_aluminum_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWALUMINUMBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWLEADBRICKS = registerBlock("raw_lead_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWEADBRICKSLAB = registerBlock("raw_lead_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWLEADBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWLEADBRICKSTAIRS = registerBlock("raw_lead_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWLEADBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWNICKELBRICKS = registerBlock("raw_nickel_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWNICKELBRICKSLAB = registerBlock("raw_nickel_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWNICKELBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWNICKELBRICKSTAIRS = registerBlock("raw_nickel_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWNICKELBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWSILVERBRICKS = registerBlock("raw_silver_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWSILVERBRICKSLAB = registerBlock("raw_silver_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWSILVERBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWSILVERBRICKSTAIRS = registerBlock("raw_silver_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWSILVERBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWURANIUMBRICKS = registerBlock("raw_uranium_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWURANIUMBRICKSLAB = registerBlock("raw_uranium_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWURANIUMBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWURANIUMBRICKSTAIRS = registerBlock("raw_uranium_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWURANIUMBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWZINCBRICKS = registerBlock("raw_zinc_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWZINCBRICKSLAB = registerBlock("raw_zinc_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWZINCBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWZINCBRICKSTAIRS = registerBlock("raw_zinc_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWZINCBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWTINBRICKS = registerBlock("raw_tin_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWTINBRICKSLAB = registerBlock("raw_tin_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWTINBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWTINBRICKSTAIRS = registerBlock("raw_tin_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWTINBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWOSTRUMBRICKS = registerBlock("raw_ostrum_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWSTRUMBRICKSLAB = registerBlock("raw_ostrum_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWOSTRUMBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWOSTRUMBRICKSTAIRS = registerBlock("raw_ostrum_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWOSTRUMBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWCALORITEBRICKS = registerBlock("raw_calorite_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWCALORITEBRICKSLAB = registerBlock("raw_calorite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWCALORITEBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWCALORITERICKSTAIRS = registerBlock("raw_calorite_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWCALORITEBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWDESHBRICKS = registerBlock("raw_desh_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWDESHBRICKSLAB = registerBlock("raw_desh_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWDESHBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWDESHBRICKSTAIRS = registerBlock("raw_desh_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWDESHBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWEMERALDBRICKS = registerBlock("raw_emerald_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWEMERALDBRICKSLAB = registerBlock("raw_emerald_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWEMERALDBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWEMERALDBRICKSTAIRS = registerBlock("raw_emerald_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWEMERALDBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWEMERALDBLOCK = registerBlock("raw_emerald_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWDIAMONDBRICKS = registerBlock("raw_diamond_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWDIAMONDBRICKSLAB = registerBlock("raw_diamond_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWDIAMONDBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWDIAMONDBRICKSTAIRS = registerBlock("raw_diamond_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWDIAMONDBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWDIAMONDBLOCK = registerBlock("raw_diamond_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWREDSTONEBRICKS = registerBlock("raw_redstone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWREDSTONEBRICKSLAB = registerBlock("raw_redstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RAWREDSTONEBRICKS.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWREDSTONEBRICKSTAIRS = registerBlock("raw_redstone_brick_stairs", () -> new StairBlock(() -> BlockRegistry.RAWREDSTONEBRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> RAWREDSTONEBLOCK = registerBlock("raw_redstone_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDANDESITE = registerBlock("cobbled_andesite", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDANDESITESLAB = registerBlock("cobbled_andesite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDANDESITE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDANDESITESTAIRS = registerBlock("cobbled_andesite_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDANDESITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDBLACKSTONE = registerBlock("cobbled_blackstone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDBLACKSTONESLAB = registerBlock("cobbled_blackstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDBLACKSTONE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDBLACKSTONESTAIRS = registerBlock("cobbled_blackstone_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDBLACKSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDCALCITE= registerBlock("cobbled_calcite", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDCALCITESLAB = registerBlock("cobbled_calcite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDCALCITE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDCALCITESTAIRS = registerBlock("cobbled_calcite_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDCALCITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDDIORITE= registerBlock("cobbled_diorite", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDDIORITESLAB = registerBlock("cobbled_diorite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDDIORITE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDDIORITESTAIRS = registerBlock("cobbled_diorite_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDDIORITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDRIPSTONE= registerBlock("cobbled_dripstone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDRIPSTONESLAB = registerBlock("cobbled_dripstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDRIPSTONE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDRIPSTONESTAIRS = registerBlock("cobbled_dripstone_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDRIPSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDGRANITE= registerBlock("cobbled_granite", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDGRANITESLAB = registerBlock("cobbled_granite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDGRANITE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDGRANITESTAIRS = registerBlock("cobbled_granite_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDGRANITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDTUFF= registerBlock("cobbled_tuff", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDTUFFSLAB = registerBlock("cobbled_tuff_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDTUFF.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDTUFFSTAIRS = registerBlock("cobbled_tuff_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDTUFF.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDASURINE= registerBlock("cobbled_asurine", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDASURINESLAB = registerBlock("cobbled_asurine_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDASURINE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDASURINESTAIRS = registerBlock("cobbled_asurine_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDASURINE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDCRIMSITE= registerBlock("cobbled_crimsite", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDCRIMSITESLAB = registerBlock("cobbled_crimsite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDCRIMSITE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDCRIMSITESTAIRS = registerBlock("cobbled_crimsite_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDCRIMSITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDLIMESTONE= registerBlock("cobbled_limestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDLIMESTONESLAB = registerBlock("cobbled_limestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDLIMESTONE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDLIMESTONESTAIRS = registerBlock("cobbled_limestone_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDLIMESTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDVERIDIUM= registerBlock("cobbled_veridium", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDVERIDIUMSLAB = registerBlock("cobbled_veridium_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDVERIDIUM.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDVERIDIUMSTAIRS = registerBlock("cobbled_veridium_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDVERIDIUM.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDOCHRUM= registerBlock("cobbled_ochrum", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDOCHRUMSLAB = registerBlock("cobbled_ochrum_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDOCHRUM.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDOCHRUMSTAIRS = registerBlock("cobbled_ochrum_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDOCHRUM.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDSCORCHIA= registerBlock("cobbled_scorchia", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDSCORCHIASLAB = registerBlock("cobbled_scorchia_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDSCORCHIA.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDSCORCHIASTAIRS = registerBlock("cobbled_scorchia_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDSCORCHIA.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDSCORIA= registerBlock("cobbled_scoria", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDSCORIASLAB = registerBlock("cobbled_scoria_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDSCORIA.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDSCORIASTAIRS = registerBlock("cobbled_scoria_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDSCORIA.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDSHALE= registerBlock("cobbled_shale", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDSHALESLAB = registerBlock("cobbled_shale_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDSHALE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDSHALESTAIRS = registerBlock("cobbled_shale_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDSHALE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDJASPER= registerBlock("cobbled_jasper", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDJASPERLAB = registerBlock("cobbled_jasper_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDJASPER.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDJASPERSTAIRS = registerBlock("cobbled_jasper_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDJASPER.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDJPERIDOTITE= registerBlock("cobbled_peridotite", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDJPERIDOTITELAB = registerBlock("cobbled_peridotite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDJPERIDOTITE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDJPERIDOTITESTAIRS = registerBlock("cobbled_peridotite_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDJPERIDOTITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDPERMAFROST= registerBlock("cobbled_permafrost", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDPERMAFROSTSLAB = registerBlock("cobbled_permafrost_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDPERMAFROST.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDPERMAFROSTSTAIRS = registerBlock("cobbled_permafrost_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDPERMAFROST.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDSKYSTONE= registerBlock("cobbled_sky_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDSKYSTONESLAB = registerBlock("cobbled_sky_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDSKYSTONE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDSKYSTONESTAIRS = registerBlock("cobbled_sky_stone_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDSKYSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDCONGLOMERATE= registerBlock("cobbled_conglomerate", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDCONGLOMERATESLAB = registerBlock("cobbled_conglomerate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COBBLEDCONGLOMERATE.get()).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> COBBLEDCONGLOMERATESTAIRS = registerBlock("cobbled_conglomerate_stairs", () -> new StairBlock(() -> BlockRegistry.COBBLEDCONGLOMERATE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE) .strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);
    public static final  RegistryObject<Block> DUNMERPLANKS= registerBlock("dunmer_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> DUNMERSLAB = registerBlock("dunmer_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(DUNMERPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> DUNMERSTAIRS = registerBlock("dunmer_stairs", () -> new StairBlock(() -> BlockRegistry.DUNMERPLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD) .strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> DUNMERFENCE = registerBlock("dunmer_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(DUNMERPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> DUNMERFENCEGATE = registerBlock("dunmer_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(DUNMERPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> DUNMERDOOR = registerBlock("dunmer_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(DUNMERPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);

    public static final RegistryObject<Block> CINDERORE = registerBlock("cinder_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> DEEPSLATECINDERORE = registerBlock("deepslate_cinder_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NETHERCINDER = registerBlock("nether_cinder", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> CINDERBLOCK = registerBlock("cinder_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), BlockTab.SCBLOCKS);

    public static final  RegistryObject<Block> NORDICPLANKS= registerBlock("nordic_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NORDICSLAB = registerBlock("nordic_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(NORDICPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NORDICSTAIRS = registerBlock("nordic_stairs", () -> new StairBlock(() -> BlockRegistry.NORDICPLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD) .strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NORDICFENCE = registerBlock("nordic_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(NORDICPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NORDICFENCEGATE = registerBlock("nordic_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(NORDICPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NORDICDOOR = registerBlock("nordic_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(NORDICPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);



    public static final  RegistryObject<Block> VENTHYRPLANKS= registerBlock("venthyr_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> VENTHYRSLAB = registerBlock("venthyr_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(VENTHYRPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> VENTHYRSTAIRS = registerBlock("venthyr_stairs", () -> new StairBlock(() -> BlockRegistry.VENTHYRPLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD) .strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> VENTHYRFENCE = registerBlock("venthyr_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(VENTHYRPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> VENTHYRFENCEGATE = registerBlock("venthyr_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(VENTHYRPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> VENTHYRDOOR = registerBlock("venthyr_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(VENTHYRPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);

    public static final  RegistryObject<Block> NECROPLANKS= registerBlock("necro_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NECROPSLAB = registerBlock("necro_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(NECROPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NECROPSTAIRS = registerBlock("necro_stairs", () -> new StairBlock(() -> BlockRegistry.NECROPLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD) .strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NECROPFENCE = registerBlock("necro_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(NECROPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NECROPFENCEGATE = registerBlock("necro_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(NECROPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NECRODOOR = registerBlock("necro_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(NECROPLANKS.get()).strength(2f)), BlockTab.SCBLOCKS);

    public static final  RegistryObject<Block> TREATEDWOODCASING= registerBlock("treated_wood_casing", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> TREATEDDOOR = registerBlock("treated_wood_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(TREATEDWOODCASING.get()).strength(2f)), BlockTab.SCBLOCKS);
    public static final RegistryObject<LiquidBlock> ASTRAL_OIL_BLOCK = BLOCKS.register("astral_oil_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ASTRAL_OIL, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<Block> TREATED_LOG = registerBlock("treated_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2f)
            ), BlockTab.SCBLOCKS);


    public static final RegistryObject<Block> VENTHYR_LOG = registerBlock("venthyr_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2f)
                    ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> VENTHYR_WOOD = registerBlock("venthyr_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2f)
               ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> STRIPPED_VENTHYR_LOG = registerBlock("stripped_venthyr_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2f)
                   ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> STRIPPED_VENTHYR_WOOD = registerBlock("stripped_venthyr_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2f)
                    ), BlockTab.SCBLOCKS);

    public static final RegistryObject<Block> NORDIC_LOG = registerBlock("nordic_log",
            () -> new NordicFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2f)
                    ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NORDIC_WOOD = registerBlock("nordic_wood",
            () -> new NordicFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2f)
                 ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> STRIPPED_NORDIC_LOG = registerBlock("stripped_nordic_log",
            () -> new NordicFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2f)
                    ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> STRIPPED_NORDIC_WOOD = registerBlock("stripped_nordic_wood",
            () -> new NordicFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2f)
                    ), BlockTab.SCBLOCKS);

    public static final RegistryObject<Block> DUNMER_LOG = registerBlock("dunmer_log",
            () -> new NordicFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2f)
            ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> DUNMER_WOOD = registerBlock("dunmer_wood",
            () -> new NordicFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2f)
            ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> STRIPPED_DUNMER_LOG = registerBlock("stripped_dunmer_log",
            () -> new NordicFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2f)
            ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> STRIPPED_DUNMER_WOOD = registerBlock("stripped_dunmer_wood",
            () -> new NordicFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2f)
            ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NECRO_LOG = registerBlock("necro_log",
            () -> new NordicFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2f)
            ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> NECRO_WOOD = registerBlock("necro_wood",
            () -> new NordicFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2f)
            ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> STRIPPED_NECRO_LOG = registerBlock("stripped_necro_log",
            () -> new NordicFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2f)
            ), BlockTab.SCBLOCKS);
    public static final RegistryObject<Block> STRIPPED_NECRO_WOOD = registerBlock("stripped_necro_wood",
            () -> new NordicFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2f)
            ), BlockTab.SCBLOCKS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;


    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}








