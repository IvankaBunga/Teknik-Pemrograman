import java.util.Scanner;
import java.math.BigInteger;

public class DataTypes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            BigInteger n = sc.nextBigInteger();

            System.out.println(n + " can be fitted in:");

            boolean canFit = false;

            if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 && n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                System.out.println("  * byte");
                canFit = true;
            }

            if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                System.out.println("  * short");
                canFit = true;
            }

            if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                System.out.println("  * int");
                canFit = true;
            }

            if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                System.out.println("  * long");
                canFit = true;
            }

            if (!canFit) {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}
