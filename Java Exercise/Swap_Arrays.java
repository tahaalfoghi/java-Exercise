                                   /*اكتب برنامج بلغة Java لتحقيق ما يلي:
إذا كانت كل من A,B مصفوفة أحادية بها عدد n من الأعداد الصحيحة. اكتب برنامج
يقوم بتبديل عناصر المصفوفتين بشكل تناضري دون استخدام أي متغيرات أو مصفوفات اخرى للتبديل*/

import java.util.Scanner;

public class Swap_Arrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=in.nextInt();
        int[]A=new int[n];
        int[]B=new int[n];

        System.out.println("Enter array [A] elements:");
        for (int i = 0; i < A.length; i++) {
            A[i]=in.nextInt();
        }
        System.out.println("Enter array [B] elements:");
        for (int i = 0; i < B.length; i++) {
            B[i] = in.nextInt();
        }
        System.out.println("array A[] before swapping");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println("array B[] before swapping");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i]+" ");
        }
        System.out.println();
         for(int i=0; i<n; i++){
             A[i]=A[i]+B[i];
             B[i]=A[i]-B[i];
             A[i]=A[i]-B[i];
         }
        System.out.println("Array A[] after swapping");
         for (int i = 0; i < A.length; i++) {
             System.out.print(A[i]+" ");
         }
        System.out.println();
        System.out.println("Array B[] after swapping");
         for(int i=0; i<B.length; i++){
             System.out.print(B[i]+" ");
         }
    }
}
