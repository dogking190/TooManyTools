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


public class GenericOre extends Block{

	public GenericOre(int id, Material par2Material) {
		super(id, par2Material);
		
		setHardness(4.0F); // 33% harder than diamond
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(Names.genericOre_UnlocalizedName);
		setCreativeTab(CreativeTabs.tabBlock);
		func_111022_d(Modinfo.ID.toLowerCase() + ":" + Names.genericOre_UnlocalizedName);

	}

}
