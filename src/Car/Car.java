package Car;

public class Car {
    private String make;
    private String model;
    private int year;
    private int hp;
    public int speed;

    public Car(String make, String model, int year, int hp){
        this.make = make;
        this.model = model;
        setYear(year);
        this.hp = hp;
    }
    public void print(){
        System.out.printf("<make,model,year,hp,speed> : <%s, %s, %d, %d, %d> \n", make, model, year, hp, speed);
    }
    public void setYear(int year){
        if(year >= 0 && year < 2023){
            this.year = year;
        }
    }
}
