/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package international.astro.hack.hacks.misc;

import international.astro.events.PacketReceiveEvent;
import international.astro.hack.Hack;
import international.astro.mixins.accessor.ISPacketPlayerPosLook;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Hack.Construct(name = "NoRotate", description = "stop server from forceing you to rotate", category = Hack.Category.MISC)
public class NoRotate
        extends Hack {
    @SubscribeEvent
    public void onReceive(PacketReceiveEvent e) {
        Packet p = e.getPacket();
        if (p instanceof SPacketPlayerPosLook) {
            SPacketPlayerPosLook packet = (SPacketPlayerPosLook) e.getPacket();
            ((ISPacketPlayerPosLook) packet).setYaw(NoRotate.mc.player.rotationYaw);
            ((ISPacketPlayerPosLook) packet).setPitch(NoRotate.mc.player.rotationPitch);
        }
    }
}

