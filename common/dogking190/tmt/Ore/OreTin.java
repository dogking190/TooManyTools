/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.Ore;

import dogking190.lib.Modinfo;
import dogking190.lib.Names;
import dogking190.tmt.tmt;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreTin extends Block
    {

    public OreTin(int par1, Material par2Material)
        {
            super(par1, par2Material);
            this.setCreativeTab(tmt.tabTooManytools);
            this.setUnlocalizedName(Names.oreTin_UnlocalizedName);
            this.setResistance(5.0F);
            this.setHardness(5.0F);
            this.func_111022_d(Modinfo.ID.toLowerCase() +":" + Names.oreTin_UnlocalizedName);
        }

    }
