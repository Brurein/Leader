package io.craigcarr.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import Leader.*;

@Mixin(SkeletonEntity.class)
abstract class SkeletonEntityMixin extends HostileEntity {

	public SkeletonEntityMixin(EntityType<? extends HostileEntity> entityType, World world) {
		super(entityType, world);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canBeLeashedBy(PlayerEntity pe) {
		return Utilities.canBeLeashedBy(pe, this) || super.canBeLeashedBy(pe);

	}

}