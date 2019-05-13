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
        
        do{
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
        opcao = leitor.nextLine().toLowerCase().charAt(0);
        switch (opcao) {
            case 'a': start();
                break;
            case 'b':
                break;
            case 'c':
                break;
            case 'd':
                break;
            case 'e':
                System.out.println("Você Saiu!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
        }while(opcao!='e');
    }
    
    
    public static void start() {
        System.out.print(" Bem vindo ao jogo RPG “Escola do Caos”,\n antes de mais nada, "
                + "nos informe qual será seu nome neste jogo: ");
        String nome = leitor.nextLine().toUpperCase();
        System.out.print("\n" +
        "Elfo\n" +
        "Mago\n" +
        "Besta\n" +
        "Humano\n"+
        "\nMuito bem "+nome+", agora digite o personagem você deseja ser:");
        String personagem = leitor.nextLine().toUpperCase();
        while(!personagem.equals("ELFO")&&!personagem.equals("MAGO")&&!personagem.equals("BESTA")&&!personagem.equals("HUMANO")){
            System.out.print("Personagem inválido, digite um dos personagens acima: ");
            personagem = leitor.nextLine().toUpperCase();
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(nome+", você é um "+personagem+ ", que vive em uma terra misteriosa chamada "
        + "Monsaraz, um lugar belo e pacífico,\n contudo, descobriu que sua mãe Freya adquiriu uma doença "
        + "grave e muito rara que não tem cura,\n porém, através de muitas pesquisas e perguntas "
        + "feitas aos habitantes da região,\n descobriu que há uma pedra mágica com poderes curadores, "
        + "localizado além das terras de Monsaraz,\n em uma antiga escola, isolada nas montanhas.");
        System.out.println("\n");
        System.out.println("\n");
        
        System.out.print("Você parte em busca da pedra, após 4 longas horas de caminhada você chega a seu destino e encontra a escola que fica no fim de uma longa ponte.\n"
                + "Após passar pela ponte, você se depera com uma grande porta já aberta! Adentra naquele ambiente inóspito e de repente a porta se fecha.\n"
                + "Há algo gravado na porta dizendo .....\n"
                + "*****************************\n"
                + "*****************************\n"
                + "Para sair, encontre os 5 emblemas.\n"
                + "*****************************\n"
                + "*****************************\n"
                + "Olha com mais atenção na porta e percebe que há 5 espaços com formato octogonal vazios, como se faltasse algo!\n"
                + "Você precisa encontrar a pedra mágica e os cinco emblemas para salvar sua mãe!\n"
                + "Há dois corredores para seguir\n"
                + "Esquerda\n"
                + "Direita\n"
                + "Qual você deseja seguir? ");
                String escolha = leitor.nextLine().toLowerCase();
                while(!escolha.equals("esquerda")&&!escolha.equals("direita")){
                    System.out.print("Você possui somente duas opções, ir para direita ou para esquerda.\n Digite a direção que deseja seguir: ");
                    escolha = leitor.nextLine().toLowerCase();
                }
                if (escolha.equals("esquerda")){
                    char escolha2;
                    do{
                       System.out.print("Você segue em direção ao corredor da esquerda e há duas salas com a descrição.\n"
                       + "(a) ConceitosDeComputacao\n"
                       + "(b) Algoritmos\n"
                       + "(c) Voltar para o corredor da direita\n"
                       + "Onde você deseja ir? ");
                        escolha2 = leitor.nextLine().toLowerCase().charAt(0);
                            switch (escolha2){
                                case 'a': salaAlgoritmos();
                                    break;
                                case 'b': salaAlgoritmos();
                                    break;
                                case 'c': System.out.println("Saiu");
                                    break;
                                default: System.out.print("Você possui somente duas opções, ir para ConceitosDeComputacao ou para Algoritmos.\n Digite qual sala você deseja entrar: ");
                                escolha2 = leitor.nextLine().toLowerCase().charAt(0);
                            }
                    }while(escolha2!=('c'));    
                }
                        
        
    }
    
    
    
    public static void salaConceitosComputacao(){
        
        //Questão 1   
        do{
            System.out.println ("*******Questão 1*******");
            System.out.println ("O resultado da multiplicação dos números decimais 3 e 4  pode ser representado em hexadecimal pela letra:");
            System.out.println("(a)B\n(b)F\n(c)C\n(d)A");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
            if (opcao=='c'){
                acertou();
            }
            else if ((opcao=='b') || (opcao=='a') || (opcao=='d')){
                errou();
            }
        }while(opcao!='c'&&soma!=0);
    
    
        //Questão 2
        do{
            System.out.println ("*******Questão 2*******");
            System.out.println ("A função “NÃO E” também pode ser escrita da seguinte forma:");
            System.out.println("(a)AND\n(b)NOR\n(c)OR\n(d)NAND");
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
            System.out.println ("Qual símbolo representa a função AND/E ?");
            System.out.println("(a)+\n(b)-\n(c)*\n(d)/");
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
            System.out.println ("Quanto vale em decimal o número binário 100000100?");
            System.out.println("(a)254\n(b)260\n(c)256\n(d)512");
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
            System.out.println ("Qual símbolo representa a função OR/OU ?");
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
    
    public static void salaAlgoritmos(){
        
        //Questão 1   
        do{
            System.out.println ("*******Questão 1*******");
            System.out.println ("O resultado da multiplicação dos números decimais 3 e 4  pode ser representado em hexadecimal pela letra:");
            System.out.println("(a)B\n(b)F\n(c)C\n(d)A");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
            if (opcao=='c'){
                acertou();
            }
            else if ((opcao=='b') || (opcao=='a') || (opcao=='d')){
                errou();
            }
        }while(opcao!='c'&&soma!=0);
    
    
        //Questão 2
        do{
            System.out.println ("*******Questão 2*******");
            System.out.println ("A função “NÃO E” também pode ser escrita da seguinte forma:");
            System.out.println("(a)AND\n(b)NOR\n(c)OR\n(d)NAND");
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
            System.out.println ("Qual símbolo representa a função AND/E ?");
            System.out.println("(a)+\n(b)-\n(c)*\n(d)/");
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
            System.out.println ("Quanto vale em decimal o número binário 100000100?");
            System.out.println("(a)254\n(b)260\n(c)256\n(d)512");
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
            System.out.println ("Qual símbolo representa a função OR/OU ?");
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
    
    public static void salaFundamentos(){
        
        //Questão 1   
        do{
            System.out.println ("*******Questão 1*******");
            System.out.println ("O resultado da multiplicação dos números decimais 3 e 4  pode ser representado em hexadecimal pela letra:");
            System.out.println("(a)B\n(b)F\n(c)C\n(d)A");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
            if (opcao=='c'){
                acertou();
            }
            else if ((opcao=='b') || (opcao=='a') || (opcao=='d')){
                errou();
            }
        }while(opcao!='c'&&soma!=0);
    
    
        //Questão 2
        do{
            System.out.println ("*******Questão 2*******");
            System.out.println ("A função “NÃO E” também pode ser escrita da seguinte forma:");
            System.out.println("(a)AND\n(b)NOR\n(c)OR\n(d)NAND");
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
            System.out.println ("Qual símbolo representa a função AND/E ?");
            System.out.println("(a)+\n(b)-\n(c)*\n(d)/");
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
            System.out.println ("Quanto vale em decimal o número binário 100000100?");
            System.out.println("(a)254\n(b)260\n(c)256\n(d)512");
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
            System.out.println ("Qual símbolo representa a função OR/OU ?");
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
    
    public static void salaPreCalculo(){
        
        //Questão 1   
        do{
            System.out.println ("*******Questão 1*******");
            System.out.println ("O resultado da multiplicação dos números decimais 3 e 4  pode ser representado em hexadecimal pela letra:");
            System.out.println("(a)B\n(b)F\n(c)C\n(d)A");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        
            while ((opcao!='a') && (opcao!='b') && (opcao!='c') && (opcao!='d')){
                System.out.println("Resposta inválida, favor informar novamente a resposta");
                opcao = leitor.nextLine().toLowerCase().charAt(0); 
            }
            if (opcao=='c'){
                acertou();
            }
            else if ((opcao=='b') || (opcao=='a') || (opcao=='d')){
                errou();
            }
        }while(opcao!='c'&&soma!=0);
    
    
        //Questão 2
        do{
            System.out.println ("*******Questão 2*******");
            System.out.println ("A função “NÃO E” também pode ser escrita da seguinte forma:");
            System.out.println("(a)AND\n(b)NOR\n(c)OR\n(d)NAND");
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
            System.out.println ("Qual símbolo representa a função AND/E ?");
            System.out.println("(a)+\n(b)-\n(c)*\n(d)/");
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
            System.out.println ("Quanto vale em decimal o número binário 100000100?");
            System.out.println("(a)254\n(b)260\n(c)256\n(d)512");
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
            System.out.println ("Qual símbolo representa a função OR/OU ?");
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
