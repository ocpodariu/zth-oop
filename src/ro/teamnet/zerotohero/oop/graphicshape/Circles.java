package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class Circles {

    public double getAreaPub() {
        return new Circle().area();
    }

    public void getAreaDef() {
        Circle circle = new Circle();
        circle.fillColor();
        circle.fillColor(55);
        circle.fillColor(102.3f);
    }

}
