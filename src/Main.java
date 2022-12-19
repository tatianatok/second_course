public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", - 1.7);
        lada.model = "Granta";
        //lada.engineVolume = 1.7;
        //lada.color = "желтый";
        lada.year = 2015;
        lada.country = "Россия";
        lada.car();

        Car audi = new Car("Audi", 0);
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "черный";
        //audi.year = 2020;
        //audi.country = "Германия";
        audi.car();

        Car bmw = new Car();
        //bmw.model = "Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "черный";
        bmw.year = 2021;
        bmw.country = "Германия";
        bmw.car();

        Car kia = new Car("Kia");
        kia.model = "Sportage 4-го поколения";
        kia.engineVolume = 2.4;
        kia.color = "красный";
        kia.year = 2018;
        kia.country = "Южная Корея";
        kia.car();

        Car hyundai = new Car("Hyundai");
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "оранжевый";
        hyundai.year = 2016;
        hyundai.country = "Южная Корея";
        hyundai.car();

    }
}