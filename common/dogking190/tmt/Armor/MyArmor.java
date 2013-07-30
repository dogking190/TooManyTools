/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.Armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dogking190.lib.Modinfo;
import dogking190.lib.Names;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MyArmor extends ItemArmor
    {

    public MyArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3,
            int par4)
        {
            super(par1, par2EnumArmorMaterial, par3, par4);
        }
    
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
        {
            /** Sapphire Item Rendering */
           if(itemstack.itemID == Armory.sapphireHelment.itemID || itemstack.itemID == Armory.sapphireChestPlate.itemID || itemstack.itemID == Armory.sapphireBoots.itemID)
               {
                  return "tmt:textures/models/armor/Sapphire_Armor_1.png"; 
               }
           if(itemstack.itemID == Armory.sapphireLeggings.itemID)
               {
                   return "tmt:textures/models/armor/Sapphire_Armor_2.png";
               }
           
           /** Ruby Item Rendering */
           if(itemstack.itemID == Armory.rubyHelment.itemID || itemstack.itemID == Armory.rubyChestPlate.itemID || itemstack.itemID == Armory.rubyBoots.itemID)
               {
                  return "tmt:textures/models/armor/Ruby_Armor_1.png"; 
               }
           if(itemstack.itemID == Armory.rubyLeggings.itemID)
               {
                   return "tmt:textures/models/armor/Ruby_Armor_2.png";
               }
           else
               {
                   return null;
               }
        }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) 
        {
            /** Ruby ChestPlate Texture */
            if(itemID == Armory.rubyChestPlate.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.rubyChestplate_UnlocalizedName);
                }
            
            /** Ruby Helment Texture */
            if(itemID == Armory.rubyHelment.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.rubyHelment_UnlocalizedName);
                }
            
            /** Ruby Leggings Texture */
            if(itemID == Armory.rubyLeggings.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.rubyLeggings_UnlocalizedName);
                }
            
            /** Ruby Boots Texture */
            if(itemID == Armory.rubyBoots.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.rubyBoots_UnlocalizedName);
                }
            
            /** Sapphire ChestPlate Texture */
            if(itemID == Armory.sapphireChestPlate.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.sapphireChestplate_UnlocalizedName);
                }
            
            /** Sapphire Helment Texture */
            if(itemID == Armory.sapphireHelment.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.sapphireHelment_UnlocalizedName);
                }
            
            /** Sapphire Leggings Texture */
            if(itemID == Armory.sapphireLeggings.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.sapphireLeggings_UnlocalizedName);
                }
            
            /** Sapphire Boots Texture */
            if(itemID == Armory.sapphireBoots.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.sapphireBoots_UnlocalizedName);
                }
        }

    }
