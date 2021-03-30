package io.craigcarr.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.mob.VexEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import Leader.*;

@Mixin(VexEntity.class)
abstract class VexEntityMixin extends HostileEntity {

	public VexEntityMixin(EntityType<? extends HostileEntity> entityType, World world) {
		super(entityType, world);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canBeLeashedBy(PlayerEntity pe) {
		return Utilities.canBeLeashedBy(pe, this) || super.canBeLeashedBy(pe);

	}

}