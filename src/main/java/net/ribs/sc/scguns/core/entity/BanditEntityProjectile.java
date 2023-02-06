
package net.ribs.sc.scguns.core.entity;

import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class BanditEntityProjectile extends AbstractArrow implements ItemSupplier {
	public BanditEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(ModEntityTypes.BANDIT_PROJECTILE.get(), world);
	}

	public BanditEntityProjectile(EntityType<? extends BanditEntityProjectile> type, Level world) {
		super(type, world);
	}

	public BanditEntityProjectile(EntityType<? extends BanditEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public BanditEntityProjectile(EntityType<? extends BanditEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.POLISHED_BLACKSTONE_BUTTON);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Blocks.POLISHED_BLACKSTONE_BUTTON);
	}
}
