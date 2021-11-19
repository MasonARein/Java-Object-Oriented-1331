package NeighborhoodProject;

public class HouseHunting {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();
        House house3 = new House();
        Neighborhood neighborhood123 = new Neighborhood(new House[3]);
        neighborhood123.addHouse(0, house1);
        neighborhood123.addHouse(1, house2);
        neighborhood123.addHouse(2, house3);
        neighborhood123.displayNewHouses(1900);
        System.out.print(neighborhood123.isFull());
    }
}
