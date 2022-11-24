import java.util.Scanner;
/*اكتب برنامج بلغة جافا يقوم بتعريف المصفوفة MyList ذات البعدين n*n وقراءة عناصرها
ومن تم استدعاء الدوال التالية:
*/
//الدالة Square لاستبدال كل عنصر من عناصر القطر الرئيسي بمربعه. مثلاً 2  4
//الدالة PrintList لطباعة عناصر المصفوفة بالكامل بعد التعديل

public class Arrays {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=in.nextInt();
        double[][]MyList=new double[n][n];
        System.out.println("Enter arr elements:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                MyList[i][j]=in.nextFloat();
            }
        }
        Square(MyList);
        PrintList(MyList);

        in.close();
    }

    public static void Square(double[][]MyList){
      for(int i=0; i<MyList.length; i++){
          for(int j=0; j<MyList[i].length; j++){
              if( i == j){
                  MyList[i][j]=Math.pow(MyList[i][j],2);
              }
          }
      }
    }
    public static void PrintList(double[][]MyList){
        for(int i=0; i<MyList.length; i++){
            for(int j=0; j<MyList[i].length; j++)
                System.out.print(MyList[i][j]+" ");
            System.out.println();
        }
    }
}
