/**
 * Flight class structure.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public class Flight extends Transportation {
    private int connectors;

    /**
     * Creates an instance of a flight.
     *
     * @param company     String for name of Airline
     * @param id          ID number of the flight
     * @param departDate  String for the depart date in the format of MM-DD-YYYY
     * @param departTime  String for the depart time in the format of HHMM
     * @param arrivalTime String for the arrival time in the format of HHMM
     * @param connectors  Int for the number of connector flights
     */
    public Flight(String company, int id, String departDate, String departTime, String arrivalTime, int connectors) {
        super(company, id, departDate, departTime, arrivalTime);
        if (connectors < 0) {
            throw new IllegalArgumentException("Connectors must be Positive");
        } else {
            this.connectors = connectors;
        }
    }

    /**
     * Gives string with all information for a flight.
     *
     * @return String with all variables with using a string from Transportation
     */
    public String toString() {
        return "Flight," + super.toString() + "," + connectors;
    }

    /**
     * Gives boolean of equality between two flights by comparing all variables of flight.
     *
     * @param f Passed in object of flight to be compared
     * @return Boolean of equality between the two flights
     */
    public boolean equals(Object f) {
        if (f instanceof Flight) {
            return super.equals(f) && this.connectors == ((Flight) f).connectors;
        } else {
            return false;
        }
    }
}
