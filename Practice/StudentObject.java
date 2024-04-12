package Practice;

import java.time.LocalDate;
import java.time.Period;

public class StudentObject {

    private int id;
    private String studentName;
    private LocalDate dob;
    private int age;

    public StudentObject(Integer id, String studentName, String dob) {
        this.id = id;
        this.studentName = studentName;
        this.dob = LocalDate.parse(dob);
        this.age = calcAge();
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Integer getAge() {
        return age;
    }

    // Calculate AGE
    public int calcAge() {
        LocalDate curDate = LocalDate.now(); // Get Today's Date
        return (Period.between(dob, curDate).getYears()); // return the difference in years
    }

    @Override
    public String toString() {
        return "{id:" + id + ", studentName:" + studentName + ", dob:" + dob + ", age:" + age + "}";
    }

}
