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

//метод «начать движение»,
//метод «остановиться»,
//метод «заправить авто».
//Водители будут отличаться друг от друга по типу водительских прав (соответственно, это три разных класса):
//
//для легковых авто нужна категория В;
//для грузовых нужна категория С;
//для автобусов — D.
//Водитель с определенным типом водительских прав может управлять только одним авто в выбранной категории.
// Управлять авто других категорий в наших соревнованиях он не может. В классах авто в качестве дженериков
// указать класс водителя с определенной водительской категорией.
//
//Напишите приложение, которое выводит в консоль информацию в формате:
//
//"водитель А управляет автомобилем Б и будет участвовать в заезде".
//
//На платформу в качестве выполненного задания пришлите ссылку на pull-request вашего проекта в GitHub.

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

