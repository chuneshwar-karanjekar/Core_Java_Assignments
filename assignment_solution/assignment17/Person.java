package assignment17;

public class Person {
    private String name;
    private int age;

    public String setPerson(String name) {
        this.name = name;
        return name;
    }

    public void setPerson(int age) {
        this.age = age;
    }

    public void setPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setPerson("chuneshwar");
        p.setPerson("22");
        p.setPerson("c. karanjeakr", 23);

    }
}