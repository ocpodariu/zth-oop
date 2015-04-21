package ro.teamnet.zerotohero.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class GCExample {

    public static void main(String[] args) {
        List<DemoObject> demoObjects = new ArrayList<DemoObject>();

        while (true) {
            demoObjects.add(new DemoObject());
        }
    }

}
