
public class ErroLexico extends RuntimeException {

    private char caractereEncontrado;
    private String caracteresEsperados;

    public ErroLexico(char caracterEncontrado, String caracteresEsperados) {
        setCaractereEncontrado(caracterEncontrado);
        setCaracteresEsperados(caracteresEsperados);
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

    @Override
    public String toString() {
        return "caractere encontrado: " + ((char) getCaractereEncontrado()) + "\nera(m) esperado(s): " + getCaracteresEsperados();
    }
}
