// Package Declaration
package me.iffa.vanillapops;

// VanillaPops Imports
import me.iffa.vanillapops.populators.nether.GlowstonePopulator;

/**
 * "Main" class of VanillaPops. Includes methods to get populators.
 * 
 * @author iffa
 */
public class VanillaPops {
    // Variables
    // TODO: Place populator variables here.
    private GlowstonePopulator glowstonePopulator = new GlowstonePopulator();

    /**
     * Gets the glowstone populator.
     * 
     * @return Glowstone populator
     */
    public GlowstonePopulator getGlowstonePopulator() {
        return this.glowstonePopulator;
    }
}