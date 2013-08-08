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
    
    /** Ruby Armor */
    public static Item rubyHelment;
    public static Item rubyChestPlate;
    public static Item rubyLeggings;
    public static Item rubyBoots;
    
    /** Sapphire Armor */
    public static Item sapphireHelment;
    public static Item sapphireChestPlate;
    public static Item sapphireLeggings;
    public static Item sapphireBoots;
    
    /** Zinc Armor */
    public static Item zincHelment;
    public static Item zincChestPlate;
    public static Item zincLeggings;
    public static Item zincBoots;
    
    /** Tin Armor tin */
    public static Item tinHelment;
    public static Item tinChestPlate;
    public static Item tinLeggings;
    public static Item tinBoots;
    
    /** Platinum Armor platinum */
    public static Item platinumHelment;
    public static Item platinumChestPlate;
    public static Item platinumLeggings;
    public static Item platinumBoots;
    
    /** Copper Armor copper */
    public static Item copperHelment;
    public static Item copperChestPlate;
    public static Item copperLeggings;
    public static Item copperBoots;
    
    /** Chrome Armor chrome */
    public static Item chromeHelment;
    public static Item chromeChestPlate;
    public static Item chromeLeggings;
    public static Item chromeBoots;
    
    /** Titanium Armor titanium */
    public static Item titaniumHelment;
    public static Item titaniumChestPlate;
    public static Item titaniumLeggings;
    public static Item titaniumBoots;

    public static void init()
        {
            
            /** Armor Enum */
            EnumArmorMaterial ArmorRuby = EnumHelper.addArmorMaterial("Ruby Armor",25, new int[]{4,5,6,3}, 15);
            EnumArmorMaterial ArmorSapphire = EnumHelper.addArmorMaterial("Sapphire Armor",25, new int[]{4,5,6,3}, 15);
            EnumArmorMaterial ArmorZinc = EnumHelper.addArmorMaterial("Zinc Armor",25, new int[]{4,5,6,3}, 15);
            EnumArmorMaterial ArmorTin = EnumHelper.addArmorMaterial("Tin Armor",25, new int[]{4,5,6,3}, 15);
            EnumArmorMaterial ArmorPlatinum = EnumHelper.addArmorMaterial("Platinum Armor",25, new int[]{4,5,6,3}, 15);
            EnumArmorMaterial ArmorCopper = EnumHelper.addArmorMaterial("Copper Armor",25, new int[]{4,5,6,3}, 15);
            EnumArmorMaterial ArmorChrome = EnumHelper.addArmorMaterial("Chrome Armor",25, new int[]{4,5,6,3}, 15);
            EnumArmorMaterial ArmorTitanium = EnumHelper.addArmorMaterial("Titanium Armor",25, new int[]{4,5,6,3}, 15);



            /** Ruby Armor */
            rubyHelment = (new MyArmor(tmt.RubyHelmentID, ArmorRuby, tmt.proxy.addArmor("Ruby"), 0)).setUnlocalizedName(Names.rubyHelment_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            rubyChestPlate = (new MyArmor(tmt.RubyChestPlateID, ArmorRuby, tmt.proxy.addArmor("Ruby"), 1)).setUnlocalizedName(Names.rubyChestplate_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            rubyLeggings = (new MyArmor(tmt.RubyLeggingsID, ArmorRuby, tmt.proxy.addArmor("Ruby"), 2)).setUnlocalizedName(Names.rubyLeggings_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            rubyBoots = (new MyArmor(tmt.RubyBootsID, ArmorRuby, tmt.proxy.addArmor("Ruby"), 3)).setUnlocalizedName(Names.rubyBoots_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            
            /** Sapphire  Armor */
            sapphireHelment = (new MyArmor(tmt.SapphireHelmentID, ArmorSapphire, tmt.proxy.addArmor("Sapphire"), 0)).setUnlocalizedName(Names.sapphireHelment_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            sapphireChestPlate = (new MyArmor(tmt.SapphireChestPlateID, ArmorSapphire, tmt.proxy.addArmor("Sapphire"), 1)).setUnlocalizedName(Names.sapphireChestplate_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            sapphireLeggings = (new MyArmor(tmt.SapphireLeggingsID, ArmorSapphire, tmt.proxy.addArmor("Sapphire"), 2)).setUnlocalizedName(Names.sapphireLeggings_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            sapphireBoots = (new MyArmor(tmt.SapphireBootsID, ArmorSapphire, tmt.proxy.addArmor("Sapphire"), 3)).setUnlocalizedName(Names.sapphireBoots_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            
            /** Zinc Armor */
            zincHelment = (new MyArmor(tmt.ZincHelmentID, ArmorZinc, tmt.proxy.addArmor("Zinc"), 0)).setUnlocalizedName(Names.zincHelment_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            zincChestPlate = (new MyArmor(tmt.ZincChestPlateID, ArmorZinc, tmt.proxy.addArmor("Zinc"), 1)).setUnlocalizedName(Names.zincChestplate_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            zincLeggings = (new MyArmor(tmt.ZincLeggingsID, ArmorZinc, tmt.proxy.addArmor("Zinc"), 2)).setUnlocalizedName(Names.zincLeggings_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            zincBoots = (new MyArmor(tmt.ZincBootsID, ArmorZinc, tmt.proxy.addArmor("Zinc"), 3)).setUnlocalizedName(Names.zincBoots_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            
            /** Tin Armor tin */
            tinHelment = (new MyArmor(tmt.TinHelmentID, ArmorTin, tmt.proxy.addArmor("Tin"), 0)).setUnlocalizedName(Names.tinHelment_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            tinChestPlate = (new MyArmor(tmt.TinChestPlateID, ArmorTin, tmt.proxy.addArmor("Tin"), 1)).setUnlocalizedName(Names.tinChestplate_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            tinLeggings = (new MyArmor(tmt.TinLeggingsID, ArmorTin, tmt.proxy.addArmor("Tin"), 2)).setUnlocalizedName(Names.tinLeggings_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            tinBoots = (new MyArmor(tmt.TinBootsID, ArmorTin, tmt.proxy.addArmor("Tin"), 3)).setUnlocalizedName(Names.tinBoots_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            
            /** Platinum Armor platinum */
            platinumHelment = (new MyArmor(tmt.PlatinumHelmentID, ArmorPlatinum, tmt.proxy.addArmor("Platinum"), 0)).setUnlocalizedName(Names.platinumHelment_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            platinumChestPlate = (new MyArmor(tmt.PlatinumChestPlateID, ArmorPlatinum, tmt.proxy.addArmor("Platinum"), 1)).setUnlocalizedName(Names.platinumChestplate_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            platinumLeggings = (new MyArmor(tmt.PlatinumLeggingsID, ArmorPlatinum, tmt.proxy.addArmor("Platinum"), 2)).setUnlocalizedName(Names.platinumLeggings_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            platinumBoots = (new MyArmor(tmt.PlatinumBootsID, ArmorPlatinum, tmt.proxy.addArmor("Platinum"), 3)).setUnlocalizedName(Names.platinumBoots_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            
            /** Copper Armor copper */
            copperHelment = (new MyArmor(tmt.CopperHelmentID, ArmorCopper, tmt.proxy.addArmor("Copper"), 0)).setUnlocalizedName(Names.copperHelment_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            copperChestPlate = (new MyArmor(tmt.CopperChestPlateID, ArmorCopper, tmt.proxy.addArmor("Copper"), 1)).setUnlocalizedName(Names.copperChestplate_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            copperLeggings = (new MyArmor(tmt.CopperLeggingsID, ArmorCopper, tmt.proxy.addArmor("Copper"), 2)).setUnlocalizedName(Names.copperLeggings_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            copperBoots = (new MyArmor(tmt.CopperBootsID, ArmorCopper, tmt.proxy.addArmor("Copper"), 3)).setUnlocalizedName(Names.copperBoots_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            
            /** Chrome Armor chrome */
            chromeHelment = (new MyArmor(tmt.ChromeHelmentID, ArmorCopper, tmt.proxy.addArmor("Chrome"), 0)).setUnlocalizedName(Names.chromeHelment_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            chromeChestPlate = (new MyArmor(tmt.ChromeChestPlateID, ArmorCopper, tmt.proxy.addArmor("Chrome"), 1)).setUnlocalizedName(Names.chromeChestplate_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            chromeLeggings = (new MyArmor(tmt.ChromeLeggingsID, ArmorCopper, tmt.proxy.addArmor("Chrome"), 2)).setUnlocalizedName(Names.chromeLeggings_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            chromeBoots = (new MyArmor(tmt.ChromeBootsID, ArmorCopper, tmt.proxy.addArmor("Chrome"), 3)).setUnlocalizedName(Names.chromeBoots_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            
            /** Titanium Armor titanium */
            titaniumHelment = (new MyArmor(tmt.TitaniumHelmentID, ArmorTitanium, tmt.proxy.addArmor("Titanium"), 0)).setUnlocalizedName(Names.titaniumHelment_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            titaniumChestPlate = (new MyArmor(tmt.TitaniumChestPlateID, ArmorTitanium, tmt.proxy.addArmor("Titanium"), 1)).setUnlocalizedName(Names.titaniumChestplate_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            titaniumLeggings = (new MyArmor(tmt.TitaniumLeggingsID, ArmorTitanium, tmt.proxy.addArmor("Titanium"), 2)).setUnlocalizedName(Names.titaniumLeggings_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
            titaniumBoots = (new MyArmor(tmt.TitaniumBootsID, ArmorTitanium, tmt.proxy.addArmor("Titanium"), 3)).setUnlocalizedName(Names.titaniumBoots_UnlocalizedName).setCreativeTab(tmt.tabTooManytools);
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
            
            /** Zinc Armor Names */
            LanguageRegistry.addName(zincHelment, Names.zincHelment_Name);
            LanguageRegistry.addName(zincChestPlate, Names.zincChestplate_Name);
            LanguageRegistry.addName(zincLeggings, Names.zincLeggings_Name);
            LanguageRegistry.addName(zincBoots, Names.zincBoots_Name);
            
            /** Tin Armor Names */
            LanguageRegistry.addName(tinHelment, Names.tinHelment_Name);
            LanguageRegistry.addName(tinChestPlate, Names.tinChestplate_Name);
            LanguageRegistry.addName(tinLeggings, Names.tinLeggings_Name);
            LanguageRegistry.addName(tinBoots, Names.tinBoots_Name);
            
            /** Platinum Armor Names */
            LanguageRegistry.addName(platinumHelment, Names.platinumHelment_Name);
            LanguageRegistry.addName(platinumChestPlate, Names.platinumChestplate_Name);
            LanguageRegistry.addName(platinumLeggings, Names.platinumLeggings_Name);
            LanguageRegistry.addName(platinumBoots, Names.platinumBoots_Name);
            
            /** Copper Armors Names */
            LanguageRegistry.addName(copperHelment, Names.copperHelment_Name);
            LanguageRegistry.addName(copperChestPlate, Names.copperChestplate_Name);
            LanguageRegistry.addName(copperLeggings, Names.copperLeggings_Name);
            LanguageRegistry.addName(copperBoots, Names.copperBoots_Name);
            
            /** Chrome Armor Names */
            LanguageRegistry.addName(chromeHelment, Names.chromeHelment_Name);
            LanguageRegistry.addName(chromeChestPlate, Names.chromeChestplate_Name);
            LanguageRegistry.addName(chromeLeggings, Names.chromeLeggings_Name);
            LanguageRegistry.addName(chromeBoots, Names.chromeBoots_Name);
            
            /** Titanium Armor Names */
            LanguageRegistry.addName(titaniumHelment, Names.titaniumHelment_Name);
            LanguageRegistry.addName(titaniumChestPlate, Names.titaniumChestplate_Name);
            LanguageRegistry.addName(titaniumLeggings, Names.titaniumLeggings_Name);
            LanguageRegistry.addName(titaniumBoots, Names.titaniumBoots_Name);
            
        }

    }
