package web.models;

import org.springframework.context.annotation.ComponentScan;

import java.util.Objects;


public class Car {
    private String model;
    private String serial;
    private int year;

    public Car(String model, String serial, int year) {
        this.model = model;
        this.serial = serial;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(model, car.model) &&
                Objects.equals(serial, car.serial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, serial, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", year=" + year +
                '}';
    }
}
