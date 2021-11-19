import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

/**
 * Creates class structure for modifiying bookings.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public class Booking {
    /**
     * Develops an array of transportation from a file.
     *
     * @param fileName File to be read
     * @return ArrayList of all transportation in the file
     * @throws FileNotFoundException   Throws exception if String does not find file
     * @throws InvalidBookingException Thrown if item in file is not form of transportation
     */
    public static ArrayList<Transportation> outputBookings(String fileName)
            throws FileNotFoundException, InvalidBookingException {
        try {
            File bookingFile = new File(fileName);
            Scanner reader = new Scanner(bookingFile);
            ArrayList<Transportation> collectedTransportation = new ArrayList<>();
            while (reader.hasNextLine()) {
                String s = reader.nextLine();
                String[] info = s.split(",", 7);
                if (info[0].equals("Bus")) {
                    collectedTransportation.add(new Bus(info[1], Integer.parseInt(info[2]), info[3], info[4], info[5],
                            Integer.parseInt(info[6])));
                } else if (info[0].equals("Flight")) {
                    collectedTransportation.add(new Flight(info[1], Integer.parseInt(info[2]), info[3], info[4],
                            info[5], Integer.parseInt(info[6])));
                } else {
                    throw new InvalidBookingException();
                }
            }
            reader.close();
            return collectedTransportation;
        } catch (NullPointerException e) {
            throw new FileNotFoundException("File does not exist");
        }

    }

    /**
     * Writes in new bookings.
     *
     * @param fileName File being modified
     * @param tList    List of new transportation being added
     * @return Boolean of modification for the file
     * @throws FileNotFoundException Thrown if string does not find file
     */
    public static boolean writeBookings(String fileName, ArrayList<Transportation> tList)
            throws FileNotFoundException {
        try {
            File writtenFile = new File(fileName);
            if (writtenFile.canWrite()) {
                PrintWriter modifier = new PrintWriter(writtenFile);
                for (int i = 0; i < tList.size(); ++i) {
                    modifier.write(tList.get(i).toString());
                }
                return true;
            } else {
                return false;
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File does not exist");
        }
    }

    /**
     * Reads through bookings to find locations of transportation bookings.
     *
     * @param fileName Passed in file to be read
     * @param t        Transportation to be found
     * @return List of all line locations of the transportation passed in
     * @throws FileNotFoundException   Thrown if string given does not find file
     * @throws InvalidBookingException Thrown if no instance of passed transportation is found in the list
     */
    public static ArrayList<Integer> readBookings(String fileName, Transportation t)
            throws FileNotFoundException, InvalidBookingException {
        try {
            File readFile = new File(fileName);
            Scanner readFileScanner = new Scanner(readFile);
            ArrayList<Integer> instLoc = new ArrayList<>();
            int numLine = 0;
            while (readFileScanner.hasNextLine()) {
                if (t.toString().equals(readFileScanner.nextLine())) {
                    instLoc.add(numLine);
                }
                numLine++;
            }
            if (instLoc.size() == 0) {
                throw new InvalidBookingException();
            }
            return instLoc;

        } catch (InvalidBookingException E) {
            throw new InvalidBookingException("No Booking of that type found");
        } catch (FileNotFoundException E) {
            throw new FileNotFoundException("File does not Exist");
        }
    }

    /**
     * Main method to test booking methods.
     *
     * @param args Passed in array
     * @throws FileNotFoundException   Thrown if no file is found in used strings
     * @throws InvalidBookingException Thrown if there is an incorrect use of transportation
     */
    public static void main(String[] args) throws FileNotFoundException, InvalidBookingException {
        Flight flighta = new Flight("Delta", 12423, "04-02-2021",
                "1045", "1445", 0);
        Flight flightb = new Flight("United", 53235, "05-21-2021",
                "1120", "0345", 1);
        Bus busa = new Bus("Dashound", 34532, "12-24-2013",
                "1645", "2245", 6);
        Bus busb = new Bus("Bolt", 21321, "08-20-2021",
                "0345", "0456", 2);
        ArrayList<Transportation> routes = new ArrayList<>();
        routes.add(flighta);
        routes.add(flightb);
        routes.add(busb);
        routes.add(busa);
        Booking.writeBookings("TestBooking.csv", routes);
        ArrayList<Transportation> returnedList = Booking.outputBookings("TestBooking.csv");
        for (Transportation t : returnedList) {
            System.out.println(t.toString());
        }
        routes = new ArrayList<>();
        Flight flightc = new Flight("Frontier", 53233, "07-30-2021",
                "1345", "1630", 2);
        routes.add(flightc);
        Booking.writeBookings("TestBooking.csv", routes);
    }
}
