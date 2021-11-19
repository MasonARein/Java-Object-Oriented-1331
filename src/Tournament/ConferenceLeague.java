package Tournament;

/**
 * Basic Format for creating Conference League Tournaments.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public class ConferenceLeague extends Tournament {
    private int teamsPerLeague;
    private String currentHolder;

    /**
     * Creates instance of Conference League Tournament.
     *
     * @param finalReferee   String for the referee of final
     * @param teamsPerLeague Int for number of teams in each league
     * @param currentHolder  String for name of current holder
     */
    public ConferenceLeague(String finalReferee, int teamsPerLeague, String currentHolder) {
        super("Conference League", 32, true, finalReferee, 15000);
        this.teamsPerLeague = teamsPerLeague;
        this.currentHolder = currentHolder;
    }

    /**
     * Gives a string with information of tournament.
     *
     * @return A string with fields of Conference League instance
     */
    public String toString() {
        return ("Name: " + this.getName() + ", Number of Teams: " + this.getNumTeams() + ", Final Referee: "
                + this.getFinalReferee() + ", Teams per League: " + teamsPerLeague + ", Current Holder: "
                + currentHolder);
    }

    /**
     * Determine if two Conference League tournaments are the same.
     *
     * @param o Another tournament object
     * @return Boolean of equality between tournaments
     */
    public boolean equals(Object o) {
        if (o instanceof ConferenceLeague) {
            return this.teamsPerLeague == ((ConferenceLeague) o).getTeamsPerLeague()
                    && this.currentHolder.equals(((ConferenceLeague) o).getCurrentHolder());
        } else {
            return false;
        }
    }

    /**
     * Moves the teams to the next round of the tournament.
     */
    public void nextRound() {
        if (this.isKnockout()) {
            if (this.getNumTeams() > 2) {
                this.setNumTeams(this.getNumTeams() / 2);
            } else {
                System.out.println("We have reached the final!");
                if (this.maxCapacity > this.getFinalCapacity()) {
                    this.maxCapacity = this.getFinalCapacity();
                }
            }
        }
    }

    /**
     * Outlines process and conditions of hiring new referee.
     *
     * @param ref String of new referee to be hired
     */
    public void refereeHire(String ref) {
        if (this.getFinalReferee().equals(ref)) {
            System.out.println("We need a new referee!");
            this.setFinalReferee("Undecided");
        } else {
            System.out.println("We're ready to go!");
            this.maxCapacity *= 2;
        }
    }

    /**
     * Gets the teams in each league.
     *
     * @return Int for number of teams in each league
     */
    public int getTeamsPerLeague() {
        return teamsPerLeague;
    }

    /**
     * Gets the current holder of Conference League tournament.
     *
     * @return String for name of current holder
     */
    public String getCurrentHolder() {
        return currentHolder;
    }
}
