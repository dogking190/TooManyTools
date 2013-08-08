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
            
/********************************************************************************************************************************/
            
            /** Sapphire Item Rendering */
           if(itemstack.itemID == Armory.sapphireHelment.itemID || itemstack.itemID == Armory.sapphireChestPlate.itemID || itemstack.itemID == Armory.sapphireBoots.itemID)
               {
                  return "tmt:textures/models/armor/Sapphire_Armor_1.png"; 
               }
           if(itemstack.itemID == Armory.sapphireLeggings.itemID)
               {
                   return "tmt:textures/models/armor/Sapphire_Armor_2.png";
               }
           
/********************************************************************************************************************************/
           
           /** Ruby Item Rendering */
           if(itemstack.itemID == Armory.rubyHelment.itemID || itemstack.itemID == Armory.rubyChestPlate.itemID || itemstack.itemID == Armory.rubyBoots.itemID)
               {
                  return "tmt:textures/models/armor/Ruby_Armor_1.png"; 
               }
           if(itemstack.itemID == Armory.rubyLeggings.itemID)
               {
                   return "tmt:textures/models/armor/Ruby_Armor_2.png";
               }
           
/********************************************************************************************************************************/
           
           /** Zinc Item Rendering */
           if(itemstack.itemID == Armory.zincHelment.itemID || itemstack.itemID == Armory.zincChestPlate.itemID || itemstack.itemID == Armory.zincBoots.itemID)
               {
                  return "tmt:textures/models/armor/Zinc_Armor_1.png"; 
               }
           if(itemstack.itemID == Armory.zincLeggings.itemID)
               {
                   return "tmt:textures/models/armor/Zinc_Armor_2.png";
               }
           
/********************************************************************************************************************************/
           
           /** Tin Armor Rendering */
           if(itemstack.itemID == Armory.tinHelment.itemID || itemstack.itemID == Armory.tinChestPlate.itemID || itemstack.itemID == Armory.tinBoots.itemID)
               {
                  return "tmt:textures/models/armor/Tin_Armor_1.png"; 
               }
           if(itemstack.itemID == Armory.tinLeggings.itemID)
               {
                   return "tmt:textures/models/armor/Tin_Armor_2.png";
               }
           
/********************************************************************************************************************************/
           
           /** Platinum Armor Rendering */
           if(itemstack.itemID == Armory.platinumHelment.itemID || itemstack.itemID == Armory.platinumChestPlate.itemID || itemstack.itemID == Armory.platinumBoots.itemID)
               {
                  return "tmt:textures/models/armor/Platinum_Armor_1.png"; 
               }
           if(itemstack.itemID == Armory.platinumLeggings.itemID)
               {
                   return "tmt:textures/models/armor/Platinum_Armor_2.png";
               }
           
/********************************************************************************************************************************/
           
           /** Copper Armor Rendering */
           if(itemstack.itemID == Armory.copperHelment.itemID || itemstack.itemID == Armory.copperChestPlate.itemID || itemstack.itemID == Armory.copperBoots.itemID)
               {
                  return "tmt:textures/models/armor/Copper_Armor_1.png"; 
               }
           if(itemstack.itemID == Armory.copperLeggings.itemID)
               {
                   return "tmt:textures/models/armor/Copper_Armor_2.png";
               }
           
/********************************************************************************************************************************/           
           
           /** Chrome Armor Rendering */
           if(itemstack.itemID == Armory.chromeHelment.itemID || itemstack.itemID == Armory.chromeChestPlate.itemID || itemstack.itemID == Armory.chromeBoots.itemID)
               {
                  return "tmt:textures/models/armor/Chrome_Armor_1.png"; 
               }
           if(itemstack.itemID == Armory.chromeLeggings.itemID)
               {
                   return "tmt:textures/models/armor/Chrome_Armor_2.png";
               }
