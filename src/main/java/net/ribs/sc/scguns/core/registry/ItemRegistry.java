package net.ribs.sc.scguns.core.registry;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.ScGunsTab;
import net.ribs.sc.scguns.core.entity.ModEntityTypes;
import net.ribs.sc.scguns.core.fluid.ModFluids;
import net.ribs.sc.scguns.core.item.ScGunItem;

import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.*;
import com.mrcrayfish.guns.item.attachment.impl.Barrel;
import com.mrcrayfish.guns.item.attachment.impl.Scope;
import com.mrcrayfish.guns.item.attachment.impl.Stock;
import com.mrcrayfish.guns.item.attachment.impl.UnderBarrel;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Properties;


//CLASS FOR REGISTERING GUNS
public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScGuns.ID);


    public static final Item.Properties genericProperties = new Item.Properties().stacksTo(1).tab(ScGuns.GROUP);

    /* Guns */
    public static final RegistryObject<Item> EOKAPISTOL = registerGun("eoka_pistol", false);
    public static final RegistryObject<Item> PIPEMUSKET = registerGun("pipe_musket", false);
    public static final RegistryObject<Item> HANDCROSSBOW = registerGun("hand_crossbow", false);
    public static final RegistryObject<Item> AUTOCROSSBOW = registerGun("auto_crossbow", false);
    public static final RegistryObject<Item> SCRAPCANNON = registerGun("scrap_cannon", false);
    public static final RegistryObject<Item> BLUNDERBUSS = registerGun("blunderbuss", false);
    public static final RegistryObject<Item> BASTARD_GUN = registerGun("bastard_gun", false);
    public static final RegistryObject<Item> SCRAPPISTOL = registerGun("scrap_pistol", false);
    public static final RegistryObject<Item> VOLLEY_GUN = registerGun("volley_gun", false);
    public static final RegistryObject<Item> FLECHETTEJET = registerGun("flechette_jet", false);
    public static final RegistryObject<Item> M12WALTZ = registerGun("m12_waltz", false);
    public static final RegistryObject<Item> WALTZCONVERSION = registerGun("waltz_conversion", false);
    public static final RegistryObject<Item> STEYRSMG = registerGun("steyr_smg", false);
    public static final RegistryObject<Item> SCATTERGUN = registerGun("scattergun", false);
    public static final RegistryObject<Item> CARABINE_44 = registerGun("carabine_44", false);
    public static final RegistryObject<Item> G19DIRECTOR = registerGun("g19_director", false);
    public static final RegistryObject<Item> M19WALTZDEHANN = registerGun("m19_waltz_dehann", false);
    public static final RegistryObject<Item> LMSCOONT = registerGun("lm_scoont", false);
    public static final RegistryObject<Item> LMSPEARTROUGH = registerGun("lm_spear_trough", false);
    public static final RegistryObject<Item> LMSPEARIRONPORT = registerGun("lm_spear_ironport", false);
    public static final RegistryObject<Item> LMSEKORA = registerGun("lm_sekora", false);
    public static final RegistryObject<Item> OOZ96 = registerGun("ooz_96", false);
    public static final RegistryObject<Item> KILNGUN = registerGun("kiln_gun", false);
    public static final RegistryObject<Item> PUNTGUN = registerGun("punt_gun", false);
    public static final RegistryObject<Item> SCORCHEDWAND = registerGun("scorched_wand", false);
    public static final RegistryObject<Item> SCORCHEDSTAFF = registerGun("scorched_staff", false);
    public static final RegistryObject<Item> SCORCHEDOBREZSTAFF = registerGun("scorched_obrez_staff", false);
    public static final RegistryObject<Item> SCORCHEDSCATTERSTAFF = registerGun("scorched_scatter_staff", false);
    public static final RegistryObject<Item> BLASPHEMY = registerGun("blasphemy", false);
    public static final RegistryObject<Item> GOWZA32L = registerGun("gowza_32l", false);
    public static final RegistryObject<Item> SCGOWZA = registerGun("sc_gowza", false);
    public static final RegistryObject<Item> SCFUSILAGE = registerGun("sc_fusilage", false);
    public static final RegistryObject<Item> SCDAHKA = registerGun("sc_dahka", false);
    public static final RegistryObject<Item> FRONTIERSIDEARM = registerGun("frontier_sidearm", false);
    public static final RegistryObject<Item> SCDEPUTY = registerGun("sc_deputy", false);
    public static final RegistryObject<Item> SCLAWBRINGER = registerGun("sc_lawbringer", false);
    public static final RegistryObject<Item> SOULDRUMMER = registerGun("soul_drummer", false);
    public static final RegistryObject<Item> RIVETER = registerGun("riveter", false);
    public static final RegistryObject<Item> JURYRIGGEDWRISTBREAKER = registerGun("jury_rigged_wrist_breaker", false);
    public static final RegistryObject<Item> RAILWORKER = registerGun("railworker", false);
    public static final RegistryObject<Item> GAUSS = registerGun("gauss_rifle", false);
    public static final RegistryObject<Item> COGLOADER = registerGun("cogloader", false);
    public static final RegistryObject<Item> M99KRAUSER = registerGun("m99_krauser", false);
    public static final RegistryObject<Item> KRAUSERCONVERSION = registerGun("krauser_conversion", false);
    public static final RegistryObject<Item> JACKHAMMER = registerGun("jackhammer", false);
    public static final RegistryObject<Item> OSGOODFIFTY = registerGun("osgood_50", false);
    public static final RegistryObject<Item> HUOT_AUTO = registerGun("huot_auto", false);
    public static final RegistryObject<Item> THUMPER = registerGun("thumper", false);
    public static final RegistryObject<Item> SPITFIRE = registerGun("spitfire", false);
    public static final RegistryObject<Item> CYCLONE = registerGun("cyclone", false);
    public static final RegistryObject<Item> THUNDERHEAD = registerGun("thunderhead", false);
    public static final RegistryObject<Item> OFFICERS_SPECIAL = registerGun("officers_special", false);
    public static final RegistryObject<Item> COSMICBLITZER = registerGun("cosmic_blitzer", false);
    public static final RegistryObject<Item> R498GAUSSCANNON = registerGun("r498_gauss_cannon", false);
    public static final RegistryObject<Item> ALFONZREPEATINGPUNTER = registerGun("alfonz_repeating_punter", false);
    public static final RegistryObject<Item> ALFONZTURNPIKE = registerGun("alfonz_turnpike", false);
    public static final RegistryObject<Item> LG8GRENADELAUNCHER = registerGun("lg8_grenade_launcher", false);
    public static final RegistryObject<Item> ASTELLA = registerGun("astella", false);
    public static final RegistryObject<Item> EARTHSCORPSE = registerGun("earths_corpse", false);
    /* Attachments */
    public static final RegistryObject<Item> WIRE_STOCK = ITEMS.register("wire_stock", () -> new StockItem(Stock.create(GunModifiers.STABILISED), genericProperties, false));
    public static final RegistryObject<Item> STURDYGRIP = ITEMS.register("sturdy_grip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.STABILISED), genericProperties, false));
    public static final RegistryObject<Item> TACTICALGRIP = ITEMS.register("tactical_grip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.LIGHT_RECOIL), genericProperties, false));

    public static final RegistryObject<Item> WOODEN_STOCK = ITEMS.register("wooden_stock", () -> new StockItem(Stock.create(GunModifiers.SUPER_STABILISED), genericProperties, false));
    public static final RegistryObject<Item> MUZZLE_BRAKE = ITEMS.register("muzzle_brake", () -> new BarrelItem(Barrel.create(9.5f, GunModifiers.REDUCED_RECOIL), genericProperties, false));
    public static final RegistryObject<Item> ADVANCED_SILENCER = ITEMS.register("advanced_silencer", () -> new BarrelItem(Barrel.create(16.0f, GunModifiers.SILENCED), genericProperties));
    public static final RegistryObject<Item> BASIC_SIGHT = ITEMS.register("basic_sight", () -> new ScopeItem(Scope.create(0.025F, 1.25F, GunModifiers.SLOWER_ADS).viewFinderOffset(0.3), genericProperties, false));

    /* Bullets */
    public static final RegistryObject<Item> POWDERANDBALL = registerMisc("powder_and_ball");
    public static final RegistryObject<Item> SIMPLEBULLET = registerAmmo("simple_bullet");
    public static final RegistryObject<Item> SHOTBOLT = registerAmmo("shotbolt");
    public static final RegistryObject<Item> VOLATILESCRAP = registerAmmo("volatile_scrap");
    public static final RegistryObject<Item> ENCASEDFIRE = registerAmmo("encased_fire");
    public static final RegistryObject<Item> RIVET = registerAmmo("rivet");
    public static final RegistryObject<Item> FLECHETTE = registerAmmo("flechette");
    public static final RegistryObject<Item> FLECHETTEROUND = registerMisc("flechette_round");
    public static final RegistryObject<Item> ECROUND = registerAmmo("ec_round");
    public static final RegistryObject<Item> SCORCHEDBULLET = registerMisc("scorched_bullet");
    public static final RegistryObject<Item> SCORCHEDBIGBULLET = registerMisc("scorched_big_bullet");
    public static final RegistryObject<Item> SCORCHEDSHELL = registerMisc("scorched_shell");
    public static final RegistryObject<Item> HEAVYBULLET = registerAmmo("heavy_bullet");
    public static final RegistryObject<Item> OSBORNESHELL = registerMisc("osborne_shell");
    public static final RegistryObject<Item> OSBORNESLUG = registerAmmo("osborne_slug");
    public static final RegistryObject<Item> EXPERIMENTALCASING = registerMisc("experimental_casing");
    public static final RegistryObject<Item> EXPERIMENTALROUND = registerAmmo("experimental_round");
    public static final RegistryObject<Item> ETHEREALBULLET = registerAmmo("ethereal_bullet");
    public static final RegistryObject<Item> ETHEREALHEAVYBULLET = registerAmmo("ethereal_heavy_bullet");
    public static final RegistryObject<Item> ETHEREALSHELL = registerAmmo("ethereal_shell");
    public static final RegistryObject<Item> ETHEREALECROUND = registerAmmo("ethereal_ec_round");
    public static final RegistryObject<Item> SMALLBULLETCASING = registerMisc("small_bullet_casing");
    public static final RegistryObject<Item> SCORCHEDCASING = registerMisc("scorched_casing");
    public static final RegistryObject<Item> SCORCHEDBIGCASING = registerMisc("scorched_big_casing");
    public static final RegistryObject<Item> BIGBULLETCASING = registerMisc("big_bullet_casing");
    public static final RegistryObject<Item> RAWBASICBULLET = registerMisc("raw_basic_bullet");
    public static final RegistryObject<Item> RAWSHELL = registerMisc("raw_shell");
    public static final RegistryObject<Item> RAWFLECHETTEROUND = registerMisc("raw_flechette_round");
    public static final RegistryObject<Item> RAWADVANCEDBULLET = registerMisc("raw_advanced_bullet");
    public static final RegistryObject<Item> RAWSCORCHEDBULLET = registerMisc("raw_scorched_bullet");
    public static final RegistryObject<Item> RAWSCORCHEDBIGBULLET = registerMisc("raw_scorched_big_bullet");
    public static final RegistryObject<Item> RAWSCORCHEDSHELL = registerMisc("raw_scorched_shell");
    public static final RegistryObject<Item> RAWHEAVYBULLET = registerMisc("raw_heavy_bullet");
    public static final RegistryObject<Item> RAWEXPERIMENTALROUND = registerMisc("raw_experimental_round");
    public static final RegistryObject<Item> RAWOSBORNESLUG = registerMisc("raw_osborne_slug");
    public static final RegistryObject<Item> RAWETHEREALBULLET = registerMisc("raw_ethereal_bullet");
    public static final RegistryObject<Item> RAWETHEREALHEAVYBULLET = registerMisc("raw_ethereal_heavy_bullet");
    public static final RegistryObject<Item> RAWETHEREALSHELL = registerMisc("raw_ethereal_shell");
    public static final RegistryObject<Item> POWDERANDBALLPOUCH = registerMisc("powder_and_ball_pouch");
    public static final RegistryObject<Item> SIMPLEBULLETPOUCH = registerMisc("simple_bullet_pouch");
    public static final RegistryObject<Item> BASICBULLETPOUCH = registerMisc("basic_bullet_pouch");
    public static final RegistryObject<Item> ARROWQUIVER = registerMisc("arrow_quiver");
    public static final RegistryObject<Item> SHOTBOLTQUIVER = registerMisc("shotbolt_quiver");
    public static final RegistryObject<Item> SHELLBULLETPOUCH = registerMisc("shell_pouch");
    public static final RegistryObject<Item> FLECHETTEROUNDPOUCH = registerMisc("flechette_round_pouch");
    public static final RegistryObject<Item> ADVANCEDBULLETPOUCH = registerMisc("advanced_bullet_pouch");
    public static final RegistryObject<Item> EXPERIMENTALRONDPOUCH = registerMisc("experimental_round_pouch");
    public static final RegistryObject<Item> HEAVYBULLETPOUCH = registerMisc("heavy_bullet_pouch");
    public static final RegistryObject<Item> OSBORNESLUGPOUCH = registerMisc("osborne_slug_pouch");
    public static final RegistryObject<Item> SCORCHEDBULLETPOUCH = registerMisc("scorched_bullet_pouch");
    public static final RegistryObject<Item> SCORCHEDSHELLPOUCH = registerMisc("scorched_shell_pouch");
    public static final RegistryObject<Item> SCORCHEDBIGBULLETPOUCH = registerMisc("scorched_big_bullet_pouch");
    public static final RegistryObject<Item> ETHEREALBULLETPOUCH = registerAmmo("ethereal_bullet_pouch");
    public static final RegistryObject<Item> ETHEREALHEAVYBULLETPOUCH = registerAmmo("ethereal_heavy_bullet_pouch");
    public static final RegistryObject<Item> ETHEREALSHELLPOUCH = registerAmmo("ethereal_shell_pouch");
    public static final RegistryObject<Item> ECROUNDBOX = registerMisc("ec_round_box");
    public static final RegistryObject<Item> ETHEREALECROUNDBOX = registerMisc("ethereal_ec_round_box");
    /*MELEE WEAPONS*/
    public static final RegistryObject<Item> FIRESTARTER = ITEMS.register("fire_starter", () -> new FlintAndSteelItem( new Item.Properties().durability(8).tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> BANDITCLUB = ITEMS.register("bandit_club", () -> new SwordItem(Tiers.WOOD, 3, -3f, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> BANDITHAMMER = ITEMS.register("bandit_hammer", () -> new SwordItem(Tiers.IRON, 8, -3.6f, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> BANDITMACHETE = ITEMS.register("bandit_machete", () -> new SwordItem(Tiers.IRON, 4, -2.4f, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> BANDITAXE = ITEMS.register("bandit_axe", () -> new AxeItem(Tiers.IRON, 5, -2.8f, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> ETHERIUMKNIFE = ITEMS.register("etherium_knife", () -> new SwordItem(Tiers.NETHERITE, 3, -2.0f, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> ETHERIUMMACHETE = ITEMS.register("etherium_machete", () -> new SwordItem(Tiers.NETHERITE, 4, -2.6F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> STEELKNIFE = ITEMS.register("steel_knife", () -> new SwordItem(Tiers.IRON, 2, -2.0F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> STEELMACHETE = ITEMS.register("steel_machete", () -> new SwordItem(Tiers.IRON, 3, -2.6F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> HEAVYFLINT = ITEMS.register("heavy_flint", () -> new PickaxeItem(ToolTiers.FLINT, 2, -2.0F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> COPPERPICK = ITEMS.register("copper_pick", () -> new PickaxeItem(ToolTiers.COPPER, 1, -2.0F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> TINBRONZESWORD = ITEMS.register("tin_bronze_sword", () -> new SwordItem(ToolTiers.TINBRONZE, 3, -2.4F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> TINBRONZESHOVEL = ITEMS.register("tin_bronze_shovel", () -> new ShovelItem(ToolTiers.TINBRONZE, 1.5F, -3.0F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> TINBRONZEPICKAXE = ITEMS.register("tin_bronze_pickaxe", () -> new PickaxeItem(ToolTiers.TINBRONZE, 1, -2.8F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> TINBRONZEAXE = ITEMS.register("tin_bronze_axe", () -> new AxeItem(ToolTiers.TINBRONZE, 5.5F, -3.2F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<HoeItem> TINBRONZEHOE = ITEMS.register("tin_bronze_hoe", () -> new HoeItem(ToolTiers.TINBRONZE, -1, -2.0F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<SwordItem> TINBRONZEKNIFE = ITEMS.register("tin_bronze_knife", () -> new SwordItem(ToolTiers.TINBRONZE, 1, -2.0F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<SwordItem> TINBRONZEMACHETE = ITEMS.register("tin_bronze_machete", () -> new SwordItem(ToolTiers.TINBRONZE, 2, -2.6F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));


    public static final RegistryObject<Item> SCORCHEDBRONZESWORD = ITEMS.register("scorched_bronze_sword", () -> new SwordItem(ToolTiers.SCORCHEDBRONZE, 3, -2.4F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> SCORCHEDBRONZESHOVEL = ITEMS.register("scorched_bronze_shovel", () -> new ShovelItem(ToolTiers.SCORCHEDBRONZE, 1.5F, -3.0F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> SCORCHEDBRONZEPICKAXE = ITEMS.register("scorched_bronze_pickaxe", () -> new PickaxeItem(ToolTiers.SCORCHEDBRONZE, 1, -2.8F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> SCORCHEDBRONZEAXE = ITEMS.register("scorched_bronze_axe", () -> new AxeItem(ToolTiers.SCORCHEDBRONZE, 5.5F, -3.1F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> SCORCHEDBRONZEHOE = ITEMS.register("scorched_bronze_hoe", () -> new HoeItem(ToolTiers.SCORCHEDBRONZE, -3, 0.0f, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> SCORCHEDBRONZEKNIFE = ITEMS.register("scorched_bronze_knife", () -> new SwordItem(ToolTiers.SCORCHEDBRONZE, 1, -2.0f, new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> SCORCHEDBRONZEMACHETE = ITEMS.register("scorched_bronze_machete", () -> new SwordItem(ToolTiers.SCORCHEDBRONZE, 2, -2.6F, new Item.Properties().tab(ScGunsTab.TAB_MISC)));



    /*ARMOR*/
    public static final RegistryObject<ArmorItem> GAMBESONHELMET = ITEMS.register("gambeson_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> GAMBESONCHESTPLATE = ITEMS.register("gambeson_chestplate", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> GAMBESONLEGGINGS = ITEMS.register("gambeson_leggings", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> GAMBESONBOOTS = ITEMS.register("gambeson_boots", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.FEET, props()));
    public static final RegistryObject<ArmorItem> TINBRONZEHELMET = ITEMS.register("tin_bronze_helmet", () -> new ArmorItem(TinArmorMaterials.TIN_BRONZE, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> TINBRONZECHESTPLATE = ITEMS.register("tin_bronze_chestplate", () -> new ArmorItem(TinArmorMaterials.TIN_BRONZE, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> TINBRONZELEGGINGS = ITEMS.register("tin_bronze_leggings", () -> new ArmorItem(TinArmorMaterials.TIN_BRONZE, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> TINBRONZEBOOTS = ITEMS.register("tin_bronze_boots", () -> new ArmorItem(TinArmorMaterials.TIN_BRONZE, EquipmentSlot.FEET, props()));
    public static final RegistryObject<ArmorItem> SCORCHEDBRONZEHELMET = ITEMS.register("scorched_bronze_helmet", () -> new ArmorItem(ModArmorMaterials.SCORCHED_BRONZE, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> SCORCHEDBRONZECHESTPLATE = ITEMS.register("scorched_bronze_chestplate", () -> new ArmorItem(ModArmorMaterials.SCORCHED_BRONZE, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> SCORCHEDBRONZELEGGINGS = ITEMS.register("scorched_bronze_leggings", () -> new ArmorItem(ModArmorMaterials.SCORCHED_BRONZE, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> SCORCHEDBRONZEBOOTS = ITEMS.register("scorched_bronze_boots", () -> new ArmorItem(ModArmorMaterials.SCORCHED_BRONZE, EquipmentSlot.FEET, props()));


    /* COMPONENENTS */
    public static final RegistryObject<Item> TOOLHANDLE = registerMisc("tool_handle");
    public static final RegistryObject<Item> TOOLBINDING = registerMisc("tool_binding");
    public static final RegistryObject<Item> COPPERCONVERSIONKIT = registerMisc("copper_conversion_kit");
    public static final RegistryObject<Item> STEELCONVERSIONKIT = registerMisc("steel_conversion_kit");
    public static final RegistryObject<Item> BRASSCONVERSIONKIT = registerMisc("brass_conversion_kit");
    public static final RegistryObject<Item> SPECIALCONVERSIONKIT = registerMisc("special_conversion_kit");
    public static final RegistryObject<Item> ETHEREALCONVERSIONKIT = registerMisc("ethereal_conversion_kit");
    public static final RegistryObject<Item> HEAVYDUTYPLATFORM = registerMisc("heavy_duty_platform");
    public static final RegistryObject<Item> STONEGUNBARREL = registerMisc("stone_gun_barrel");
    public static final RegistryObject<Item> COPPERGUNBARREL = registerMisc("copper_gun_barrel");
    public static final RegistryObject<Item> IRONGUNBARREL = registerMisc("iron_gun_barrel");
    public static final RegistryObject<Item> BRASSGUNBARREL = registerMisc("brass_gun_barrel");
    public static final RegistryObject<Item> BASICMECHANISM = registerMisc("basic_mechanism");
    public static final RegistryObject<Item> MAGAZINE = registerMisc("magazine");
    public static final RegistryObject<Item> MACHINEPLATE = registerMisc("machine_plate");
    public static final RegistryObject<Item> RIVETCAST = registerMisc("rivet_cast");
    public static final RegistryObject<Item> BULLETPRESS = registerMisc("mold_bullet_press");
    public static final RegistryObject<Item> BIGBULLETPRESS = registerMisc("mold_big_bullet_casing");

    /* SLAG */
    public static final RegistryObject<Item> COPPERSLAG = registerMisc("copper_slag");
    public static final RegistryObject<Item> IRONSLAG = registerMisc("iron_slag");
    public static final RegistryObject<Item> GOLDSLAG = registerMisc("gold_slag");
    public static final RegistryObject<Item> BRASSSLAG = registerMisc("brass_slag");
    public static final RegistryObject<Item> ZINCSLAG = registerMisc("zinc_slag");
    public static final RegistryObject<Item> STEELSLAG = registerMisc("steel_slag");
    public static final RegistryObject<Item> DIAMONDSTEELSLAG = registerMisc("diamond_steel_slag");
    public static final RegistryObject<Item> ALUMINUMSLAG = registerMisc("aluminum_slag");

    /* MISC */
    public static final RegistryObject<Item> SOLIFIEDOIL = registerMisc("solidified_oil_clump");
    public static final RegistryObject<Item> RAWTIN = registerMisc("raw_tin");
    public static final RegistryObject<Item> TINNUGGET = registerMisc("tin_nugget");
    public static final RegistryObject<Item> TININGOT = registerMisc("tin_ingot");
    public static final RegistryObject<Item> TINSHEET = registerMisc("tin_sheet");
    public static final RegistryObject<Item> TINBRONZENUGGET = registerMisc("tin_bronze_nugget");


    public static final RegistryObject<Item> TINBRONZEINGOT = registerMisc("tin_bronze_ingot");
    public static final RegistryObject<Item> TINBRONZESHEET = registerMisc("tin_bronze_sheet");
    public static final RegistryObject<Item> FUELBRICK = ITEMS.register("fuel_brick",
            () -> new FuelItem(props(), 3200));
    public static final RegistryObject<Item> BAKEDSOURDOUGH = ITEMS.register("baked_sourdough",
            () -> new Item(new Item.Properties().tab(ScGunsTab.TAB_MISC)
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build())));
    public static final RegistryObject<Item> SLICEDSOURDOUGH = ITEMS.register("sliced_sourdough",
            () -> new Item(new Item.Properties().tab(ScGunsTab.TAB_MISC)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> SLICEDBREAD = ITEMS.register("sliced_bread",
            () -> new Item(new Item.Properties().tab(ScGunsTab.TAB_MISC)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> RICEDOUGH = ITEMS.register("rice_dough",
            () -> new Item(new Item.Properties().tab(ScGunsTab.TAB_MISC)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build())));

    public static final RegistryObject<Item> SLICEDCORNBREAD = ITEMS.register("sliced_cornbread",
            () -> new Item(new Item.Properties().tab(ScGunsTab.TAB_MISC)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(0.7F).build())));
    public static final RegistryObject<Item> CORNBREADDOUGH = ITEMS.register("cornbread_dough",
            () -> new Item(new Item.Properties().tab(ScGunsTab.TAB_MISC)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build())));










    public static final RegistryObject<Item> CORNFLOUR = registerMisc("corn_flour");
    public static final RegistryObject<Item> RICEFLOUR = registerMisc("rice_flour");
    public static final RegistryObject<Item> FIRECLAY = registerMisc("fire_clay");
    public static final RegistryObject<Item> BLASTBRICK = registerMisc("blast_brick");
    public static final RegistryObject<Item> RESIN = registerMisc("resin");
    public static final RegistryObject<Item> CRUSHEDQUARTZ = registerMisc("crushed_quartz");
    public static final RegistryObject<Item> CHARCOALDUST = registerMisc("charcoal_dust");
    public static final RegistryObject<Item> CINDER = ITEMS.register("cinder",
            () -> new FuelItem(props(), 1200));
    public static final RegistryObject<Item> CINDERCOKE = ITEMS.register("cinder_coke",
            () -> new FuelItem(props(), 2400));
    public static final RegistryObject<Item> CRUSHEDCINDER = registerMisc("crushed_cinder");
    public static final RegistryObject<Item> SULFURCHUNK = registerMisc("sulfur_chunk");
    public static final RegistryObject<Item> SANDDUST = registerMisc("sand_dust");
    public static final RegistryObject<Item> GRAVELDUST = registerMisc("gravel_dust");
    public static final RegistryObject<Item> LIMESTONEDUST = registerMisc("limestone_dust");
    public static final RegistryObject<Item> GUNPOWDERDUST = registerMisc("gunpowder_dust");
    public static final RegistryObject<Item> SPIRITGUNPOWDERDUST = registerMisc("spirit_gunpowder_dust");
    public static final RegistryObject<Item> SPIRITGUNPOWDER = registerMisc("spirit_gunpowder");
    public static final RegistryObject<Item> PUREGUNPOWDER = registerMisc("pure_gunpowder");
    public static final RegistryObject<Item> PUREGUNPOWDERDUST = registerMisc("pure_gunpowder_dust");
    public static final RegistryObject<Item> NITRODUST = registerMisc("nitro_dust");
    public static final RegistryObject<Item> NETHERSTARDUST = registerMisc("nether_star_dust");
    public static final RegistryObject<Item> ASTRALGUNPOWDERDUST = registerMisc("astral_gunpowder_dust");
    public static final RegistryObject<Item> ASTRALGUNPOWDER = registerMisc("astral_gunpowder");
    public static final RegistryObject<Item> ETHEREALPLATE = registerMisc("ethereal_plate");
    public static final RegistryObject<Item> ETHEREALMECHANISM = registerMisc("ethereal_mechanism");
    public static final RegistryObject<Item> SOULSTEELNUGGET = registerMisc("soul_steel_nugget");
    public static final RegistryObject<Item> DIAMONDSTEELNUGGET = registerMisc("diamond_steel_nugget");
    public static final RegistryObject<Item> DIAMONDSTEEL = registerMisc("diamond_steel");
    public static final RegistryObject<Item> DIAMONDSTEELSHEET = registerMisc("diamond_steel_sheet");
    public static final RegistryObject<Item> SCORCHEDBRONZENUGGET = registerMisc("scorched_bronze_nugget");
    public static final RegistryObject<Item> SCORCHEDBRONZEINGOT = registerMisc("scorched_bronze_ingot");
    public static final RegistryObject<Item> SCORCHEDBRONZESHEET = registerMisc("scorched_bronze_sheet");
    public static final RegistryObject<Item> VEHEMENTCOAL = ITEMS.register("vehement_coal",
            () -> new FuelItem(props(), 8000));
    public static final RegistryObject<Item> VIVACIOUSPULP = registerMisc("vivacious_pulp");
    public static final RegistryObject<Item> VIVACIOUSDOUGH = ITEMS.register("vivacious_dough",
            () -> new Item(new Item.Properties().tab(ScGunsTab.TAB_MISC)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(1.5f).build())));
    public static final RegistryObject<Item> VIVALOAF = ITEMS.register("viva_loaf",
            () -> new Item(new Item.Properties().tab(ScGunsTab.TAB_MISC)
                    .food(new FoodProperties.Builder().nutrition(8).saturationMod(1.2f).build())));
    public static final RegistryObject<Item> SLICEDVIVALOAF = ITEMS.register("sliced_viva_loaf",
            () -> new Item(new Item.Properties().tab(ScGunsTab.TAB_MISC)
                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(1.5f).build())));
    /* STONE */
    public static final RegistryObject<Item> VERIDIUMCHUNK = registerMisc("veridium_chunk");
    public static final RegistryObject<Item> TUFFCHUNK = registerMisc("tuff_chunk");
    public static final RegistryObject<Item> STONECHUNK = registerMisc("stone_chunk");
    public static final RegistryObject<Item> SHALECHUNK = registerMisc("shale_chunk");
    public static final RegistryObject<Item> SCORIACHUNK = registerMisc("scoria_chunk");
    public static final RegistryObject<Item> SCORCHIACHUNK = registerMisc("scorchia_chunk");
    public static final RegistryObject<Item> PERMAFROSTCHUNK = registerMisc("permafrost_chunk");
    public static final RegistryObject<Item> PERIDOTITECHUNK = registerMisc("peridotite_chunk");
    public static final RegistryObject<Item> OCHRUMCHUNK = registerMisc("ochrum_chunk");
    public static final RegistryObject<Item> LIMESTONECHUNK = registerMisc("limestone_chunk");
    public static final RegistryObject<Item> JASPERCHUNK = registerMisc("jasper_chunk");
    public static final RegistryObject<Item> GRANITECHUNK = registerMisc("granite_chunk");
    public static final RegistryObject<Item> DIORITECHUNK = registerMisc("diorite_chunk");
    public static final RegistryObject<Item> DRIPSTONECHUNK = registerMisc("dripstone_chunk");
    public static final RegistryObject<Item> DEEPSLATECHUNK = registerMisc("deepslate_chunk");
    public static final RegistryObject<Item> CRIMSITECHUNK = registerMisc("crimsite_chunk");
    public static final RegistryObject<Item> CALCITECHUNK = registerMisc("calcite_chunk");
    public static final RegistryObject<Item> BLACKSTONECHUNK = registerMisc("blackstone_chunk");
    public static final RegistryObject<Item> BASALTCHUNK = registerMisc("basalt_chunk");
    public static final RegistryObject<Item> ANDESITECHUNK = registerMisc("andesite_chunk");
    public static final RegistryObject<Item> ASURINECHUNK = registerMisc("asurine_chunk");
    public static final RegistryObject<Item> SKYSTONECHUNK = registerMisc("sky_stone_chunk");
    public static final RegistryObject<Item> MYALITECHUNK = registerMisc("myalite_chunk");
    public static final RegistryObject<Item> MOONCHUNK = registerMisc("moon_chunk");
    public static final RegistryObject<Item> MARSCHUNK = registerMisc("mars_chunk");
    public static final RegistryObject<Item> VENUSCHUNK = registerMisc("venus_chunk");
    public static final RegistryObject<Item> GLACIOCHUNK = registerMisc("glacio_chunk");
    public static final RegistryObject<Item> MERCURYCHUNK = registerMisc("mercury_chunk");
    public static final RegistryObject<Item> ENDSTONECHUNK = registerMisc("end_stone_chunk");
    public static final RegistryObject<Item> SANDSTONECHUNK = registerMisc("sandstone_chunk");
    public static final RegistryObject<Item> REDSANDSTONECHUNK = registerMisc("red_sandstone_chunk");
    public static final RegistryObject<Item> NETHERRACKCHUNK = registerMisc("netherrack_chunk");
    public static final RegistryObject<Item> SOULSTONECHUNK = registerMisc("soul_stone_chunk");
    public static final RegistryObject<Item> CONGLOMERATECHUNK = registerMisc("conglomerate_chunk");
    public static final RegistryObject<Item> RIMESTONECHUNK = registerMisc("rimestone_chunk");
    public static final RegistryObject<Item> GROUT = registerMisc("grout");
    /* SPAWN EGG */

    public static final RegistryObject<Item> COGMINIONSPAWNEGG = ITEMS.register("cog_minion_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.COGMINION, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> COGKNIGHTSPAWNEGG = ITEMS.register("cog_knight_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.COGKNIGHT, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> TRAININGDUMMYSPAWNEGG = ITEMS.register("training_dummy_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TRAININGDUMMY, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> TRAUMAUNITSPAWNEGG = ITEMS.register("trauma_unit_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TRAUMAUNIT, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> DEFECTIVETRAUMAUNITSPAWNEGG = ITEMS.register("defective_trauma_unit_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DEFECTIVETRAUMAUNIT, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> SUPPLYSCAMPSPAWNEGG = ITEMS.register("supply_scamp_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SUPPLYSCAMP, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> RAILWAYBANDITSPAWNEGG = ITEMS.register("railway_bandit_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.RAILWAYBANDIT, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> HATRAILWAYBANDITSPAWNEGG = ITEMS.register("hat_railway_bandit_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.HATRAILWAYBANDIT, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> GUNRAILWAYBANDITSPAWNEGG = ITEMS.register("gun_railway_bandit_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GUNRAILWAYBANDIT, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> CLUBRAILWAYBANDITSPAWNEGG = ITEMS.register("club_railway_bandit_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CLUBRAILWAYBANDIT, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> GIRLRAILWAYBANDITSPAWNEGG = ITEMS.register("girl_railway_bandit_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GIRLRAILWAYBANDIT, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> BROKENMININGUNITSPAWNEGG = ITEMS.register("broken_mining_unit_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BROKENMININGUNIT, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> BROKENGRINDERUNITSPAWNEGG = ITEMS.register("broken_grinder_unit_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BROKENGRINDERUNIT, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> FATTYRAILWAYBANDITSPAWNEGG = ITEMS.register("fatty_railway_bandit_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.FATTYRAILWAYBANDIT, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> RAILWAYBANDITCHIEFSPAWNEGG = ITEMS.register("railway_bandit_chief_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.RAILWAYBANDITCHIEF, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> SKYCARRIERSPAWNEGG = ITEMS.register("sky_carrier_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SKYCARRIER, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> KILNMANSPAWNEGG = ITEMS.register("kiln_man_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.KILNMAN, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> DISSIDENTSPAWNEGG = ITEMS.register("dissident_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DISSIDENT, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> ADJUDICATORSPAWNEGG = ITEMS.register("adjudicator_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ADJUDICATOR, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> SUBJUGATORSPAWNEGG = ITEMS.register("subjugator_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SUBJUGATOR, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> BOUNDONESPAWNEGG = ITEMS.register("bound_one_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BOUNDONE, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));
    public static final RegistryObject<Item> WOOLMANEGG = ITEMS.register("wool_man_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.WOOLMAN, 0x91693F, 0x765430,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC)));

    public static final RegistryObject<Item> ASTRAL_OIL_BUCKET = ITEMS.register("astral_oil_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ASTRAL_OIL,
                    new Item.Properties().tab(ScGunsTab.TAB_MISC).craftRemainder(Items.BUCKET).stacksTo(1)));


    private static RegistryObject<Item> registerGun(String name, boolean canColor) {
        return ITEMS.register(name, () -> new ScGunItem(genericProperties, canColor));
    }

    private static RegistryObject<Item> registerAmmo(String name) {
        return ITEMS.register(name, () -> new AmmoItem(new Item.Properties().tab(ScGuns.GROUP)));
    }

    private static RegistryObject<Item> registerMisc(String name) {
        return ITEMS.register(name, () -> new AmmoItem(new Item.Properties().tab(ScGuns.GROUP)));
    }

    private static Item.Properties props() {
        return new Item.Properties().tab(ScGuns.GROUP);
    }


}










