package CollatzConjecture;

public class Sequence3X {
    public static long conversion(long first){
        if(first % 2 ==0){
            return first/2;
        }
        else{
            return 3*first+1;
        }
    }

    public static void main(String[] args) {
        for (int pow = 2; pow < 11; ++pow) {
            for (long count = (long)Math.pow(10.0, pow-1); count < Math.pow(10.0, pow); ++count) {
                long changer = count;
                long intial = count - 1;
                try {
                    while (changer > intial) {
                        changer = Sequence3X.conversion(changer);
                    }
                } catch (Exception e) {
                    System.out.println(changer);
                }
            }
            System.out.println("Complete for 10 to the " + pow);
        }
    }
}
