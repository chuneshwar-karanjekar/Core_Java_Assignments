package assignments;

public class A21 {

    public void driver(){
        int []arr={10,5,20,15,10,7,10,20,5,10,15};
        /*
        int count=f1(arr,10);
        System.out.println("Frequency of 10 in the array is "+count);

         */
        f2(arr);
        printArray(arr);
    }
    public void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public int f1(int []arr,int item){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(item==arr[i])
                count++;
        }
        return count;

    }
    public void f2(int []arr){
        int round=0,i,t;
        for(round=1;round<arr.length;round++){
            for(i=0;i<=arr.length-1-round;i++){
                if(arr[i]>arr[i+1]){
                    t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                }

            }
        }

    }
    public int f3(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                sum=sum+arr[i];
        }
        return sum;

    }
    public void f4(Employee []emp){
        Employee t;
        int round=0,i;
        for(round=1;round<emp.length;round++){
            for(i=0;i<=emp.length-1-round;i++){
                if(emp[i].getSalary()>emp[i+1].getSalary()){
                    t=emp[i];
                    emp[i]=emp[i+1];
                    emp[i+1]=t;
                }

            }
        }
    }
    public void f5(Employee []emp){
        Employee t;
        int round=0,i;
        for(round=1;round<emp.length;round++){
            for(i=0;i<=emp.length-1-round;i++){
                int c=emp[i].getName().compareTo(emp[i+1].getName());
                if(c>0){
                    t=emp[i];
                    emp[i]=emp[i+1];
                    emp[i+1]=t;
                }

            }
        }
    }

}
class Employee5{
    private int id;
    private String name;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
