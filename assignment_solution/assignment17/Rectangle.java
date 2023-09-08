package assignment17;

public class Rectangle {
    private int length, breadth;
    private String bColour;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public String getbColour() {
        return bColour;
    }

    public void setbColour(String bColour) {
        this.bColour = bColour;
    }

    public void printRactangleCoulor() {
        System.out.println("this is prarent class method " + this.bColour);
    }

}

class FilledRactangle extends Rectangle {
    private String fillbColour;

    public String getFillbColour() {
        return fillbColour;
    }

    public void setFillbColour(String fillbColour) {
        this.fillbColour = fillbColour;
    }

    @Override
    public void printRactangleCoulor() {
        System.out.println("filled bColour :" + this.fillbColour);
        super.printRactangleCoulor();

    }

}