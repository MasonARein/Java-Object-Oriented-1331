package NeighborhoodProject;

public class House {
    private String address;
    private int yearBuilt;
    private double numBaths;
    private boolean isRenovated;

    public House(String address, int yearBuilt, double numBaths, boolean isRenovated) {
        this.address = address;
        this.isRenovated = isRenovated;
        if (yearBuilt >= 0) {
            this.yearBuilt = yearBuilt;
        }
        if (isValidBath(numBaths)) {
            this.numBaths = numBaths;
        }
    }

    public House(String address, double numBaths) {
        this(address, 1984, numBaths, false);
    }

    public House() {
        this("North Ave NW, Atlanta, GA 30332", 1);
    }

    private boolean isValidBath(double bath) {
        return bath / 0.5 == (int) (bath / 0.5) && bath >= 0;
    }

    public String getAddress() {
        return address;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public double getNumBaths() {
        return numBaths;
    }

    public boolean isRenovated() {
        return isRenovated;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setYearBuilt(int yearBuilt) {
        if (yearBuilt >= 0) {
            this.yearBuilt = yearBuilt;
        }
    }

    public void setNumBaths(double numBaths) {
        if (isValidBath(numBaths)) {
            this.numBaths = numBaths;
        }
    }

    public void setRenovated(boolean renovated) {
        isRenovated = renovated;
    }
}
