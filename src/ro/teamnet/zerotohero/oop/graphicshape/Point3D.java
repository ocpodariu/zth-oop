package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class Point3D extends Point {

    private int zPos;

    public Point3D(int xPos, int yPos, int zPos) {
        super(xPos, yPos);
        this.zPos = zPos;
    }
}
