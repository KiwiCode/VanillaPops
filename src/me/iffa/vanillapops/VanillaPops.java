// Package Declaration
package me.iffa.vanillapops;

// VanillaPops Imports
import me.iffa.vanillapops.populators.BedrockPopulator;
import me.iffa.vanillapops.populators.DungeonPopulator;
import me.iffa.vanillapops.populators.FlowerPopulator;
import me.iffa.vanillapops.populators.SnowPopulator;
import me.iffa.vanillapops.populators.nether.GlowstonePopulator;

/**
 * "Main" class of VanillaPops. Includes methods to get populators.
 * 
 * @author iffa
 */
public class VanillaPops {
    // Variables - TODO: Place populator variables here.
    private BedrockPopulator bedrockPopulator = new BedrockPopulator();
    private FlowerPopulator flowerPopulator = new FlowerPopulator();
    private SnowPopulator snowPopulator = new SnowPopulator();
    private DungeonPopulator dungeonPopulator = new DungeonPopulator();
    private GlowstonePopulator glowstonePopulator = new GlowstonePopulator();

    /**
     * Gets the bedrock populator.
     * 
     * @return Bedrock populator
     */
    public BedrockPopulator getBedrockPopulator() {
        return this.bedrockPopulator;
    }
    
    /**
     * Gets the dungeon populator.
     * 
     * @return Dungeon populator
     */
    public DungeonPopulator getDungeonPopulator() {
        return this.dungeonPopulator;
    }
    
    /**
     * Gets the flower populator.
     * 
     * @return Flower populator
     */
    public FlowerPopulator getFlowerPopulator() {
        return this.flowerPopulator;
    }
    
    /**
     * Gets the snow populator.
     * 
     * @return Snow populator
     */
    public SnowPopulator getSnowPopulator() {
        return this.snowPopulator;
    }

    /**
     * Gets the glowstone populator.
     * 
     * @return Glowstone populator
     */
    public GlowstonePopulator getGlowstonePopulator() {
        return this.glowstonePopulator;
    }
}