package com.example.checkpoint1parte2;

package com.example.checkpoint1parte2.controller.Exercicio4Controller;
import com.example.checkpoint1parte2.Entity.Exercicio4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

public class Exercicio4Test {
    Exercicio4Controller exe = new Exercicio4Controller();

    @Test
    public void TestePalindromoSucesso() {

        String resultadoEsperado = "Palíndromo!";

        String frase = "Ovo";

        Assertions.assertEquals(resultadoEsperado, exe.isPalindromo(frase));

    }

    @Test
    public void TestePalindromoFalha() {

        String resultadoNaoEsperado = "Não é Palíndromo!";

        String frase = "hello";

        Assertions.assertEquals(resultadoNaoEsperado, exe.isPalindromo(frase));

    }

    @Test
    public void TesteNumeroUnicoSucesso() {

        Integer resultadoEsperado = 0;

        int[] lista = {5, 3, 5, 3, 0};

        Assertions.assertEquals(resultadoEsperado, exe.achaNumero(lista));
    }

    @Test
    public void TesteNumeroUnicoFalha() {

        Integer resultadoEsperado = 4;

        int[] lista = {7, 3, 7, 3};

        Assertions.assertEquals(resultadoEsperado, exe.achaNumero(lista));
    }
}