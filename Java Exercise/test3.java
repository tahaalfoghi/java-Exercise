import java.util.Scanner;
// OOP ايجاد مساحة ومحيط مستطيل باستخدام مفهوم 
public class test3 {
   
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
     Rectangle r1=new Rectangle();
     System.out.println("Enter lenght and width");
     r1.setLength(in.nextDouble());
     r1.setWidth(in.nextDouble());
     System.out.println(r1.toString());
     System.out.println("Area = "+r1.getArea()+" Perimeter = "+r1.getPerimeter());
     
    }
}
class Rectangle{
    private double length;
    private double width;
    Rectangle(){}
    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
       this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }
    public String toString(){
        return "length= "+length+" width= "+width;
    }
}
