// Package Declaration
package me.iffa.vanillapops;

// VanillaPops Imports
import me.iffa.vanillapops.populators.BedrockPopulator;
import me.iffa.vanillapops.populators.CavePopulator;
import me.iffa.vanillapops.populators.DungeonPopulator;
import me.iffa.vanillapops.populators.FlowerPopulator;
import me.iffa.vanillapops.populators.SnowPopulator;
import me.iffa.vanillapops.populators.nether.GlowstonePopulator;

// Bukkit Imports
import org.bukkit.plugin.Plugin;

/**
 * "Main" class of VanillaPops. Includes methods to get populators.
 * 
 * @author iffa
 */
public class VanillaPops {
    // Variables - TODO: Place populator variables here.
    private Plugin plugin;
    private BedrockPopulator bedrockPopulator = new BedrockPopulator();
    private CavePopulator cavePopulator;
    private FlowerPopulator flowerPopulator = new FlowerPopulator();
    private SnowPopulator snowPopulator = new SnowPopulator();
    private DungeonPopulator dungeonPopulator = new DungeonPopulator();
    private GlowstonePopulator glowstonePopulator = new GlowstonePopulator();
    
    /**
     * Constructor of VanillaPops.
     * 
     * @param plugin Plugin instance
     */
    public VanillaPops(Plugin plugin) {
        this.plugin = plugin;
        // Initializing all populators that need the plugin instance
        this.cavePopulator = new CavePopulator(plugin);
    }

    /**
     * Gets the bedrock populator.
     * 
     * @return Bedrock populator
     */
    public BedrockPopulator getBedrockPopulator() {
        return this.bedrockPopulator;
    }
    
    /**
     * Gets the cave populator.
     * 
     * @param plugin Plugin instance (for schedulers)
     * 
     * @return Cave populator
     */
    public CavePopulator getCavePopulator(Plugin plugin) {
        return this.cavePopulator;
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