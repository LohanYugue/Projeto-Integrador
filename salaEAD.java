//Esboço de como será a possível sala de EAD do jogo Escola do Caos.

package SalaEAD;

import java.util.Scanner;

public class sala {
    
    static Scanner leitor = new Scanner(System.in);
    static int soma = 5;
    static char opcao;
    
    public static void main(String[] args) {
        
        questao1 ();
        questao2 ();
        questao3 ();
        questao4 ();
        questao5 ();
        
    }
    
    public static void questao1 () {   
        do{
            System.out.println ("A soma de 5 + 5 resulta em um número ....?");
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
                System.out.println("Opção incoreta! Você perdeu 1 ponto.");
                    soma = soma - 1;
                perdeu();
            }
        }while(opcao!='a'&&soma!=0);
    }
    
    public static void questao2 (){   
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
                System.out.println("Opção incoreta! Você perdeu 1 ponto.");
                    soma = soma - 1;
                perdeu();
            }
        }while(opcao!='d');
    }
    
    public static void questao3 (){   
        do{
            System.out.println ("Em que ano se deu início a ditadura no Brasil?");
            System.out.println("(a)1945\n(b)1956\n(c)1964\n(d)No século XXI");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
            if (opcao=='c'){
                System.out.println("Opção correta! Parabéns você somou 2 pontos.");
                    soma = soma + 2;
                System.out.println("Você possui " + soma + " pontos!");
            }
            else if ((opcao=='b') || (opcao=='d') || (opcao=='a')){
                System.out.println("Opção incoreta! Você perdeu 1 ponto.");
                    soma = soma - 1;
                perdeu();
            }
        }while(opcao!='c');
    }
    
    public static void questao4 (){   
        do{
            System.out.println ("Quanto vale em hexadical o número binário 1011?");
            System.out.println("(a)F\n(b)B\n(c)D\n(d)C");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
            if (opcao=='b'){
                System.out.println("Opção correta! Parabéns você somou 2 pontos.");
                    soma = soma + 2;
                System.out.println("Você possui " + soma + " pontos!");
            }
            else if ((opcao=='d') || (opcao=='c') || (opcao=='a')){
                System.out.println("Opção incoreta! Você perdeu 1 ponto.");
                    soma = soma - 1;
                perdeu();
            }
        }while(opcao!='b');
    }
    
    public static void questao5 (){   
        do{
            System.out.println ("Qual símbolo representa o operador lógico OR/OU ?");
            System.out.println("(a)+\n(b)*\n(c)-\n(d)/");
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
                System.out.println("Opção incoreta! Você perdeu 1 ponto.");
                    soma = soma - 1;
                perdeu();
            }
        }while(opcao!='a');
    }
    
//Função responsável por validar se o total de pontos do jogador chegou a ZERO, caso ocorra, a função encerrará o jogo.
    public static void perdeu (){
        if (soma!=0){
                        System.out.println("Você possui " + soma + " pontos!");
                    }
                    else{
                        System.out.println("Seus pontos chegaram a " + soma + " você perdeu!");
                        System.exit(0);
                    }
    }

}
