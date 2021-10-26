import java.util.Scanner;

/**
 *
 * @author Artur
 */
public class JavaIF_Else {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = scanner.nextInt();

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N >= 20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }

}

