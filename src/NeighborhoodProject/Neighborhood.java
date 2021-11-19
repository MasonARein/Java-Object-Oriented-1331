package NeighborhoodProject;

public class Neighborhood {
    private int numHouses;
    private House[] houses;

    public Neighborhood(House[] houses) {
        this.houses = houses;
        this.numHouses = 0;
        for (House h : houses) {
            if (h != null) {
                ++numHouses;
            }
        }
    }

    public Neighborhood() {
        this(new House[5]);
    }

    private boolean validIndex(int index) {
        return index < houses.length && index > -1;
    }

    public void displayNewHouses(int afterYear) {
        for (House h : houses) {
            if (h != null && h.getYearBuilt() >= afterYear) {
                String piece = h.isRenovated() ? "has" : "has not";
                String whole = "House located at %s was built in %d, "
                        + "has %f number of bathrooms, and %s been renovated recently \n";
                System.out.printf(whole, h.getAddress(), h.getYearBuilt(), h.getNumBaths(), piece);
            }
        }
    }

    public House addHouse(int index, House newHouse) {
        if (validIndex(index) && newHouse != null) {
            House oldHouse = houses[index];
            if (oldHouse == null) {
                ++numHouses;
            }
            houses[index] = newHouse;
            return oldHouse;
        } else {
            return null;
        }
    }

    public House removeHouse(int index) {
        if (validIndex(index)) {
            House oldHouse = houses[index];
            if (oldHouse != null) {
                --numHouses;
            }
            houses[index] = null;
            return oldHouse;
        } else {
            return null;
        }
    }

    public boolean isFull() {
        return houses.length == numHouses;
    }
}
