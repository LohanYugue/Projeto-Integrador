package jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        
        String a = "Par";
        String b = "Ímpar";
        String c = "Horizonte";
        String d = "Diagonal";
        
        Random ram = new Random();
        Scanner leitor = new Scanner (System.in);
        System.out.println("(a)" + a + "\n(b)" + b + "\n(c)" +c + "\n(d)" + d);
        System.out.print("Escolha a alternativa correta: ");
        
        char opcao = leitor.nextLine().toLowerCase().charAt(0);
        
        while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
            System.out.println("Resposta inválida, favor informar novamente a resposta");
            opcao = leitor.nextLine().toLowerCase().charAt(0); 
        }
        
        if (opcao=='a'){
            System.out.println("Opção correta! Parabéns você somou 2 pontos.");
        }
        
        else if ((opcao=='b') || (opcao=='c') || (opcao=='d')){
            System.out.println("Opção incoreta! Você perdeu 1 ponto.");
            
        }
        
    }
    
}
