package com.grassonleaves.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.VegetationBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VegetationBlock.class)
public abstract class VegetationBlockMixin {

	@Inject(method = "mayPlaceOn", at = @At("HEAD"), cancellable = true)
	private void allowPlacementOnLeaves(BlockState state, BlockGetter level, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
		if (state.is(BlockTags.LEAVES)) {
			cir.setReturnValue(true);
		}
	}
}
