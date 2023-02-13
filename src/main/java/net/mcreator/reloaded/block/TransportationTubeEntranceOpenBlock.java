
package net.mcreator.reloaded.block;

import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.reloaded.procedures.TransportationTubeEntranceOpenRedstoneOffProcedure;
import net.mcreator.reloaded.procedures.TransportationTubeEntranceOpenBlockAddedProcedure;
import net.mcreator.reloaded.init.ReloadedModBlocks;

import java.util.List;
import java.util.Collections;

public class TransportationTubeEntranceOpenBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public TransportationTubeEntranceOpenBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.glass.break")),
						() -> new SoundEvent(new ResourceLocation("block.metal.step")),
						() -> new SoundEvent(new ResourceLocation("block.metal.place")),
						() -> new SoundEvent(new ResourceLocation("block.metal.hit")),
						() -> new SoundEvent(new ResourceLocation("block.metal.fall"))))
				.strength(0.4f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(15, 0, 0, 16, 32, 16), box(0, 0, 0, 1, 32, 16), box(0, 0, 0, 16, 32, 1));
			case NORTH -> Shapes.or(box(0, 0, 0, 1, 32, 16), box(15, 0, 0, 16, 32, 16), box(0, 0, 15, 16, 32, 16));
			case EAST -> Shapes.or(box(0, 0, 0, 16, 32, 1), box(0, 0, 15, 16, 32, 16), box(0, 0, 0, 1, 32, 16));
			case WEST -> Shapes.or(box(0, 0, 15, 16, 32, 16), box(0, 0, 0, 16, 32, 1), box(15, 0, 0, 16, 32, 16));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(ReloadedModBlocks.TRANSPORTALTION_TUBE_ENTRANCE.get());
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(ReloadedModBlocks.TRANSPORTALTION_TUBE_ENTRANCE.get()));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			TransportationTubeEntranceOpenBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		} else {
			TransportationTubeEntranceOpenRedstoneOffProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}
}