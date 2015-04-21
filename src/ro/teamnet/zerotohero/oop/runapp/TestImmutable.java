package ro.teamnet.zerotohero.oop.runapp;

import ro.teamnet.zerotohero.oop.immutable.Watch;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class TestImmutable {

    public static void main(String[] args) {
        Watch watch = new Watch("Longines", "L2.693.4.78.3",
                "Round", "Sapphire crystal", "Stainless steel", 44.0,
                "Brown", "Alligator strap");

        System.out.println(watch.getName());
        System.out.println(watch.getCaseDetails());
        System.out.println(watch.getBraceletDetails());
    }

}
