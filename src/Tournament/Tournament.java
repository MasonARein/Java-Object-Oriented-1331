package Tournament;

/**
 * Basic format for creating tournaments.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public abstract class Tournament {
    private String name;
    private int numTeams;
    private boolean knockout;
    private String finalReferee;
    protected int maxCapacity;
    private static final int FINAL_CAPACITY = 30000;

    /**
     * Creates an instance of the Tournament class.
     *
     * @param name         String for name of tournament
     * @param numTeams     Int for number of teams in tournament
     * @param knockout     Boolean for type of knockout tournament
     * @param finalReferee String for the referee of final
     * @param maxCapacity  Int for max capacity of spectators
     */
    public Tournament(String name, int numTeams, boolean knockout, String finalReferee, int maxCapacity) {
        this.name = name;
        this.numTeams = numTeams % 2 == 0 ? numTeams : 16;
        this.knockout = numTeams > 64 ? true : knockout;
        this.finalReferee = finalReferee;
        this.maxCapacity = maxCapacity;
    }

    /**
     * Gives a string with information of tournament.
     *
     * @return A string with fields of Tournament instance
     */
    public String toString() {
        String piece = knockout ? "is" : "isn't";
        return ("Name: " + name + ", Number of Teams: " + numTeams + ", KO: this " + piece
                + " a KO tournament, Final Referee: " + finalReferee + ", Maximum Capacity" + maxCapacity + "\n");
    }

    /**
     * Determines if two tournaments are the same.
     *
     * @param o Another tournament object
     * @return Boolean of equality between tournaments
     */
    public boolean equals(Object o) {
        if (o instanceof Tournament) {
            return this.name.equals(((Tournament) o).getName()) && this.numTeams == ((Tournament) o).getNumTeams()
                    && this.knockout == ((Tournament) o).isKnockout();
        } else {
            return false;
        }
    }

    /**
     * Outlines process and conditions of hiring new referee.
     *
     * @param ref String of new referee to be hired
     */
    public abstract void refereeHire(String ref);

    /**
     * Gets name of tournament.
     *
     * @return String for name of tournament
     */
    public String getName() {
        return name;
    }

    /**
     * Gets number of teams in tournament.
     *
     * @return Int for number of teams in tournament
     */
    public int getNumTeams() {
        return numTeams;
    }

    /**
     * Gets the type of knockout for a tournament.
     *
     * @return true for knockout tournaments
     */
    public boolean isKnockout() {
        return knockout;
    }

    /**
     * Gets the name of the final referee.
     *
     * @return String for name of final referee
     */
    public String getFinalReferee() {
        return finalReferee;
    }

    /**
     * Sets the number of teams in the tournament.
     *
     * @param numTeams Int for number of teams in tournament
     */
    public void setNumTeams(int numTeams) {
        this.numTeams = numTeams % 2 == 0 ? numTeams : 16;
        if (numTeams > 64) {
            knockout = true;
        }
    }

    /**
     * Sets the final referee for a tournament.
     *
     * @param finalReferee String for name of referee in tournament
     */
    public void setFinalReferee(String finalReferee) {
        this.finalReferee = finalReferee;
    }

    /**
     * Gets the final capacity of tournament.
     *
     * @return Int for final capacity of tournament
     */
    public int getFinalCapacity() {
        return FINAL_CAPACITY;
    }
}