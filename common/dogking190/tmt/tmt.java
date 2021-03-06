/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dogking190.lib.Modinfo;
import dogking190.lib.PacketHandler;
import dogking190.tmt.Armor.Armory;
import dogking190.tmt.Blocks.Blocks;
import dogking190.tmt.Ore.BlocksOre;
import dogking190.tmt.Tools.Tools;
import dogking190.tmt.items.Items;
import dogking190.tmt.proxy.CommonProxy;

@Mod(modid= Modinfo.ID, name= Modinfo.Name, version= Modinfo.version)
@NetworkMod(channels = {Modinfo.Channel}, clientSideRequired=true, serverSideRequired=true, packetHandler = PacketHandler.class)

public class tmt {
	
    @Instance("tmt")
    public static tmt instance = new tmt();

    @SidedProxy(clientSide= Modinfo.Proxy_Loc + ".ClientProxy", serverSide= Modinfo.Proxy_Loc + ".CommonProxy")
    public static CommonProxy proxy;

    /** Config Ores*/
    public static int genericOreID;
    public static int orePlatinumID;
    public static int oreRubyID;
    public static int oreCopperID;
    public static int oreTinID;
    public static int oreChromeID;
    public static int oreZincID;
    public static int oreSapphireID;
    
    /** Config Blocks */
    public static int blockPlatinumID;
    
    /** Config Items */
    public static int ingotPlatinumID;
    public static int ingotTitaniumID;
    public static int ingotCopperID;
    public static int ingotTinID;
    public static int ingotChromeID;
    public static int ingotZincID;
    
    public static int gemRubyID;
    public static int gemSapphireID;
    public static int ingotSapphireID;
    public static int ingotRubyID;
    
    /** Config Platinum Tools */
    public static int swordPlatinumID;
    public static int pickaxePlatinumID;
    public static int axePlatinumID;
    public static int spadePlatinumID;
    public static int hoePlatinumID;
    
    /** Config Titanium Tools */
    public static int swordTitaniumID;
    public static int pickaxeTitaniumID;
    public static int axeTitaniumID;
    public static int spadeTitaniumID;
    public static int hoeTitaniumID;
    
    /** Config Sapphire Tools */
    public static int swordSapphireID;
    public static int pickaxeSapphireID;
    public static int axeSapphireID;
    public static int spadeSapphireID;
    public static int hoeSapphireID;
    
    /** Config Copper Tools */
    public static int swordCopperID;
    public static int pickaxeCopperID;
    public static int axeCopperID;
    public static int spadeCopperID;
    public static int hoeCopperID;
    
    /** Config Zinc Tools */
    public static int swordZincID;
    public static int pickaxeZincID;
    public static int axeZincID;
    public static int spadeZincID;
    public static int hoeZincID;
    
    /** Config Tin Tools */
    public static int swordTinID;
    public static int pickaxeTinID;
    public static int axeTinID;
    public static int spadeTinID;
    public static int hoeTinID;
    
    /** Config Ruby Tools */
    public static int swordRubyID;
    public static int pickaxeRubyID;
    public static int axeRubyID;
    public static int spadeRubyID;
    public static int hoeRubyID;
    
    /** Config Chrome Tools */
    public static int swordChromeID;
    public static int pickaxeChromeID;
    public static int axeChromeID;
    public static int spadeChromeID;
    public static int hoeChromeID;
    
    /** Config Ruby Armor */
    public static int RubyHelmentID;
    public static int RubyChestPlateID;
    public static int RubyLeggingsID;
    public static int RubyBootsID;
    
    /** Config Sapphire Armor */
    public static int SapphireHelmentID;
    public static int SapphireChestPlateID;
    public static int SapphireLeggingsID;
    public static int SapphireBootsID;
    
    /** Config Zinc Armor */
    public static int ZincHelmentID;
    public static int ZincChestPlateID;
    public static int ZincLeggingsID;
    public static int ZincBootsID;
    
