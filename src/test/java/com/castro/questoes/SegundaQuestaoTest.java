package com.castro.questoes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
/**
 * Teste unitário referente a classe SegundaQuestao
 * @author Pedriana Castro
 */
public class SegundaQuestaoTest {
	
	@Test
	public void testCalculaNumeroElementos() {
		SegundaQuestao segundaQuestao = new SegundaQuestao();
        List<Integer> list = Arrays.asList(1,5,3,4,2);
        int valorX =  2;
        int resultadoEsperado = 3;

        int resultado = segundaQuestao.calculaNumeroElementos(list,valorX);

        assertTrue(resultadoEsperado==resultado);        
	}

}
