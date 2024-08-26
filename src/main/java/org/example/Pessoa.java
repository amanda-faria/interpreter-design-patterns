package org.example;
public class Pessoa {
    private double salario1;
    private double salario2;

    public double getSalario1() {
        return salario1;
    }

    public void setSalario1(double salario1) {
        this.salario1 = salario1;
    }

    public double getSalario2() {
        return salario2;
    }

    public void setSalario2(double salario2) {
        this.salario2 = salario2;
    }

    public double calcularRenda() {
        return Renda.calcularRenda(this.salario1, this.salario2);
    }
}
