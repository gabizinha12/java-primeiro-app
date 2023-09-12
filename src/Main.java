public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun Maverick");
        int anoDeLancamento = 2022;  // camelCase
        System.out.println("Ano de Lancamento:   "   + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}