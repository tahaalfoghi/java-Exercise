package com.pack;
import java.util.Scanner;
//برنامج يقوم بادخال عدد ثم يقوم بعملية جمع كل خانة وعندما يصبح العدد بخانة وحيدة قم بارجاعها وطباعتها
// ex:- 56=> 5+6=11 => 1+1=2 => retuen 2.
public class Digit {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int num=in.nextInt();
        System.out.println(digit(num));
    }
    public static int digit(int num){
        if(num<10)
            return num;
        else
            return digit((num%10)+(num/10));
    }
}
