// Package Declaration
package me.iffa.vanillapops.utils;

/**
 * Used for fast storage, comparison, and recall of block positions. Mutable
 * to avoid creating new objects for simple comparison.
 *
 * @author Nightgunner5
 * @author iffa
 */
public class XYZ {
    // Variables
    public int x;
    public int y;
    public int z;

    /**
     * Constructor of XYZ.
     * 
     * @param x X
     * @param y Y
     * @param z Z
     */
    public XYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Constructor of XYZ #2.
     */
    public XYZ() {
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        result = prime * result + z;
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof XYZ)) {
            return false;
        }
        XYZ other = (XYZ) obj;
        if (x != other.x) {
            return false;
        }
        if (y != other.y) {
            return false;
        }
        if (z != other.z) {
            return false;
        }
        return true;
    }
}
