package Transport;

public class DriverD extends Driver<Bus>{
    private String driverLicense;
    public DriverD (String name,
                    String driverLicense,
                    int experience,
                    Bus transport) {
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
        return "автобусом";
    }

    @Override
    public void driverStartMove() {
        System.out.println("Начать движение на автобусе");
    }
    @Override
    public void driverStopMove() {
        System.out.println("Остановить автобус!");
    }
    @Override
    public  void refuelAuto(){
        System.out.println("Заправить автобус");
    }

    @Override
    public String toString (){
        return "Водитель " + getName() + " управляет " + getTransport() +
                " и будет участвовать в заезде";
    }
}
