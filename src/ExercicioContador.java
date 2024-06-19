import java.util.Random;
import java.util.Scanner;

public class ExercicioContador {
    public static void main(String[] args) {
        /*
        * Exercício: Criar um programa que simula um jogo de adivinhação,
        * que deve gerar um número aleatório entre 0 e 100 e pedir
        * para que o usuário tente adivinhar o número, em até 5 tentativas.
        * A cada tentativa, o programa deve informar se o número digitado
        * pelo usuário é maior ou menor do que o número gerado.
        */

        //Criar objeto scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);

        //Criar objeto random para ler o número aleatório
        Random random = new Random();
        int numAleatorio = random.nextInt(100); //Numero entre 0 e 100
        int jogadaUsuário, tentativasRestantes = 5; //Variaveis para a jogada do usuário e as tentativas restantes

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");
        System.out.println("Você tem " + tentativasRestantes + " tentativas.");

        while (tentativasRestantes > 0){
            System.out.print("Digite sua jogada: ");
            jogadaUsuário = scanner.nextInt();

            switch (Integer.compare(jogadaUsuário, numAleatorio)){
                case 0: //Números iguais
                    System.out.println("Parabéns! Você acertou o número!");
                    return; // Encerra o jogo

                case 1: //jogadaUsuario é maior que numAleatorio
                    System.out.println("O número é menor.");
                    break;

                case -1: //jogadaUsuario é menor que numAleatorio
                    System.out.println("O número é maior.");
                    break;
            }

            tentativasRestantes--;

            if (tentativasRestantes > 0 ){
                System.out.println("Você tem " + tentativasRestantes + " tentativas restantes.");
            } else {
                System.out.println("Você não conseguiu adivinhar o número. O número era " + numAleatorio + ".");
            }

        }

    }
}
