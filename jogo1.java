package jogo;

import java.util.Scanner;

public class jogo {

    static Scanner leitor = new Scanner(System.in);
    static String opcao;

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
            System.out.println("(C) Créditos");
            System.out.println("(D) Sair");
            System.out.println("***********");
            PulaUmaLinha();
            System.out.print("Digite a opção desejada: ");
            opcao = leitor.nextLine().toLowerCase();
            switch (opcao) {
                case "a":
                    controladora();
                    break;
                case "b":
                    instrucoes();
                    break;
                case "c":
                    creditos();
                    break;
                case "d":
                    System.out.println("Você Saiu!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (!opcao.equals("d"));
    }

    static void controladora() {
        int[]pontos =ponto();
        int[][] trancou = tranca();
        ContaHistoria(trancou, pontos);

    }

    public static void ContaHistoria(int[][] trancou, int[]pontos) {
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
                + "Para sair, encontre os 4 emblemas.\n"
                + "*****************************\n"
                + "*****************************\n"
                + "Olha com mais atenção na porta e percebe que há 4 espaços com formato octogonal vazios, como se faltasse algo!\n"
                + "Você precisa encontrar a pedra mágica e os cinco emblemas para salvar sua mãe!\n"
                + "\nHá dois corredores para seguir\n");

        int chave = ValidaChave(trancou);
        validaCorredor(trancou, chave, pontos);

    }

