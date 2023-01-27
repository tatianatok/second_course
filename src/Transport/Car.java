package Transport;

public final class Car extends Transport {
    private BodyType type;

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбэк"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String BODY_TYPE;

        BodyType(String body_type) {
            this.BODY_TYPE = body_type;
        }
    }

    public BodyType getType() {
        return type;
    }

    public void setType(BodyType type) {
        this.type = type;
    }

    @Override
    public void printType() {
        if (type == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println("Тип кузова автомобиля: " + getType());
        }
    }

    @Override
    public String toString () {
        return "Автомобиль: " + getBrand() + " " + getModel() +
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
    public void checkTransport() {
        System.out.println("Автомобилю: " +getBrand() + " " + getModel() + " проходит диагностику");
    }

    @Override
    public void makeTO(){
        System.out.println("Автомобилю: " + getBrand() + " " + getModel() + " провести ТО"); ;
    }

    @Override
    public boolean service() {
        System.out.println("Автомобилю: " + getBrand() + " " + getModel() + " ТО пройдено");
        return true;
    }
}


