import Transport.*;

import java.util.ArrayList;
import java.util.List;

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

        Mechanics first = new Mechanics(
                "Механик 1",
                "Компания 1");

        Mechanics second = new Mechanics(
                "Механик 2",
                "Компания 2");

        Mechanics third = new Mechanics(
                 "Механик 3",
                 "Компания 3");

        List<Transport> transportList = new ArrayList<>();
        transportList.add(audi);
        transportList.add(bmw);
        transportList.add(kia);
        transportList.add(hyundai);
        transportList.add(volvo);
        transportList.add(paz);
        transportList.add(mercedes);
        transportList.add(higer);
        transportList.add(renault);
        transportList.add(mercedesBenz);
        transportList.add(scania);
        transportList.add(faw);

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

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addTransport(audi);
        serviceStation.addTransport(bmw);
        serviceStation.addTransport(kia);
        serviceStation.addTransport(hyundai);
        serviceStation.addTransport(higer);
        serviceStation.addTransport(volvo);
        serviceStation.addTransport(paz);
        serviceStation.addTransport(mercedes);
        serviceStation.addTransport(renault);
        serviceStation.addTransport(mercedesBenz);
        serviceStation.addTransport(scania);
        serviceStation.addTransport(faw);

        serviceStation.makeTO(audi);
        serviceStation.service(audi);

        serviceStation.makeTO(higer);



        ServiceStation.service(higer );

        //faw.serviceStation.makeTO();



        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);

        bmw.setType(Car.BodyType.SEDAN);
        bmw.printType();
        audi.checkTransport();
        //higer.checkTransport();

        third.makeMaintenance(audi);
        first.repairTransport(mercedesBenz);
        second.repairTransport(transportList.get(5));
    }
}

