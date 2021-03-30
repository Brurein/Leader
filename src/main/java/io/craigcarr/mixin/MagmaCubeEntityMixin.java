package io.craigcarr.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.mob.MagmaCubeEntity;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import Leader.*;

@Mixin(MagmaCubeEntity.class)
abstract class MagmaCubeEntityMixin extends SlimeEntity {

	public MagmaCubeEntityMixin(EntityType<? extends SlimeEntity> entityType, World world) {
		super(entityType, world);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canBeLeashedBy(PlayerEntity pe) {
		return Utilities.canBeLeashedBy(pe, this) || super.canBeLeashedBy(pe);

	}

}