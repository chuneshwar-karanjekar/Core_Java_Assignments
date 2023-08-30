package assignment16;

public class Person {
    private String name;
    private int age;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }
}

class Employee extends Person {
    int salary;

    public int input(int salary) {
        this.salary = salary;
        return salary;
    }

    public void display() {

        System.out.println("Name is :" + getName());
        System.out.println("age is :" + getAge());
        System.out.println("salary is :" + salary);

    }

    public static void main(String[] args) {
        Employee foo = new Employee();
        foo.setName("chuneshwar");
        foo.setAge(22);
        foo.input(346787);
        foo.display();

    }
}