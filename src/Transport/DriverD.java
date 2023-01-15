package Transport;

public class DriverD extends Driver<Bus> {
    public DriverD(String name,
                   int experience,
                   Bus transport,
                   String category) {
        super(name, experience, transport, category);}

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
        return "Водитель " + getName() + " управляет " + getTransport() + ", стаж " + getExperience() + " лет, " +
                "категория прав " + getCategory() + " и будет участвовать в заезде";
    }
}
