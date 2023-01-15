
package Transport;

public class DriverC extends Driver<Truck>{
      public DriverC (String name,
                    int experience,
                    Truck transport,
                    String category) {
          super(name, experience, transport, category); }


    private String getTransport() {
        return "грузовиком";
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
        return "Водитель " + getName() + " управляет " + getTransport() + ", стаж " + getExperience() + " лет, " +
                "категория прав " + getCategory() + " и будет участвовать в заезде";
    }
}

