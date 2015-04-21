package ro.teamnet.zerotohero.oop.runapp;

import ro.teamnet.zerotohero.oop.canvas.Canvas;
import ro.teamnet.zerotohero.oop.graphicshape.*;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class RunApp {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circles circles = new Circles();
        System.out.println("The default circle is " + circle);
        System.out.println("The default circle area is " + circles.getAreaPub());

        System.out.println("\nCall fillColor():");
        circles.getAreaDef();

        Canvas canvas = new Canvas();
        // "getArea()" has package access => cannot be called here
        // canvas.getArea();

        System.out.println("\nPolymorphism:");
        Shape shape = new Circle(10);
        System.out.println("The shape's area is " + shape.area());

        ShapeBehaviour shapeBehaviour = new Square(10);
        System.out.println("The shape's area is " + shapeBehaviour.area());
    }

}
