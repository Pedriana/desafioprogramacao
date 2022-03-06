package com.castro.questoes;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Teste unitário referente a classe TerceiraQuestao
 * @author Pedriana Castro
 */
public class TerceiraQuestaoTest {

	@Test
	public void testEncriptaTexto() {
		TerceiraQuestao terceiraQuestao = new TerceiraQuestao();
        String texto = "tenha um bom dia";
        String resultadoEsperado = "taoa eum nmd hbi";
        String resultado = terceiraQuestao.encriptaTexto(texto);
 
        assertTrue(resultado.equals(resultadoEsperado));
	}

}
