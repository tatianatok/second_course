
package Transport;

public class DriverC<B extends Truck> extends Driver{
    private String driverLicense;
    private String truck;

    public DriverC (String name,
                    String driverLicense,
                    int experience,
                    String truck) {
        super(name, experience);
        this.driverLicense = driverLicense;
        this.truck = truck;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getCar() {
        return truck;
    }

    public void setCar(String truck) {
        this.truck = truck;
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
}

