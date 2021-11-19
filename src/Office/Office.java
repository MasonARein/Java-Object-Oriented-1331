package Office;

import java.util.ArrayList;

/**
 * Class structure of an Office.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public class Office {
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Employee> employees;

    /**
     * Creates an instance of Office.
     *
     * @param name String for name of Office
     */
    public Office(String name) {
        this.name = name;
        departments = new ArrayList<>();
        employees = new ArrayList<>();
    }

    /**
     * Adds a Department to the Office.
     *
     * @param d New Department
     */
    public void addDepartment(Department d) {
        departments.add(d);
    }

    /**
     * Adds an Employee to the Office.
     *
     * @param e New Employee
     */
    public void addEmployee(Employee e) {
        int loc = 0;
        while (employees.get(loc).compareTo(e) < 0) {
            loc++;
        }
        employees.add(loc, e);
    }

    /**
     * Removes an Employee from the Office.
     *
     * @param e Employee to be removed from Office
     * @return Removed Employee
     */
    public Employee removeEmployee(Employee e) {
        int loc = 0;
        while (!employees.get(loc).equals(e)) {
            loc++;
        }
        if (loc == employees.size()) {
            return null;
        }
        return employees.remove(loc);
    }

    /**
     * Gets the Departments of the Office.
     *
     * @return Departments of Office
     */
    public ArrayList<Department> getDepartments() {
        return departments;
    }

    /**
     * Gets the Employees of the Office.
     *
     * @return ArrayList of Employees in the Office
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
