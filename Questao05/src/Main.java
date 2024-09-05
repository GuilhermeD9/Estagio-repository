import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Invertendo tuut");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra para ser invertida: ");
        String palavra = scanner.nextLine();//Lê a palavra q será invertida

        int n = palavra.length(); //Pega o tamanho da palavra
        char vetor[] = palavra.toCharArray();//Cria um vetor de caracteres

        for (int c = n; c > 0; c--) { //O for chama o tamanho da palavra até 0
            System.out.print(vetor[c-1]);
        }
    }
}