package web;

public class Car {

    private String name;
    private String series;
    private String vin;

    public Car() {

    }

    public Car(String name, String series, String vin) {
        this.name = name;
        this.series = series;
        this.vin = vin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

}
