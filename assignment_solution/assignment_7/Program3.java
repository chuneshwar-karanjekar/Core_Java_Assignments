package assignment_7;

/**
 * Program3 : Define the class
 */
public class Program3 {
    int length,breadth,height;

    public void setLength(int l){ 
        length=l;
    }
    public void setBreadth(int b){ 
        breadth = b;
    }
    public void setHeight(int h){ 
        height =h;
    }
    public int getHeight(){ 
        return height;
    }
    public int getLength(){ 
        return length;
    }
    public int getBreadth(){ 
        return breadth;
    }
    
    public int getVolume(){
        return length*height*breadth;
    }

    public int getSurfaceArea(){
        return 2*(length*height*breadth);
    }

    

public static void main(String[] args) {
    Program3 obj = new Program3();
    obj.setLength(20);
    obj.setHeight(10);
    obj.setBreadth(15);

    System.out.println("volume :"+obj.getVolume());
    System.out.println("surface area :"+obj.getSurfaceArea());
    
}
}