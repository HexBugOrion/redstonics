package net.oriondev.redstonics;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.oriondev.redstonics.toolsnstuff.RedstonicBuzzsawTool;;
import net.oriondev.redstonics.toolsnstuff.RedstonicDrillTool;
import net.oriondev.redstonics.toolsnstuff.RedstonicToolMaterialsFueled;

import java.util.Set;

public class Redstonics implements ModInitializer {

	public static final RedstonicBuzzsawTool BASIC_BUZZSAW = new RedstonicBuzzsawTool(0, 0, RedstonicToolMaterialsFueled.FUELED, new Item.Settings().group(ItemGroup.TOOLS));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("redstonics","basic_buzzsaw"), BASIC_BUZZSAW);
	}
}
