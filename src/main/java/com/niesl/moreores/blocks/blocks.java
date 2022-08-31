package com.niesl.moreores.blocks;

import com.niesl.moreores.MoreOres;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class blocks {

    public static RubyOreBlock RUBY_ORE_BLOCK = new RubyOreBlock(FabricBlockSettings.of(Material.STONE).hardness(4.5f));

    public static void Registry() {
        Registry.register(Registry.BLOCK, new Identifier("moreores", "ruby_ore_block"), RUBY_ORE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("moreores", "ruby_ore_block"), new BlockItem(RUBY_ORE_BLOCK, new FabricItemSettings().group(MoreOres.MORE_ORES)));
    }

}
