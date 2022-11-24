import java.util.Scanner;
// OOP برنامج لايجاد مساحة ومحيط دائرة باستخدام مفهوم 
public class test2 {
    
    public static void main(String []args){
    Scanner in=new Scanner(System.in);
    Circle c1=new Circle();
    System.out.println("Enter radius and color:");
    c1.setRadius(in.nextDouble());
    c1.setColor(in.nextLine());
    System.out.println("Circle 1 "+c1.toString());
    System.out.println("Area= "+c1.getArea()+" Circumference= "+c1.getCircumference());  

    }
}
class Circle{
    private double radius;
    private String color;
    Circle(){}

    Circle(double radius, String color){
      this.radius=radius;
      this.color=color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "Radius= "+radius+" Circle color= "+color;
    }
}