/********************************************************************************************************************************/           
           /** Titanium Armor Rendering */
           if(itemstack.itemID == Armory.titaniumHelment.itemID || itemstack.itemID == Armory.titaniumChestPlate.itemID || itemstack.itemID == Armory.titaniumBoots.itemID)
               {
                  return "tmt:textures/models/armor/Titanium_Armor_1.png"; 
               }
           if(itemstack.itemID == Armory.titaniumLeggings.itemID)
               {
                   return "tmt:textures/models/armor/Titanium_Armor_2.png";
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
            
/********************************************************************************************************************************/
            
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
            
/********************************************************************************************************************************/
            
            /** Zinc ChestPlate Texture */
            if(itemID == Armory.zincChestPlate.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.zincChestplate_UnlocalizedName);
                }
            
            /** Zinc Helment Texture */
            if(itemID == Armory.zincHelment.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.zincHelment_UnlocalizedName);
                }
            
            /** Zinc Leggings Texture */
            if(itemID == Armory.zincLeggings.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.zincLeggings_UnlocalizedName);
                }
            
            /** Zinc Boots Texture */
            if(itemID == Armory.zincBoots.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.zincBoots_UnlocalizedName);
                }
            
/********************************************************************************************************************************/
            
            /** Tin ChestPlate Texture */
            if(itemID == Armory.tinChestPlate.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.tinChestplate_UnlocalizedName);
                }
            
            /** Tin Helment Texture */
            if(itemID == Armory.tinHelment.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.tinHelment_UnlocalizedName);
                }
            
            /** Tin Leggings Texture */
            if(itemID == Armory.tinLeggings.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.tinLeggings_UnlocalizedName);
                }
            
            /** Tin Boots Texture */
            if(itemID == Armory.tinBoots.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.tinBoots_UnlocalizedName);
                }
            
/********************************************************************************************************************************/
            
            /** Platinum ChestPlate Texture */
            if(itemID == Armory.platinumChestPlate.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.platinumChestplate_UnlocalizedName);
                }
            
            /** Platinum Helment Texture */
            if(itemID == Armory.platinumHelment.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.platinumHelment_UnlocalizedName);
                }
            
            /** Platinum Leggings Texture */
            if(itemID == Armory.platinumLeggings.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.platinumLeggings_UnlocalizedName);
                }
            
            /** Platinum Boots Texture */
            if(itemID == Armory.platinumBoots.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.platinumBoots_UnlocalizedName);
                }
            
/********************************************************************************************************************************/
            
            /** Copper ChestPlate Texture */
            if(itemID == Armory.copperChestPlate.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.copperChestplate_UnlocalizedName);
                }
            
            /** Copper Helment Texture */
            if(itemID == Armory.copperHelment.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.copperHelment_UnlocalizedName);
                }
            
            /** Copper Leggings Texture */
            if(itemID == Armory.copperLeggings.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.copperLeggings_UnlocalizedName);
                }
            
            /** Copper Boots Texture */
            if(itemID == Armory.copperBoots.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.copperBoots_UnlocalizedName);
                }

/********************************************************************************************************************************/
            
            /** Chrome ChestPlate Texture */
            if(itemID == Armory.chromeChestPlate.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.chromeChestplate_UnlocalizedName);
                }
            
            /** Chrome Helment Texture */
            if(itemID == Armory.chromeHelment.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.chromeHelment_UnlocalizedName);
                }
            
            /** Chrome Leggings Texture */
            if(itemID == Armory.chromeLeggings.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.chromeLeggings_UnlocalizedName);
                }
            
            /** Chrome Boots Texture */
            if(itemID == Armory.chromeBoots.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.chromeBoots_UnlocalizedName);
                }
            
/********************************************************************************************************************************/
            
            /** Titanium ChestPlate Texture */
            if(itemID == Armory.titaniumChestPlate.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.titaniumChestplate_UnlocalizedName);
                }
            
            /** Titanium Helment Texture */
            if(itemID == Armory.titaniumHelment.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.titaniumHelment_UnlocalizedName);
                }
            
            /** Titanium Leggings Texture */
            if(itemID == Armory.titaniumLeggings.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.titaniumLeggings_UnlocalizedName);
                }
            
            /** Titanium Boots Texture */
            if(itemID == Armory.titaniumBoots.itemID)
                {
                    itemIcon = icon.registerIcon(Modinfo.ID.toLowerCase() + ":" + Names.titaniumBoots_UnlocalizedName);
                }
            
        }

    }
