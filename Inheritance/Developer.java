package Inheritance;

public class Developer extends Employee {

    private String coreLang;

    public Developer(String name, String address, double salary, String jobTitle, String coreLang) {
        super(name, address, salary, jobTitle);
        this.coreLang = coreLang;
    }

    public String getCoreLang() {
        return coreLang;
    }

    public double calcBonus(){
        return getSalary() * 0.5;
    }

    @Override
    public String toString() {
        return "Developer [name=" + getName() + ", address=" + getAddress() + ", salary=" + getSalary() + ", jobTitle=" + getJobTitle() +", coreLang=" + coreLang + "]";
    }

    
}
