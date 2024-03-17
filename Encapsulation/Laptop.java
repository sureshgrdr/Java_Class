public class Laptop {

    public String brandName;
    public String modelSeries;
    public String color;
    public String processor;
    public Integer ram;
    public Integer ssd;
    public String graphicMemory;
    public String operatingSystem;
    public boolean touchScreen;
    public boolean fingerPrintSensor;
    public String batteryCell;
    public Integer price;


    public Laptop(String brandName, String modelSeries, String color, String processor, Integer ram, Integer ssd,
            String graphicMemory, String operatingSystem, boolean touchScreen, boolean fingerPrintSensor,
            String batteryCell, Integer price) {
        this.brandName = brandName;
        this.modelSeries = modelSeries;
        this.color = color;
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
        this.graphicMemory = graphicMemory;
        this.operatingSystem = operatingSystem;
        this.touchScreen = touchScreen;
        this.fingerPrintSensor = fingerPrintSensor;
        this.batteryCell = batteryCell;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Laptop [brandName=" + brandName + ", modelSeries=" + modelSeries + ", color=" + color + ", processor="
                + processor + ", ram=" + ram + ", ssd=" + ssd + ", graphicMemory=" + graphicMemory
                + ", operatingSystem=" + operatingSystem + ", touchScreen=" + touchScreen + ", fingerPrintSensor="
                + fingerPrintSensor + ", batteryCell=" + batteryCell + ", price=" + price + "]";
    }

    

    



    
}
