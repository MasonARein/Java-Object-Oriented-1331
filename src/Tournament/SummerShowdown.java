package Tournament;

/**
 * Basic format for creating Summer Showdown Tournaments.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public class SummerShowdown extends Tournament {
    private String backupReferee;

    /**
     * Creates an instance of Summer Showdown.
     *
     * @param numTeams      Int number of teams in tournament
     * @param knockout      Boolean for type of knockout tournament
     * @param finalReferee  String for the referee of final
     * @param maxCapacity   Int for max capacity of spectators
     * @param backupReferee String for backup referee of final
     */
    public SummerShowdown(int numTeams, boolean knockout, String finalReferee, int maxCapacity, String backupReferee) {
        super("Summer Showdown", numTeams, knockout, finalReferee, maxCapacity);
        this.backupReferee = backupReferee;
    }

    /**
     * Creates an instance of Summer Showdown.
     *
     * @param finalReferee  String for the referee of final
     * @param backupReferee String for backup referee of final
     */
    public SummerShowdown(String finalReferee, String backupReferee) {
        this(64, false, finalReferee, 20000, backupReferee);
    }

    /**
     * Gives a string with information of tournament.
     *
     * @return A string with fields of Summer Showdown instance
     */
    public String toString() {
        return "Name: " + this.getName() + ", Number of Teams: " + this.getNumTeams() + ", Final Referee: "
                + this.getFinalReferee() + ", Backup Referee: " + backupReferee + ", Maximum Capacity: "
                + this.maxCapacity;
    }

    /**
     * Determine if two Summer Showdowns are the same.
     *
     * @param o Another tournament object
     * @return Boolean of equality between tournaments
     */
    public boolean equals(Object o) {
        if (o instanceof SummerShowdown) {
            return this.getFinalReferee().equals(((SummerShowdown) o).getFinalReferee()) && this.maxCapacity
                    == ((SummerShowdown) o).maxCapacity;
        } else {
            return false;
        }
    }

    /**
     * Outlines process and conditions of hiring new referee.
     *
     * @param ref String of new referee to be hired
     */
    @Override
    public void refereeHire(String ref) {
        if (this.getFinalReferee().equals(ref)) {
            System.out.println("We need a new referee! " + backupReferee + " is already refereeing the final!");
            this.backupReferee = "Undecided";
        } else if (this.backupReferee.equals(ref)) {
            System.out.println("Be ready for some conflicts!");
            maxCapacity /= 2;
        } else {
            System.out.println("Ready to play!");
        }
    }
}
