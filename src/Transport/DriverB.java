package Transport;
public class DriverB extends Driver<Car>{
    private String driverLicense;
    public DriverB(String name,
                   String driverLicense,
                   int experience,
                   Car transport) {
        super(name, experience, transport);
        this.driverLicense = driverLicense;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }
    private String getTransport() {
        return "легковым автомобилем";
    }

    @Override
    public void driverStartMove() {
        System.out.println("Начать движение на автомобиле");
    }
    @Override
    public void driverStopMove() {
        System.out.println("Остановить автомобиль!");
    }
    @Override
    public  void refuelAuto(){
        System.out.println("Заправить автомобиль");
    }
    @Override
    public String toString (){
        return "Водитель " + getName() + " управляет " + getTransport() +
                " и будет участвовать в заезде";
    }
}

