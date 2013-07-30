/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.Armor;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import dogking190.lib.Names;
import dogking190.tmt.tmt;

public class Armory
    {
        
    public static Item rubyHelment;
    public static Item rubyChestPlate;
    public static Item rubyLeggings;
    public static Item rubyBoots;
    
    public static Item sapphireHelment;
    public static Item sapphireChestPlate;
    public static Item sapphireLeggings;
    public static Item sapphireBoots;
    

    public static void init()
        {
            
            /** Armor Enum */
            EnumArmorMaterial ArmorRuby = EnumHelper.addArmorMaterial("Ruby Armor",25, new int[]{4,5,6,3}, 15);
            EnumArmorMaterial ArmorSapphire = EnumHelper.addArmorMaterial("Sapphire Armor",25, new int[]{4,5,6,3}, 15);
            
            /** Ruby Armor */
            rubyHelment = (new MyArmor(tmt.RubyHelmentID, ArmorRuby, tmt.proxy.addArmor("Ruby"), 0)).setUnlocalizedName(Names.rubyHelment_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            rubyChestPlate = (new MyArmor(tmt.RubyChestPlateID, ArmorRuby, tmt.proxy.addArmor("Ruby"), 1)).setUnlocalizedName(Names.rubyChestplate_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            rubyLeggings = (new MyArmor(tmt.RubyLeggingsID, ArmorRuby, tmt.proxy.addArmor("Ruby"), 2)).setUnlocalizedName(Names.rubyLeggings_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            rubyBoots = (new MyArmor(tmt.RubyBootsID, ArmorRuby, tmt.proxy.addArmor("Ruby"), 3)).setUnlocalizedName(Names.rubyBoots_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            
            /** Sapphire */
            sapphireHelment = (new MyArmor(tmt.SapphireHelmentID, ArmorSapphire, tmt.proxy.addArmor("Sapphire"), 0)).setUnlocalizedName(Names.sapphireHelment_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            sapphireChestPlate = (new MyArmor(tmt.SapphireChestPlateID, ArmorSapphire, tmt.proxy.addArmor("Sapphire"), 1)).setUnlocalizedName(Names.sapphireChestplate_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            sapphireLeggings = (new MyArmor(tmt.SapphireLeggingsID, ArmorSapphire, tmt.proxy.addArmor("Sapphire"), 2)).setUnlocalizedName(Names.sapphireLeggings_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            sapphireBoots = (new MyArmor(tmt.SapphireBootsID, ArmorSapphire, tmt.proxy.addArmor("Sapphire"), 3)).setUnlocalizedName(Names.sapphireBoots_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            
        }

    public static void addNames()
        {
            /** Ruby Armor Names */
            LanguageRegistry.addName(rubyHelment, Names.rubyHelment_Name);
            LanguageRegistry.addName(rubyChestPlate, Names.rubyChestplate_Name);
            LanguageRegistry.addName(rubyLeggings, Names.rubyLeggings_Name);
            LanguageRegistry.addName(rubyBoots, Names.rubyBoots_Name);
            
            /** Sapphire Armor Names */
            LanguageRegistry.addName(sapphireHelment, Names.sapphireHelment_Name);
            LanguageRegistry.addName(sapphireChestPlate, Names.sapphireChestplate_Name);
            LanguageRegistry.addName(sapphireLeggings, Names.sapphireLeggings_Name);
            LanguageRegistry.addName(sapphireBoots, Names.sapphireBoots_Name);
        }

    }
