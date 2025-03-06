package TarefaClasseCarro;

/**
 * Classe que demonstra a utilizacao da classe Carro com um objeto Gol
 */
public class Gol {

    /**
     * Metodo principal que cria um objeto Carro (Gol), definindo seus atributos e os exibindo
     * @param args os argumentos da linha de comando (nao utilizados neste exemplo)
     */
    public static void main(String[] args) {

        Carro gol = new Carro();

        gol.setFabricante("Volkswagen");
        gol.setModelo("Gol");
        gol.setMotor(1.6f);
        gol.setChassi("1ABCD23EF45678900");
        gol.setAno(2012);

        String fabricante = gol.getFabricante();
        String modelo = gol.getModelo();
        float motor = gol.getMotor();
        String chassi = gol.getChassi();
        int ano = gol.getAno();

        System.out.println(fabricante);
        System.out.println(modelo);
        System.out.println(motor);
        System.out.println(chassi);
        System.out.println(ano);
        System.out.println(gol.velocidadeMaxima());

        gol.acelerar();
        gol.buzinar();
    }
}