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
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreRuby extends Block{

	public OreRuby(int par1, Material par2Material) {
		super(par1, par2Material);
		
		setHardness(6.0F); 
		setResistance(6.0F);
		setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName(Names.oreRuby_UnloclalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.func_111022_d(Modinfo.ID.toLowerCase() +":" + Names.oreRuby_UnloclalizedName);

	}

}
