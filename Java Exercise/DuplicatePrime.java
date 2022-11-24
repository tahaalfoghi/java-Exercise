
/*اكتب برنامج Java لإيجاد جميع الأعداد الأولية المزدوجة الأصغر من 111 الفرق بين كل
زوجين 2. مثال:
(3, 5)
(5, 7)
(11, 13)
(17, 19)
(29, 31)
(41, 43)
(59, 61)
(71, 73)*/
public class DuplicatePrime {
    public static void main(String[] args) {
        for(int i=2; i<=100; i++)
            if(prime(i) && prime(i+2))
                System.out.printf("(%d,%d)\n",i,(i+2));
    }
    public static boolean prime(int num){
        if(num <= 1)
            return false;

        for(int j=2; j<num; j++)
            if(num % j==0)
                return false;

        return true;
    }
}
