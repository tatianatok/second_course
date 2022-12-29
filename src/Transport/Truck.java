
package Transport;

import java.util.Objects;

public class Truck extends Transport {
    private String kind;

    public Truck(String brand,
                 String model,
                 String kind,
                 double engineVolume) {
        super(brand, model, engineVolume);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString () {
        return getBrand() + " " + getModel() +
                ", тип грузовика: " + getKind() +
                ", объем двигателя: " + getEngineVolume();
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик начал движение!");
    }

    @Override
    public void stopMove() {
        System.out.println("Грузовик закончил движение!");
    }

    @Override
    public void getPitStop() {
        System.out.println("Грузовик на пит-стоп!");
    }

    @Override
    public void getBestTimeCircle() {
        System.out.println("Лучшее время круга грузовика: ");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость грузовика: ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return Objects.equals(kind, truck.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind);
    }
}

