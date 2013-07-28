/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dogking190.tmt.Ore.BlocksOre;
import net.minecraft.creativetab.CreativeTabs;

public class tabTooManyTools extends CreativeTabs
    {

    public tabTooManyTools(int par1, String par2Str)
        {
            super(par1, par2Str);
        }
    @SideOnly(Side.CLIENT)
        public int getTabIconItemIndex()
        {
            return BlocksOre.oreChrome.blockID;
        }
    public String getTranslatedTabLabel(){
        return "Too Many Tools";
    }
    

    }
