package modificador.pacote1;

public class Classe2 {

    private String propriedadePrivada;
    public String propriedadePublica;
    String propriedadeDefaul;
    protected String propriedadeProtected;

    public static void main(String[] args) {

        Classe1 class1 = new Classe1();
//        class1.propriedadePublica;
//        class1.propriedadeDefaul;
//        class1.propriedadeProtected;

        class1.setPropriedadePrivada("Teste endereco");
        System.out.println(class1.getPropriedadePrivada());
    }
}