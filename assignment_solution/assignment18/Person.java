package assignment18;

import assignment10.PrimeCmd;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("chuneshwar", 22);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person foo = new Person();
        System.out.println(foo.getName());
        System.out.println(foo.getAge());
    }
}
