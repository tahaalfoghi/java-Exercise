import java.util.Scanner;
/*اكتب برنامج بلغة جافا يستدعي دالتين كل منهما تُسمى max ، وذلك بتطبيق overloading method بحيث:
- الاولى تستقبل مصفوفة من السلاسل وترجع أطول سلسلة.
- الثانية تستقبل مصفوفة من الاعداد الصحيحة وترجع أكبر عدد. */

public class Overload {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size for two arrays:");
        int n=in.nextInt();
        int m=in.nextInt();
        String []arr1=new String[n];
        int []arr2 = new int[m];
        System.out.println("Enter String array:");
        for(int i=0; i<arr1.length; i++){
            arr1[i]=in.nextLine();}

        System.out.println("Enter integer array:");
        for (int i = 0; i < arr2.length; i++) {
             arr2[i]=in.nextInt();}

        String str=max(arr1);
        int number=max(arr2);
        System.out.println("the longest string="+str);
        System.out.println("the biggest number="+number);


    }
    public static String max(String[]arr1){
        String swap ="";
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = i+1; j < arr1.length; j++) {

                if(arr1[i].length() > arr1[j].length())
                    swap=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=swap;
            }
        }
      return arr1[arr1.length-1];
    }
    public static int max(int[]arr2){
        int key=arr2[0];
        for(int i=0; i<arr2.length; i++){
            if(arr2[i]>key)
                key=arr2[i];
        }
            return key;
    }
 }

