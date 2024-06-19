import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); //rastreia uma entreda no teclado

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine(); // nextLine lê um texto

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt(); // nextInt lê um valor inteiro

        System.out.println("Diga sua avaliação para o filme");
        double avaliacaoo = leitura.nextDouble(); // nextDouble lê valores decimais

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacaoo);
    }
}