    /** Config Tin Armor */
    public static int TinHelmentID;
    public static int TinChestPlateID;
    public static int TinLeggingsID;
    public static int TinBootsID;
    
    /** Config Platinum Armor */
    public static int PlatinumHelmentID;
    public static int PlatinumChestPlateID;
    public static int PlatinumLeggingsID;
    public static int PlatinumBootsID;
    
    /** Config Copper Armor */
    public static int CopperHelmentID;
    public static int CopperChestPlateID;
    public static int CopperLeggingsID;
    public static int CopperBootsID;
    
    /** Config Chrome Armor */
    public static int ChromeHelmentID;
    public static int ChromeChestPlateID;
    public static int ChromeLeggingsID;
    public static int ChromeBootsID;
    
    /** Config Titanium Armor */
    public static int TitaniumHelmentID;
    public static int TitaniumChestPlateID;
    public static int TitaniumLeggingsID;
    public static int TitaniumBootsID;
 
    /** Creative Tab Var */
    public static CreativeTabs tabTooManytools = new tabTooManyTools(CreativeTabs.getNextID(), "TooManyTools");
     
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.initRenderers();
    	proxy.initSounds();
    	
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	
    	/** Items ID*/
    	ingotPlatinumID = config.getItem("Platinum Ingot", 6000).getInt();
    	ingotRubyID = config.getItem("Ruby Ingot", 6001).getInt();
    	ingotTitaniumID = config.getItem("Titanium Ingot", 6002).getInt();
    	gemRubyID = config.getItem("Ruby Gem", 6003).getInt();
    	ingotCopperID = config.getItem("Copper Ingot", 6004).getInt();
    	gemSapphireID = config.getItem("Sapphire Gem", 6005).getInt();
    	ingotSapphireID = config.getItem("Sapphire Ingot", 6006).getInt();
    	ingotTinID = config.getItem("Tin Ingot", 6007).getInt();
    	ingotChromeID = config.getItem("Chrome Ingot", 6008).getInt();
    	ingotZincID = config.getItem("Zinc Ingot", 6009).getInt();
    	
    	/** Platinum Tools ID*/
    	swordPlatinumID = config.getItem("Platinum Sword", 7000).getInt();
    	pickaxePlatinumID = config.getItem("Platinum Pickaxe", 7001).getInt();
    	axePlatinumID = config.getItem("Platinum Axe", 7002).getInt();
    	spadePlatinumID = config.getItem("Platinum Spade", 7004).getInt();
    	hoePlatinumID = config.getItem("Platinun Hoe", 7005).getInt();
    	
    	/** Titanium Tools ID */
    	swordTitaniumID = config.getItem("Titanium Sword", 7006).getInt();
        pickaxeTitaniumID = config.getItem("Titanium Pickaxe", 7007).getInt();
        axeTitaniumID = config.getItem("Titanium Axe", 7008).getInt();
        spadeTitaniumID = config.getItem("Titanium Spade", 7009).getInt();
        hoeTitaniumID = config.getItem("Titanium Hoe", 7010).getInt();
        
        /** Sapphire Tools ID */
        swordSapphireID = config.getItem("Sapphire Sword", 7011).getInt();
        pickaxeSapphireID = config.getItem("Sapphire Pickaxe", 7012).getInt();
        axeSapphireID = config.getItem("Sapphire Axe", 7013).getInt();
        spadeSapphireID = config.getItem("Sapphire Spade", 7014).getInt();
        hoeSapphireID = config.getItem("Sapphire Hoe", 7015).getInt();
        
        /** Copper Tools ID */
        swordCopperID = config.getItem("Copper Sword", 7016).getInt();
        pickaxeCopperID = config.getItem("Copper Pickaxe", 7017).getInt();
        axeCopperID = config.getItem("Copper Axe", 7018).getInt();
        spadeCopperID = config.getItem("Copper Spade", 7019).getInt();
        hoeCopperID = config.getItem("Copper Hoe", 7020).getInt();
        
