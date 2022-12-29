package Transport;

import java.util.Objects;

public abstract class Driver<A> {
    private String name;
    private int experience;
    private A transport;

    public Driver(String name,
                  int experience,
                  A transport) {
        this.name = name;
        this.experience = experience;
        this.transport = transport;
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


