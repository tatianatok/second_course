package Transport;
import java.util.Objects;

public class Truck extends Transport {
    private LoadCapacity type;;
    public Truck(String brand,
                 String model,
                 double engineVolume) {
        super(brand, model, engineVolume);
    }
    public enum LoadCapacity {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);
        private final Float FROM;
        private final Float TO;
        LoadCapacity(Float FROM, Float TO) {
            this.FROM = FROM;
            this.TO = TO;
        }
        @Override
        public String toString() {
            if (FROM != null && TO != null) {
                return "Грузоподъемность: от " + FROM + " тонн до " + TO + " тонн.";
            } else if (FROM == null) {
                return "Грузоподъемность: до " + TO + " тонн.";
            } else if (TO == null) {
                return "Грузоподъемность: свыше " + FROM + " тонн.";
            }
            return "";
        }
    }
    public LoadCapacity getType() {
        return type;
    }
    public void setType(LoadCapacity type) {
        this.type = type;
    }

    @Override
    public void printType() {
        if (type == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println(type);
        }
    }

    @Override
    public String toString () {
        return getBrand() + " " + getModel() +
                ", тип грузовика: " + getType() +
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
        return Objects.equals(type, truck.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}

