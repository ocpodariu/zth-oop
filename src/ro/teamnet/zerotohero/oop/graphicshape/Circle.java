package ro.teamnet.zerotohero.oop.graphicshape;

import static java.lang.Math.PI;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class Circle extends Shape {

    int xPos, yPos;
    int radius;

    public Circle() {
        xPos = 5;
        yPos = 5;
        radius = 10;
    }

    public Circle(int xPos) {
        this.xPos = xPos;
    }

    public Circle(int xPos, int yPos) {

        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "center = (" + xPos + ", " + yPos + ") and radius = " + radius;
    }

    public void fillColor() {
        System.out.println("Super class color primitive = " + color);
    }

    public void fillColor(int color) {
        this.color = color;
        System.out.println("Color is now " + this.color);
    }

    public void fillColor(float saturation) {
        this.saturation = saturation;
        System.out.println("Saturation is now " + this.saturation);
    }
}
