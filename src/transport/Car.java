package transport;

import java.util.Objects;

public class Car extends Transport {

    private final String bodyType;

    public Car (String brand,
                String model,
                int year,
                String country,
                String color,
                String bodyType,
                int maxSpeed) {
        super(brand, model,year, country, color, maxSpeed);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
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







