package com.castro.questoes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Teste unitário referente a classe PrimeiraQuestao
 * @author Pedriana Castro
 */
public class PrimeiraQuestaoTest {

	@Test
	public void testCalculaMediana() {
		PrimeiraQuestao primeiraQuestao = new PrimeiraQuestao();
        List<Integer> list = Arrays.asList(9, 2,1,4,6);
        int resultadoEsperado = 4;
        int resultado = primeiraQuestao.calculaMediana(list);

        assertTrue(resultadoEsperado==resultado);        
	}

}
