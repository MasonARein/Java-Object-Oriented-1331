package Office;

/**
 * Class structure of an Employee.
 *
 * @version 11.0.12
 * @author Mason Rein
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private int height;

    /**
     * Creates an instance of Employee.
     *
     * @param name   String used for the name of the Employee
     * @param height Int used for the height of the Employee
     */
    public Employee(String name, int height) {
        this.name = name;
        this.height = height;
    }

    /**
     * Gives a String with information on the Employee.
     *
     * @return A String with fields of Employee.
     */
    public String toString() {
        return "My name is " + name + " and I am " + height + " inches tall";
    }

    /**
     * Determines if two Employees are equal.
     *
     * @param o Another Employee
     * @return Boolean of equality between Employees
     */
    public boolean equals(Object o) {
        if (o instanceof Employee) {
            return height == ((Employee) o).getHeight() && name.equals(((Employee) o).getName());
        } else {
            return false;
        }
    }

    /**
     * Gets the name of the Employee.
     *
     * @return String for name of Employee
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the height of the Employee.
     *
     * @return Integer for height of Employee
     */
    public int getHeight() {
        return height;
    }

    /**
     * Compares the height of Employees.
     *
     * @param o Compared Employee
     * @return Difference in height between this Employee and passed Employee
     */
    @Override
    public int compareTo(Employee o) {
        return height - o.getHeight();
    }
}
