import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome de usuário:");
        String usuario = scanner.nextLine();

        System.out.println("Senha:");
        String senha = scanner.nextLine();

        if(usuario.equals("usuario") && senha.equals("senha123")){
            System.out.println("Login bem-sucedido.");
        }
        else{
            System.out.println("Nome de usuário ou senha incorretos.");
        }

        scanner.close();
    }
}
