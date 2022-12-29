
package Transport;
import java.util.Objects;
public class Car extends Transport {
    private final String bodyType;
    public Car (String brand,
                String model,
                double engineVolume,
                String bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String toString () {
        return getBrand() + " " + getModel() +
        ", тип кузова: " + getBodyType() +
                ", объем двигателя: " + getEngineVolume();
    }

    @Override
    public void getPitStop() {
        System.out.println("Машина на пит-стоп!");
    }

    @Override
    public void getBestTimeCircle() {
        System.out.println("Лучшее время круга машины: ");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость машины: ");
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль начал движение!");
    }

    @Override
    public void stopMove() {
        System.out.println("Автомобиль закончил движение!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(bodyType, car.bodyType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bodyType);
    }
}


