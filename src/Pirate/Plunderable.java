package Pirate;

import Pirate.Loot;

/**
 * Defines an interface for Plunder use.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public interface Plunderable {
    /**
     * Removes all loot from the ship and returns the cargo.
     * @return Array of loot from ship cargo
     */
    Loot[] bePlundered();
}
