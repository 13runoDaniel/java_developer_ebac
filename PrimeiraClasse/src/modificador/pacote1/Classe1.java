package modificador.pacote1;

public class Classe1 {

    private String propriedadePrivada;
    public String propriedadePublica;
    String propriedadeDefaul;
    protected String propriedadeProtected;

    public String getPropriedadePrivada() {
        return propriedadePrivada;
    }

    public void setPropriedadePrivada(String propriedadePrivada) {
        this.propriedadePrivada = propriedadePrivada;
    }
}

/**
 *
 * JAVADOC
 *
 * @author - Especifica o autor da classe ou do metodo em questao;
 * @deprecated - Identifica classes ou metodos obsoletos. E interessante informar nessa tag,quais metodos ou classes podem ser usadas como alternativa ao metodo obsoleto;
 * @link - Possibilita a definicao de um link para um outro documento local ou remoto atraves de uma URL;
 * @param - Mostra um parametro que sera passado a um metodo;
 * @return - Mostra qual o tipo de retorno de um metodo;
 * @see - Possibilita as definicoes referenciais de classes ou metodos, que podem ser consultadas para melhor compreender ideias daquilo que esta sendo comentada;
 * @since - Indica desde quando uma classe ou metodo foi adicionado na aplicacao;
 * @throws - Indica os tipos de excecoes que podem ser lancadas por um metodo;
 * @version - Informa a versao da classe.
 *
 */