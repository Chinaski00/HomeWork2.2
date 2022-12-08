package Auto;

public class Sponsor {

    private String name;
    private int salary;

    public Sponsor(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void sponsorRace(){
        System.out.println("Заезд проспонсирован" + getName());
    }
}
