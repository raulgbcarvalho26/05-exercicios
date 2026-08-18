import java.util.Random;
import java.util.Scanner;
public class exericio6 {

    static void main() {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int quantidade;

        System.out.print("informe a quantidade de números: ");
        quantidade = sc.nextInt();
        int[] x = new int[quantidade];

        for(int i = 0; i< x.length; i++) {
            x[i] = random.nextInt(1,5);
            System.out.print(x[i] + "\t" );
        }

    }
}
