import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Artur
 */
public class Compare_The_Triplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int datoA = 0;
        int datoB = 0;
        int a =0;
        int b =0;

        List<Integer> pointA;
        pointA = new ArrayList<>();

        List<Integer> pointB;
        pointB = new ArrayList<>();

        List<Integer> f;
        f = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            datoA = entrada.nextInt();
            pointA.add(datoA);

        }
        System.out.println("");

        for (int j = 0; j < 3; j++) {
            datoB = entrada.nextInt();
            pointB.add(datoB);

        }
        System.out.println("");

        for (int z = 0; z < pointA.size(); z++) {
            if (pointA.get(z)>pointB.get(z)) {
                a++;
            }
            else if (pointA.get(z)<pointB.get(z)) {
                b++;
            }
        }




        System.out.println(a+" "+b);
    }

}