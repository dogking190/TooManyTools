/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dogking190.lib.Names;
import dogking190.tmt.tmt;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Blocks
    {
        
        public static Block blockPlatinum;

    public static void init()
        {
            blockPlatinum = new BlockPlatinum(tmt.blockPlatinumID, Material.rock);
            
            GameRegistry.registerBlock(blockPlatinum, Names.blockPlatinum_Name);
            
        }

    public static void addNames()
        {
          LanguageRegistry.addName(blockPlatinum, Names.blockPlatinum_Name);
            
        }

    public static void oreRegistration()
        {
            OreDictionary.registerOre("blockPlatinum", new ItemStack(blockPlatinum));
        }
    
    }
