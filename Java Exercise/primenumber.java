package com.pack;
//ادخال مصفوفة حجمها 10 وتضتفة الاعداد الاولية في مصفوفة اخرى
import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []arr=new int[10];
        int []prime=new int[10];
        System.out.println("Enter array elements:");
        for(int i=0; i<arr.length; i++){
            arr[i]=in.nextInt();
        }
        check(arr,prime);
    }
    public static void check(int[]arr,int[]prime){
        int count1,count2=0;
        for
        (int i=0; i<10; i++){
            count1=0;
            for(int j=2; j<arr[i]; j++){
                if(arr[i]%j==0)
                    count1++;
            }
            if(count1==0)
                prime[count2++]=arr[i];
        }
        System.out.println("Original array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Prime number array");
        for(int i=0; i<count2; i++)
            System.out.print(prime[i]+" ");
    }
}
