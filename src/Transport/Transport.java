
package Transport;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;

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
}