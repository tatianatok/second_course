public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    public Car(String brand, double engineVolume)  {
        this.brand = brand;
        model = "default";
        country = "default";
        color = "белый";
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = Math.abs(engineVolume);
        }
    }

    public Car(String brand) {
        this.brand = brand;
        model = "default";
        country = "default";
        color = "белый";
        }

    public Car(String brand, int year) {
        this.brand = brand;
        model = "default";
        country = "default";
        color = "белый";
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = Math.abs(year);
        }
    }

    public Car() {
        brand = "default";
        model = "default";
        country = "default";
        color = "белый";
        }

    public void car() {
        System.out.println("\nАвтомобиль: ");
        System.out.println("* марка: " + brand + "\n* модель: " + model + "\n* объем двигателя в литрах: " + engineVolume + "\n* цвет кузова: " + color + "\n* год производства: " + year + "\n* страна сборки: " + country);
    }
}
