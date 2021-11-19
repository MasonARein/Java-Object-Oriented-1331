package Halloween;

/**
 * Class structure for Witch companions.
 * @author Mason Rein
 * @version 11.0.12
 */
public class BlackCat extends TrickOrTreater {
    private String name;
    private boolean familiar;

    /**
     * Creates an object of BlackCat using name and familiar.
     *
     * @param name     Parameter for a String as the name of the cat
     * @param familiar Parameter for the boolean value of if the cat is a familiar
     */
    public BlackCat(String name, boolean familiar) {
        this.name = name;
        this.familiar = familiar;
    }

    /**
     * Creates an object of BlackCat that is a copy of another BlackCat object.
     *
     * @param other BlackCat that will be copied
     */
    public BlackCat(BlackCat other) {
        this(other.getName(), other.getFamiliar());
    }

    /**
     * Gives the familar value for the cat.
     *
     * @return boolean for the familiarity of the cat
     */
    public boolean getFamiliar() {
        return familiar;
    }

    /**
     * Sets the familarity of the cat.
     *
     * @param familiar Boolean taken in for familiarity of cat
     */
    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Prints out the name and familiarity of the cat.
     */
    public void meow() {
        String piece = this.getFamiliar() ? "a familiar" : "not a familiar";
        System.out.printf("%s is %s \n", name, piece);
    }
}
