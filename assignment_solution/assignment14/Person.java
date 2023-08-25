package assignment14;

public class Person {
    private int age;
    private String name;

   
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
   public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
       Person foo = new Person();
       foo.setAge(22);
       foo.setName("chuneshwar");
       
       System.out.println(foo.getAge());
       System.out.println(foo.getName());
        
    }
}
