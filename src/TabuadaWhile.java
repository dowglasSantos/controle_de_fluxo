import java.util.Scanner;

public class TabuadaWhile {
    Scanner s = new Scanner(System.in);

    public void calculator() {
        System.out.println("Voce deseja realizar uma multiplicação? ");
        String condition = s.next();

        while(condition.equalsIgnoreCase("sim")) {
            System.out.print("Informe o numero que deseja multiplicar: ");
            int number = s.nextInt();

            for(int i = 0; i<= 10; i++) {
                System.out.println(number + " X " + i + "=" + number * i);
            };

            System.out.println("Voce deseja realizar uma nova multiplicação? ");
            condition = s.next();
        };

        System.out.print("Obrigado");
    };
}
