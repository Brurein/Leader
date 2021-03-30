package io.craigcarr.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import Leader.*;

@Mixin(SlimeEntity.class)
abstract class SlimeEntityMixin extends MobEntity {

	public SlimeEntityMixin(EntityType<? extends MobEntity> entityType, World world) {
		super(entityType, world);
		
	}

	@Override
	public boolean canBeLeashedBy(PlayerEntity pe) {
		System.out.println(this.getClass().getSuperclass().getName());		
		return Utilities.canBeLeashedBy(pe, this) || super.canBeLeashedBy(pe);

	}

}