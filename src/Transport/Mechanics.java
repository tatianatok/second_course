package Transport;

import java.util.Objects;

public class Mechanics <A extends Transport> {
    private String name;
    private String nameCompany;

    public Mechanics(String name, String nameCompany) {
        this.name = name;
        this.nameCompany = nameCompany;
    }

    public void makeMaintenance(A transport){
        System.out.println( getName() + " проводит ТО на ТС " +
                transport.getBrand() + " " + transport.getModel());
    }

    public void repairTransport(A transport){
        System.out.println( getName() + " ремонтирует ТС " +
                transport.getBrand() + " " + transport.getModel());
    }

    public void add(Mechanics mechanics) {
    }
    public void makeTO() {
        System.out.println("ТО транспорта");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString (){
        return ", Имя механика: " + getName() + ", " + "Компания: " + getNameCompany();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanics mechanics = (Mechanics) o;
        return Objects.equals(name, mechanics.name) && Objects.equals(nameCompany, mechanics.nameCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nameCompany);
    }
}
