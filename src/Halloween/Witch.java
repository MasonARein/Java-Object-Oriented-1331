package Halloween;

/**
 * Defines new object called Witch and extends the class of TrickOrTreater.
 * @author Mason Rein
 * @version 11.0.12
 */
public class Witch extends TrickOrTreater {
    private String signatureSpell;
    private BlackCat companion;

    /**
     * Creates an object of Witch using specified parameters.
     *
     * @param name           Passed string used for name of Witch
     * @param neighborhood   Passed string used for name of neighborhood of Witch
     * @param numCandy       Passed int used for number of candy held
     * @param signatureSpell Passed string used for name of Witch's spell
     * @param companion      Passed object of BlackCat used for companion of Witch
     */
    public Witch(String name, String neighborhood, int numCandy, String signatureSpell, BlackCat companion) {
        super(name, neighborhood, numCandy);
        this.signatureSpell = signatureSpell;
        this.companion = companion;
    }

    /**
     * Creates an object of Witch using specified parameters.
     *
     * @param name           Passed string used for name of Witch
     * @param signatureSpell Passed string used for name of Witch's spell
     * @param companion      Passed object of BlackCat used for companion of Witch
     */
    public Witch(String name, String signatureSpell, BlackCat companion) {
        this(name, "Godric's Hollow", 13, signatureSpell, companion);
    }

    /**
     * Creates an object of Witch that is a copy of a passed Witch.
     *
     * @param other Witch that will be copied
     */
    public Witch(Witch other) {
        this(other.getName(), other.getNeighborhood(), other.getNumCandy(), other.getSignatureSpell(),
                other.getCompanion());
        this.companion = new BlackCat(other.getCompanion());
    }

    /**
     * Gives the name of the Witch's spell.
     *
     * @return String for the name of Witch's speel
     */
    public String getSignatureSpell() {
        return signatureSpell;
    }

    /**
     * Sets the name of the Witch's spell.
     *
     * @param signatureSpell String used for name of spell
     */
    public void setSignatureSpell(String signatureSpell) {
        this.signatureSpell = signatureSpell;
    }

    /**
     * Gives the companion BlackCat of the Witch.
     *
     * @return BlackCat companion of Witch
     */
    public BlackCat getCompanion() {
        return companion;
    }

    /**
     * Sets the companion BlackCat of the Witch.
     *
     * @param companion BlackCat to be set as companion
     */
    public void setCompanion(BlackCat companion) {
        this.companion = companion;
    }

    /**
     * Doubles the candy of the Witch and prints out the Witch name and spell.
     */
    public void castSpell() {
        System.out.printf("%s casts %s! \n", name, signatureSpell);
        this.setNumCandy(this.getNumCandy() * 2);
    }
}
