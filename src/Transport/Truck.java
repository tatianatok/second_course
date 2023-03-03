package Transport;

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
        return "Грузовик: " + getBrand() + " " + getModel() +
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
    public void checkTransport() {
        System.out.println(getBrand() + getModel() + " проходит диагностику");
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
    public void makeTO(){
        System.out.println("Грузовик: " + getBrand() + " " + getModel() + " провести ТО"); ;
    }

    @Override
    public boolean service() {
        System.out.println("Грузовик: " + getBrand() + " " + getModel() + " ТО пройдено");
        return true;
    }
}

