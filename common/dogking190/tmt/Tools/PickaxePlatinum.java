/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.Tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dogking190.lib.Modinfo;
import dogking190.lib.Names;
import dogking190.tmt.tmt;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class PickaxePlatinum extends ItemPickaxe
    {

    public PickaxePlatinum(int par1, EnumToolMaterial par2EnumToolMaterial)
        {
            super(par1, par2EnumToolMaterial);
            
            this.maxStackSize = 1;
            this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
            this.setCreativeTab(tmt.tabTooManytools);
            this.setUnlocalizedName(Names.pickaxePlatinum_UnlocalizedName);
        }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.pickaxePlatinum_UnlocalizedName);
            }

    }
