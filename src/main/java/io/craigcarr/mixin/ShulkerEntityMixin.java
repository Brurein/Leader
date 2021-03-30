package io.craigcarr.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.mob.ShulkerEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import Leader.*;

@Mixin(ShulkerEntity.class)
abstract class ShulkerEntityMixin extends GolemEntity {

	public ShulkerEntityMixin(EntityType<? extends GolemEntity> entityType, World world) {
		super(entityType, world);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canBeLeashedBy(PlayerEntity pe) {
		//System.out.println(this.getClass().getSuperclass().getName());		
		return Utilities.canBeLeashedBy(pe, this) || super.canBeLeashedBy(pe);

	}

}