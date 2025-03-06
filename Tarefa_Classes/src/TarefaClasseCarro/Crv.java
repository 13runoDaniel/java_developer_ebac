package TarefaClasseCarro;

/**
 * Classe que demonstra a utilizacao da classe Carro com um objeto Crv
 */
public class Crv {

    /**
     * Metodo principal que cria um objeto Carro (Crv), definindo seus atributos e os exibindo
     * @param args os argumentos da linha de comando (nao utilizado neste exemplo)
     */
    public static void main(String[] args) {

        Carro crv = new Carro();

        crv.setFabricante("Honda");
        crv.setModelo("CR-V");
        crv.setMotor(2.0f);
        crv.setChassi("0ZYXW98VU76543211");
        crv.setAno(2010);

        String fabricante = crv.getFabricante();
        String modelo = crv.getModelo();
        float motor = crv.getMotor();
        String chassi = crv.getChassi();
        int ano = crv.getAno();

        System.out.println(fabricante);
        System.out.println(modelo);
        System.out.println(motor);
        System.out.println(chassi);
        System.out.println(ano);
        System.out.println(crv.velocidadeMaxima());

        crv.acelerar();
        crv.buzinar();
    }
}