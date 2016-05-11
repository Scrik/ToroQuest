package net.torocraft.torobasemod.item.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.torocraft.torobasemod.ToroBaseMod;
import net.torocraft.torobasemod.entity.projectile.EntityTorchArrow;
import net.torocraft.torobasemod.util.ToroBaseUtils;

public class ItemTorchArrow extends ItemArrow {
	
	public static final String NAME = "torch_arrow";
	
	public ItemTorchArrow(String unlocalizedName, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super();
		this.setUnlocalizedName(unlocalizedName);
	}
	
	public static void init() {
		ItemTorchArrow torchArrow = new ItemTorchArrow(NAME, 1, EntityEquipmentSlot.OFFHAND);
		ToroBaseUtils.registerItem(torchArrow, NAME);
		EntityRegistry.registerModEntity(EntityTorchArrow.class, "Torch Arrow", 0, ToroBaseMod.instance, 80, 10, true);
	}

	public EntityArrow makeTippedArrow(World worldIn, ItemStack itemStack, EntityLivingBase shooter) {
		return new EntityTorchArrow(worldIn, shooter);
	}
	
}
