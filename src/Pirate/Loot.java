package Pirate;

/**
 * Class defines the structure for the object of Loot.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public abstract class Loot {
    private double value;

    /**
     * Method constructs an instance of Loot.
     *
     * @param value Double used for the value of the Loot
     */
    public Loot(double value) {
        if (value > 0) {
            this.value = value;
        }
    }

    /**
     * Method constructs an instance of Loot with no value.
     */
    public Loot() {
        this.value = 0;
    }

    /**
     * Method gets the value of a piece of Loot.
     *
     * @return Double value of Loot
     */
    public double getValue() {
        return value;
    }

    /**
     * Method sets the value of a piece of Loot.
     *
     * @param value Double tobe used as value for loot
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Method overrides Object toString for Loot.
     *
     * @return String that includes value of Loot
     */
    public String toString() {
        return "A piece of loot worth " + value;
    }

    /**
     * Method overrides Object equals for Loot using comparison of values.
     *
     * @param o Object compared to this Loot
     * @return Boolean of equality between passed Object and this object
     */
    public boolean equals(Object o) {
        if (o instanceof Loot) {
            return value == ((Loot) o).getValue();
        } else {
            return false;
        }
    }
}
