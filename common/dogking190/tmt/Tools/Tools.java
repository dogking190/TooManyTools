/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.Tools;

import cpw.mods.fml.common.registry.LanguageRegistry;
import dogking190.lib.Names;
import dogking190.tmt.tmt;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class Tools
    {
        /** Platinum Tools Var */
        public static Item swordPlatinum;
        public static Item pickaxePlatinum;
        public static Item axePlatinum;
        public static Item spadePlatinum;
        public static Item hoePlatinum;
        
        /** Titanium Tools Var */
        public static Item swordTitanium;
        public static Item pickaxeTitanium;
        public static Item axeTitanium;
        public static Item spadeTitanium;
        public static Item hoeTitanium;
        
        /** Sapphire Tools Var */
        public static Item swordSapphire;
        public static Item pickaxeSapphire;
        public static Item axeSapphire;
        public static Item spadeSapphire;
        public static Item hoeSapphire; 
        
        /** Copper Tools Var */
        public static Item swordCopper;
        public static Item pickaxeCopper;
        public static Item axeCopper;
        public static Item spadeCopper;
        public static Item hoeCopper; 
        
        /** Zinc Tools Var */
        public static Item swordZinc;
        public static Item pickaxeZinc;
        public static Item axeZinc;
        public static Item spadeZinc;
        public static Item hoeZinc;
        
        /** Tin Tools Var */
        public static Item swordTin;
        public static Item pickaxeTin;
        public static Item axeTin;
        public static Item spadeTin;
        public static Item hoeTin;
        
        /** Ruby Tools Var */
        public static Item swordRuby;
        public static Item pickaxeRuby;
        public static Item axeRuby;
        public static Item spadeRuby;
        public static Item hoeRuby;
        
        /** Chrome Tools Var */
        public static Item swordChrome;
        public static Item pickaxeChrome;
        public static Item axeChrome;
        public static Item spadeChrome;
        public static Item hoeChrome;

        public static void inti()
            {
                /** Tool Enum */
                EnumToolMaterial toolPlatinum = EnumHelper.addToolMaterial("Platinum", 4, 2324, 12F, 2F, 14);
                EnumToolMaterial toolTitanium = EnumHelper.addToolMaterial("Titanium", 10, 4648, 13.5F, 3.5F, 8);
                EnumToolMaterial toolSapphire = EnumHelper.addToolMaterial("Sapphire", 3, 1682, 7.5F, 1.5F, 16);
                EnumToolMaterial toolRuby = EnumHelper.addToolMaterial("Ruby", 3, 1682, 7.5F, 1.5F, 16);
                EnumToolMaterial toolCopper = EnumHelper.addToolMaterial("Copper", 3, 1682, 7.5F, 1.5F, 17);
                EnumToolMaterial toolZinc = EnumHelper.addToolMaterial("Zinc", 3, 1682, 7.5F, 1.0F, 15);
                EnumToolMaterial toolTin = EnumHelper.addToolMaterial("Tin", 3, 1682, 7.0F, 1.0F, 12);
                EnumToolMaterial toolChrome = EnumHelper.addToolMaterial("Chrome", 3, 1682, 7.0F, 1.0F, 12);
                
                
                /** Tools Platinum */
                swordPlatinum = (new SwordPlatinum(tmt.swordPlatinumID, toolPlatinum));
                pickaxePlatinum = (new PickaxePlatinum(tmt.pickaxePlatinumID, toolPlatinum ));
                axePlatinum = (new AxePlatinum(tmt.axePlatinumID, toolPlatinum));
                spadePlatinum = (new SpadePlatinum(tmt.spadePlatinumID, toolPlatinum));
                hoePlatinum = (new HoePlatinum(tmt.hoePlatinumID, toolPlatinum));
                
                /** Tools Platinum */
                swordTitanium = (new SwordTitanium(tmt.swordTitaniumID, toolTitanium));
                pickaxeTitanium = (new PickaxeTitanium(tmt.pickaxeTitaniumID, toolTitanium));
                axeTitanium = (new AxeTitanium(tmt.axeTitaniumID, toolTitanium));
                spadeTitanium = (new SpadeTitanium(tmt.spadeTitaniumID, toolTitanium));
                hoeTitanium = (new HoeTitanium(tmt.hoeTitaniumID, toolTitanium));
                
                /** Tools Sapphire */
                swordSapphire = (new SwordSapphire(tmt.swordSapphireID, toolSapphire));
                pickaxeSapphire = (new PickaxeSapphire(tmt.pickaxeSapphireID, toolSapphire));
                axeSapphire = (new AxeSapphire(tmt.axeSapphireID, toolSapphire));
                spadeSapphire = (new SpadeSapphire(tmt.spadeSapphireID, toolSapphire));
                hoeSapphire = (new HoeSapphire(tmt.hoeSapphireID, toolSapphire));
                
                /** Copper Tools */
                swordCopper = (new SwordCopper(tmt.swordCopperID, toolCopper));
                pickaxeCopper = (new PickaxeCopper(tmt.pickaxeCopperID, toolCopper));
                axeCopper = (new AxeCopper(tmt.axeCopperID, toolCopper));
                spadeCopper = (new SpadeCopper(tmt.spadeCopperID, toolCopper));
                hoeCopper = (new HoeCopper(tmt.hoeCopperID, toolCopper));
                
                /** Zinc Tools */
                swordZinc = (new SwordZinc(tmt.swordZincID, toolZinc));
                pickaxeZinc = (new PickaxeZinc(tmt.pickaxeZincID, toolZinc));
                axeZinc = (new AxeZinc(tmt.axeZincID, toolZinc));
                spadeZinc = (new SpadeZinc(tmt.spadeZincID, toolZinc));
                hoeZinc = (new HoeZinc(tmt.hoeZincID, toolZinc));
                
                /** Tin Tools */
                swordTin = (new SwordTin(tmt.swordTinID, toolTin));
                pickaxeTin = (new PickaxeTin(tmt.pickaxeTinID, toolTin));
                axeTin = (new AxeTin(tmt.axeTinID, toolTin));
                spadeTin = (new SpadeTin(tmt.spadeTinID, toolTin));
                hoeTin = (new HoeTin(tmt.hoeTinID, toolTin));
                
                /** Ruby Tools */
                swordRuby = (new SwordRuby(tmt.swordRubyID, toolRuby));
                pickaxeRuby = (new PickaxeRuby(tmt.pickaxeRubyID, toolRuby));
                axeRuby = (new AxeRuby(tmt.axeRubyID, toolRuby));
                spadeRuby = (new SpadeRuby(tmt.spadeRubyID, toolRuby));
                hoeRuby = (new HoeRuby(tmt.hoeRubyID, toolRuby));
                
                /** Chrome Tools */
                swordChrome = (new SwordChrome(tmt.swordChromeID, toolChrome));
                pickaxeChrome = (new PickaxeChrome(tmt.pickaxeChromeID, toolChrome));
                axeChrome = (new AxeChrome(tmt.axeChromeID, toolChrome));
                spadeChrome = (new SpadeChrome(tmt.spadeChromeID, toolChrome));
                hoeChrome = (new HoeChrome(tmt.hoeChromeID, toolChrome));
                
            }
        
        /** Names in Game*/ 
        public static void addName()
            {
                
                /** Platinum Tools */       
                LanguageRegistry.addName(swordPlatinum, Names.PlatinumSword_Name);
                LanguageRegistry.addName(pickaxePlatinum, Names.pickaxePlatinum_Name);
                LanguageRegistry.addName(axePlatinum, Names.axePlatinum_Name);
                LanguageRegistry.addName(spadePlatinum, Names.spadePlatinum_Name);
                LanguageRegistry.addName(hoePlatinum, Names.hoePlatinum_Name);
                
                /** Titanium Tools */
                LanguageRegistry.addName(swordTitanium, Names.swordTitanium_Name);
                LanguageRegistry.addName(pickaxeTitanium, Names.pickaxeTitanium_Name);
                LanguageRegistry.addName(axeTitanium, Names.axeTitanium_Name);
                LanguageRegistry.addName(spadeTitanium, Names.spadeTitanium_Name);
                LanguageRegistry.addName(hoeTitanium, Names.hoeTitanium_Name);
                
                /** Sapphire Tools */
                LanguageRegistry.addName(swordSapphire, Names.swordSapphire_Name);
                LanguageRegistry.addName(pickaxeSapphire, Names.pickaxeSapphire_Name);
                LanguageRegistry.addName(axeSapphire, Names.axeSapphire_Name);
                LanguageRegistry.addName(spadeSapphire, Names.spadeSapphire_Name);
                LanguageRegistry.addName(hoeSapphire, Names.hoeSapphire_Name);
                
                /** Copper Tools */
                LanguageRegistry.addName(swordCopper, Names.swordCopper_Name);
                LanguageRegistry.addName(pickaxeCopper, Names.pickaxeCopper_Name);
                LanguageRegistry.addName(axeCopper, Names.axeCopper_Name);
                LanguageRegistry.addName(spadeCopper, Names.spadeCopper_Name);
                LanguageRegistry.addName(hoeCopper, Names.hoeCopper_Name);
                
                /** Zinc Tools */
                LanguageRegistry.addName(swordZinc, Names.swordZinc_Name);
                LanguageRegistry.addName(pickaxeZinc, Names.pickaxeZinc_Name);
                LanguageRegistry.addName(axeZinc, Names.axeZinc_Name);
                LanguageRegistry.addName(spadeZinc, Names.spadeZinc_Name);
                LanguageRegistry.addName(hoeZinc, Names.hoeZinc_Name);
                
                /** Tin Tools */
                LanguageRegistry.addName(swordTin, Names.swordTin_Name);
                LanguageRegistry.addName(pickaxeTin, Names.pickaxeTin_Name);
                LanguageRegistry.addName(axeTin, Names.axeTin_Name);
                LanguageRegistry.addName(spadeTin, Names.spadeTin_Name);
                LanguageRegistry.addName(hoeTin, Names.hoeTin_Name);
                
                /** Ruby Tools */
                LanguageRegistry.addName(swordRuby, Names.swordRuby_Name);
                LanguageRegistry.addName(pickaxeRuby, Names.pickaxeRuby_Name);
                LanguageRegistry.addName(axeRuby, Names.axeRuby_Name);
                LanguageRegistry.addName(spadeRuby, Names.spadeRuby_Name);
                LanguageRegistry.addName(hoeRuby, Names.hoeRuby_Name);
                
                /** Chrome Tools */
                LanguageRegistry.addName(swordChrome, Names.swordChrome_Name);
                LanguageRegistry.addName(pickaxeChrome, Names.pickaxeChrome_Name);
                LanguageRegistry.addName(axeChrome, Names.axeChrome_Name);
                LanguageRegistry.addName(spadeChrome, Names.spadeChrome_Name);
                LanguageRegistry.addName(hoeChrome, Names.hoeChrome_Name);
                
                

            }
    }
