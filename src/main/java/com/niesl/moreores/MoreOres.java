package com.niesl.moreores;

import com.niesl.moreores.blocks.blocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class MoreOres implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("More Ores");

    public static final ItemGroup MORE_ORES = FabricItemGroupBuilder.build(
            new Identifier("moreores", "more_ores"),
            () -> new ItemStack(blocks.RUBY_ORE_BLOCK));

    @Override
    public void onInitialize() {

    }
}
