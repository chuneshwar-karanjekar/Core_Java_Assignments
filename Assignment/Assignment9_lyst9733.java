package assignments;

public class A9 {
    public void driver(){
        Circle1 c1=new Circle1();
        c1.setRadius(5.6);
        System.out.println("Radius="+c1.getRadius());
        System.out.println("Area="+c1.getArea());
        System.out.println("Circumference="+c1.getCircumference());
    }
}
class Marksheet{
    public Integer physics, mathematics, chemistry, hindi,english;

    public Boolean isPass(Integer passingMarks){
        Boolean result=true;
        if(physics<passingMarks)
            result=false;
        if(mathematics<passingMarks)
            result=false;
        if(chemistry<passingMarks)
            result=false;
        if(hindi<passingMarks)
            result=false;
        if(english<passingMarks)
            result=false;
        return result;
    }
    public Double average(){
        Double avg=(physics+mathematics+chemistry+hindi+english)/5.0;
        return avg;
    }
    public Integer maxMarks(){
        Integer max=0;
        if(max<physics)
            max=physics;
        if(max<mathematics)
            max=mathematics;
        if(max<chemistry)
            max=chemistry;
        if(max<hindi)
            max=hindi;
        if(max<english)
            max=english;
        return max;
    }
    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getMathematics() {
        return mathematics;
    }

    public void setMathematics(Integer mathematics) {
        this.mathematics = mathematics;
    }

    public Integer getChemistry() {
        return chemistry;
    }

    public void setChemistry(Integer chemistry) {
        this.chemistry = chemistry;
    }

    public Integer getHindi() {
        return hindi;
    }

    public void setHindi(Integer hindi) {
        this.hindi = hindi;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }
}
class Circle1{
    private Double radius;
    public Double getArea(){
        return 3.14*radius*radius;
    }
    public Double getCircumference(){
        return 2*3.14*radius;
    }
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}