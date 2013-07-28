/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.Ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dogking190.lib.Names;
import dogking190.tmt.tmt;

public class BlocksOre{
	
	public static Block orePlatinum;
    public static Block genericOre;
    public static Block oreRuby;
    public static Block oreCopper;
    public static Block oreTin;
    public static Block oreChrome;
    public static Block oreZinc;
    public static Block oreSapphire;
	
	public static void init(){
		
		//Blocks
		orePlatinum = new OrePlatinum(tmt.orePlatinumID, Material.rock );
		genericOre = new GenericOre(tmt.genericOreID, Material.rock);
    	oreRuby = new OreRuby(tmt.oreRubyID, Material.rock);
    	oreCopper = new OreCopper(tmt.oreCopperID, Material.rock);
    	oreTin = new OreTin(tmt.oreTinID, Material.rock);
    	oreChrome = new OreChrome(tmt.oreChromeID, Material.rock);
    	oreZinc = new OreZinc(tmt.oreZincID, Material.rock);
    	oreSapphire = new OreSapphire(tmt.oreSapphireID, Material.rock);
		
		//GameRegistry
		GameRegistry.registerBlock(orePlatinum, Names.orePlatinum_Name);
    	GameRegistry.registerBlock(genericOre, "genericOre");
    	GameRegistry.registerBlock(oreRuby, "oreRuby");
    	GameRegistry.registerBlock(oreCopper, Names.oreCopper_Name);
    	GameRegistry.registerBlock(oreTin, Names.oreTin_Name);
    	GameRegistry.registerBlock(oreChrome, Names.oreChrome_Name);
    	GameRegistry.registerBlock(oreZinc, Names.oreZinc_Name);
    	GameRegistry.registerBlock(oreSapphire, Names.oreSapphire_Name);
    	
		//Minecraft Harvest
		MinecraftForge.setBlockHarvestLevel(orePlatinum,"pickaxe", 1);
    	MinecraftForge.setBlockHarvestLevel(genericOre, "pickaxe", 4);
    	MinecraftForge.setBlockHarvestLevel(oreRuby, "Pickaxe", 2);
    	MinecraftForge.setBlockHarvestLevel(oreCopper, "pickaxe", 1);
    	MinecraftForge.setBlockHarvestLevel(oreTin, "pickaxe", 1);
    	MinecraftForge.setBlockHarvestLevel(oreChrome, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(oreZinc, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(oreSapphire, "pickaxe", 1);


    	
	}

    public static void addNames()
        {
            
            LanguageRegistry.addName(orePlatinum, Names.orePlatinum_Name);
            LanguageRegistry.addName(genericOre, Names.genericOre_Name);
            LanguageRegistry.addName(oreRuby, Names.oreRuby_Name);
            LanguageRegistry.addName(oreCopper, Names.oreCopper_Name);
            LanguageRegistry.addName(oreTin, Names.oreTin_Name);
            LanguageRegistry.addName(oreChrome, Names.oreChrome_Name);
            LanguageRegistry.addName(oreZinc, Names.oreZinc_Name);
            LanguageRegistry.addName(oreSapphire, Names.oreSapphire_Name);


  
        }
	
	


}
