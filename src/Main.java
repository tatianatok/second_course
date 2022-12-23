import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Granta",
                2015,
                "Россия",
                "желтый",
                "",
                220);

        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                2020,
                "Германия",
                "черный",
                "седан",
                250);

        Car bmw = new Car(
                "BMW",
                "Z8",
                2021,
                "Германия",
                "черный",
                "родстер",
                270);

        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2018,
                "Южная Корея",
                "черный",
                "кроссовер",
                180);

        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                2016,
                "Южная Корея",
                "оранжевый",
                "седан",
                200);

        Bus higer = new Bus(
                "Higer",
                "KLQ6106X",
                2012,
                "Китай",
                "желтый",
                "школьный",
                "средний",
                100);

        Bus volvo = new Bus(
                "Volvo",
                "9700",
                2008,
                "Польша",
                "серый",
                "туристский",
                "средний",
                91);

        Bus paz = new Bus(
                "ПАЗ",
                "320402-05",
                2016,
                "Россия",
                "белый",
                "туристский",
                "малый",
                80);

        printIhfo(higer);
        printIhfo(volvo);
        printIhfo(paz);

        printIhfo(lada);
        printIhfo(audi);
        printIhfo(bmw);
        printIhfo(kia);
        printIhfo(hyundai);
    }

    private static void printIhfo(Car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                        ", год выпуска: " + car.getYear() +
                        ", страна сборки: " + car.getCountry() +
                        ", цвет кузова: " + car.getColor() +
                        ", тип кузова: " + car.getBodyType() +
                        ", максимальная скорость: " + car.getMaxSpeed());
    }

    private static void printIhfo(Bus bus) {
        System.out.println(
                bus.getBrand() + " " + bus.getModel() +
                        ", год выпуска: " + bus.getYear() +
                        ", страна сборки: " + bus.getCountry() +
                        ", цвет кузова: " + bus.getColor() +
                        ", вид автобуса: " + bus.getType() +
                        ", размер автобуса: " + bus.getDimensions() +
                        ", максимальная скорость: " + bus.getMaxSpeed());

    }
}