    public static void validaCorredor(int[][] trancou, int chave, int[]pontos) {
        System.out.print("\n(a) Esquerda\n(b) Direita\nQual você deseja seguir?");
        String escolha = leitor.nextLine().toLowerCase();
        PulaUmaLinha();
        while (!escolha.equals("a") && !escolha.equals("b")) {
            System.out.print("Você possui somente duas opções\n(a) Esquerda\n(b) Direita\nQual você deseja seguir?");
            escolha = leitor.nextLine().toLowerCase();
        }
        switch (escolha) {
            case "a":
                esquerda(trancou, chave, pontos);
                break;
            case "b":
                direita(trancou, chave, pontos);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public static void volta(int[][] trancou, int chave, int[]pontos) {
        System.out.println("\nVoce voltou para a entrada principal e deve encontrar os emblemas que estão nos dois corredores");
        validaCorredor(trancou, chave, pontos);
    }

// Função responsável por ler cada sala como matriz e iniciar o valor como 0.
    static int[][] tranca() {
        int[][] tranca = new int[2][2];
        tranca[0][0] = 0;
        tranca[0][1] = 0;
        tranca[1][0] = 0;
        tranca[1][1] = 0;
        return (tranca);
    }

// Função responsável por validar se a soma do vetor da função "tranca" for igual a 4, caso sim, o jogador será direcionado para a última sala de forma automática
    static int ValidaChave(int[][] trancou) {
        int junta = 0;
        int chave;
        for (int i = 0; i < trancou.length; i++) {
            for (int j = 0; j < trancou[i].length; j++) {
                junta += trancou[i][j];
            }
        }
        if (junta == 4) {
            chave = 4;
        } else {
            chave = 0;
        }
        return chave;
    }

    static int[][] esquerda(int[][] trancou, int chave, int[]pontos) {
        String escolha;
        do {
            System.out.print("\nVocê segue em direção ao corredor da esquerda e há duas salas com a descrição.\n"
                    + "(a) ConceitosDeComputacao\n"
                    + "(b) Algoritmos\n"
                    + "(c) sair deste corredor e voltar para a entrada principal que está trancada\n"
                    + "Onde você deseja ir? ");
            escolha = leitor.nextLine().toLowerCase();

            switch (escolha) {
                case "a":
                    chave = ValidaChave(trancou);
                    if (trancou[0][0] < 1) {
                        trancou[0][0]++;
                        salaConceitosComputacao(pontos);
                    } else if (chave == 4) {
                        salaFinal();
                    } else {
                        System.out.println("\n sala trancada \n");
                    }
                    break;
                case "b":
                    chave = ValidaChave(trancou);
                    if (trancou[0][1] < 1) {
                        trancou[0][1]++;
                        salaAlgoritmos(pontos);
                    } else if (chave == 4) {
                        salaFinal();
                    } else {
                        System.out.println("\n sala trancada \n");
                    }
                    break;
                case "c":
                    volta(trancou, chave, pontos);
                    break;
                default:
                    System.out.println("\nopção invalida!!");
            }
        } while (!escolha.equals("c"));
        return (trancou);
    }

    static int[][] direita(int[][] trancou, int chave, int[]pontos) {
        String escolha;
        do {
            System.out.print("\nVocê segue em direção ao corredor da direita e há duas salas com a descrição.\n"
                    + "(a) PreCalculo\n"
                    + "(b) FundamentosdeADM\n"
                    + "(c) sair deste corredor e voltar para a entrada principal que está trancada\n"
                    + "Onde você deseja ir? ");
            escolha = leitor.nextLine().toLowerCase();
            switch (escolha) {
                case "a":
                    chave = ValidaChave(trancou);
                    if (trancou[1][0] < 1) {
                        trancou[1][0]++;
                        salaPreCalculo(pontos);
                    } else if (chave == 4) {
                        salaFinal();
                    } else {
                        System.out.println("\n sala trancada \n");
                    }
                    break;
                case "b":
                    chave = ValidaChave(trancou);
                    if (trancou[1][1] < 1) {
                        trancou[1][1]++;
                        salaFundamentos(pontos);
                    } else if (chave == 4) {
                        salaFinal();
                    } else {
                        System.out.println("\n sala trancada \n");
                    }
                    break;
                case "c":
                    volta(trancou, chave, pontos);
                    break;
                default:
                    System.out.println("\nopção invalida!!");
            }
        } while (!escolha.equals("c"));
        return (trancou);
    }

    public static void salaConceitosComputacao(int[]pontos) {

        //Questão 1   
        do {
            System.out.println("***SALA DE CONCEITOS DE COMPUTAÇÃO***");
            System.out.println("*******Questão 1*******");
            System.out.println("O resultado da multiplicação dos números decimais 3 e 4  pode ser representado em hexadecimal pela letra:");
            System.out.println("(a)B\n(b)F\n(c)C\n(d)A");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("c")) {
                acertou(pontos);
            } else if ((opcao.equals("b")) || (opcao.equals("a")) || (opcao.equals("d"))) {
                errou(pontos);
            }
        } while (!opcao.equals("c"));

        //Questão 2
        do {
            System.out.println("*******Questão 2*******");
            System.out.println("A função “NÃO E” também pode ser escrita da seguinte forma:");
            System.out.println("(a)AND\n(b)NOR\n(c)OR\n(d)NAND");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("d")) {
                acertou(pontos);
            } else if ((opcao.equals("b")) || (opcao.equals("c")) || (opcao.equals("a"))) {
                errou(pontos);
            }
        } while (!opcao.equals("d"));

        //Questão 3
        do {
            System.out.println("*******Questão 3*******");
            System.out.println("Qual símbolo representa a função AND/E ?");
            System.out.println("(a)+\n(b)-\n(c)*\n(d)/");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("c")) {
                acertou(pontos);
            } else if ((opcao.equals("b")) || (opcao.equals("d")) || (opcao.equals("a"))) {
                errou(pontos);
            }
        } while (!opcao.equals("c"));

