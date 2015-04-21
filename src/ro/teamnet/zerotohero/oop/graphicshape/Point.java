package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class Point {

    int xPos, yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null)
            return false;

        if (object instanceof Point) {
            Point other = (Point) object;
            if ((xPos == other.xPos) && (yPos == other.yPos))
                return true;
        }

        return false;
    }
}
