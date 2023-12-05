package web.model;

public class Car {

    private static int ID = 0;
    private String model;
    private int series;
    private int price;

    public Car() {
    }

    public Car(String model, int series, int price) {
        ID++;
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public static int getID() {
        return ID;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
