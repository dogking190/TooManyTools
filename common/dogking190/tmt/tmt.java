/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
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
import dogking190.tmt.Blocks.Blocks;
import dogking190.tmt.Ore.BlocksOre;
import dogking190.tmt.Ore.GenericOre;
import dogking190.tmt.Ore.OrePlatinum;
import dogking190.tmt.Ore.OreRuby;
import dogking190.tmt.items.Items;
import dogking190.tmt.proxy.CommonProxy;

@Mod(modid= Modinfo.ID, name= Modinfo.Name, version= Modinfo.version)
@NetworkMod(channels = {Modinfo.Channel}, clientSideRequired=true, serverSideRequired=true)

public class tmt {
	
    @Instance("tmt")
    public static tmt instance;
    
    @SidedProxy(clientSide= Modinfo.Proxy_Loc + ".ClientProxy", serverSide= Modinfo.Proxy_Loc + ".CommonProxy")
    public static CommonProxy proxy;
    
    //Config Ore
    public static int genericOreID;
    public static int orePlatinumID;
    public static int oreRubyID;
    public static int oreCopperID;
    public static int oreTinID;
    public static int oreChromeID;
    public static int oreZincID;
    public static int oreSapphireID;
    
    //Config Blocks
    public static int blockPlatinumID;
    
    //Config Items
    public static int ingotPlatinumID;
    public static int ingotRubyID;
    public static int ingotTitaniumID;
    public static int ingotCopperID;
    
    public static int gemRubyID;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.initRenderers();
    	proxy.initSounds();
    	
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	
    	//Items
    	ingotPlatinumID = config.getItem("Platinum Ingot", 6000).getInt();
    	ingotRubyID = config.getItem("Ruby Ingot", 6001).getInt();
    	ingotTitaniumID = config.getItem("Titanium Ingot", 6002).getInt();
    	gemRubyID = config.getItem("Ruby Gem", 6003).getInt();
    	ingotCopperID = config.getItem("Copper Ingot", 6004).getInt();
    	
    	//Ores
    	genericOreID = config.getBlock("Titanium Ore",4095).getInt();
    	orePlatinumID = config.getBlock("Platinum Ore",4094).getInt();
    	oreRubyID = config.getBlock("Ruby Ore", 4093).getInt();
    	oreCopperID = config.getBlock("Copper Ore", 4092).getInt();
    	oreTinID = config.getBlock("Tin Ore", 4091).getInt();
    	oreChromeID = config.getBlock("Chrome Ore", 4090).getInt();
    	oreZincID = config.getBlock("Zinc Ore", 4089).getInt();
    	oreSapphireID = config.getBlock("Sapphire Ore", 4088).getInt();
    	
    	//Blocks
    	blockPlatinumID = config.getBlock("Platinum Block", 4000).getInt();
    	
    	config.save();
    

    }
    	
    	
    
    @EventHandler
    public void Init(FMLInitializationEvent event)
        {
            
    	Items.init();
    	Items.addNames();
    	Items.oreRegistration();
    	
    	Blocks.init();
    	Blocks.addNames();
    	Blocks.oreRegistration();
    	
    	BlocksOre.init();
    	BlocksOre.addNames();
    	

    	//GameRegistry WorldGen
    	GameRegistry.registerWorldGenerator(new tmtWorldGen()); 
    	
    	//Smelting
    	GameRegistry.addSmelting(orePlatinumID, new ItemStack(Items.ingotPlatinum, 1), 0.2F);
    	GameRegistry.addSmelting(genericOreID, new ItemStack(Items.ingotTitanium, 1), 0.2F);
    	
    	//Crafting Recipe Ore 
    	GameRegistry.addRecipe(new ShapedOreRecipe(Blocks.blockPlatinum, true, new Object[]{"FFF","FFF","FFF", Character.valueOf('F'), "ingotPlatinum"}));
    	GameRegistry.addRecipe(new ItemStack(Items.ingotPlatinum, 9), new Object[]{"P", Character.valueOf('P'), Blocks.blockPlatinum});
    	
        }






    @EventHandler
    public void PostInit(FMLPostInitializationEvent event){
    	
    }
	


   
   	}


    
   



