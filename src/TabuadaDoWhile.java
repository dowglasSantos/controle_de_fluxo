import java.util.Scanner;

public class TabuadaDoWhile {
    Scanner s = new Scanner(System.in);

    public void calculator() {
        String condition = "";

        do {
            System.out.println("Informe o numero que deseja multiplicar: ");
            int number = s.nextInt();

            for(int i = 0; i <= 10 ;i++) {
                System.out.println(number + " X " + i + " = " + number * i);
            };

            System.out.println("Deseja realizar mais uma multiplicacao? ");
            condition = s.next();

        } while(condition.equalsIgnoreCase("sim"));

        System.out.println("Fim do programa");
    };
}
