import java.util.Scanner;

/**
 *
 * @author Artur
 */
public class Simple_Arrary_Sum {

    static int suma = 0;

    static int simpleArraySum(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            suma += ar[i];
        }
        return suma;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arCount = scanner.nextInt();
        int[] ar = new int[arCount];

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = scanner.nextInt();
            ar[arItr] = arItem;

        }

        int result = simpleArraySum(ar);

        System.out.println(suma);

    }

}
