package Transport;

public class DriverD<C extends Truck> extends Driver{
    private String driverLicense;
    private String bus;

    public DriverD (String name,
                    String driverLicense,
                    int experience,
                    String bus) {
        super(name, experience);
        this.driverLicense = driverLicense;
        this.bus = bus;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getCar() {
        return bus;
    }

    public void setCar(String bus) {
        this.bus = bus;
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
}
