/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt.Tools;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;
import dogking190.tmt.Blocks.Blocks;
import dogking190.tmt.Ore.BlocksOre;

public class SuperPick extends ItemTool {
    
    public static final Block[] blocksEffectiveAgainst = {Block.cobblestone, Block.stoneDoubleSlab, 
            Block.stoneSingleSlab, Block.stone, Block.sandStone, Block.cobblestoneMossy, Block.oreIron, 
            Block.blockIron, Block.oreCoal, Block.blockGold, Block.oreGold, Block.oreDiamond, 
            Block.blockDiamond, Block.ice, Block.netherrack, Block.oreLapis, Block.blockLapis, Block.oreRedstone, 
            Block.oreRedstoneGlowing, Block.rail, Block.railDetector, Block.railPowered, Block.railActivator,
            BlocksOre.orePlatinum, BlocksOre.oreZinc, BlocksOre.oreTin, BlocksOre.oreSapphire, BlocksOre.oreRuby, 
            BlocksOre.oreCopper, BlocksOre.oreChrome, BlocksOre.genericOre,Blocks.blockPlatinum, Block.grass, Block.dirt, Block.sand, 
            Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, 
            Block.mycelium};
    
    public SuperPick(int id, EnumToolMaterial material) {
        super(id, 8F, material, blocksEffectiveAgainst);

    }

}