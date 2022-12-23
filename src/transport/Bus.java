package transport;

import java.util.Objects;

public class Bus extends Transport {
    private String type;
    private String dimensions;

    public Bus (String brand,
                String model,
                int year,
                String country,
                String color,
                String type,
                String dimensions,
                int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        this.type = type;
        this.dimensions = dimensions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(type, bus.type) && Objects.equals(dimensions, bus.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, dimensions);
    }
}
