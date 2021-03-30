package io.craigcarr.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.mob.CaveSpiderEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import Leader.*;

@Mixin(CaveSpiderEntity.class)
abstract class CaveSpiderEntityMixin extends HostileEntity {

	public CaveSpiderEntityMixin(EntityType<? extends HostileEntity> entityType, World world) {
		super(entityType, world);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canBeLeashedBy(PlayerEntity pe) {
		return Utilities.canBeLeashedBy(pe, this) || super.canBeLeashedBy(pe);

	}

}

/*
Panda
*/