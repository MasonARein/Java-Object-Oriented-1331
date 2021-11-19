package Halloween;

/**
 * Defines new object called Ghost and extends the class of TrickOrTreater.
 * @author Mason Rein
 * @version 11.0.12
 */
public class Ghost extends TrickOrTreater {
    private int transparency;

    /**
     * Creates an object of Ghost using specified parameters.
     *
     * @param name         Passed string used for name of Ghost
     * @param neighborhood Passed string used for name of neighborhood of Ghost
     * @param numCandy     Passed int used for number of candy held
     * @param transparency Passed int used for transparency of Ghost
     */
    public Ghost(String name, String neighborhood, int numCandy, int transparency) {
        super(name, neighborhood, numCandy);
        this.transparency = transparency;
    }

    /**
     * Creates an object of Ghost using specified parameters.
     *
     * @param transparency Passed int used for transparency of Ghost
     */
    public Ghost(int transparency) {
        super();
        this.transparency = transparency;
    }

    /**
     * Creates an object of Ghost that is a copy of passed Ghost.
     *
     * @param other Ghost that will be copied
     */
    public Ghost(Ghost other) {
        this(other.getName(), other.getNeighborhood(), other.getNumCandy(), other.getTransparency());
    }

    /**
     * Gives the transparency of the Ghost.
     *
     * @return int of Ghost's transparency
     */
    public int getTransparency() {
        return transparency;
    }

    /**
     * Sets the transparency of the Ghost.
     *
     * @param transparency int used measure of transparency
     */
    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    /**
     * Evaluates how spooky the ghost is.
     */
    public void spook() {
        if (this.transparency > 9) {
            System.out.println("Very spooky");
        } else if (this.transparency > 2) {
            System.out.println("Boo!");
        } else {
            System.out.println("Not very spooky");
        }
    }
}
