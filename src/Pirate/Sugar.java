package Pirate;

/**
 * Class defines the structure for the Object of Sugar extending the class of Loot.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public class Sugar extends Loot {
    private double amount;
    private double sweetness;

    /**
     * Method constructs an instance of Sugar.
     *
     * @param amount    Double for the amount of Sugar
     * @param sweetness Double for the sweetness of Sugar in range of [0,100]
     */
    public Sugar(double amount, double sweetness) {
        this.sweetness = sweetness <= 100 && sweetness >= 0 ? sweetness : 0;
        this.amount = amount >= 0 ? amount : 0;
        this.setValue(amount * sweetness);
    }

    /**
     * Method overrides Loot toString to Sugar.
     *
     * @return String including amount and sweetness
     */
    public String toString() {
        return "A pile of sugar of size " + amount + " and sweetness " + sweetness + ".";
    }

    /**
     * Method overrides Loot equals for Sugar and compares amount and sweetness.
     *
     * @param o Object compared to this Loot
     * @return Boolean of equality between passed object and this object
     */
    public boolean equals(Object o) {
        if (o instanceof Sugar) {
            return super.equals(o) && amount == ((Sugar) o).amount && sweetness == ((Sugar) o).sweetness;
        } else {
            return false;
        }
    }
}
