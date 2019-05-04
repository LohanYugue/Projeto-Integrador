package jogo;

import java.util.Scanner;

/**
 *
 * @author lohan.ypyugue
 */
public class jogo {
    
static Scanner leitor = new Scanner(System.in);
    static int soma = 5;
    static char opcao;
    public static void main(String[] args) {
        
        menu();
    }
    
    public static void menu() {
        System.out.println(" ___                   _               _                                ");
        System.out.println("| __|  ___  __   ___  | |  __ _     __| |  ___     __   __ _   ___   ___");
        System.out.println("| _|  (_-< / _| / _ \\ | | / _` |   / _` | / _ \\   / _| / _` | / _ \\ (_-<");
        System.out.println("|___| /__/ \\__| \\___/ |_| \\__,_|   \\__,_| \\___/   \\__| \\__,_| \\___/ /__/");
        System.out.println("\n");
        System.out.println("***********");
        System.out.println("(A) Jogar");
        System.out.println("(B) Instruções");
        System.out.println("(C) Recorde");
        System.out.println("(D) Créditos");
        System.out.println("(E) Sair");
        System.out.println("***********");
        System.out.println("\n");
        System.out.print("Digite a opção desejada: ");
        char inicio = leitor.nextLine().toLowerCase().charAt(0);
        while ((inicio != 'a') && (inicio != 'b')) {
            System.out.println("a)Jogar");
            System.out.println("b)Sair");
            inicio = leitor.nextLine().toLowerCase().charAt(0);
        }
        switch (inicio) {
            case 'a': salaEAD();
                break;
            case 'b':
                break;
            case 'c':
                break;
            case 'd':
                break;
            case 'e':
                System.out.println("voce saiu");
                break;
        }
    }
    
    public static void salaEAD() {
        
        //Questão 1   
        do{
            System.out.println ("*******Questão 1*******");
            System.out.println ("A soma de 5 + 5 resulta em um número ....?");
            System.out.println("(a)Par\n(b)Impar\n(c)Horizontal\n(d)Vertical");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
            if (opcao=='a'){
                acertou();
            }
            else if ((opcao=='b') || (opcao=='c') || (opcao=='d')){
                errou();
            }
        }while(opcao!='a'&&soma!=0);
    
    
        //Questão 2
        do{
            System.out.println ("*******Questão 2*******");
            System.out.println ("O palmeiras tem Mundial?");
            System.out.println("(a)Sim\n(b)Não\n(c)Com certeza\n(d)Tem só se for roubado");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
            if (opcao=='d'){
                acertou();
            }
            else if ((opcao=='b') || (opcao=='c') || (opcao=='a')){
                errou();
            }
        }while(opcao!='d');
    
    
        //Questão 3
        do{
            System.out.println ("*******Questão 3*******");
            System.out.println ("Em que ano se deu início a ditadura no Brasil?");
            System.out.println("(a)1945\n(b)1956\n(c)1964\n(d)No século XXI");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
            if (opcao=='c'){
                acertou();
            }
            else if ((opcao=='b') || (opcao=='d') || (opcao=='a')){
                errou();
            }
        }while(opcao!='c');
    
    
        //Questão 4
        do{
            System.out.println ("*******Questão 4*******");
            System.out.println ("Quanto vale em hexadecimal o número binário 1011?");
            System.out.println("(a)F\n(b)B\n(c)D\n(d)C");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
            if (opcao=='b'){
                acertou();
            }
            else if ((opcao=='d') || (opcao=='c') || (opcao=='a')){
                errou();
            }
        }while(opcao!='b');
    
    
        //Questão 5
        do{
            System.out.println ("*******Questão 5*******");
            System.out.println ("Qual símbolo representa o operador lógico OR/OU ?");
            System.out.println("(a)+\n(b)*\n(c)-\n(d)/");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
            if (opcao=='a'){
                acertou();
                System.out.println("Parabéns, você completou todos os desafios desta sala.");
            }
            else if ((opcao=='b') || (opcao=='c') || (opcao=='d')){
                errou();
            }
        }while(opcao!='a');
        
    }
       
//Função responsável por subtrair um ponto caso o jogar erra uma questão. 
//Se o total de pontos do jogador chegou a ZERO, a função encerrará o jogo.
    public static void errou (){
            soma = soma - 1;
        if (soma!=0){
            System.out.println("\n");
            System.out.println("Opção incoreta! Você perdeu 1 ponto.");
            System.out.println("Você possui " + soma + " pontos!");
            System.out.println("\n");
        }
        else{
            System.out.println("\n");
            System.out.println("Opção incoreta! Você perdeu 1 ponto.");
            System.out.println("Seus pontos chegaram a " + soma + " você perdeu!");
            System.exit(0);
        }
    }

//Função responsável por somar dois pontos caso o jogador acerte a questão
    public static void acertou() {
        System.out.println("\n");
        System.out.println("Opção correta! Parabéns você somou 2 pontos.");
            soma = soma + 2;
        System.out.println("Você possui " + soma + " pontos!");
        System.out.println("\n");
    }
    
}
