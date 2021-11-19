/**
 * Exception used for invalid bookings.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public class InvalidBookingException extends Exception {

    /**
     * Throws an invalid booking exception.
     *
     * @param msg String used for message of exception
     */
    public InvalidBookingException(String msg) {
        super(msg);
    }

    /**
     * Throws an invalid booking exception.
     */
    public InvalidBookingException() {
        this("Invalid booking type");
    }
}
