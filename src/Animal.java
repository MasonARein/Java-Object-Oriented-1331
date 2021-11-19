public class Animal {
    public void move(){

    }

    public static void main(String[] args) {
        Animal a2 = new Dog();
        ((Cat) a2).move();
    }
}
class Dog extends Animal{
    public Dog(){

    }
    public void move(){

    }
}
class Cat extends Animal{
    public Cat(){

    }
    public void move(){

    }
}