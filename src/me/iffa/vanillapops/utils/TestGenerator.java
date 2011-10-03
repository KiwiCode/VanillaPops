// Package Declaration
package me.iffa.vanillapops.utils;

// Java Imports
import java.util.List;
import java.util.Random;

// VanillaPops Imports
import me.iffa.vanillapops.VanillaPops;

// Bukkit Imports
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

/**
 * A test ChunkGenerator to easily test the populators.
 * 
 * @author iffa
 * @author codename_B (xyzToByte)
 */
public class TestGenerator extends ChunkGenerator {
    // Variables

    private VanillaPops vanillaPops;

    /**
     * Constructor of TestGenerator.
     * 
     * @param vanillaPops VanillaPops
     */
    public TestGenerator(VanillaPops vanillaPops) {
        this.vanillaPops = vanillaPops;
    }

    /**
     * Converts chunk locations to bytes that can be written to the chunk.
     * 
     * @param x X
     * @param y Y
     * @param z Z
     * 
     * @return Byte 
     */
    public int xyzToByte(int x, int y, int z) {
        return (x * 16 + z) * 128 + y;
    }

    /**
     * Generates a chunk.
     * 
     * @param world World
     * @param random Random
     * @param chunkX Chunk X
     * @param chunkZ Chunk Y
     * 
     * @return byte[]
     */
    @Override
    public byte[] generate(World world, Random random, int chunkX, int chunkZ) {
        byte[] result = new byte[32768];
        // Adds a bedrock layer at Y 0. (rest SHOULD be handled by BedrockPopulator)
        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                result[xyzToByte(x, 0, z)] = (byte) Material.BEDROCK.getId();
                result[xyzToByte(x, 65, z)] = (byte) Material.GRASS.getId();
                // Adds some stone
                for (int y = 1; y < 64; y++) {
                    if (y != 64) {
                        result[xyzToByte(x, y, z)] = (byte) Material.STONE.getId();
                    }
                }
            }
        }
        return result;
    }

    /**
     * Gets the generator's populators.
     * 
     * @param world World
     * 
     * @return List of BlockPopulators
     */
    @Override
    public List<BlockPopulator> getDefaultPopulators(World world) {
        return vanillaPops.getPopulators();
    }

    /**
     * Must be returned true to override MC's default behavior.
     * 
     * @param world World
     * @param x X
     * @param z Z
     * 
     * @return True
     */
    @Override
    public boolean canSpawn(World world, int x, int z) {
        return true;
    }
}