package ro.teamnet.zerotohero.oop.immutable;

/**
 * Author: Ovidiu
 * Date:   4/21/2015
 */
public class Watch {
    private final String brand;
    private final String modelNumber;
    private final String shape;
    private final String glass;
    private final String caseMaterial;
    private final double caseDimension;
    private final String braceletColor;
    private final String braceletMaterial;

    public Watch(String brand, String modelNumber, String shape, String glass,
                 String caseMaterial, double caseDimension,
                 String braceletColor, String braceletMaterial)
    {
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.shape = shape;
        this.glass = glass;
        this.caseMaterial = caseMaterial;
        this.caseDimension = caseDimension;
        this.braceletColor = braceletColor;
        this.braceletMaterial = braceletMaterial;
    }

    public String getName() {
        return brand + " - " + modelNumber;
    }

    public String getCaseDetails() {
        return "Case: " +
                "\n\tShape: " + shape +
                "\n\tGlass: " + glass +
                "\n\tMaterial: " + caseMaterial +
                "\n\tDimension: " + caseDimension + " mm";
    }

    public String getBraceletDetails() {
        return "Bracelet" +
                "\n\tColor: " + braceletColor +
                "\n\tMaterial: " + braceletMaterial;
    }
}
