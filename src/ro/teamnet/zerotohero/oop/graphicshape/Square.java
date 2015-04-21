package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class Square extends Shape {

    private int side;

    public Square(int newSide) {
        side = newSide;
    }

    @Override
    public double area() {
        return side * side;
    }
}
