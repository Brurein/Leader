package io.craigcarr.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.mob.RavagerEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import Leader.*;

@Mixin(MobEntity.class)
abstract class MobEntityMixin extends LivingEntity {

	protected MobEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
		super(entityType, world);
		// TODO Auto-generated constructor stub
	}

	@Inject(method = "canBeLeashedBy", at = @At(value = "RETURN", target = "Lnet/minecraft/entity/mob/MobEntity;canBeLeashedBy(Lnet/minecraft/entity/player/PlayerEntity;)V"), cancellable = true)
    private void onCanBeLeashedBy(PlayerEntity pe, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(cir.getReturnValueZ() || Utilities.canBeLeashedBy(pe, this));
    }

}