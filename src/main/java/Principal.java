
public class Principal {

    public static void main(String[] args) {

        MeuAnalisadorLexico leitor;
        try {
            if (args.length != 1) {
                throw new RuntimeException("Esqueceu de escrever o nome do arquivo de entrada!");
            }
            leitor = new MeuAnalisadorLexico(args[0]);
            // chama várias vezes até encontrar o fim de arquivo
            do {
                leitor.s0();
                System.out.println(leitor.tokenReconhecido);
            } while (leitor.tokenReconhecido != Constantes.Token.EOF);

            System.out.println("Analise lexica realizada com sucesso no arquivo " + leitor.getNomeArquivoEntrada());
        } catch (ErroLexico e) {
            System.out.println("Erro lexico: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
