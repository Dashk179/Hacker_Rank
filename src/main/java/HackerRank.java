
import java.util.Scanner;

/**
 *
 * @author Artur
 */
public class HackerRank {

    int r5 = 0;
    int r3 = 0;

    public static void fizzBuzz(int n) {

        for (int i = 1; i < n + 1; i++) {

            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("fizzbuzz");
            } else if ((i % 5 == 0)) {
                System.out.println("buzz");
            } else if ((i % 3 == 0)) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }

        }

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        fizzBuzz(n);
    }

}
