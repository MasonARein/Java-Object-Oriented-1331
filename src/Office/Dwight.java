package Office;

import Office.Office;

import java.util.ArrayList;

/**
 * Class structure of Dwight.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public class Dwight extends Employee {
    /**
     * Creates an instance of Dwight.
     */
    public Dwight() {
        super("Dwight Schrute", 74);
    }

    /**
     * Gives information on Dwight in String format.
     * @return String with information on Dwight
     */
    public String toString() {
        return "My name is Dwight and I am the fire marshal";
    }

    /**
     * Checks if 50% of office departments have a fire extinguisher.
     * @param o Passed in Office to be checked
     * @return Boolean of if there's more than 50% of the Office that has fire extinguishers
     */
    public boolean checkOffice(Office o) {
        int fireExtinguisherCount = 0;
        for (Department d : o.getDepartments()) {
            if (d.getFireExtinguisher()) {
                fireExtinguisherCount++;
            }
        }
        return fireExtinguisherCount / o.getDepartments().size() >= 0.5;
    }

    /**
     * Looks for an Employee in an ArrayList of Employees.
     *
     * @param e         Employee to be looked for
     * @param employees ArrayList of Employees
     * @return Boolean of true if employee found; false if not
     */
    public boolean findEmployee(Employee e, ArrayList<Employee> employees) {
        int leftIndex = 0;
        int rightIndex = employees.size() - 1;
        int midIndex;
        while (leftIndex <= rightIndex) {
            midIndex = (leftIndex + rightIndex) / 2;
            if (e.compareTo(employees.get(midIndex)) > 0) {
                leftIndex = midIndex + 1;
            } else if (e.compareTo(employees.get(midIndex)) < 0) {
                rightIndex = midIndex - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * Finds Employees in the Office not accounted for in the ArrayList.
     *
     * @param e List of Employees
     * @param o Office recounted
     * @return ArrayList of Employees in Office and not in List
     */
    public ArrayList<Employee> doRecount(ArrayList<Employee> e, Office o) {
        ArrayList<Employee> notEmployee = new ArrayList<>();
        for (Employee officeE : o.getEmployees()) {
            if (!findEmployee(officeE, e)) {
                notEmployee.add(officeE);
            }
        }
        return notEmployee;
    }
}
