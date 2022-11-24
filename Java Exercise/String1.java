import java.util.Scanner;
/*compare between two string using length() and charAt(),use method that called equal
to return true if the strings is equal or false if it's not.*/

public class String1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two string's:");
        String a=in.nextLine();
        String b=in.nextLine();
        System.out.println(equals(a,b));

    }
    public static boolean equals(String a, String b){
        if(a.length()!=b.length())
            return false;

        if(a.length()==b.length()){
            for(int i=0; i<a.length(); i++){
                if(a.charAt(i) != b.charAt(i))
                    return false;
            }
        }
            return true;
    }
}
