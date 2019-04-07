/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO03;

import java.util.Scanner;

/*
 * @author lohan.ypyugue
 */
public class JogoComMenu {
    public static void main(String[] args) {
        
        
         Scanner leitor = new Scanner(System.in);
         
         int soma = 0;
         int opcao = 0;
         
        while (opcao!=5){
             
              System.out.println("(1)Instruções \n(2)Jogar \n(3)Pontos Ganhos \n(4)Créditos \n(5)Sair");
              opcao = leitor.nextInt();
              
            switch(opcao){
             
            case 1: 
                System.out.println("Pra cada resposta certa ganha 10 pontos, é isso!");
            break;
             
            case 2: 
                System.out.println("Qual o resultado da operação 2 + 2 ?");
                System.out.println("(a)2 \n(b)4 \n(c)20 \n(d)8 \n(e)10");
                char resposta = leitor.next().charAt(0);
                if (resposta =='b'){
                    System.out.println("Resposta correta :) ");
                    soma += 10;
                }
                else{
                    System.out.println("Resposta Errada:( ");
                }
            break;
             
            case 3: 
                System.out.println(soma);
            break;
             
            case 4:
                System.out.println("Criador: Lohan Yochinori Petermann Yugue\nRoteirista: Lohan Yochinori Petermann Yugue\nMáquina: Lohan Yochinori Petermann Yugue\nDesign: Lohan Yochinori Petermann Yugue\nFigurino: Lohan Yochinori Petermann Yugue");
            break;
             
            case 5:
                System.out.println("Tchau!");
            break;
            }
            
         }
    }    
}
