package Transport;

import java.util.Objects;

public abstract class Driver<A> {
    private String name;
    private int experience;
    private A transport;
    private String category;

     public Driver (String name,
                       int experience,
                       A transport,
                       String category) {
            this.name = name;
            this.experience = experience;
            this.transport = transport;

                if (category != null && !category.isEmpty()) {
                    this.category = category;
                } else {
                    throw new Exeptions("Тип прав указан неверно");
                }
            }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public abstract void driverStartMove();
    public abstract void driverStopMove();
    public abstract void refuelAuto();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experience);
    }
}


