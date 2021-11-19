package Car;

import Car.Car;

public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car("Acura", "TL Type S", 2002, 260);
        c1.print();
        c1.speed = Integer.MAX_VALUE;
        c1.print();
    }
}
