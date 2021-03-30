package io.craigcarr.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.entity.passive.PufferfishEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import Leader.*;

@Mixin(PufferfishEntity.class)
abstract class PufferFishEntityMixin extends FishEntity {

	public PufferFishEntityMixin(EntityType<? extends FishEntity> entityType, World world) {
		super(entityType, world);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canBeLeashedBy(PlayerEntity pe) {
		return Utilities.canBeLeashedBy(pe, this) || super.canBeLeashedBy(pe);

	}

}