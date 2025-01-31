import java.util.Scanner;

public class CreateClient {
    Scanner s = new Scanner(System.in);

    private String name;
    private String password;
    private String email;

    public void createUser() {
        System.out.print("Informe seu nome: ");
        this.name = s.nextLine();

        System.out.print("Informe sua senha: ");
        this.password = s.nextLine();

        System.out.print("Informe seu e-mail: ");
        this.email = s.nextLine();

    };

    public void checkUser() {
        if(
            this.name.equals("danizinha gameplay") &&
            this.password.equals("senha") &&
            this.email.equals("danizinha@gameplay")
        ) {

            System.out.println("Sejá Bem vindo, " + this.name);

        } else {
            System.out.println("Usuario não encontrado, por favor verifique seus dados e tente novamente!!");
        }
    };
}
