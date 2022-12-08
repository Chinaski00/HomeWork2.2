package Auto;

public class Mechanic<T extends Car> {

    private String firstName;
    private String lastName;
    private String company;
    private String autoMec;

    public Mechanic(String firstName, String lastName, String company, String autoMec) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.autoMec = autoMec;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAutoMec() {
        return autoMec;
    }

    public void setAutoMec(String autoMec) {
        this.autoMec = autoMec;
    }

    public boolean fixCar(){
        return true;
    }

    public void  service(T t){
        t.passDiagnostics();
    }
}
