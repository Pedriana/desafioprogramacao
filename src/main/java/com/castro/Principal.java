package com.castro;
import com.castro.questoes.PrimeiraQuestao;
import com.castro.questoes.SegundaQuestao;
import com.castro.questoes.TerceiraQuestao;
import com.castro.util.IOUtils;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável pelo fluxo principal do projeto
 * @author Pedriana Castro
 *
 */
public class Principal {

	static Scanner inputInt = new Scanner(System.in);
	static Scanner inputStr = new Scanner(System.in);
	
    public static void main (String[] arg) throws Exception{
    	
        int op;
        List<Integer> dados;
        try {
            do {

                System.out.println("------------------ MENU -------------------");
                System.out.println("1 - QUESTÃO 01");
                System.out.println("2 - QUESTÃO 02");
                System.out.println("3 - QUESTÃO 03");
                System.out.println("ESCOLHA UMA OPÇÃO: ");
                op= inputInt.nextInt();
                switch (op) {
                    case 1:
                    	System.out.println("-------------- # QUESTÃO 01 # --------------");
                    	PrimeiraQuestao pq = new PrimeiraQuestao();
                    	dados = IOUtils.entradaDeDados(op);
                    	pq.calculaMediana(dados);
                    	System.out.println("Saída: "+pq.calculaMediana(dados));
                    	break;
                    case 2:
                        System.out.println("-------------- # QUESTÃO 02 # --------------");
                        SegundaQuestao sq = new SegundaQuestao();
                        dados = IOUtils.entradaDeDados(op);
                        System.out.println("Digite um valor para x: ");
                        int x = inputInt.nextInt();
                        int r = sq.calculaNumeroElementos(dados,x);
                        System.out.println("Saída: "+r);
                        break;
                    case 3:
                        System.out.println("-------------- # QUESTÃO 03 # --------------");
                        System.out.println("Entre com uma frase: ");
                        String frase=inputStr.nextLine();
                        TerceiraQuestao tq = new TerceiraQuestao();
                        System.out.println("Saída: "+tq.encriptaTexto(frase));
                        
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
                System.out.println("\nDeseja continuar? 1 - SIM | 2 - NÃO");
                op = inputInt.nextInt();
            } while (op==1);
            
        } catch(InputMismatchException e) {
            System.out.println("Erro: 'E permitido somente digitar números.");
        }finally {
        	System.out.print("\nFinalizando o sistema...");
		}
    }
   
}
