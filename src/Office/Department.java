package Office;

/**
 * Class structure for the Department of an Office.
 *
 * @author Mason Rein
 * @version 11.0.12
 */
public class Department {
    private String name;
    private boolean hasFireExtinguisher;

    /**
     * Creates an instance of department.
     *
     * @param name                String used for the name of the department
     * @param hasFireExtinguisher Boolean used for state of having a fire extinguisher in the department
     */
    public Department(String name, boolean hasFireExtinguisher) {
        this.name = name;
        this.hasFireExtinguisher = hasFireExtinguisher;
    }

    /**
     * Gets the state of having a fire extinguisher.
     *
     * @return Boolean of having fire extinguisher
     */
    public boolean getFireExtinguisher() {
        return hasFireExtinguisher;
    }
}
