/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.Ore;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import dogking190.lib.Modinfo;
import dogking190.lib.Names;
import dogking190.tmt.tmt;
import dogking190.tmt.items.Items;

public class OreSapphire extends Block
    {

    public OreSapphire(int par1, Material par2Material)
        {
            super(par1, par2Material);
            
            this.setCreativeTab(tmt.tabTooManytools);
            this.setUnlocalizedName(Names.oreSapphire_UnlocalizedName);
            this.setResistance(5.0F);
            this.setHardness(5.0F);
            this.func_111022_d(Modinfo.ID.toLowerCase() +":" + Names.oreSapphire_UnlocalizedName);
        }
    
    public int idDropped(int par1, Random random, int zero) {
        return Items.gemSapphire.itemID;
}

    }