        //Questão 4
        do {
            System.out.println("*******Questão 4*******");
            System.out.println("Quanto vale em decimal o número binário 100000100?");
            System.out.println("(a)254\n(b)260\n(c)256\n(d)512");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("b")) {
                acertou(pontos);
            } else if ((opcao.equals("d")) || (opcao.equals("c")) || (opcao.equals("a"))) {
                errou(pontos);
            }
        } while (!opcao.equals("b"));

        //Questão 5
        do {
            System.out.println("*******Questão 5*******");
            System.out.println("Qual símbolo representa a função OR/OU ?");
            System.out.println("(a)+\n(b)*\n(c)-\n(d)/");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("a")) {
                acertou(pontos);
                System.out.println("Parabéns, você completou todos os desafios desta sala e encontrou um emblema!");
            } else if ((opcao.equals("b")) || (opcao.equals("c")) || (opcao.equals("d"))) {
                errou(pontos);
            }
        } while (!opcao.equals("a"));

    }

    public static void salaAlgoritmos(int[]pontos) {

        //Questão 1   
        do {
            System.out.println("***SALA DE ALGORÍTIMOS E PROGRAMAÇÃO***");
            System.out.println("*******Questão 1*******");
            System.out.println("Qual das alternativas demonstra apenas estruturas de repetição:");
            System.out.println("(a)while, if, if else\n(b)while, else, scanner\n(c)if, else if, else\n(d)while, do, do while");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("d")) {
                acertou(pontos);
            } else if ((opcao.equals("b")) || (opcao.equals("a")) || (opcao.equals("c"))) {
                errou(pontos);
            }
        } while (!opcao.equals("d"));

        //Questão 2
        do {
            System.out.println("*******Questão 2*******");
            System.out.println("Qual das formas a seguir apresenta a escrita de uma função que imprime:");
            System.out.println("(a)import java.util.Scanner\n(b)System.out.println();\n(c)public static void main {}\n(d)switch (opção) {}");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("b")) {
                acertou(pontos);
            } else if ((opcao.equals("d")) || (opcao.equals("c")) || (opcao.equals("a"))) {
                errou(pontos);
            }
        } while (!opcao.equals("b"));

        //Questão 3
        do {
            System.out.println("*******Questão 3*******");
            System.out.println("Qual das alternativas mostra apenas estruturas de decisão:");
            System.out.println("(a)while, if, System.out.println();\n(b)if, else, else if\n(c)while, do, switch\n(d)if, else, do");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("b")) {
                acertou(pontos);
            } else if ((opcao.equals("c")) || (opcao.equals("d")) || (opcao.equals("a"))) {
                errou(pontos);
            }
        } while (!opcao.equals("b"));

        //Questão 4
        do {
            System.out.println("*******Questão 4*******");
            System.out.println("Qual das alternativas a seguir apresenta a forma correta de iniciar um vetor?");
            System.out.println("(a)import java.util.Scanner\n(b)float [] notas = {6.5, 7.0, 5.5, 9.0, 2.5};\n(c)public static void main\n(d)switch (opção) {}");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("b")) {
                acertou(pontos);
            } else if ((opcao.equals("d")) || (opcao.equals("c")) || (opcao.equals("a"))) {
                errou(pontos);
            }
        } while (!opcao.equals("b"));

        //Questão 5
        do {
            System.out.println("*******Questão 5*******");
            System.out.println("qual das alternativas demonstra como declarar uma matriz tridimensional");
            System.out.println("(a)int [][][] m = new int[2][4][7];\n(b)public static void\n(c)System.out.println\n(d)int [][] m = new int[8][8];");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("a")) {
                acertou(pontos);
                System.out.println("Parabéns, você completou todos os desafios desta sala e encontrou um emblema!.");

            } else if ((opcao.equals("b")) || (opcao.equals("c")) || (opcao.equals("d"))) {
                errou(pontos);
            }
        } while (!opcao.equals("a"));

    }

    public static void salaFundamentos(int[]pontos) {

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
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("a")) {
                acertou(pontos);
            } else if ((opcao.equals("b")) || (opcao.equals("c")) || (opcao.equals("d"))) {
                errou(pontos);
            }
        } while (!opcao.equals("a"));

        //Questão 2
        do {
            System.out.println("*******Questão 2*******");
            System.out.println("De acordo com Graicunas, a formula para calcular o número total de relacionamentos é:");
            System.out.println("(a)D= B²-4*a*c\n(b)E= mc²\n(c)N(2n/2+n-1)\n(d)C= 2*II*R");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("c")) {
                acertou(pontos);
            } else if ((opcao.equals("b")) || (opcao.equals("d")) || (opcao.equals("a"))) {
                errou(pontos);
            }
        } while (!opcao.equals("c"));

        //Questão 3
        do {
            System.out.println("*******Questão 3*******");
            System.out.println("A palavra usada para indicar que a organização atinge seus objetivos é:");
            System.out.println("(a)Eficiência\n(b)Eficácia\n(c)Qualidade\n(d)Incompetência");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("a")) {
                acertou(pontos);
            } else if ((opcao.equals("b")) || (opcao.equals("c")) || (opcao.equals("d"))) {
                errou(pontos);
            }
        } while (!opcao.equals("a"));

        //Questão 4
        do {
            System.out.println("*******Questão 4*******");
            System.out.println("Eliminação de desperdício e fabricação com qualidade são princípios mais importante do sistema:");
            System.out.println("(a)Operacional\n(b)Java\n(c)Toyota\n(d)Japonês");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("d")) {
                acertou(pontos);
            } else if ((opcao.equals("b")) || (opcao.equals("c")) || (opcao.equals("a"))) {
                errou(pontos);
            }
        } while (!opcao.equals("d"));

        //Questão 5
        do {
            System.out.println("*******Questão 5*******");
            System.out.println("Planejar, organizar, controlar, executar é o mesmo que Administração?");
            System.out.println("(a)Sim\n(b)Não\n(c)Talvez\n(d)Em alguns casos");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("a")) {
                acertou(pontos);
                System.out.println("Parabéns, você completou todos os desafios desta sala e encontrou um emblema!.");
            } else if ((opcao.equals("b")) || (opcao.equals("c")) || (opcao.equals("d"))) {
                errou(pontos);
            }
        } while (!opcao.equals("a"));

    }

    public static void salaPreCalculo(int[]pontos) {

        //Questão 1   
        do {
            System.out.println("***SALA DE PRÉ CÁLCULO***");
            System.out.println("*******Questão 1*******");
            System.out.println("A divisão de 1215 por -27 é igual a ?");
            System.out.println("(a)40\n(b)-45\n(c)-90\n(d)45");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();
            opcaoInvalida();
            if (opcao.equals("b")) {
                acertou(pontos);
            } else if ((opcao.equals("c")) || (opcao.equals("a")) || (opcao.equals("d"))) {
                errou(pontos);
            }
        } while (!opcao.equals("b"));

        //Questão 2
        do {
            System.out.println("*******Questão 2*******");
            System.out.println("O resultado da fatoração de 2x²+2x+1 é igual a? ");
            System.out.println("(a)(y+1)²\n(b)x²\n(c)(x+1)²\n(d)1x²");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("c")) {
                acertou(pontos);
            } else if ((opcao.equals("b")) || (opcao.equals("d")) || (opcao.equals("a"))) {
                errou(pontos);
            }
        } while (!opcao.equals("c"));

        //Questão 3
        do {
            System.out.println("*******Questão 3*******");
            System.out.println("1680 representa 56% de um numero, qual é esse numero?");
            System.out.println("(a)3360\n(b)2000\n(c)3000\n(d)1680");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("c")) {
                acertou(pontos);
            } else if ((opcao.equals("b")) || (opcao.equals("d")) || (opcao.equals("a"))) {
                errou(pontos);
            }
        } while (!opcao.equals("c"));

        //Questão 4
        do {
            System.out.println("*******Questão 4*******");
            System.out.println("Qual a porcentagem em que 91 representa em 650?");
            System.out.println("(a)23%\n(b)13%\n(c)14%\n(d)19%");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("c")) {
                acertou(pontos);
            } else if ((opcao.equals("b")) || (opcao.equals("d")) || (opcao.equals("a"))) {
                errou(pontos);
            }
        } while (!opcao.equals("c"));

        //Questão 5
        do {
            System.out.println("*******Questão 5*******");
            System.out.println("Qual é o resultado da simplificação de 3x*(-x-1)-4(x²+x)?");
            System.out.println("(a)-7x²-7x\n(b)-6x²-6x\n(c)5x+6x²\n(d)-9x");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase();

            opcaoInvalida();

            if (opcao.equals("a")) {
                acertou(pontos);
                System.out.println("Parabéns, você completou todos os desafios desta sala e encontrou um emblema!.");
            } else if ((opcao.equals("b")) || (opcao.equals("c")) || (opcao.equals("d"))) {
                errou(pontos);
            }
        } while (!opcao.equals("a"));

    }

    public static void salaFinal() {

        System.out.println("***FINAL***");
        System.out.println("*******************");
        System.out.println("Após sair da última sala e juntar os 4 emblemas, você encontrou a tão procurada pedra com poderes curativos mágicos.\n"
                + "Você se aproxima do portão da entrada, encaixa os 4 emblemas nele e então a porta se abre.\n"
                + "Retorna a sua casa e percebe que sua mãe já havia falecido durante sua ausência :´( \n"
                + "FIM!");

        menu();

    }

    public static void instrucoes() {
        System.out.println("\nPara cada resposta correta você irá somar 1 ponto\n"
                + "Para cada resposta incorreta você irá perder 2 pontos\n"
                + "O jogo se inicia com um total de 5 pontos acumulados\n"
                + "Para ganhar o jogo é necessário coletar todos os emblemas e obter a pedra mágica para assim sair da escola");
    }

    public static void creditos() {
        System.out.println("\nLohan Yochinori Petermann Yugue\n"
                + "Rubens Liparelli Ricci\n"
                + "Lukas Matias Peireira\n"
                + "Leonardo Piccolo Motta\n"
                + "Alexandre dos Santos Mignon\n"
                + "Leonildo Carnevalli Junior\n"
                + "Stelvio Henrique Ignazio Barboza\n"
                + "Keli Cristiane Vido\n"
                + "Ana Marta de Brito Borges Avelas de Araujo\n"
                + "Raul Dias Paiva Junior");
    }

