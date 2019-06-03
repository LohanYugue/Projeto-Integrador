package jogo;

import java.util.Scanner;

public class jogo {

    static Scanner leitor = new Scanner(System.in);
    static int soma = 5;
    static char opcao;

    public static void main(String[] args) {
        menu();

    }

    static void menu() {
        do {
            System.out.println(" ___                   _               _                                ");
            System.out.println("| __|  ___  __   ___  | |  __ _     __| |  ___     __   __ _   ___   ___");
            System.out.println("| _|  (_-< / _| / _ \\ | | / _` |   / _` | / _ \\   / _| / _` | / _ \\ (_-<");
            System.out.println("|___| /__/ \\__| \\___/ |_| \\__,_|   \\__,_| \\___/   \\__| \\__,_| \\___/ /__/");
            PulaUmaLinha();
            System.out.println("***********");
            System.out.println("(A) Jogar");
            System.out.println("(B) Instruções");
            System.out.println("(C) Recorde");
            System.out.println("(D) Créditos");
            System.out.println("(E) Sair");
            System.out.println("***********");
            PulaUmaLinha();
            System.out.print("Digite a opção desejada: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
            switch (opcao) {
                case 'a':
                    controladora();
                    break;
                case 'b':
                    instrucoes();
                    break;
                case 'c':
                    recorde();
                    break;
                case 'd':
                    creditos();
                    break;
                case 'e':
                    System.out.println("Você Saiu!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 'e');
    }

    static void controladora() {
        int[][] trancou = tranca();
        ContaHistoria(trancou);
    }

    public static void ContaHistoria(int[][] trancou) {
        System.out.print(" Bem vindo ao jogo RPG “Escola do Caos”,\n antes de mais nada, "
                + "nos informe qual será seu nome neste jogo: ");
        String nome = leitor.nextLine().toUpperCase();
        System.out.print("\n" + "Elfo\n" + "Mago\n" + "Besta\n" + "Humano\n" + "\nMuito bem " + nome + ", agora digite o personagem você deseja ser:");
        String personagem = leitor.nextLine().toUpperCase();
        while (!personagem.equals("ELFO") && !personagem.equals("MAGO") && !personagem.equals("BESTA") && !personagem.equals("HUMANO")) {
            System.out.print("Personagem inválido, digite um dos personagens acima: ");
            personagem = leitor.nextLine().toUpperCase();
        }
        PulaUmaLinha();
        PulaUmaLinha();
        System.out.println(nome + ", você é um " + personagem + ", que vive em uma terra misteriosa chamada "
                + "Monsaraz, um lugar belo e pacífico,\n contudo, descobriu que sua mãe Freya adquiriu uma doença "
                + "grave e muito rara que não tem cura,\n porém, através de muitas pesquisas e perguntas "
                + "feitas aos habitantes da região,\n descobriu que há uma pedra mágica com poderes curadores, "
                + "localizado além das terras de Monsaraz,\n em uma antiga escola, isolada nas montanhas.");
        PulaUmaLinha();
        PulaUmaLinha();

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
                + "Há dois corredores para seguir\n");

        int chave = ValidaChave(trancou);
        validaCorredor(trancou, chave);

    }

    public static void validaCorredor(int[][] trancou, int chave) {
        System.out.print("\nEsquerda\n" + "Direita\n" + "Qual você deseja seguir?");
        String escolha = leitor.nextLine().toLowerCase();
        PulaUmaLinha();
        while (!escolha.equals("esquerda") && !escolha.equals("direita")) {
            System.out.print("Você possui somente duas opções, ir para direita ou para esquerda.\n Digite a direção que deseja seguir: ");
            escolha = leitor.nextLine().toLowerCase();
        }
        switch (escolha) {
            case "esquerda":
                esquerda(trancou, chave);
                break;
            case "direita":
                direita(trancou, chave);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public static void volta(int[][] trancou, int chave) {
        System.out.println("\nVoce voltou para a entrada principal e deve encontrar os emblemas que estão nos dois corredores");
        validaCorredor(trancou, chave);
    }

    static int[][] tranca() {
        int[][] tranca = new int[3][2];
        tranca[0][0] = 0;
        tranca[0][1] = 0;
        tranca[1][0] = 0;
        tranca[1][1] = 0;
        tranca[2][0] = 0;
        tranca[2][1] = 0;
        return (tranca);
    }

    static int ValidaChave(int[][] trancou) {
        int junta = 0;
        int chave;
        for (int i = 0; i < trancou.length; i++) {
            for (int j = 0; j < trancou[i].length; j++) {
                junta += trancou[i][j];
                //System.out.println(i);
                //System.out.println("j" + j);
                //System.out.println("junta" + junta);
            }
        }
        //System.out.println("junta 2 : " + junta);
        if (junta == 4) {
            chave = 4;
        } else {
            chave = 0;
        }
        //System.out.println("chave " + chave);
        return chave;
    }

    static int[][] esquerda(int[][] trancou, int chave) {
        char escolha;
        do {
            System.out.print("Você segue em direção ao corredor da esquerda e há duas salas com a descrição.\n"
                    + "(a) ConceitosDeComputacao\n"
                    + "(b) Algoritmos\n"
                    + "(c) sair deste corredor e voltar para a entrada principal que está trancada\n"
                    + "Onde você deseja ir? ");
            escolha = leitor.nextLine().toLowerCase().charAt(0);

            switch (escolha) {
                case 'a':
                    chave = ValidaChave(trancou);
                    if (trancou[0][0] < 1) {
                        trancou[0][0]++;
                        salaConceitosComputacao();
                    } else if (chave == 4) {
                         salaFinal();
                    } else {
                        System.out.println("\n sala trancada \n");
                    }
                    break;
                case 'b':
                    chave = ValidaChave(trancou);
                    if (trancou[0][1] < 1) {
                        trancou[0][1]++;
                        salaAlgoritmos();
                    } else if (chave == 4) {
                        salaFinal();
                    } else {
                        System.out.println("\n sala trancada \n");
                    }
                    break;
                case 'c':
                    volta(trancou, chave);
                    break;
                default:
                    System.out.print("Você possui somente duas opções, ir para ConceitosDeComputacao ou para Algoritmos.\n Digite qual sala você deseja entrar: ");
                    escolha = leitor.nextLine().toLowerCase().charAt(0);
            }
        } while (escolha != ('c'));
        return (trancou);
    }

    static int[][] direita(int[][] trancou, int chave) {
        char escolha;
        do {
            System.out.print("Você segue em direção ao corredor da direita e há duas salas com a descrição.\n"
                    + "(a) PreCalculo\n"
                    + "(b) FundamentosdeADM\n"
                    + "(c) sair deste corredor e voltar para a entrada principal que está trancada\n"
                    + "Onde você deseja ir? ");
            escolha = leitor.nextLine().toLowerCase().charAt(0);
            switch (escolha) {
                case 'a':
                    chave = ValidaChave(trancou);
                    if (trancou[1][0] < 1) {
                        trancou[1][0]++;
                        salaPreCalculo();
                    } else if (chave == 4) {
                        salaFinal();
                    } else {
                        System.out.println("\n sala trancada \n");
                    }
                    break;
                case 'b':
                    chave = ValidaChave(trancou);
                    if (trancou[1][1] < 1) {
                        trancou[1][1]++;
                        salaFundamentos();
                    } else if (chave == 4) {
                        salaFinal();
                    } else {
                        System.out.println("\n sala trancada \n");
                    }
                    break;
                case 'c':
                    volta(trancou, chave);
                    break;
                default:
                    System.out.print("Você possui somente duas opções, ir para ConceitosDeComputacao ou para Algoritmos.\n Digite qual sala você deseja entrar: ");
                    escolha = leitor.nextLine().toLowerCase().charAt(0);
            }
        } while (escolha != ('c'));
        return (trancou);
    }

    public static void salaConceitosComputacao() {

        //Questão 1   
        do {
            System.out.println("***SALA DE CONCEITOS DE COMPUTAÇÃO***");
            System.out.println("*******Questão 1*******");
            System.out.println("O resultado da multiplicação dos números decimais 3 e 4  pode ser representado em hexadecimal pela letra:");
            System.out.println("(a)B\n(b)F\n(c)C\n(d)A");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'c') {
                acertou();
            } else if ((opcao == 'b') || (opcao == 'a') || (opcao == 'd')) {
                errou();
            }
        } while (opcao != 'c' && soma != 0);

        //Questão 2
        do {
            System.out.println("*******Questão 2*******");
            System.out.println("A função “NÃO E” também pode ser escrita da seguinte forma:");
            System.out.println("(a)AND\n(b)NOR\n(c)OR\n(d)NAND");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'd') {
                acertou();
            } else if ((opcao == 'b') || (opcao == 'c') || (opcao == 'a')) {
                errou();
            }
        } while (opcao != 'd');

        //Questão 3
        do {
            System.out.println("*******Questão 3*******");
            System.out.println("Qual símbolo representa a função AND/E ?");
            System.out.println("(a)+\n(b)-\n(c)*\n(d)/");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'c') {
                acertou();
            } else if ((opcao == 'b') || (opcao == 'd') || (opcao == 'a')) {
                errou();
            }
        } while (opcao != 'c');

        //Questão 4
        do {
            System.out.println("*******Questão 4*******");
            System.out.println("Quanto vale em decimal o número binário 100000100?");
            System.out.println("(a)254\n(b)260\n(c)256\n(d)512");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'b') {
                acertou();
            } else if ((opcao == 'd') || (opcao == 'c') || (opcao == 'a')) {
                errou();
            }
        } while (opcao != 'b');

        //Questão 5
        do {
            System.out.println("*******Questão 5*******");
            System.out.println("Qual símbolo representa a função OR/OU ?");
            System.out.println("(a)+\n(b)*\n(c)-\n(d)/");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'a') {
                acertou();
                System.out.println("Parabéns, você completou todos os desafios desta sala.");
            } else if ((opcao == 'b') || (opcao == 'c') || (opcao == 'd')) {
                errou();
            }
        } while (opcao != 'a');

    }

