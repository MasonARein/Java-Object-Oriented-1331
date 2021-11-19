/**
 * Bus class structure.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public class Bus extends Transportation {
    private int stops;

    /**
     * Creates an instance of Bus.
     *
     * @param company     String for name of company
     * @param id          ID number of Bus
     * @param departDate  String for depart date of Bus in MM-DD-YY format
     * @param departTime  String for depart time of Bus in HHMM format
     * @param arrivalTime String for arrival time of Bus in HHMM format
     * @param stops       Number of stops for bus ride
     */
    public Bus(String company, int id, String departDate, String departTime, String arrivalTime, int stops) {
        super(company, id, departDate, departTime, arrivalTime);
        if (stops < 0) {
            throw new IllegalArgumentException("Stops cannot be negative");
        } else {
            this.stops = stops;
        }
    }

    /**
     * Gives string with all information of bus ride.
     *
     * @return String with all information on Bus ride
     */
    public String toString() {
        return "Bus," + super.toString() + "," + stops;

    }

    /**
     * Gives boolean of equality between two bus rides comparing all values.
     *
     * @param b Passed in object of Bus to be compared
     * @return Boolean of equality between the Buses
     */
    public boolean equals(Object b) {
        return super.equals(b) && this.stops == ((Bus) b).stops;
    }
}
