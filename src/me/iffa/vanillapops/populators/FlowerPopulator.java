// Package Declaration
package me.iffa.vanillapops.populators;

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
 * A flower populator.
 *
 * @author codename_B
 * @author iffa
 */
public class FlowerPopulator extends BlockPopulator {
    /**
     * Populates a chunk with flowers and tall grass.
     * 
     * @param world World
     * @param random Random
     * @param source Source chunk
     */
    @Override
    public void populate(World world, Random random, Chunk source) {
        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                int cx = (source.getX() << 4) + x;
                int cz = (source.getZ() << 4) + z;
                int y = world.getHighestBlockYAt(cx, cz);
                Block block = source.getBlock(x, y, z);
                if (block.getType() == Material.AIR
                        && block.getRelative(BlockFace.DOWN).getType() == Material.GRASS) {
                    if (block.getBiome() == Biome.PLAINS) {
                        int n = random.nextInt(64);
                        if (n < 1) {
                            block.setType(Material.RED_ROSE);
                        } else if (n < 4) {
                            block.setType(Material.YELLOW_FLOWER);
                        }
                    } else if (block.getBiome() == Biome.SHRUBLAND
                            || block.getBiome() == Biome.SAVANNA) {
                        int n = random.nextInt(256);
                        if (n < 2) {
                            block.setType(Material.RED_ROSE);
                        } else if (n < 3) {
                            block.setType(Material.YELLOW_FLOWER);
                        } else if (n < 16) {
                            block.setType(Material.LONG_GRASS);
                            block.setData((byte) 1);
                        }
                    } else if (block.getBiome() == Biome.FOREST
                            || block.getBiome() == Biome.SEASONAL_FOREST) {
                        int n = random.nextInt(256);
                        if (n < 16) {
                            block.setType(Material.LONG_GRASS);
                            block.setData((byte) 2);
                        }
                    }
                }
            }
        }
    }
}
