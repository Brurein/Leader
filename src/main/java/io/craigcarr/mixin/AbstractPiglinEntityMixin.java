package io.craigcarr.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.mob.AbstractPiglinEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

import Leader.Utilities;

@Mixin(PiglinEntity.class)
abstract class AbstractPiglinEntityMixin extends AbstractPiglinEntity {

	public AbstractPiglinEntityMixin(EntityType<? extends AbstractPiglinEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	public boolean canBeLeashedBy(PlayerEntity pe) {
		return Utilities.canBeLeashedBy(pe, this) || super.canBeLeashedBy(pe);
	}

}
