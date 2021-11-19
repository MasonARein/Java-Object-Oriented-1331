package Pirate;

/**
 * Class defines the structure for the Object of Coin extending the class of Loot.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public class Coin extends Loot {
    private boolean heads;
    private int yearMade;
    private String material;

    /**
     * Method constructs an instance of Coin.
     *
     * @param value    Double used for the value of Loot
     * @param heads    Boolean used for side of coin
     * @param yearMade Int for the year made
     * @param material String for material of the coin
     */
    public Coin(double value, boolean heads, int yearMade, String material) {
        super(value);
        this.yearMade = yearMade >= 0 && yearMade <= 1700 ? yearMade : 1700;
        this.heads = heads;
        this.material = material;
    }

    /**
     * Method constructs an instance of Coin.
     *
     * @param heads    Boolean used for side of coin
     * @param yearMade Int for the year made
     */
    public Coin(boolean heads, int yearMade) {
        this((3000 - yearMade) / 100.0, heads, yearMade, "Gold");
    }

    /**
     * Method overrides Loot toString to Coin.
     *
     * @return String including material, year made, and the side of the coin
     */
    public String toString() {
        return "A " + material + " coin made in " + yearMade + ". Heads side is up: " + heads + ".";
    }

    /**
     * Method overrides Loot equals for Coin and compares year made and material.
     *
     * @param o Object compared to this Coin
     * @return Boolean of equality between passed object and this object
     */
    public boolean equals(Object o) {
        if (o instanceof Coin) {
            if (super.equals(o) && yearMade == ((Coin) o).yearMade && material.equals(((Coin) o).material)) {
                return true;
            }
        }
        return false;
    }
}
