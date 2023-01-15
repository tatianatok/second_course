package Transport;
import java.util.Objects;

public class Bus extends Transport {
    private Capacity type;
    public Bus(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }
    public enum Capacity {
        VERY_SMALL(null, 10),
        SMALL(null, 25),
        MIDDLE(40, 50),
        LARGE(60, 80),
        VERY_LARGE(100, 120);
        private final Integer FROM;
        private final Integer TO;

        Capacity(Integer FROM, Integer TO) {
            this.FROM = FROM;
            this.TO = TO;
        }

        @Override
        public String toString() {
            if (FROM != null && TO != null) {
                return "Вместимость: от " + FROM + " человек до " + TO + " человек.";
            } else if (FROM == null) {
                return "Вместимость: до " + TO + " человек.";
            } else if (TO == null) {
                return "Вместимость: свыше " + FROM + " человек.";
            }
            return " ";
        }
    }
    public Capacity getType() {
        return type;
    }
    public void setType(Capacity type) {
        this.type = type;
    }

    @Override
    public void checkTransport() {
        throw new RuntimeException("Автобусы не проходит диагностику");
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
                ", вид автобуса: " + getType() +
                ", объем двигателя: " + getEngineVolume();
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
