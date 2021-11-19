/**
 * General structure of Transportation objects.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public abstract class Transportation {
    protected String company;
    protected int id;
    protected String departDate;
    protected String departTime;
    protected String arrivalTime;

    /**
     * Provides a default constructor for transportation descendants.
     *
     * @param company     String for name of Transportation companies
     * @param id          ID number of Transportation
     * @param departDate  String for depart date of transportation in format MM-DD-YYYY
     * @param departTime  String for depart time of transportation in format HHMM
     * @param arrivalTime String for arrival time of transportation in format HHMM
     * @throws IllegalArgumentException Thrown for null and empty string values
     */
    public Transportation(String company, int id, String departDate, String departTime, String arrivalTime)
            throws IllegalArgumentException {
        if (transportationChecker(company)) {
            throw new IllegalArgumentException("Null or Empty value for string");
        } else {
            this.company = company;
        }
        if (transportationChecker(departDate)) {
            throw new IllegalArgumentException("Null or Empty value for string");
        } else {
            this.departDate = departDate;
        }
        if (transportationChecker(departTime)) {
            throw new IllegalArgumentException("Null or Empty value for string");
        } else {
            this.departTime = departTime;
        }
        if (transportationChecker(arrivalTime)) {
            throw new IllegalArgumentException("Null or Empty value for string");
        } else {
            this.arrivalTime = arrivalTime;
        }
        if (id < 10000 || id > 99999) {
            throw new IllegalArgumentException("ID must be a 5 digit number");

        } else {
            this.id = id;
        }
    }

    /**
     * Gives string with all information of transportation.
     *
     * @return String includes company, id, depart date, depart time, and arrival time
     */
    public String toString() {
        return String.format("%s,%d,%s,%s,%s", company, id, departDate, departTime, arrivalTime);
    }

    /**
     * Determines equality of two transportation descendants.
     *
     * @param t Passed Transportation descendant
     * @return Boolean of equality between transportation
     */
    public boolean equals(Object t) {
        if (t instanceof Transportation) {
            return this.company.equals(((Transportation) t).company) && this.id == ((Transportation) t).id
                    && this.departDate.equals(((Transportation) t).departDate)
                    && this.departTime.equals(((Transportation) t).departTime)
                    && this.arrivalTime.equals(((Transportation) t).arrivalTime);
        } else {
            return false;
        }
    }

    /**
     * Checks if string is a valid object.
     *
     * @param s Passed in String
     * @return Boolean of validity for string
     */
    private boolean transportationChecker(String s) {
        return s == null || s.equals("");
    }

}
