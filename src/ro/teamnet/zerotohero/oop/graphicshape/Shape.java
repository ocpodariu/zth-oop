package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class Shape extends AbstractShape implements ShapeBehaviour {

    protected int color;
    protected float saturation;

    public double area() {
        return 0;
    }

    public void setColor(int newColor) {
        color = newColor;
    }

    public void setSaturation(float newSaturation) {
        saturation = newSaturation;
    }

}
