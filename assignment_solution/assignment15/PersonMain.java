package assignment15;

public class PersonMain {
    private int age;
    private String name;

    PersonMain(){
        System.out.println("Default constructor");
    }
     PersonMain(int age){
        this.age = age;
        System.out.println(age);

    }
     PersonMain(String name){
        this.name = name;
        System.out.println(name);
    }
     PersonMain(int age, String name){
        this.age =age;
        this.name = name;
        System.out.println(age+" "+name);
    }
    public static void main(String[] args) {
        PersonMain obj = new PersonMain();
        PersonMain obj1 = new PersonMain(22);
        PersonMain obj2 = new PersonMain("chuneshwar");
        PersonMain obj3 = new PersonMain(23,"karanjekar");
        
    }
}