        /** Zinc Tools ID*/
        swordZincID = config.getItem("Zinc Sword", 7021).getInt();
        pickaxeZincID = config.getItem("Zinc Pickaxe", 7022).getInt();
        axeZincID = config.getItem("Zinc Axe", 7023).getInt();
        spadeZincID = config.getItem("Zinc Spade", 7024).getInt();
        hoeZincID = config.getItem("Zinc Hoe", 7025).getInt();
        
        /** Tin Tools ID */
        swordTinID = config.getItem("Tin Sword", 7026).getInt();
        pickaxeTinID = config.getItem("Tin Pickaxe", 7027).getInt();
        axeTinID = config.getItem("Tin Axe", 7028).getInt();
        spadeTinID = config.getItem("Tin Spade", 7029).getInt();
        hoeTinID = config.getItem("Tin Hoe", 7030).getInt();
        
        /** Ruby Tools ID */
        swordRubyID = config.getItem("Ruby Sword", 7031).getInt();
        pickaxeRubyID = config.getItem("Ruby Pickaxe", 7032).getInt();
        axeRubyID = config.getItem("Ruby Axe", 7033).getInt();
        spadeRubyID = config.getItem("Ruby Spade", 7034).getInt();
        hoeRubyID = config.getItem("Ruby Hoe", 7035).getInt();
        
        /** Chrome Tools ID */
        swordChromeID = config.getItem("Chrome Sword", 7036).getInt();
        pickaxeChromeID = config.getItem("Chrome Pickaxe", 7037).getInt();
        axeChromeID = config.getItem("Chrome Axe", 7038).getInt();
        spadeChromeID = config.getItem("Chrome Spade", 7039).getInt();
        hoeChromeID = config.getItem("Chrome Hoe", 7040).getInt();
    	
    	
    	/** Ores ID*/
    	genericOreID = config.getBlock("Titanium Ore",4095).getInt();
    	orePlatinumID = config.getBlock("Platinum Ore",4094).getInt();
    	oreRubyID = config.getBlock("Ruby Ore", 4093).getInt();
    	oreCopperID = config.getBlock("Copper Ore", 4092).getInt();
    	oreTinID = config.getBlock("Tin Ore", 4091).getInt();
    	oreChromeID = config.getBlock("Chrome Ore", 4090).getInt();
    	oreZincID = config.getBlock("Zinc Ore", 4089).getInt();
    	oreSapphireID = config.getBlock("Sapphire Ore", 4088).getInt();
    	
    	/** Blocks ID*/
    	blockPlatinumID = config.getBlock("Platinum Block", 4000).getInt();
    	
    	/** Ruby Armor ID */
    	RubyHelmentID = config.getItem("Ruby Helment", 8000).getInt();
    	RubyChestPlateID = config.getItem("Ruby ChestPlate", 8001).getInt();
    	RubyLeggingsID = config.getItem("Ruby Leggings", 8002).getInt();
    	RubyBootsID = config.getItem("Ruby Boots", 8003).getInt();
    	
    	/** Sapphire Armor ID */
    	SapphireHelmentID = config.getItem("Sapphire Helment", 8004).getInt();
    	SapphireChestPlateID = config.getItem("Sapphire ChestPlate", 8005).getInt();
    	SapphireLeggingsID = config.getItem("Sapphire Leggings", 8006).getInt();
    	SapphireBootsID = config.getItem("Sapphire Boots", 8007).getInt();
    	
    	/** Zinc Armor ID */
    	ZincHelmentID = config.getItem("Zinc Helment", 8008).getInt();
        ZincChestPlateID = config.getItem("Zinc ChestPlate", 8009).getInt();
        ZincLeggingsID = config.getItem("Zinc Leggings", 8010).getInt();
        ZincBootsID = config.getItem("Zinc Boots", 8011).getInt();
        
