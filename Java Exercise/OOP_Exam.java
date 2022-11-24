import java.util.Scanner;

/*قم بإنشاء class باسم x1 مع منع إستعماله مباشرةً، علماً بأن x1 يحتوي على دالة مجردة
max تعمل على تحديد أطول سلسلة بين ثلاث سلاسل. و x1 هو اب ل x2 الذي يحوي
دالة Length التي تعمل على استقبال ثلاث سلاسل، ولاترجع أي قيمة. وعليك منع توريث
x2 لأي classes أخرى. وفي x2 قم بالتركيب على الدالة المجردة ) max ( بحيث تعمل على
تحديد أطول سلسلة من ثلاث سلاسل.
أكتب الجمل البرمجية لإستعمال ال class x2 من أجل طباعة طول أطول سلسلة.*/

public class OOP_Exam{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        x2 obj = new x2();
        System.out.println("Enter String's");
        obj.setStr1(in.nextLine());
        obj.setStr2(in.nextLine());
        obj.setStr3(in.nextLine());
        obj.max();

        in.close();

    }
}

abstract class x1{
    protected String str1;
    protected String str2;
    protected String str3;
    x1(){};


    public x1(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }
    abstract public void max();

    public void setStr1(String str1) {
        this.str1 = str1;
    }
    public void setStr2(String str2) {
        this.str2 = str2;
    }
    public void setStr3(String str3) {
        this.str3 = str3;
    }
}
class x2 extends x1 {
    public void  length(String str1,String str2,String str3){}
    public void max(){
        int a=str1.length();
        int b=str2.length();
        int c=str3.length();
        if(a > b && a > c)
            System.out.println("longest string ="+str1+" "+a);
        else if(b > a && b > c)
            System.out.println("longest string ="+str2+" "+b);
        else
            System.out.println("longest string ="+str3+" "+c);
    }
}