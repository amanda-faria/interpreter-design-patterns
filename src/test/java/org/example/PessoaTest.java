package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Pessoa pessoa = new Pessoa();
        pessoa.setSalario1(2000.0);
        pessoa.setSalario2(3000.0);

        assertEquals(7000.0, pessoa.calcularRenda());
    }


}