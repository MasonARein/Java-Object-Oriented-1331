package Halloween;

import Halloween.TrickOrTreater;
import Halloween.Witch;

/**
 * Makes a runner method to create instances of TrickOrTreaters.
 * @author Mason Rein
 * @version 11.0.12
 */
public class HappyHalloween {
    /**
     * @param args String Array for runner
     */
    public static void main(String[] args) {
        Ghost casper = new Ghost("Casper", "SDK", 30, 5);
        Ghost casperCopy = new Ghost(casper);
        casperCopy.setName("William");
        System.out.println(casper.getName());
        System.out.println(casperCopy.getName());
        Witch melisandre = new Witch("Melisandre", "GOT", 24, "Fireball", new BlackCat("Cat", false));
        BlackCat crookshanks = new BlackCat("Crookshanks", true);
        Witch herimone = new Witch("Herimone", "Wingardium Leviosa", crookshanks);
        Witch herimoneCopy = new Witch(herimone);
        herimoneCopy.setCompanion(new BlackCat("Cauldron Familiar", true));
        System.out.println(herimone.getCompanion().getName());
        casper.seekCandy(13);
        melisandre.seekCandy(7);
        crookshanks.seekCandy(11);
        herimone.seekCandy(15);
        System.out.println(TrickOrTreater.getTotalCandy());
    }
}
