/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dogking190.lib.Modinfo;
import dogking190.lib.Names;
import dogking190.tmt.tmt;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GemSapphire extends Item
    {

    public GemSapphire(int par1)
        {
            super(par1);
            
            this.setCreativeTab(tmt.tabTooManytools);
            this.setUnlocalizedName(Names.gemSapphire_UnlocalizedName);
        }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.gemSapphire_UnlocalizedName);
    }
}