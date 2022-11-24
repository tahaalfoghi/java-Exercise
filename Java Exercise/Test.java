import java.util.Scanner;
/*اكتب برنامج بلغة Java لتعريف كلاس Person يحتوي على متغير الاسم ) P_Name )
وسنة الميلاد ) year ( ثم عرف كلاس للطالب Student لوراثة عناصر Person بالإضافة
لمتغيراتها رقم القيد ) Std_id ( والقسم ) Dept ( ودالة PrinrStd لطباعة بيانات الطالب
كاملة.
ثم قم بتعريف كلاس باسم Test يحوي main method فقط لتعريف Object اسمه std
من نوع Student
*/

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        S std=new S();
        System.out.println("Enter Student name :");
        std.setP_name(in.nextLine());
        System.out.println("Enter Student department :");
        std.setDept(in.nextLine());
        System.out.println("Enter Student year :");
        std.setYear(in.nextInt());
        System.out.println("Enter Student id :");
        std.setStd_id(in.nextLong());

        std.print_std();

        in.close();

    }
}
class Person{
    protected String P_name;
    protected int year;
    public Person(){}
    public Person(String P_name, int year){
        this.P_name=P_name;
        this.year = year;
    }

    public void setP_name(String p_name) {
        P_name = p_name;
    }

    public String getP_name() {
        return P_name;
    }
    public void setYear(int year) {
        this.year=year;
    }
    public int getYear() {
        return year;
    }
}

class S extends Person{
    protected long std_id;
    protected String Dept;
    S(){}
    public S(String P_name, int year){
        super(P_name,year);
        this.std_id=std_id;
        this.Dept = Dept;
    }

    public long getStd_id() {
        return std_id;
    }

    public void setStd_id(long std_id) {
        this.std_id = std_id;
    }

    public String getDept() {
        return Dept;
    }
    public void setDept(String dept) {
        Dept = dept;
    }
    public void print_std(){
        System.out.println(P_name+" "+year+" "+std_id+" "+Dept);
    }
}