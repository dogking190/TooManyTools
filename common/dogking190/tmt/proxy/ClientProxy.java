package dogking190.tmt.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;


public class ClientProxy extends CommonProxy{
	
	@Override
	public void initRenderers()
	    {
		
	    }
	
	@Override
	public void initSounds()
	    {
		
	    }
	
	public int addArmor(String armor)
	    {
	       return RenderingRegistry.addNewArmourRendererPrefix(armor); 
	    }

}
