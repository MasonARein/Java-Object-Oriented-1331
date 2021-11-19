package Tournament;

import Tournament.SummerShowdown;

public class TournamentRunner {
    public static void main(String[] args) {
        SummerShowdown v = new SummerShowdown(32, true, "Bob", 200000, "Tim");
        SummerShowdown a = null;
        System.out.println(v.equals(a));
    }
}
