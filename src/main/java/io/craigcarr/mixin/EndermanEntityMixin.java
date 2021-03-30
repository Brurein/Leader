package io.craigcarr.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import Leader.*;

@Mixin(EndermanEntity.class)
abstract class EndermanEntityMixin extends HostileEntity {

	public EndermanEntityMixin(EntityType<? extends HostileEntity> entityType, World world) {
		super(entityType, world);
		System.out.println(this.getClass().getSuperclass().getName());		
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canBeLeashedBy(PlayerEntity pe) {
		System.out.println(this.getClass().getSuperclass().getName());		
		return Utilities.canBeLeashedBy(pe, this) || super.canBeLeashedBy(pe);

	}

}