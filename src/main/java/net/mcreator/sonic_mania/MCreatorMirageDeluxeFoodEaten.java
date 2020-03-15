package net.mcreator.sonic_mania;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementssonic_mania.ModElement.Tag
public class MCreatorMirageDeluxeFoodEaten extends Elementssonic_mania.ModElement {
	public MCreatorMirageDeluxeFoodEaten(Elementssonic_mania instance) {
		super(instance, 293);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorMirageDeluxeFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 300, (int) 1));
	}
}