    public static void salaAlgoritmos() {

        //Questão 1   
        do {
            System.out.println("***SALA DE ALGORÍTIMOS E PROGRAMAÇÃO***");
            System.out.println("*******Questão 1*******");
            System.out.println("Qual das alternativas demonstra apenas estruturas de repetição:");
            System.out.println("(a)while, if, if else\n(b)while, else, scanner\n(c)if, else if, else\n(d)while, do, do while");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'd') {
                acertou();
            } else if ((opcao == 'b') || (opcao == 'a') || (opcao == 'c')) {
                errou();
            }
        } while (opcao != 'd');

        //Questão 2
        do {
            System.out.println("*******Questão 2*******");
            System.out.println("Qual das formas a seguir apresenta a escrita de uma função:");
            System.out.println("(a)import java.util.Scanner\n(b)System.out.println();\n(c)public static void main {}\n(d)switch (opção) {}");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'c') {
                acertou();
            } else if ((opcao == 'd') || (opcao == 'b') || (opcao == 'a')) {
                errou();
            }
        } while (opcao != 'c');

        //Questão 3
        do {
            System.out.println("*******Questão 3*******");
            System.out.println("Qual das alternativas mostra apenas estruturas de decisão:");
            System.out.println("(a)while, if, System.out.println();\n(b)if, else, else if\n(c)while, do, switch\n(d)if, else, do");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'b') {
                acertou();
            } else if ((opcao == 'c') || (opcao == 'd') || (opcao == 'a')) {
                errou();
            }
        } while (opcao != 'b');

        //Questão 4
        do {
            System.out.println("*******Questão 4*******");
            System.out.println("Qual das alternativas a seguir apresenta a forma correta de iniciar um vetor?");
            System.out.println("(a)import java.util.Scanner\n(b)float [] notas = {6.5, 7.0, 5.5, 9.0, 2.5};\n(c)public static void main\n(d)switch (opção) {}");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'b') {
                acertou();
            } else if ((opcao == 'd') || (opcao == 'c') || (opcao == 'a')) {
                errou();
            }
        } while (opcao != 'b');

        //Questão 5
        do {
            System.out.println("*******Questão 5*******");
            System.out.println("qual das alternativas demonstra como declarar um matriz tridimensional");
            System.out.println("(a)int [][][] m = new int[2][4][7];\n(b)public static void\n(c)System.out.println\n(d)int [][] m = new int[8][8];");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'a') {
                acertou();
                System.out.println("Parabéns, você completou todos os desafios desta sala.");

            } else if ((opcao == 'b') || (opcao == 'c') || (opcao == 'd')) {
                errou();
            }
        } while (opcao != 'a');

    }

    public static void salaFundamentos() {

        //Questão 1   
        do {
            System.out.println("***SALA DE FUNDAMENTOS DE ADMINISTRAÇÃO***");
            System.out.println("*******Questão 1*******");
            System.out.println("Organizações existem há muitos e muitos anos atrás. Na pirâmide de Quéops, por exemplo, 100 mil pessoas foram empregadas para construi-la "
                    + "em apenas 20 anos. Administrar essa quantidade de empregados não é uma tarefa nada fácil não é mesmo? No entanto, pioneiros da escola clássica "
                    + "desenvolveram conceitos e técnicas para estruturar, controlar e organizar sua administração."
                    + "Os autores da escola clássica, responsável por sistematizar à administração, no século XX foram?");
            System.out.println("(a)Taylor, Ford e Max Webber\n(b)Ford, Taylor e Alexandre Magno\n(c)Dante, Ragnar e Pascoal\n(d)Ford e Taylor ");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'a') {
                acertou();
            } else if ((opcao == 'b') || (opcao == 'c') || (opcao == 'd')) {
                errou();
            }
        } while (opcao != 'a');

        //Questão 2
        do {
            System.out.println("*******Questão 2*******");
            System.out.println("De acordo com Graicunas, a formula para calcular o número total de relacionamentos é:");
            System.out.println("(a)D= B²-4*a*c\n(b)E= mc²\n(c)N(2n/2+n-1)\n(d)C= 2*II*R");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'c') {
                acertou();
            } else if ((opcao == 'b') || (opcao == 'd') || (opcao == 'a')) {
                errou();
            }
        } while (opcao != 'c');

        //Questão 3
        do {
            System.out.println("*******Questão 3*******");
            System.out.println("A palavra usada para indicar que a organização atinge seus objetivos é:");
            System.out.println("(a)Eficiência\n(b)Eficácia\n(c)Qualidade\n(d)Incompetência");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'a') {
                acertou();
            } else if ((opcao == 'b') || (opcao == 'd') || (opcao == 'c')) {
                errou();
            }
        } while (opcao != 'a');

        //Questão 4
        do {
            System.out.println("*******Questão 4*******");
            System.out.println("Eliminação de desperdício e fabricação com qualidade são princípios mais importante do sistema:");
            System.out.println("(a)Operacional\n(b)Java\n(c)Toyota\n(d)Japonês");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'd') {
                acertou();
            } else if ((opcao == 'b') || (opcao == 'c') || (opcao == 'a')) {
                errou();
            }
        } while (opcao != 'd');

        //Questão 5
        do {
            System.out.println("*******Questão 5*******");
            System.out.println("Planejar, organizar, controlar, executar é o mesmo que Administração?");
            System.out.println("(a)Sim\n(b)Não\n(c)Talvez\n(d)Em alguns casos");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'a') {
                acertou();
                System.out.println("Parabéns, você completou todos os desafios desta sala.");
            } else if ((opcao == 'b') || (opcao == 'c') || (opcao == 'd')) {
                errou();
            }
        } while (opcao != 'a');

    }

    public static void salaPreCalculo() {

        //Questão 1   
        do {
            System.out.println("***SALA DE PRÉ CÁLCULO***");
            System.out.println("*******Questão 1*******");
            System.out.println("A divisão de 1215 por -27 é igual a ?");
            System.out.println("(a)40\n(b)-45\n(c)-90\n(d)45");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
            opcaoInvalida();
            if (opcao == 'b') {
                acertou();
            } else if ((opcao == 'c') || (opcao == 'a') || (opcao == 'd')) {
                errou();
            }
        } while (opcao != 'b' && soma != 0);

        //Questão 2
        do {
            System.out.println("*******Questão 2*******");
            System.out.println("O resultado da fatoração de 2x²+2x+1 é igual a? ");
            System.out.println("(a)(y+1)²\n(b)x²\n(c)(x+1)²\n(d)1x²");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'c') {
                acertou();
            } else if ((opcao == 'b') || (opcao == 'd') || (opcao == 'a')) {
                errou();
            }
        } while (opcao != 'c');

        //Questão 3
        do {
            System.out.println("*******Questão 3*******");
            System.out.println("1680 representa 56% de um numero, qual é esse numero?");
            System.out.println("(a)3360\n(b)2000\n(c)3000\n(d)1680");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'c') {
                acertou();
            } else if ((opcao == 'b') || (opcao == 'd') || (opcao == 'a')) {
                errou();
            }
        } while (opcao != 'c');

        //Questão 4
        do {
            System.out.println("*******Questão 4*******");
            System.out.println("Qual a porcentagem em que 91 representa em 650?");
            System.out.println("(a)23%\n(b)13%\n(c)14%\n(d)19%");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'c') {
                acertou();
            } else if ((opcao == 'd') || (opcao == 'b') || (opcao == 'a')) {
                errou();
            }
        } while (opcao != 'c');

        //Questão 5
        do {
            System.out.println("*******Questão 5*******");
            System.out.println("Qual é o resultado da simplificação de 3x*(-x-1)-4(x²+x)?");
            System.out.println("(a)-7x²-7x\n(b)-6x²-6x\n(c)5x+6x²\n(d)-9x");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'a') {
                acertou();
                System.out.println("Parabéns, você completou todos os desafios desta sala.");
            } else if ((opcao == 'b') || (opcao == 'c') || (opcao == 'd')) {
                errou();
            }
        } while (opcao != 'a');

    }
    
    public static void salaFinal() {

        //Questão 1   
        do {
            System.out.println("***SALA FINAL***");
            System.out.println("*******Questão 1*******");
            System.out.println("Qual das alternativas demonstra apenas estruturas de repetição:");
            System.out.println("(a)while, if, if else\n(b)while, else, scanner\n(c)if, else if, else\n(d)while, do, do while");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'd') {
                acertou();
            } else if ((opcao == 'b') || (opcao == 'a') || (opcao == 'c')) {
                fatality();
            }
        } while (opcao != 'd');

        //Questão 2
        do {
            System.out.println("*******Questão 2*******");
            System.out.println("Qual das formas a seguir apresenta a escrita de uma função:");
            System.out.println("(a)import java.util.Scanner\n(b)System.out.println();\n(c)public static void main {}\n(d)switch (opção) {}");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'c') {
                acertou();
            } else if ((opcao == 'd') || (opcao == 'b') || (opcao == 'a')) {
                fatality();
            }
        } while (opcao != 'c');

        //Questão 3
        do {
            System.out.println("*******Questão 3*******");
            System.out.println("Qual das alternativas mostra apenas estruturas de decisão:");
            System.out.println("(a)while, if, System.out.println();\n(b)if, else, else if\n(c)while, do, switch\n(d)if, else, do");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'b') {
                acertou();
            } else if ((opcao == 'c') || (opcao == 'd') || (opcao == 'a')) {
                fatality();
            }
        } while (opcao != 'b');

        //Questão 4
        do {
            System.out.println("*******Questão 4*******");
            System.out.println("Qual das alternativas a seguir apresenta a forma correta de iniciar um vetor?");
            System.out.println("(a)import java.util.Scanner\n(b)float [] notas = {6.5, 7.0, 5.5, 9.0, 2.5};\n(c)public static void main\n(d)switch (opção) {}");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'b') {
                acertou();
            } else if ((opcao == 'd') || (opcao == 'c') || (opcao == 'a')) {
                fatality();
            }
        } while (opcao != 'b');

        //Questão 5
        do {
            System.out.println("*******Questão 5*******");
            System.out.println("qual das alternativas demonstra como declarar um matriz tridimensional");
            System.out.println("(a)int [][][] m = new int[2][4][7];\n(b)public static void\n(c)System.out.println\n(d)int [][] m = new int[8][8];");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'a') {
                acertou();
                System.out.println("Parabéns, você completou todos os desafios desta sala.");

            } else if ((opcao == 'b') || (opcao == 'c') || (opcao == 'd')) {
                fatality();
            }
        } while (opcao != 'a');

    }

    public static void instrucoes() {
        System.out.println("Para cada resposta correta você irá somar 2 pontos\n"
                + "Para cada resposta incorreta você irá perder 1 pontos\n"
                + "O jogo se inicia com um total de 5 pontos acumulados\n"
                + "Para ganhar o jogo é necessário coletar todos os emblemas e obter a pedra mágica para assim sair da escola");
    }

    public static void recorde() {
        System.out.println("O maior recorde atual foi de " + soma + " pontos!");
    }

    public static void creditos() {
        System.out.println("Alexandre dos Santos Mignon\n"
                + "Stelvio Henrique Ignazio Barboza\n"
                + "Keli Cristiane Vido\n"
                + "Ana Marta de Brito Borges Avelas de Araujo\n"
                + "Leonildo Carnevalli Junior\n"
                + "Raul Dias Paiva Junior");
    }

