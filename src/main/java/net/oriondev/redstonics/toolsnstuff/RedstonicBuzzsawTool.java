package net.oriondev.redstonics.toolsnstuff;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;

import java.util.Set;

public class RedstonicBuzzsawTool extends MiningToolItem {

    private static Set<Block> EFFECTIVE_BLOCKS;
    public RedstonicBuzzsawTool(float attackDamage, float attackSpeed, ToolMaterial material, Set<Block> effectiveBlocks, Settings settings) {
        super(attackDamage, attackSpeed, material, effectiveBlocks, settings);
    }

    @Override
    public boolean isEffectiveOn(BlockState state) {
        return true;
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return miningSpeed;
    }
}
