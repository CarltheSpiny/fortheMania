package net.mcreator.sonic_mania;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.PlantType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

@Elementssonic_mania.ModElement.Tag
public class MCreatorPGZflower2 extends Elementssonic_mania.ModElement {
	@ObjectHolder("sonic_mania:pgzflower2")
	public static final Block block = null;

	public MCreatorPGZflower2(Elementssonic_mania instance) {
		super(instance, 169);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomFlower());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MCreatorItems.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class BlockCustomFlower extends FlowerBlock {
		public BlockCustomFlower() {
			super(Effects.SATURATION, 0, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.GROUND)
					.hardnessAndResistance(0.01f, 2f).lightValue(0));
			setRegistryName("pgzflower2");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

		@Override
		public PlantType getPlantType(IBlockReader world, BlockPos pos) {
			return PlantType.Desert;
		}
	}
}
