package ro.teamnet.zerotohero.oop.runapp;

import org.omg.CORBA.DynAnyPackage.Invalid;
import ro.teamnet.zerotohero.exceptions.InvalidDimensionException;
import ro.teamnet.zerotohero.oop.immutable.Watch;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class TestImmutable {

    public static void main(String[] args) throws InvalidDimensionException {
        Watch watch;

        try {
            watch = new Watch("Longines", "L2.693.4.78.3",
                    "Round", "Sapphire crystal", "Stainless steel", 44.0,
                    "Brown", "Alligator strap");

            System.out.println(watch.getName());
            System.out.println(watch.getCaseDetails());
            System.out.println(watch.getBraceletDetails());
        } catch(InvalidDimensionException e) {
            //System.out.println(e.getMessage());
            throw e;
        } finally {
            watch = null;
        }
    }

}
