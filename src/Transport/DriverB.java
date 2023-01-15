package Transport;
public class DriverB extends Driver<Car>{

    public DriverB(String name,
                   int experience,
                   Car transport,
                   String category) {
        super(name, experience, transport, category); }

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
        return "Водитель " + getName() + " управляет " + getTransport() + ", стаж " + getExperience() + " лет, " +
                "категория прав " + getCategory() + " и будет участвовать в заезде";
    }
}

