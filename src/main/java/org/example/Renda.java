package org.example;

public class Renda {

    public static String formula = "salario1 * 2 + salario2";

    public static double calcularRenda(double salario1, double salario2) {
        String expressao;
        expressao = formula.replace("salario1", Double.toString(salario1));
        expressao = expressao.replace("salario2", Double.toString(salario2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
