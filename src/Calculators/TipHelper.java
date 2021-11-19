package Calculators;

public class TipHelper {
    /*
    Mason Rein
    I wish more people knew about how much I like card games!
     */
    public static void main(String[] args) {
        double tipPercentage = 0.15;
        double mealTotal = 20.17;
        int numberItemsOrdered = 3;
        String customerName = "Jacob";
        double totalTip = tipPercentage * mealTotal;
        double totalAmountPaid = totalTip + mealTotal;
        System.out.printf("The total tip was $%.2f!\n", totalTip);
        System.out.printf(customerName + " owes a total of $%.2f.\n", totalAmountPaid);
    }
}
