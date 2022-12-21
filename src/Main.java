import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия",
                null,
                null);

        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия",
                null,
                null);

        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия",
                null,
                null);

        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                "черный",
                2018,
                "Южная Корея",
                null,
                null);

        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                null,
                null);


    printIhfo(lada);
    printIhfo(audi);
    printIhfo(bmw);
    printIhfo(kia);
    printIhfo(hyundai);
    }
    private static void printIhfo (Car car){
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                        " , год выпуска: " + car.getYear() +
                        " , страна сборки: " + car.getCountry() +
                        " , цвет кузова: " + car.getColor() +
                        " , объем двигателя: " + car.getEngineVolume() );
    }
}