// Package Declaration
package me.iffa.vanillapops.populators.biome;

// Java Imports
import java.util.Random;

// Bukkit Imports
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.generator.BlockPopulator;

/**
 * A desert populator.
 *
 * @author codename_B
 * @author iffa
 */
public class DesertPopulator extends BlockPopulator {
    /**
     * Populates a chunk with desert.
     * 
     * @param world World
     * @param random Random
     * @param chunk Chunk
     */
    @Override
    public void populate(World world, Random random, Chunk chunk) {
        Material matSand = Material.SAND;
        Material matDirt = Material.DIRT;

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                int tx = (chunk.getX() << 4) + x;
                int tz = (chunk.getZ() << 4) + z;
                int y = world.getHighestBlockYAt(tx, tz);

                Block block = chunk.getBlock(x, y, z).getRelative(BlockFace.DOWN);
                if (block.getBiome() != Biome.DESERT) {
                    continue;
                }

                // Set top few layers of grass/dirt to sand
                for (int i = 0; i < 5; ++i) {
                    Block b2 = block.getRelative(0, -i, 0);
                    if (b2.getType() == Material.GRASS
                            || b2.getType() == matDirt) {
                        b2.setType(matSand);
                    }
                }

                // Generate cactus
                if (block.getType() == matSand) {
                    if (random.nextInt(20) == 0) {
                        // Make sure it's surrounded by air
                        Block base = block.getRelative(BlockFace.UP);
                        if (base.getTypeId() == 0
                                && base.getRelative(BlockFace.NORTH).getTypeId() == 0
                                && base.getRelative(BlockFace.EAST).getTypeId() == 0
                                && base.getRelative(BlockFace.SOUTH).getTypeId() == 0
                                && base.getRelative(BlockFace.WEST).getTypeId() == 0) {
                            generateCactus(base, random.nextInt(4));
                        }
                    }
                }
            }
        }
    }

    /**
     * Generates cactus.
     * 
     * @param block Block
     * @param height Height
     */
    private void generateCactus(Block block, int height) {
        for (int i = 0; i < height; ++i) {
            block.getRelative(0, i, 0).setType(Material.CACTUS);
        }
    }
}