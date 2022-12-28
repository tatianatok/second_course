
package Transport;

public class DriverB<A extends Car> extends Driver{
    private String driverLicense;
    private String car;

    public DriverB (String name,
                    String driverLicense,
                    int experience,
                    String car) {
        super(name, experience);
        this.driverLicense = driverLicense;
        this.car = car;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
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
}

