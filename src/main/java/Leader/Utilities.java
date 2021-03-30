package Leader;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;

public class Utilities {

	public static boolean canBeLeashedBy(PlayerEntity pe, LivingEntity le) {
		
		if((le) instanceof MobEntity) {
			
			MobEntity me = (MobEntity)le;
		
			System.out.println("Player["+pe.getName().asString()+"] tried to leash ["+me.getClass().getName()+"]");
			
	    	if(pe.isHolding(Items.LEAD) && pe.isSneaking())
	    	{
	    		System.out.println("returning: " + (!me.isLeashed()));
	    		
	    		return !me.isLeashed();
	    	}
    	    	
		}
		
    	return false;
	}
	
}
