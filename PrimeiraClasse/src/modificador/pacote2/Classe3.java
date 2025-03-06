package modificador.pacote2;

import modificador.pacote1.Classe1;
import modificador.pacote1.Classe2;

public class Classe3 extends Classe2 {

    public static void main(String[] args) {

//        this.propriedadePublica;
//        this.propriedadeProtected;

        Classe2 class2 = new Classe2();
//        class2.propriedadePublica;

        Classe1 class1 = new Classe1();
//        class1.propriedadePublica;
    }
}