// Função responsável por validar a alternativa que o jogador escolheu, caso seja diferente das que ele possui, irá pedir para escolher novamente
    public static void opcaoInvalida() {
        while ((opcao != 'a') && (opcao != 'b') && (opcao != 'c') && (opcao != 'd')) {
            System.out.println("Resposta inválida, favor informar novamente a resposta");
            opcao = leitor.nextLine().toLowerCase().charAt(0);
        }
    }

//Função responsável por subtrair um ponto caso o jogar erra uma questão. 
//Se o total de pontos do jogador chegou a ZERO, a função encerrará o jogo.
    public static void errou() {
        soma = soma - 1;
        if (soma != 0) {
            PulaUmaLinha();
            System.out.println("Opção incoreta! Você perdeu 1 ponto.");
            System.out.println("Você possui " + soma + " pontos!");
            PulaUmaLinha();
        } else {
            PulaUmaLinha();
            System.out.println("Opção incoreta! Você perdeu 1 ponto.");
            System.out.println("Seus pontos chegaram a " + soma + " você perdeu!");
            System.exit(0);
        }
    }

//Função responsável por somar dois pontos caso o jogador acerte a questão
    public static void acertou() {
        PulaUmaLinha();
        System.out.println("Opção correta! Parabéns você somou 2 pontos.");
        soma = soma + 2;
        System.out.println("Você possui " + soma + " pontos!");
        PulaUmaLinha();
    }
    
//Função respomsável por zerar a pontuação do jogador caso ele erre qualquer questão da sala final!
    public static void fatality() {
        soma = soma - soma;
       
            PulaUmaLinha();
            System.out.println("Opção incoreta! Você perdeu todos seus pontos.");
            System.out.println("Seus pontos chegaram a " + soma + " você perdeu!");
            System.exit(0);
        
    }

//Funcao q pula uma linha
    public static void PulaUmaLinha() {
        System.out.print("\n");
    }
}
