public class Main {
    public static void main(String[] args) {
        int indice = 13; //Valor INDICE
        int soma = 0; //Valor SOMA

        for (int k = 0; k < indice; k++) { //k++ = k = k + 1
            soma += k;
        }

        System.out.println("O valor total de soma é: " + soma);
    }
}