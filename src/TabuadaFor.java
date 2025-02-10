import java.util.Scanner;

public class TabuadaFor {
    Scanner s = new Scanner(System.in);

    public void calculator() {
        System.out.print("Informe o numero que deseja multiplicar: ");
        int number = s.nextInt();

        for(int i = 0; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + number*i);
        }
    };
}
