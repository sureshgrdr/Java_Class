package Inheritance;

public class Manager extends Employee {

    private int subordinates;
    private double bonus=0.18;

    public Manager(String name, String address, double salary, String jobTitle, int subordinates){
        super(name,address,salary,jobTitle);
        this.subordinates=subordinates;
    }

    public int getSubordinates() {
        return subordinates;
    }
    public double getBonus(){
        return bonus;
    }

     

    @Override
    public String toString() {
        return "Manager [name=" + getName() + ", address=" + getAddress() + ", salary=" + getSalary() + ", jobTitle=" + getJobTitle() + ", subordinates=" + subordinates + "]";
    }
    

    
}
