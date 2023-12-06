package web.model;

import java.util.Objects;

public class Car {

    private int ID;
    private String model;
    private int series;
    private int price;

    public Car() {
    }

    public Car(int ID, String model, int series, int price) {
        this.ID = ID;
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public Car(String model, int series, int price) {
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
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

    @Override
    public String toString() {
        return "Car{" +
                "ID= " + ID +
                ", model=' " + model + '\'' +
                ", series= " + series +
                ", price= " + price +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && price == car.price && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, price);
    }
}
