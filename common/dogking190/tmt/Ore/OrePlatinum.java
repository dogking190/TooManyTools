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

public class OrePlatinum extends Block{

	public OrePlatinum(int id, Material par2Material) {
		super(id, par2Material);
		
		setHardness(6.0F); 
		setResistance(6.0F);		
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(Names.orePlatinum_UnlocalizedName);
		this.setCreativeTab(tmt.tabTooManytools);
		func_111022_d(Modinfo.ID.toLowerCase() + ":" + Names.orePlatinum_UnlocalizedName);
	}

}