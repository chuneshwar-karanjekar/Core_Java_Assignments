package assignment21;

public class Employee {
    private int id;
    private String name, salary;

    Employee(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void sortBySalaries(String salary) {

    }

    public static void main(String[] args) {

    }

}