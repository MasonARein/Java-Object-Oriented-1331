package Halloween;

/**
 * Develops a class structure for Trick or Treaters.
 * @author Mason Rein
 * @version 11.0.12
 */
public class TrickOrTreater {
    protected String name;
    protected String neighborhood;
    protected int numCandy;
    protected static int totalCandy;

    /**
     * Creates an object of TrickOrTreater type using specified parameters, and modifies the value of total candy by
     * adding the numbCandy passed into constructor.
     *
     * @param name         Passed string used for name of trick or treater
     * @param neighborhood Passed string used for name of neighborhood of trick or treater
     * @param numCandy     Passed int used for number of candy held
     */
    public TrickOrTreater(String name, String neighborhood, int numCandy) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.numCandy = numCandy;
        totalCandy += numCandy;
    }

    /**
     * Creates an object of TrickOrTreater with name of Agnes in a neighborhood of Halloweentown with 0 candy.
     */
    public TrickOrTreater() {
        this("Agnes", "Halloweentown", 0);
    }

    /**
     * Increases the numCandy for the Trick Or Treater by 3 times luck in similar process of finding candy.
     *
     * @param luck Int used for the luck of trick or treater to determine candy gained
     */
    public void seekCandy(int luck) {
        int candyGained = 3 * luck;
        numCandy += candyGained;
        totalCandy += candyGained;
    }

    /**
     * Returns the string for the name of the Trick Or Treater.
     *
     * @return Gives name of Trick or Treater
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name for the Trick Or Treater to a given string.
     *
     * @param name Passed string used for name of trick or treater
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string for the name of the neighborhood.
     *
     * @return Gives name of Trick or Treater's neighborhood
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * Sets the name of the neighborhood to a given string.
     *
     * @param neighborhood Passed string used for name of neighborhood of trick or treater
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * Returns an integer for the number of candy held by a given Trick or Treater.
     *
     * @return Int for number of candy held by trick or treater
     */
    public int getNumCandy() {
        return numCandy;
    }

    /**
     * Sets the number of candy held by a Trick or Treater to a given integer.
     * Passed value must be larger than the currently stored value.
     * Updates the total candy to accurately measure new amounts of candy.
     *
     * @param numCandy Passed int used for number of candy held
     */
    public void setNumCandy(int numCandy) {
        if (numCandy > this.numCandy) {
            this.totalCandy += numCandy - this.numCandy;
            this.numCandy = numCandy;
        }
    }

    /**
     * Returns an integer for the number of candy held by all Trick or Treaters.
     *
     * @return Int for number of candy held by all trick or treaters
     */
    public static int getTotalCandy() {
        return totalCandy;
    }

    /**
     * Sets the total number of candy held by Trick or Treaters to a given integer.
     * Passed value must be larger than value currently stored.
     *
     * @param totalCandy Passed int used for number of candy held by all trick or treaters
     */
    public static void setTotalCandy(int totalCandy) {
        if (totalCandy > TrickOrTreater.totalCandy) {
            TrickOrTreater.totalCandy = totalCandy;
        }
    }
}
