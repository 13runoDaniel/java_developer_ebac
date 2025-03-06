package Variaveis;

/* OPERACOES ARITMETICA */
// + adicao
// - subtracao
// * multiplicacao
// / divisao

/* OPERADORES DE ATRIBUICAO */
// = atribui valor
// += atribuir e somar valor, exemplo: num1 += num2 e igual a num1 = num1 + num2
// -= atribuir e subtrair valor, exemplo: num1 -= num2 e igual a num1 = num1 - num2
// *= atribuir e multiplicar valor, exemplo: num1 *= num2 e igual a num1 = num1 * num2
// /= atribuir e dividir valor, exemplo: num1 /= num2 e igual a num1 = num1 / num2

/* OPERADORES DE INCREMENTO E DECREMENTO */
// ++ ou -- atribuir valor e somar/subtrair por 1

/* OPERADORES RELACIONAIS */
// < menor que
// <= menor igual a
// > maior que
// >= maior igual a
// == igual igual
// != diferente

/* OPERADORES LOGICOS */
// && (and)
// || (or)
// ! (not)

public class Operadores {

    public static void main(String[] args) {

        operacoesAritmeticas();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
        operacoesLogicas();
    }

    private static void operacoesLogicas() {

        System.out.println("**** operacoesLogicas ****");

        int num1 = 10;
        int num2 = 9;
        int num3 = 8;
        int num4 = 7;

        boolean resultadoLogicoAnd = num1 > num2 && num2 > num3;
        System.out.println("resultadoLogicoAnd: " + resultadoLogicoAnd);

        boolean resultadoLogicoAnd1 = num1 > num2 && num2 < num4;
        System.out.println("resultadoLogicoAnd1: " + resultadoLogicoAnd1);

        boolean resultadoLogicoOr = num1 < num2 || num2 > num4;
        System.out.println("resultadoLogicoOr: " + resultadoLogicoOr);

        boolean resultadoLogicoOr1 = num4 > num2 || num2 > num1;
        System.out.println("resultadoLogicoOr1: " + resultadoLogicoOr1);

        boolean resultadoLogicoNot = num1 > num2;
        System.out.println("resultadoLogicoNot: " + !resultadoLogicoNot);

        boolean resultadoLogicoNot1 = num1 < num2;
        System.out.println("resultadoLogicoNot1: " + !resultadoLogicoNot1);
    }

    private static void operacoesRelacionais() {

        System.out.println("**** operacoesRelacionais ****");

        int num1 = 10;
        int num2 = 20;
        int num3 = 10;

        boolean resultado = num1 > num2;
        System.out.println("resultado: " + resultado);

        boolean resultado1 = num1 >= num3;
        System.out.println("resultado1: " + resultado1);

        boolean resultado2 = num1 != num3;
        System.out.println("resultado2: " + resultado2);
    }

    public static void operacoesIncrementoDecremento() {

        System.out.println("**** operacoesIncrementoDecremento ****");

        int num1 = 10;
        System.out.println(num1);
        num1 ++;
        System.out.println(num1);

        int num2 = 11;
        System.out.println(num2);
        num2--;
        System.out.println(num2);

        int num3 = 8;
        System.out.println(num3);
        ++num3;
        System.out.println(num3);

        int num4 = 9;
        System.out.println(num4);
        --num4;
        System.out.println(num4);
    }

    private static void operacoesAtribuicoes() {

        System.out.println("**** operacoesAtribuicoes ****");

        int numero1 = 10;
        int numero2 = 10;

        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3;
        System.out.println(numero3);

        int numero4 = numero3 + 20;
        System.out.println(numero4);
    }

    public static void operacoesAritmeticas() {

        System.out.println("**** operacoesAritmeticas ****");

        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 * num2;
        int num6 = num1 / num2;
        int num7 = (10 + 10) / 2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }
}