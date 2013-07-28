/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dogking190.lib.Names;
import dogking190.tmt.tmt;

public class Items 
{
	
	public static Item ingotPlatinum;
	public static Item ingotRuby;
	public static Item ingotTitanium;
	public static Item ingotCopper;
	public static Item ingotSapphire;
	public static Item ingotTin;
	public static Item ingotChrome;
	public static Item ingotZinc;
	
	
	public static Item gemRuby;
	public static Item gemSapphire;
	
	public static void init() 
	    {
	        
		ingotPlatinum = (new IngotPlatinum(tmt.ingotPlatinumID));
		ingotRuby = (new IngotRuby(tmt.ingotRubyID));
		ingotTitanium = (new IngotTitanium(tmt.ingotTitaniumID));
		ingotCopper = (new IngotCopper(tmt.ingotCopperID));
		gemSapphire = (new GemSapphire(tmt.gemSapphireID));
		ingotSapphire = (new IngotSapphire(tmt.ingotSapphireID));
		ingotTin = (new IngotTin(tmt.ingotTinID));
		ingotChrome = (new IngotChrome(tmt.ingotChromeID));
		ingotZinc = (new IngotZinc(tmt.ingotZincID));
		
		gemRuby = (new GemRuby(tmt.gemRubyID));
		
	    }
	
	public static void addNames()
	    {
	        
		LanguageRegistry.addName(ingotPlatinum, Names.ingotPlatinum_Name);
		LanguageRegistry.addName(ingotRuby, Names.ingotRuby_Name);
		LanguageRegistry.addName(ingotTitanium, Names.ingotTitanium_Name);
		LanguageRegistry.addName(gemRuby, Names.gemRuby_Name);
		LanguageRegistry.addName(ingotCopper, Names.ignotCopper_Name);
		LanguageRegistry.addName(gemSapphire, Names.gemSapphire_Name);
		LanguageRegistry.addName(ingotSapphire, Names.ingotSapphire_Name);
		LanguageRegistry.addName(ingotTin, Names.ingotTin_Name);
		LanguageRegistry.addName(ingotChrome, Names.ingotChrome_Name);
		LanguageRegistry.addName(ingotZinc, Names.ingotZinc_Name);
		
	    }
	
    public static void oreRegistration()
        {
           
            OreDictionary.registerOre("ingotPlatinum", new ItemStack(ingotPlatinum));
            OreDictionary.registerOre("ingotRuby", new ItemStack(ingotRuby));
            OreDictionary.registerOre("ingotTitanium", new ItemStack(ingotTitanium));
            OreDictionary.registerOre("gemRuby", new ItemStack(gemRuby));
            OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));
            OreDictionary.registerOre("gemSapphire", new ItemStack(gemSapphire));
            OreDictionary.registerOre("ingotSapphire", new ItemStack(ingotSapphire));
            OreDictionary.registerOre("ingotTin", new ItemStack(ingotTin));
            OreDictionary.registerOre("ingotChrome", new ItemStack(ingotChrome));
            OreDictionary.registerOre("ingotZinc", new ItemStack(ingotZinc));

            

            
        }
}
