package SalaEAD;

import java.util.Scanner;

public class sala {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int soma = 5;
        char opcao;
        
        do{
            System.out.println("(a)Par\n(b)Impar\n(c)Horizontal\n(d)Vertical");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
        
            if (opcao=='a'){
                System.out.println("Opção correta! Parabéns você somou 2 pontos.");
                    soma = soma + 2;
                System.out.println("Você possui " + soma + " pontos!");
            }
        
            else if ((opcao=='b') || (opcao=='c') || (opcao=='d')){
                System.out.println("Opção incoreta! Você perdeu 1 ponto. Tente novamente");
                    soma = soma - 1;
                System.out.println("Você possui " + soma + " pontos!");
            }
        }while(opcao!='a');
        
        
        do{
            System.out.println ("O palmeiras tem Mundial?");
            System.out.println("(a)Sim\n(b)Não\n(c)Com certeza\n(d)Tem só se for roubado");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
            if (opcao=='d'){
                System.out.println("Opção correta! Parabéns você somou 2 pontos.");
                    soma = soma + 2;
                System.out.println("Você possui " + soma + " pontos!");
            }
            else if ((opcao=='b') || (opcao=='c') || (opcao=='a')){
                System.out.println("Opção incoreta! Você perdeu 1 ponto. Tente novamente");
                    soma = soma - 1;
                System.out.println("Você possui " + soma + " pontos!");
            }
        }while(opcao!='d');
    }
    
}
