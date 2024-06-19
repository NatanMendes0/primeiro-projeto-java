import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); //rastreia uma entreda no teclado
        double mediaAvaliacao = 0, nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar.");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            } else {
                System.out.println("Programa encerrado, nenhuma nota somada.");
            }
        }
        if (nota > 0) {
            System.out.println("Programa encerrado, nenhuma nota somada.");
        }
    }
}
