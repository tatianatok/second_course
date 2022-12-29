
package Transport;

public class DriverC extends Driver<Truck>{
    private String driverLicense;
    public DriverC (String name,
                    String driverLicense,
                    int experience,
                    Truck transport) {
        super(name, experience, transport);
        this.driverLicense = driverLicense;
    }

    private String getTransport() {
        return "грузовиком";
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public void driverStartMove() {
        System.out.println("Начать движение на грузовике");
    }
    @Override
    public void driverStopMove() {
        System.out.println("Остановить грузовик!");
    }
    @Override
    public  void refuelAuto(){
        System.out.println("Заправить грузовик");
    }

    @Override
    public String toString (){
        return "Водитель " + getName() + " управляет " + getTransport() +
                " и будет участвовать в заезде";
    }
}

