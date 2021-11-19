/*   <-- This is the start of a block comment.
 * Identifiers are the names that identify the elements such as classes,
 * methods, and variables in a program.
 * Types of identifiers:
 * 1) Programmer defined: Example, args, janDays
 * 2) Other-programmer defined (built in "libraries"):
 *    System, String, printLn
 * 3) Reserved (or key) words: public, class, void
 *
 * Identifier rules:
 * - case-sensitive
 * - starts with a letter
 * - Subsequent characters may be letters, digits, or underscore characters
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
 * 
 This is the end of a block comment ---> */
public class Example{
    public static void main(String[] args) {
        int num;
        num = 10;
        System.out.println(num);

        int num2 = 15;
        System.out.println("num2" + num2);

        double dub = 3.14159265358;
        System.out.println("dub"+ dub);

        long l = 10l;
        System.out.println("l" + l);

    }
}
