package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

       Scanner userInput = new Scanner(System.in);
       System.out.println("Hello, what is your height");
       double height = userInput.nextDouble();
       System.out.println("What is your first name?");
       String firstName = userInput.next();
       System.out.printf("Height[%f] \nName[%s] \nHello %s, your height is %f", height, firstName, firstName, height);

    }
    public int count(float f){
        return new Integer(2);
    }
}