        /** Tin Armor ID */
        TinHelmentID = config.getItem("Tin Helment", 8012).getInt();
        TinChestPlateID = config.getItem("Tin ChestPlate", 8013).getInt();
        TinLeggingsID = config.getItem("Tin Leggings", 8014).getInt();
        TinBootsID = config.getItem("Tin Boots", 8015).getInt();
        
        /** Platinum Armor ID */ 
        PlatinumHelmentID = config.getItem("Platinum Helment", 8016).getInt();
        PlatinumChestPlateID = config.getItem("Platinum ChestPlate", 8017).getInt();
        PlatinumLeggingsID = config.getItem("Platinum Leggings", 8018).getInt();
        PlatinumBootsID = config.getItem("Platinum Boots", 8019).getInt();
        
        /** Copper Armor ID */
        CopperHelmentID = config.getItem("Copper Helment", 8020).getInt();
        CopperChestPlateID = config.getItem("Copper ChestPlate", 8021).getInt();
        CopperLeggingsID = config.getItem("Copper Leggings", 8022).getInt();
        CopperBootsID = config.getItem("Copper Boots", 8023).getInt();
        
        /** Chrome Armor ID */
        ChromeHelmentID = config.getItem("Chrome Helment", 8024).getInt();
        ChromeChestPlateID = config.getItem("Chrome ChestPlate", 8025).getInt();
        ChromeLeggingsID = config.getItem("Chrome Leggings", 8026).getInt();
        ChromeBootsID = config.getItem("Chrome Boots", 8027).getInt();
        
        /** Titanium Armor ID */
        TitaniumHelmentID = config.getItem("Titanium Helment", 8024).getInt();
        TitaniumChestPlateID = config.getItem("Titanium ChestPlate", 8025).getInt();
        TitaniumLeggingsID = config.getItem("Titanium Leggings", 8026).getInt();
        TitaniumBootsID = config.getItem("Titanium Boots", 8027).getInt();
    	
