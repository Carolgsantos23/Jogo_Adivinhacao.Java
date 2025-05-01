package jogo.de.adivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numeroGerado = new Random().nextInt(100);
        int numeroDigitado = 0;
        int tentativa = 0;

        while (tentativa < 5) {
            System.out.println("Digite um numero: ");
            numeroDigitado = leitor.nextInt();
            tentativa++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabens você acertou o numero em " + tentativa + "tentativas");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("Errado: O numero " + numeroDigitado + " é menor que o numero gerado");
            } else {
                System.out.println("Errado: O numero " + numeroDigitado + " é maior que o numero gerado ");

            }
            if (tentativa == 5 && numeroDigitado != numeroGerado) {
                System.out.println("Você não conseguiu acertar em suas 05 tentativas ");
                System.out.println("Numero gerado: " + numeroGerado);
            }

        }

    }
}