// Função responsável por validar a alternativa que o jogador escolheu, caso seja diferente das que ele possui, irá pedir para escolher novamente
    public static void opcaoInvalida() {
        while (!opcao.equals("a") && !opcao.equals("b") && !opcao.equals("c") && !opcao.equals("d")) {
            System.out.print("Resposta inválida, favor informar novamente a resposta: ");
            opcao = leitor.nextLine().toLowerCase();
        }
    }

//Função responsável por subtrair dois pontos caso o jogar erra uma questão. 
//Se o total de pontos do jogador chegou a ZERO, a função encerrará o jogo.
    public static void errou(int[]pontos) {
        pontos[0] = pontos[0] - 2;
        if (pontos[0] > 0) {
            PulaUmaLinha();
            System.out.println("Opção incoreta! Você perdeu 2 ponto.");
            System.out.println("Você possui " + pontos[0] + " pontos!");
            PulaUmaLinha();
        } else {
            PulaUmaLinha();
            System.out.println("Opção incoreta! Você perdeu 2 pontos.");
            System.out.println("Seus pontos chegaram a " + pontos[0] + " você perdeu!");
            System.exit(0);
        }
    }

//Função responsável por somar um ponto caso o jogador acerte a questão
    public static void acertou(int[]pontos) {
        PulaUmaLinha();
        System.out.println("Opção correta! Parabéns você somou 1 ponto.");
        pontos[0] = pontos[0] + 1;
        System.out.println("Você possui " + pontos[0] + " pontos!");
        PulaUmaLinha();
    }

//Funcao q pula uma linha
    public static void PulaUmaLinha() {
        System.out.print("\n");
    }


static int[] ponto (){
int []ponto=new int [1];
ponto [0]=5;
return ponto;
}
}
