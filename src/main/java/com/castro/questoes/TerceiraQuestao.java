package com.castro.questoes;

import java.util.*;

/**
 * Representa a terceira questão do desafio de programação 02
 * @author Pedriana Castro
 *
 */

public class TerceiraQuestao {


    /**
     * Recebe uma string e transforma em uma mensagem encriptada.
     * @param texto
     */
    public String encriptaTexto(String texto) {
    	String textoEncriptado="";
        try{
            
            String result = texto.replace(" ", "");

            int qr = (int) Math.ceil(Math.sqrt(result.length()));

            String [] cripto = new String[qr];

            result = String.format("%-" + (qr * qr) + "s",result);

            int index =0;
            for(int i=0; i<qr;i++){
                cripto[i] = String.format("%-" + qr + "s",result.substring(index, index+qr) );
                index+= qr;
            }

            for(int idx=0; idx<qr;idx++) {
                for (int x = 0; x < qr; x++) {
                    textoEncriptado+=cripto[x].substring(idx, idx + 1).replace(" ", "");
                }
                if (idx <qr-1) {
                    textoEncriptado+=" ";
                }
            }
        } catch(MissingFormatWidthException e) {
            System.out.println("Erro: 'A frase está vazia.");
        }
        
        return textoEncriptado;

    }
}
