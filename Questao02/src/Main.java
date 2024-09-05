import java.util.Scanner;

public class Main {

    static long Fibonacci(int n) { //Método fibonacci
        if (n < 2) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) { //Main
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro para verificar se ele pertence a" +
                " sequência de fibonacci!: ");
        int numeroVerificador = scan.nextInt(); //Número de entrada
        boolean existeONumero = false; //Verifica se o número está na sequência

        for (int i = 0; i <= 30; i++) {
            long fibo = Fibonacci(i);
            if (fibo == numeroVerificador) {
                existeONumero = true;
            }
        }

        if (!existeONumero) {
            System.out.println("O número " + numeroVerificador +
                    " NÃO pertence a sequência de fibonacci!");
        } else {
            System.out.println("O número " + numeroVerificador +
                    " PERTENCE a sequência de fibonacci!");
        }
    }
}