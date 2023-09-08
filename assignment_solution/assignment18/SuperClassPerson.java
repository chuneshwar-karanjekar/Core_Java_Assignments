package assignment18;

public class SuperClassPerson {
    public static void main(String[] args) {
        Employee foo = new Employee();
        foo.showEmployee();
    }
}

/**
 * superClass
 */
class SuperClass {
    private String name;
    private int age;

    public SuperClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public SuperClass() {
        this("chuneshwar", 22);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

class Employee extends SuperClass {
    private double salary;

    public Employee() {
        this(10000.0);
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void showEmployee() {
        System.out.println(getName() + " " + getAge() + " " + getSalary());
    }

}
