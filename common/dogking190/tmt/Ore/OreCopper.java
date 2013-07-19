/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.Ore;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import dogking190.lib.Modinfo;
import dogking190.lib.Names;

public class OreCopper extends Block
    {

    public OreCopper(int par1, Material par2Material)
        {
            super(par1, par2Material);
            
            this.setCreativeTab(CreativeTabs.tabBlock);
            this.setUnlocalizedName(Names.oreCopper_UnlocalizedName);
            this.setResistance(8.0F);
            this.setHardness(8.0F);
        }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        blockIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.oreCopper_UnlocalizedName);

    }

    }
