package ro.teamnet.zerotohero.gc;

import java.util.Random;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class DemoObject {

    private static final int BUFFER_SIZE = 100000;
    private static final char[] characters = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

    private static int count = 0;

    private String temp;
    private String objectReference;

    public DemoObject() {
        this.objectReference = this.toString();

        // Generate random string
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < BUFFER_SIZE; i++)
            sb.append(characters[rand.nextInt(characters.length)]);

        temp = sb.toString();

        // Update number of created objects
        count++;
    }
}
