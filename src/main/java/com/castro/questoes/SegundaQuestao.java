package com.castro.questoes;

import java.util.List;
import java.util.Scanner;


/**
 * Representa a segunda questão do desafio de programação 02
 * @author Pedriana Castro
 *
 */
public class SegundaQuestao {
	
	 Scanner sc = new Scanner(System.in);

    /**
     * Calcula o número de elementos pares do vetor que tem uma diferença igual a um valor de entrada x.
     * @return total de elementos pares do vetor
     */
    public int calculaNumeroElementos(List<Integer> arr, int valorX) {
       
        int x,total=0;

            for (int i = 0; i < arr.size() - 1; i++) {
                for (int j = arr.size() - 1; j > i; j--) {
                    if (Math.abs(arr.get(i) - arr.get(j)) == Math.abs(valorX)) { // numeros[i] = 1;
                        total++;
                    }
                }
            }

        return total;
    }
   
}
