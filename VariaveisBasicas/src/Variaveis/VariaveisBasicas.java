package Variaveis;

public class VariaveisBasicas {

    private  int codigo = 1;
    // numeros inteiros de 32 bits

    private long codigoMaior = 1341234;
    // numeros em notacao de ponto flutuante

    private double valorDecimal1 = 1.6;
    // armazena caractere em notacao de 16 bits, aceita dados alfanumericos

    private boolean status = false;
    // armazena numero inteiro de 16 bits

    private String texto = "pode declarar em todos";
    // aloca numero inteiro de 8 bits

    private float valorDecimal = 8.7f;
    // assume valor true ou false

    private short shor;
    // aloca numeros inteiros de 64 bits

    private byte bi;
    // numeros em notacao de ponto flutuante


    public String retornarTexto() {
        return "Retornar texto";
    }

    public int retornarInteiro() {
        return 10;
    }

    public long retornarLong(long num) {
        return num;
    }
}