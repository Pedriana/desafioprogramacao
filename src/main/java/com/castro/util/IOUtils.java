package com.castro.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOUtils {

	static Scanner inputInt = new Scanner(System.in);
	
	public static List<Integer> entradaDeDados(int op) {
    	
    	int quantidade, numero;
    	List<Integer> arr = new ArrayList<Integer>();
    	
        do {
        	
            System.out.println("Digite a quantidade de números: ");
            quantidade = inputInt.nextInt();
            
            if(quantidade<=0){
                System.out.println("Valor zero ou negativo não é permitido. Tente novamente. \n");
            }
            if (quantidade % 2 == 0 && op==1) {
                System.out.println("A quantidade deve ser ímpar! Tente novamente. \n");
            }
        } while (quantidade % 2 == 0);
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um número: ");
            numero = inputInt.nextInt();
            arr.add(numero);
        }

        return arr;
    }
}
