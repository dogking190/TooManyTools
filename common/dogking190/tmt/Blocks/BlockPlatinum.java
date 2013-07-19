/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dogking190.lib.Modinfo;
import dogking190.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPlatinum extends Block
    {

    public BlockPlatinum(int par1, Material par2Material)
        {
            super(par1, par2Material);
            this.setHardness(5.0F);
            this.setResistance(5.0F);
            this.setCreativeTab(CreativeTabs.tabBlock);
            this.setUnlocalizedName(Names.blockPlatinum_UnlocalizedName);
            this.func_111022_d(Modinfo.ID.toLowerCase() +":" + Names.blockPlatinum_UnlocalizedName);

        }

    }
        
