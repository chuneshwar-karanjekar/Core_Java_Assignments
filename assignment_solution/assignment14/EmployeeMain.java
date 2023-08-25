package assignment14;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee foo = new Employee();
        foo.setEmpid(24678);
        foo.setName("chuneshwar");
        foo.setSalary(35000);

        System.out.println(foo.getName());
        System.out.println(foo.getEmpid());
        System.out.println(foo.getSalary());

        
    }
}
