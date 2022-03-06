package com.castro.questoes;

import java.util.*;

/**
 * Representa a primeira questão do desafio de programação 02
 * @author Pedriana Castro
 *
 */
public class PrimeiraQuestao {

    private int mediana;

    /**
     * Calcula a mediana a partir de uma lista de números ímpar de elementos, após sua ordenação.
     */
    public int calculaMediana(List<Integer> arr){
        
        Collections.sort(arr);
        mediana = arr.get(arr.size()/2);
        return mediana;

    }

}
