public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("O ano de lançamento desse filme é: "+ anoDeLancamento);

        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        //média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(String.format("O Valor da média é: %.2f",media));

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galâ com anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);

        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);

    }
}
