import java.util.Scanner;

/**
 *
 * @author Artur
 */
public class A_Very_Big_Sum {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rllno;
        long suma=0;


        A_Very_Big_Sum tamano = new A_Very_Big_Sum();

        Scanner entrada = new Scanner(System.in);

        int size = entrada.nextInt();
        int [] array = new int [size];


        for (int i = 0; i < array.length; i++) {
            rllno = entrada.nextInt();
            array[i]=rllno;

        }

        for (int i = 0; i < array.length; i++) {
            suma+=array[i];

        }

        System.out.println(suma);
    }

}
