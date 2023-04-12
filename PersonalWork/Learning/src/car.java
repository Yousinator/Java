//! Encapsulation Example

public class car {
    private String color;
    private String make;
    private String model;
    private int vin;
    private int year;
    String license = "Public License";

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

}