    	config.save();
    
    }
    
    @EventHandler
    public void Init(FMLInitializationEvent event)
        {
            
    	Items.init();
    	Items.addNames();
    	Items.oreRegistration();
    	
    	Tools.inti();
    	Tools.addName();
    	
    	Blocks.init();
    	Blocks.addNames();
    	Blocks.oreRegistration();
    	
    	BlocksOre.init();
    	BlocksOre.addNames();
    	
    	Armory.init();
    	Armory.addNames();
    	
    	addRecipe();
    	addSmelting();
    	
    	/** World Gen Registry */
    	GameRegistry.registerWorldGenerator(new tmtWorldGen()); 
    	
    	/** My Custom Tabs*/
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabTooManyTools", "en_US", "Too Many Tools");
    	
    	/** Smelting Blocks */
    	GameRegistry.addSmelting(BlocksOre.orePlatinum.blockID, new ItemStack(Items.ingotPlatinum, 1), 0.2F);
    	GameRegistry.addSmelting(BlocksOre.genericOre.blockID, new ItemStack(Items.ingotTitanium, 1), 0.2F);
        GameRegistry.addSmelting(BlocksOre.oreCopper.blockID, new ItemStack(Items.ingotCopper, 1), 0.2F);
        GameRegistry.addSmelting(BlocksOre.oreTin.blockID, new ItemStack(Items.ingotTin, 1), 0.2F);
        GameRegistry.addSmelting(BlocksOre.oreChrome.blockID, new ItemStack(Items.ingotChrome, 1), 0.2F);
        GameRegistry.addSmelting(BlocksOre.oreZinc.blockID, new ItemStack(Items.ingotZinc, 1), 0.2F);
    	
    	/** Smelting Items */
        GameRegistry.addSmelting(Items.gemSapphire.itemID, new ItemStack(Items.ingotSapphire, 1), 0.2F);
        GameRegistry.addSmelting(Items.gemRuby.itemID, new ItemStack(Items.ingotRuby, 1), 0.2F);

        }
    
    private void addSmelting()
        {
            
            /** Smelting Blocks */
            GameRegistry.addSmelting(BlocksOre.orePlatinum.blockID, new ItemStack(Items.ingotPlatinum, 1), 0.2F);
            GameRegistry.addSmelting(BlocksOre.genericOre.blockID, new ItemStack(Items.ingotTitanium, 1), 0.2F);
            GameRegistry.addSmelting(BlocksOre.oreCopper.blockID, new ItemStack(Items.ingotCopper, 1), 0.2F);
            GameRegistry.addSmelting(BlocksOre.oreTin.blockID, new ItemStack(Items.ingotTin, 1), 0.2F);
            GameRegistry.addSmelting(BlocksOre.oreChrome.blockID, new ItemStack(Items.ingotChrome, 1), 0.2F);
            GameRegistry.addSmelting(BlocksOre.oreZinc.blockID, new ItemStack(Items.ingotZinc, 1), 0.2F);
            
            /** Smelting Items */
            GameRegistry.addSmelting(Items.gemSapphire.itemID, new ItemStack(Items.ingotSapphire, 1), 0.2F);
            GameRegistry.addSmelting(Items.gemRuby.itemID, new ItemStack(Items.ingotRuby, 1), 0.2F);

        }

    private void addRecipe()
        {
            
            /** Blocks */
            GameRegistry.addRecipe(new ShapedOreRecipe(Blocks.blockPlatinum, true, new Object[]{"FFF","FFF","FFF", Character.valueOf('F'), "ingotPlatinum"}));
            
            /** Ingots */
            GameRegistry.addRecipe(new ItemStack(Items.ingotPlatinum, 9), new Object[]{"P", Character.valueOf('P'), Blocks.blockPlatinum});
            
            /** Platinum Tools */
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.swordPlatinum, true, new Object[]{" F "," F "," S ", Character.valueOf('F'), "ingotPlatinum", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.pickaxePlatinum, true, new Object[]{"FFF"," S "," S ", Character.valueOf('F'), "ingotPlatinum", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.spadePlatinum, true, new Object[]{" F "," S "," S ", Character.valueOf('F'), "ingotPlatinum", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.hoePlatinum, true, new Object[]{"FF "," S "," S ", Character.valueOf('F'), "ingotPlatinum", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.axePlatinum, true, new Object[]{" FF"," SF"," S ", Character.valueOf('F'), "ingotPlatinum", Character.valueOf('S'),Item.stick}));
            
            /** Sapphire Tools */
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.swordSapphire, true, new Object[]{" F "," F "," S ", Character.valueOf('F'), "gemSapphire", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.pickaxeSapphire, true, new Object[]{"FFF"," S "," S ", Character.valueOf('F'), "gemSapphire", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.spadeSapphire, true, new Object[]{" F "," S "," S ", Character.valueOf('F'), "gemSapphire", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.hoeSapphire, true, new Object[]{"FF "," S "," S ", Character.valueOf('F'), "gemSapphire", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.axeSapphire, true, new Object[]{" FF"," SF"," S ", Character.valueOf('F'), "gemSapphire", Character.valueOf('S'),Item.stick}));
            
            /** Titanium Tools */
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.swordTitanium, true, new Object[]{" F "," F "," S ", Character.valueOf('F'), "ingotTitanium", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.pickaxeTitanium, true, new Object[]{"FFF"," S "," S ", Character.valueOf('F'), "ingotTitanium", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.spadeTitanium, true, new Object[]{" F "," S "," S ", Character.valueOf('F'), "ingotTitanium", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.hoeTitanium, true, new Object[]{"FF "," S "," S ", Character.valueOf('F'), "ingotTitanium", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.axeTitanium, true, new Object[]{" FF"," SF"," S ", Character.valueOf('F'), "ingotTitanium", Character.valueOf('S'),Item.stick}));
            
            /** Ruby Tools */
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.swordRuby, true, new Object[]{" F "," F "," S ", Character.valueOf('F'), "gemRuby", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.pickaxeRuby, true, new Object[]{"FFF"," S "," S ", Character.valueOf('F'), "gemRuby", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.spadeRuby, true, new Object[]{" F "," S "," S ", Character.valueOf('F'), "gemRuby", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.hoeRuby, true, new Object[]{"FF "," S "," S ", Character.valueOf('F'), "gemRuby", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.axeRuby, true, new Object[]{" FF"," SF"," S ", Character.valueOf('F'), "gemRuby", Character.valueOf('S'),Item.stick}));
            
            /** Copper Tools */
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.swordCopper, true, new Object[]{" F "," F "," S ", Character.valueOf('F'), "ingotCopper", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.pickaxeCopper, true, new Object[]{"FFF"," S "," S ", Character.valueOf('F'), "ingotCopper", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.spadeCopper, true, new Object[]{" F "," S "," S ", Character.valueOf('F'), "ingotCopper", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.hoeCopper, true, new Object[]{"FF "," S "," S ", Character.valueOf('F'), "ingotCopper", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.axeCopper, true, new Object[]{" FF"," SF"," S ", Character.valueOf('F'), "ingotCopper", Character.valueOf('S'),Item.stick}));
            
            /** Tin Tools */
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.swordTin, true, new Object[]{" F "," F "," S ", Character.valueOf('F'), "ingotTin", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.pickaxeTin, true, new Object[]{"FFF"," S "," S ", Character.valueOf('F'), "ingotTin", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.spadeTin, true, new Object[]{" F "," S "," S ", Character.valueOf('F'), "ingotTin", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.hoeTin, true, new Object[]{"FF "," S "," S ", Character.valueOf('F'), "ingotTin", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.axeTin, true, new Object[]{" FF"," SF"," S ", Character.valueOf('F'), "ingotTin", Character.valueOf('S'),Item.stick}));
            
            /** Zinc Tools */
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.swordZinc, true, new Object[]{" F "," F "," S ", Character.valueOf('F'), "ingotZinc", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.pickaxeZinc, true, new Object[]{"FFF"," S "," S ", Character.valueOf('F'), "ingotZinc", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.spadeZinc, true, new Object[]{" F "," S "," S ", Character.valueOf('F'), "ingotZinc", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.hoeZinc, true, new Object[]{"FF "," S "," S ", Character.valueOf('F'), "ingotZinc", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.axeZinc, true, new Object[]{" FF"," SF"," S ", Character.valueOf('F'), "ingotZinc", Character.valueOf('S'),Item.stick}));
            
            /** Chrome Tools */
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.swordChrome, true, new Object[]{" F "," F "," S ", Character.valueOf('F'), "ingotChrome", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.pickaxeChrome, true, new Object[]{"FFF"," S "," S ", Character.valueOf('F'), "ingotChrome", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.spadeChrome, true, new Object[]{" F "," S "," S ", Character.valueOf('F'), "ingotChrome", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.hoeChrome, true, new Object[]{"FF "," S "," S ", Character.valueOf('F'), "ingotChrome", Character.valueOf('S'),Item.stick}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Tools.axeChrome, true, new Object[]{" FF"," SF"," S ", Character.valueOf('F'), "ingotChrome", Character.valueOf('S'),Item.stick}));
            
            /** Ruby Armor */
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.rubyHelment, true, new Object[]{"FFF","F F","   ", Character.valueOf('F'), "ingotRuby"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.rubyChestPlate, true, new Object[]{"F F","FFF","FFF", Character.valueOf('F'), "ingotRuby"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.rubyLeggings, true, new Object[]{"FFF","F F","F F", Character.valueOf('F'), "ingotRuby"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.rubyBoots, true, new Object[]{"   ","F F","F F", Character.valueOf('F'), "ingotRuby"}));
            
            /** Sapphire Armor */
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.sapphireHelment, true, new Object[]{"FFF","F F","   ", Character.valueOf('F'), "ingotSapphire"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.sapphireChestPlate, true, new Object[]{"F F","FFF","FFF", Character.valueOf('F'), "ingotSapphire"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.sapphireLeggings, true, new Object[]{"FFF","F F","F F", Character.valueOf('F'), "ingotSapphire"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.sapphireBoots, true, new Object[]{"   ","F F","F F", Character.valueOf('F'), "ingotSapphire"}));
            
            /** Zinc Armor */
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.zincHelment, true, new Object[]{"FFF","F F","   ", Character.valueOf('F'), "ingotZinc"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.zincChestPlate, true, new Object[]{"F F","FFF","FFF", Character.valueOf('F'), "ingotZinc"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.zincLeggings, true, new Object[]{"FFF","F F","F F", Character.valueOf('F'), "ingotZinc"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.zincBoots, true, new Object[]{"   ","F F","F F", Character.valueOf('F'), "ingotZinc"}));
            
            /** Tin Armor */
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.tinHelment, true, new Object[]{"FFF","F F","   ", Character.valueOf('F'), "ingotTin"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.tinChestPlate, true, new Object[]{"F F","FFF","FFF", Character.valueOf('F'), "ingotTin"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.tinLeggings, true, new Object[]{"FFF","F F","F F", Character.valueOf('F'), "ingotTin"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.tinBoots, true, new Object[]{"   ","F F","F F", Character.valueOf('F'), "ingotTin"}));
            
            /** Platinum Armor */
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.platinumHelment, true, new Object[]{"FFF","F F","   ", Character.valueOf('F'), "ingotPlatinum"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.platinumChestPlate, true, new Object[]{"F F","FFF","FFF", Character.valueOf('F'), "ingotPlatinum"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.platinumLeggings, true, new Object[]{"FFF","F F","F F", Character.valueOf('F'), "ingotPlatinum"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.platinumBoots, true, new Object[]{"   ","F F","F F", Character.valueOf('F'), "ingotPlatinum"}));
            
            /** Copper Armor */
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.copperHelment, true, new Object[]{"FFF","F F","   ", Character.valueOf('F'), "ingotCopper"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.copperChestPlate, true, new Object[]{"F F","FFF","FFF", Character.valueOf('F'), "ingotCopper"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.copperLeggings, true, new Object[]{"FFF","F F","F F", Character.valueOf('F'), "ingotCopper"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.copperBoots, true, new Object[]{"   ","F F","F F", Character.valueOf('F'), "ingotCopper"}));
            
            /** Chrome Armor */
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.chromeHelment, true, new Object[]{"FFF","F F","   ", Character.valueOf('F'), "ingotChrome"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.chromeChestPlate, true, new Object[]{"F F","FFF","FFF", Character.valueOf('F'), "ingotChrome"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.chromeLeggings, true, new Object[]{"FFF","F F","F F", Character.valueOf('F'), "ingotChrome"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.chromeBoots, true, new Object[]{"   ","F F","F F", Character.valueOf('F'), "ingotChrome"}));
            
            /** Titanium Armor */
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.titaniumHelment, true, new Object[]{"FFF","F F","   ", Character.valueOf('F'), "ingotTitanium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.titaniumChestPlate, true, new Object[]{"F F","FFF","FFF", Character.valueOf('F'), "ingotTitanium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.titaniumLeggings, true, new Object[]{"FFF","F F","F F", Character.valueOf('F'), "ingotTitanium"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(Armory.titaniumBoots, true, new Object[]{"   ","F F","F F", Character.valueOf('F'), "ingotTitanium"}));
            
        }
    
    @EventHandler
    public void PostInit(FMLPostInitializationEvent event)
        {
        
        }
    
   	}