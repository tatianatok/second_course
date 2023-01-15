import Transport.*;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                2);

        Car bmw = new Car(
                "BMW",
                "Z8",
                4.5);

        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2);

        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.8);

        Bus higer = new Bus(
                "Higer",
                "KLQ6106X",
                6.7);

        Bus volvo = new Bus(
                "Volvo",
                "9700",
                8.8);

        Bus paz = new Bus(
                "ПАЗ",
                "320402-05",
                4.5);

        Bus mercedes = new Bus(
                "Mercedes-Benz",
                "Intouro",
                7.2);

        Truck renault = new Truck(
                "Renault",
                "Trucks T",
                10.5);

        Truck mercedesBenz = new Truck(
                "Mercedes-Benz",
                "Actros 1845 LSnRL",
                12.8);

        Truck scania = new Truck(
                "SCANIA",
                "P380 B6X4HZ",
                15);

        Truck faw = new Truck(
                "FAW",
                "J6 6Х4 EURO5",
                17.2);

        DriverB ivanov = new DriverB(
                "Иванов И.И.",
                10,
                audi,
               "B");

        DriverC petrov = new DriverC(
                "Петров П.П.",
                8,
                faw,
                "C");

        DriverD sidorov = new DriverD(
                "Сидоров С.С.",
                15,
                higer,
                "D");

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println(higer);
        System.out.println(volvo);
        System.out.println(paz);
        System.out.println(mercedes);

        System.out.println(renault);
        System.out.println(mercedesBenz);
        System.out.println(scania);
        System.out.println(faw);

        audi.startMove();
        mercedes.stopMove();
        scania.startMove();

        audi.getPitStop();
        mercedesBenz.getBestTimeCircle();
        higer.getMaxSpeed();

        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);

        bmw.setType(Car.BodyType.SEDAN);
        bmw.printType();
        audi.checkTransport();
        higer.checkTransport();

    }
}

