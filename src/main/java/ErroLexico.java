
public class ErroLexico extends RuntimeException {

    private char caractereEncontrado;
    private String caracteresEsperados;
    private int linha;
    private int coluna;

    public ErroLexico(char caracterEncontrado, String caracteresEsperados, int linha, int coluna) {
        setCaractereEncontrado(caracterEncontrado);
        setCaracteresEsperados(caracteresEsperados);
        setLinha(linha);
        setColuna(coluna);
    }

    public void setCaractereEncontrado(char caractereEncontrado) {
        this.caractereEncontrado = caractereEncontrado;
    }

    public char getCaractereEncontrado() {
        return caractereEncontrado;
    }

    public void setCaracteresEsperados(String caracteresEsperados) {
        this.caracteresEsperados = caracteresEsperados;
    }

    public String getCaracteresEsperados() {
        return caracteresEsperados;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return "caractere encontrado: " + ((char) getCaractereEncontrado()) 
                + "\n  Na linha " + linha + " coluna " + coluna
                + "\n  Era(m) esperado(s): " + getCaracteresEsperados();
    }
}
