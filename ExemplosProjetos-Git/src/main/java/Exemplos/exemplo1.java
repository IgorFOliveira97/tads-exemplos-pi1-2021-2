/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos;

import java.util.Scanner;

/**
 *
 * @author OLIVEIRA
 */
public class exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("IGOR OLIVEIRA 24/10/2021");
        int num1, num2, media;
        
        System.out.println("DIGITE SUA PRIMEIRA NOTA:");
        num1 = entrada.nextInt();
        System.out.println("DIGITE SUA SEGUNDA NOTA");
        num2 = entrada.nextInt();
        
        media = num1 + num2 /2;
        
        System.out.println("SUA MÉDIA FOI DE: " + media);
        
    }
    
}
