/**
 * Too Many Tools
 *		TMT
 * 
 * @author dogking190
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
package dogking190.lib;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandler implements IPacketHandler
    {

    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player)
        {
            if(packet.channel.equals(Modinfo.Channel))
                {
                    handlePacket(packet);
                }
        }
    
    public void handlePacket(Packet250CustomPayload packet)
        {
            DataInputStream InputStream = new DataInputStream(new ByteArrayInputStream(packet.data));
            int randomInt1;
            int randomInt2;
            
            try{
                randomInt1 = InputStream.readInt();
                randomInt2 = InputStream.readInt();
            }catch(IOException e){
                e.printStackTrace();
                return;
            }
            
            System.out.println(randomInt1 + "" + randomInt2);
        }
       
    }
