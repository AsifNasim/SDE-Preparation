import java.util.Scanner;

public class Ques_6_AnyToAny {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long src = s.nextLong();
        long srcBase = s.nextLong();
        long destBase = s.nextLong();
        long dec = (srcToDec(src,srcBase));
        System.out.println(DecToDest(dec,destBase));
    }

    private static long srcToDec(long src, long srcBase) {
        long dec = 0;
        long place = 1;
        while (src > 0){
            long lastDigit = src%10;
            dec = dec+lastDigit*place;
            place = place*srcBase;
            src = src/10;
        }
        return dec;
    }

    private static long DecToDest(long dec, long destBase) {
        long bin = 0;
        long place = 1;
        while (dec > 0){
            long lastDigit = dec%destBase;
            bin = bin + lastDigit*place;
            dec = dec/destBase;
            place = place*10;
        }
        return bin;
    }
}
