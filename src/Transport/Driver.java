
package Transport;

import java.util.Objects;

public abstract class Driver {
    private String name;
    private int experience;

    public Driver(String name,
                  int experience) {
        this.name = name;
        this.experience = experience;
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


