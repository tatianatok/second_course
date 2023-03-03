package Transport;

import java.util.*;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private Driver driver;
    private final List<Mechanics> mechanics = new ArrayList<>();
    Map<Transport, Mechanics> map = new HashMap<>();

    public Transport(String brand,
                     String model,
                     double engineVolume) {

        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume < 0) {
            this.engineVolume = 2;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public abstract void startMove();

    public abstract void stopMove();

    public abstract void checkTransport();


    public void getMechanics() {
        System.out.println("Список механиков у " + getBrand() + " " + getModel() + ": ");
        System.out.printf(map.get(this).getName() + " " + map.get(this).getNameCompany());
    }

    public String getBrand() {
        return brand;
    }
    public abstract void printType();

    public abstract void getPitStop();
    public abstract void getBestTimeCircle();
    public abstract void getMaxSpeed();

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public abstract void makeTO();

    public abstract boolean service();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) &&
                model.equals(transport.model) && driver.equals(transport.driver) && map.equals(transport.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, map);
    }
}