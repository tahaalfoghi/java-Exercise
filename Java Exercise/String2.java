/*اكتب برنامج بلغة Java يقوم باستقبال أسماء الطلبة المسجلين في مقرر ITGS211 ،
وتخزينها في مصفوفة A بحيث يقوم وباستخدام الدوال بالآتي وحسب التسلسل الموضح ادناه:
.1 الدالة ToUpper : لتغيير حالة أسماء الطلبة التي تبدأ بالحرف a إلى حروف كبيرة.
.2 الدالة PrintList : لطباعة أسماء كل الطلبة بحيث كل اسم قرين عدد حروفه)طوله(. مثلأ:
Omar --> 4
Aml --> 3
Ahmed -->5  */
import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String []A =new String[5];
        String []B = new String[5];
        System.out.println("Enter name's:");
        for(int i=0; i<A.length; i++){
            A[i]=in.nextLine();}
        toUpper(A,B);
        Printlist(B);


    }
    public static void toUpper(String []A,String []B){
        for(int i=0; i<A.length; i++){
            B[i]=A[i].toUpperCase();
        }
    }
    public static void Printlist(String []B){
        for(int i=0; i<B.length; i++)
            System.out.println(B[i]+"-->"+B[i].length());
    }
}
