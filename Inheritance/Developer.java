package Inheritance;

public class Developer extends Employee {

    private String coreLang;
    private double bonus=0.12;

    public Developer(String name, String address, double salary, String jobTitle, String coreLang) {
        super(name, address, salary, jobTitle);
        this.coreLang = coreLang;

    }

    public String getCoreLang() {
        return coreLang;
    }

    public double getBonus(){
        return bonus;
    }


    @Override
    public String toString() {
        return "Developer [name=" + getName() + ", address=" + getAddress() + ", salary=" + getSalary() + ", jobTitle=" + getJobTitle() +", coreLang=" + coreLang + "]";
    }

    
}
