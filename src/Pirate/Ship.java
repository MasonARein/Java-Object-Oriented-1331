package Pirate;

import Pirate.Loot;
import Pirate.Plunderable;

/**
 * Class defines the structure of Ship, which implements Interface of plunderable.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public class Ship implements Plunderable {
    private Loot[] cargo;
    private double totalCargoValue;
    private String name;

    /**
     * Method constructs an instance of Ship.
     *
     * @param name String for name of the ship
     */
    public Ship(String name) {
        this.name = name;
        cargo = new Loot[10];
        totalCargoValue = 0;
    }

    /**
     * Method constructs an instance of Ship.
     */
    public Ship() {
        this("Black Pearl");
    }

    /**
     * Method overrides Object toString to Ship.
     *
     * @return String including ship name, loot onboard, and total value of loot
     */
    public String toString() {
        String s = "A ship called " + name + " with cargo ";
        for (Loot l : cargo) {
            if (l != null) {
                s += "" + l + ", ";
            }
        }
        s += "which has a total value of " + (int) (totalCargoValue * 100) / 100.0;
        return s;
    }

    /**
     * Adds an object of Loot to the cargo of the ship in first open slot.
     *
     * @param newItem Loot added to cargo
     */
    public void addCargo(Loot newItem) {
        if (cargo[cargo.length - 1] != null) {
            Loot[] newLoot = new Loot[2 * cargo.length];
            for (int i = 0; i < cargo.length; ++i) {
                newLoot[i] = cargo[i];
            }
            cargo = newLoot;
        }
        int firstOpen = cargo.length;
        for (int i = 0; i < cargo.length; ++i) {
            if (cargo[i] == null && i < firstOpen) {
                firstOpen = i;
            }
        }
        cargo[firstOpen] = newItem;
        totalCargoValue += newItem.getValue();
    }

    /**
     * Removes the first filled slot of cargo and returns the removed object of loot.
     *
     * @return Loot removed from cargo
     */
    public Loot removeCargo() {
        int firstFilled = cargo.length;
        Loot returnedCargo;
        for (int i = 0; i < cargo.length; ++i) {
            if (cargo[i] != null && i < firstFilled) {
                firstFilled = i;
            }
        }
        if (firstFilled != cargo.length) {
            returnedCargo = cargo[firstFilled];
            totalCargoValue -= returnedCargo.getValue();
            cargo[firstFilled] = null;
            return returnedCargo;
        }
        return null;
    }

    /**
     * Removes the first instance of the Loot arguement from ship cargo.
     *
     * @param cargoPassed Loot to be removed from cargo if it's in cargo
     * @return First instance of Loot cargo in ship
     */
    public Loot removeCargo(Loot cargoPassed) {
        int firstLocation = cargo.length;
        Loot returnedCargo;
        for (int i = 0; i < cargo.length; ++i) {
            if (cargo[i].equals(cargoPassed) && i < firstLocation) {
                firstLocation = i;
            }
        }
        if (firstLocation != cargo.length) {
            returnedCargo = cargo[firstLocation];
            totalCargoValue -= returnedCargo.getValue();
            cargo[firstLocation] = null;
            return returnedCargo;
        }
        return null;
    }

    /**
     * Removes all loot from the ship and returns the cargo.
     *
     * @return Array of loot from ship cargo
     */
    public Loot[] bePlundered() {
        int lootCount = 0;
        for (Loot l : cargo) {
            if (l instanceof Loot) {
                lootCount++;
            }
        }
        Loot[] plunderedLoot = new Loot[lootCount];
        lootCount = 0;
        for (int i = 0; i < cargo.length; ++i) {
            if (cargo[i] instanceof Loot) {
                plunderedLoot[lootCount] = cargo[i];
                lootCount++;
                cargo[i] = null;
            }
        }
        totalCargoValue = 0;
        return plunderedLoot;
    }

}
