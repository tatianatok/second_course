package transport;

public class Transport {

    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     String color,
                     int maxSpeed) {

    if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        this.year = 2000;
        this.country = "Россия";

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (maxSpeed < 0) {
            this.maxSpeed = 200;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



}





    //Создайте геттеры и сеттеры для необходимых полей.
    // Параметры «Год выпуска», «Страна производства» не могут изменяться,
    // «Цвет», «Скорость» меняться могут. Для изменяемых параметров добавьте проверку данных,
    // что значение указано корректно, не содержит null и не пустое.
    //
    //Скорректируйте класс Car таким образом, чтобы ранее указанные параметры не повторяли те,
    // которые содержатся в классе Transport.
    //
    //Класс Car должен наследовать параметры класса Transport.
    //Создайте новый класс «Автобус» (Bus), который полностью наследует все параметры класса Transport.

          //  Создайте 3 произвольных объекта для данного класса, выведите в консоль данные по каждому.

