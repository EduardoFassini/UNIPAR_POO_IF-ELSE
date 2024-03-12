import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int num2 = scanner.nextInt();

        if(num1==num2){
            System.out.println("Os números são iguais.");
        }
        else{
            if(num1>num2){
                System.out.println("O primeiro número (" + num1 + ") é maior que o segundo (" + num2 + ").");
            }
            else{
                System.out.println("O segundo número (" + num2 + ") é maior que o primeiro (" + num1 + "). ");
            }
        }

        scanner.close();
    }
}
