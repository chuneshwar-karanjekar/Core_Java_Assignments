package assignment17;

public class Person1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("person name :" + this.name);

    }

    public void showName(String title) {
        System.out.println(title + " " + this.name);

    }

    public static void main(String[] args) {
        Person1 foo = new Person1();
        foo.setName("chuneshwar");
        foo.showName();
        foo.showName("Mr");
    }
}
