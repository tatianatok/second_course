package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int seats;
    private boolean summerTyres;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String regNumber
               ) {

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

        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        this.transmission = "МКПП";
        this.bodyType = "седан";
        this.regNumber = "x000xx000";
        this.seats = 5;
        this.summerTyres = true;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeats() {
        return seats;
    }

    public void changTyres() {
        summerTyres = !summerTyres;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[5]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
            if (!Character.isAlphabetic(chars[1]) || !Character.isAlphabetic(chars[2]) || !Character.isAlphabetic(chars[3]) ||
                    !Character.isAlphabetic(chars[6]) || !Character.isAlphabetic(chars[7]) || !Character.isAlphabetic(chars[8])) {
                return false;
            }
            return true;
        }
    }





    //public void car() {
        //System.out.println("\nАвтомобиль: ");
       // System.out.println("* марка: " + brand + "\n* модель: " + model + "\n* объем двигателя в литрах: " + engineVolume + "\n* цвет кузова: " + color + "\n* год производства: " + year + "\n* страна сборки: " + country);
    //}

