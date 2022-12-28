package Transport;

import java.util.Objects;

public class Bus extends Transport {
    private String type;

    public Bus (String brand,
                String model,
                String type,
                double engineVolume) {
        super(brand, model, engineVolume);
        this.type = type;
        }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void startMove() {
        System.out.println("Автобус начал движение!");
    }

    @Override
    public void stopMove() {
        System.out.println("Автобус закончил движение!");
    }

    @Override
    public void getPitStop() {
        System.out.println("Автобус на пит-стоп!");
    }

    @Override
    public void getBestTimeCircle() {
        System.out.println("Лучшее время круга автобуса: ");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость автобуса: ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(type, bus.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}