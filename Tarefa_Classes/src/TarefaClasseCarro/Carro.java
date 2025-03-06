/**
 * @author 13runo Daniel
 */
package TarefaClasseCarro;

/**
 * Esta classe representa um carro
 */
public class Carro {

    private String fabricante;
    private String modelo;
    private float motor;
    private String chassi;
    private int ano;

    /**
     * Retorna o fabricante do veiculo
     * @return o fabricante do veiculo
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Define o fabricante do veiculo
     * @param fabricante O fabricante a ser definido
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * Retorna o modelo do veiculo
     * @return o modelo do veiculo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o modelo do veiculo
     * @param modelo o modelo a ser definido
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Retorna a potencia do motor do veiculo
     * @return a potencia do motor
     */
    public float getMotor() {
        return motor;
    }

    /**
     * Define a potencia do motor do veiculo
     * @param motor a potencia do motor a ser definida
     */
    public void setMotor(float motor) {
        this.motor = motor;
    }

    /**
     * Retorna o chassi do veiculo
     * @return o chassi do veiculo
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * Define o chassi do veiculo
     * @param chassi o chassi a ser definido
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /**
     * Retorna o ano do veiculo
     * @return o ano do veiculo
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define o ano do veiculo
     * @param ano o ano a ser definido
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Simula a aceleracao do veiculo
     */
    public void acelerar() {
        System.out.println("Vruumm");
    }

    /**
     * Simula a buzina do veiculo
     */
    public void buzinar() {
        System.out.println("Bibiiiiii");
    }

    /**
     * Retorna a velocidade maxima do veiculo
     * @deprecated este metodo foi substituido por {@link #velocidadeMaxima(int)}
     * @return a velocidade maxima do veiculo
     */
    public int velocidadeMaxima() {
        return 180;
    }

    /**
     * Retorna a velocidade maxima do veiculo
     * @param count o valor do contador
     * @return a velocidade maxima do veiculo
     */
    public int  velocidadeMaxima(int count) {
        return 200;
    }
}