package ro.teamnet.zerotohero.exceptions;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class InvalidDimensionException extends Exception {

    private double dimension;

    public InvalidDimensionException(String message, double dimension) {
        super(message);
        this.dimension = dimension;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "\nEntered dimension: " + dimension;
    }
}
