import Transport.*;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                2,
                "седан");

        Car bmw = new Car(
                "BMW",
                "Z8",
                4.5,
                "родстер");

        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2,
                "кроссовер");

        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.8,
                "седан");

        Bus higer = new Bus(
                "Higer",
                "KLQ6106X",
                "школьный",
                6.7);

        Bus volvo = new Bus(
                "Volvo",
                "9700",
                "туристский",
                8.8);

        Bus paz = new Bus(
                "ПАЗ",
                "320402-05",
                "служебный",
                4.5);

        Bus mercedes = new Bus(
                "Mercedes-Benz",
                "Intouro",
                "междугородний",
                7.2);

        Truck renault = new Truck(
                "Renault",
                "Trucks T",
                "тягач",
                10.5);

        Truck mercedesBenz = new Truck(
                "Mercedes-Benz",
                "Actros 1845 LSnRL",
                "тягач",
                12.8);

        Truck scania = new Truck(
                "SCANIA",
                "P380 B6X4HZ",
                "Самосвал",
                15);

        Truck faw = new Truck(
                "FAW",
                "J6 6Х4 EURO5",
                "Самосвал",
                17.2);

        DriverB A = new DriverB(
                "A",
                "B",
                10,
                "легковой автомобиль");

        DriverB B = new DriverB(
                "B",
                "C",
                8,
                "грузовик");

        DriverD C = new DriverD(
                "C",
                "D",
                15,
                "автобус");

        printIhfo(audi);
        printIhfo(bmw);
        printIhfo(kia);
        printIhfo(hyundai);

        printIhfo(higer);
        printIhfo(volvo);
        printIhfo(paz);
        printIhfo(mercedes);

        printIhfo(renault);
        printIhfo(mercedesBenz);
        printIhfo(scania);
        printIhfo(faw);

        audi.startMove();
        mercedes.stopMove();
        scania.startMove();

        audi.getPitStop();
        mercedesBenz.getBestTimeCircle();
        higer.getMaxSpeed();

        printIhfo(A);
        printIhfo(B);
        printIhfo(C);
    }

    private static void printIhfo(Car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                        ", тип кузова: " + car.getBodyType() +
                        ", объем двигателя: " + car.getEngineVolume());
    }

    private static void printIhfo(Bus bus) {
        System.out.println(
                bus.getBrand() + " " + bus.getModel() +
                        ", вид автобуса: " + bus.getType() +
                        ", объем двигателя: " + bus.getEngineVolume());

    }
    private static void printIhfo(Truck truck) {
        System.out.println(
                truck.getBrand() + " " + truck.getModel() +
                        ", тип грузовика: " + truck.getKind() +
                        ", объем двигателя: " + truck.getEngineVolume());

    }

    private static void printIhfo(DriverB driverB) {
        System.out.println("Водитель " + driverB.getName() + " управляет " + driverB.getCar() +
                " и будет участвовать в заезде");
    }

    private static void printIhfo(DriverC driverC) {
        System.out.println("Водитель " + driverC.getName() + " управляет " + driverC.getCar() +
                " и будет участвовать в заезде");
    }

    private static void printIhfo(DriverD driverD) {
        System.out.println("Водитель " + driverD.getName() + " управляет " + driverD.getCar() +
                " и будет участвовать в заезде");
    }
}

