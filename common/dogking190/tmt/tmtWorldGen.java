/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.tmt;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import dogking190.tmt.Ore.BlocksOre;
import dogking190.tmt.Ore.OrePlatinum;

public class tmtWorldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	
		switch(world.provider.dimensionId){
		case 1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			
		case -1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}



	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {

		
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0; i<15;i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(41);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(BlocksOre.orePlatinum.blockID, 3)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		for(int i = 0; i<15;i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(10);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(BlocksOre.genericOre.blockID, 3)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		for(int i = 0; i<15;i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(64);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(BlocksOre.oreRuby.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
	      for(int i = 0; i<15;i++){
	            int xCoord = chunkX + random.nextInt(16);
	            int yCoord = random.nextInt(64);
	            int zCoord = chunkZ + random.nextInt(16);
	            
	            (new WorldGenMinable(BlocksOre.oreCopper.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
	        }
	      
	       for(int i = 0; i<15;i++){
               int xCoord = chunkX + random.nextInt(16);
               int yCoord = random.nextInt(64);
               int zCoord = chunkZ + random.nextInt(16);
               
               (new WorldGenMinable(BlocksOre.oreSapphire.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
           }
	       
	       for(int i = 0; i<15;i++){
               int xCoord = chunkX + random.nextInt(16);
               int yCoord = random.nextInt(64);
               int zCoord = chunkZ + random.nextInt(16);
               
               (new WorldGenMinable(BlocksOre.oreTin.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
           }
	       
	       for(int i = 0; i<15;i++){
               int xCoord = chunkX + random.nextInt(16);
               int yCoord = random.nextInt(64);
               int zCoord = chunkZ + random.nextInt(16);
               
               (new WorldGenMinable(BlocksOre.oreZinc.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
           }
	       
	        for(int i = 0; i<5;i++){
	            int xCoord = chunkX + random.nextInt(16);
	            int yCoord = random.nextInt(64);
	            int zCoord = chunkZ + random.nextInt(16);
	            
	            (new WorldGenMinable(BlocksOre.oreChrome.blockID, 8)).generate(world, random, xCoord, yCoord, zCoord);
	        }
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
	    


		
	}

}
