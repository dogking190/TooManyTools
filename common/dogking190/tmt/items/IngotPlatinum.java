/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dogking190.lib.Modinfo;
import dogking190.lib.Names;

public class IngotPlatinum extends Item{

	public IngotPlatinum(int par1) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName(Names.ingotPlatinum_UnlocalizedName);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.ingotPlatinum_UnlocalizedName);

	}

}
