// Package Declaration
package me.iffa.vanillapops;

// VanillaPops Imports
import me.iffa.vanillapops.populators.BedrockPopulator;
import me.iffa.vanillapops.populators.nether.GlowstonePopulator;

/**
 * "Main" class of VanillaPops. Includes methods to get populators.
 * 
 * @author iffa
 */
public class VanillaPops {
    // Variables - TODO: Place populator variables here.
    private BedrockPopulator bedrockPopulator = new BedrockPopulator();
    private GlowstonePopulator glowstonePopulator = new GlowstonePopulator();

    /**
     * Gets the glowstone populator.
     * 
     * @return Glowstone populator
     */
    public GlowstonePopulator getGlowstonePopulator() {
        return this.glowstonePopulator;
    }
    
    /**
     * Gets the bedrock populator.
     * 
     * @return Bedrock populator
     */
    public BedrockPopulator getBedrockPopulator() {
        return this.bedrockPopulator;
    }
}