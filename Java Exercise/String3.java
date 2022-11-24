/* اكتب برنامج بلغة جافا يقوم بحساب النسبة المئوية للحروف الكبيرة والصغيرة في السلسة
التالية:
"To be or not To be: That Is the Question"*/

public class String3 {
    public static void main(String[] args) {

        String sentence="To be or not To be: That Is the Question";
        float upper_count = 0;
        float lower_count =0;
        for(int i=0; i<sentence.length(); i++){
            char c=sentence.charAt(i);
            if(c >='A' && c <='Z')
                upper_count++;
            else if(c >='a' && c<='z')
                lower_count++;
        }
        float upper_percent=upper_count/(upper_count+lower_count)*100;
        float lower_percent=lower_count/(lower_count+upper_count)*100;
        System.out.println("capital letter percent="+upper_percent);
        System.out.println("small letter percent="+lower_percent);
    }
}
