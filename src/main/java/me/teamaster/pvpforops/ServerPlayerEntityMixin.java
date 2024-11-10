package me.teamaster.pvpforops;

import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Overwrite;
import net.minecraft.entity.player.PlayerEntity;

@Mixin(ServerPlayerEntity.class)
public class ServerPlayerEntityMixin {
    @Overwrite
    public boolean shouldDamagePlayer(PlayerEntity player) {
        return player.getCommandSource().hasPermissionLevel(3);
    }
}
