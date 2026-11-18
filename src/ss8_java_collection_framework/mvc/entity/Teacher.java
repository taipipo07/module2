package ss8_java_collection_framework.mvc.entity;

public class Teacher extends Person{
    private double salary;

    public Teacher() {
    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"-Salary: "+this.salary;
    }
}
