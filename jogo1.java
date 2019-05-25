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

        do {
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
                case 'a':
                    inicio();
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

    public static void inicio() {
        System.out.print(" Bem vindo ao jogo RPG “Escola do Caos”,\n antes de mais nada, "
                + "nos informe qual será seu nome neste jogo: ");
        String nome = leitor.nextLine().toUpperCase();
        System.out.print("\n"
                + "Elfo\n"
                + "Mago\n"
                + "Besta\n"
                + "Humano\n"
                + "\nMuito bem " + nome + ", agora digite o personagem você deseja ser:");
        String personagem = leitor.nextLine().toUpperCase();
        while (!personagem.equals("ELFO") && !personagem.equals("MAGO") && !personagem.equals("BESTA") && !personagem.equals("HUMANO")) {
            System.out.print("Personagem inválido, digite um dos personagens acima: ");
            personagem = leitor.nextLine().toUpperCase();
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(nome + ", você é um " + personagem + ", que vive em uma terra misteriosa chamada "
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
                + "Há dois corredores para seguir\n");
        entrada();
        String escolha = leitor.nextLine().toLowerCase();

    }

public static void esquerda() {
        char escolha;
        do {
            System.out.print("Você segue em direção ao corredor da esquerda e há duas salas com a descrição.\n"
                    + "(a) ConceitosDeComputacao\n"
                    + "(b) Algoritmos\n"
                    + "(c) sair deste corredor e voltar para entrada principal que está trancada\n"
                    + "Onde você deseja ir? ");
            escolha = leitor.nextLine().toLowerCase().charAt(0);
            if (escolha == 'c') {
               retornoDisplayMessage ();
            }
            switch (escolha) {
                case 'a':
                    salaConceitosComputacao();
                    break;
                case 'b':
                    salaAlgoritmos();
                    break;
                default:
                    System.out.print("Você possui somente três opções: \n\ta) ConceitosDeComputacao \n\tb) Algoritmos \n\tc) sair desta sala"
                            + " e voltar para a entrada principal \n Digite apenas umas delas!");
                    escolha = leitor.nextLine().toLowerCase().charAt(0);
                    if (escolha == 'a') {
                        salaConceitosComputacao();
                    } else if (escolha == 'b') {
                        salaAlgoritmos();
                    } else if (escolha == 'c') {
                        retornoDisplayMessage ();
                    }

            }
        } while (escolha != 'c' && escolha != 'b' && escolha != 'a');
    }

    public static void entrada() {
        char escolha;
        do {
            System.out.println(" Corredor 'A' da esquerda ou corredor 'B' da direita qual deseja seguir, corredor A OU B");
            escolha = leitor.nextLine().toLowerCase().charAt(0);
            switch (escolha) {
                case 'a':
                    esquerda();
                    break;
                case 'b':
                    direita();
                    break;
                default:
                    System.out.println("Opção inválida! \n Digite qual corredor pretende seguir A OU B ?");
                    escolha = leitor.nextLine().toLowerCase().charAt(0);
                    if (escolha == 'a') {
                        esquerda();
                    } else if (escolha == 'b') {
                        direita();

                    }
            }

        } while (escolha != 'a' && escolha != 'b');
    }
public static void retornoDisplayMessage (){
    System.out.println("\n\tVoce voltou para a entrada principal e deve encontrar os emblemas que estão nos dois corredores");
                        entrada();
}
    public static void direita() {
        char escolha;
        do {
            System.out.print("Você segue em direção ao corredor da direita e há duas salas com a descrição.\n"
                    + "(a) precalculo\n"
                    + "(b) FundamentosdeADM\n"
                    + "(c) sair deste corredor e voltar para a entrada principal que está trancada\n"
                    + "Onde você deseja ir? ");
            escolha = leitor.nextLine().toLowerCase().charAt(0);

            if (escolha == 'c') {
                retornoDisplayMessage ();
            }

            switch (escolha) {
                case 'a':

                    break;
                case 'b':
                    salaFundamentos();
                    break;

                default:
                    System.out.print("Você possui somente três opções, \n\ta)pré-calculo \n\tb)ADM \n\tc)sair deste corredor.\n Digite apenas umas das três opcões: ");
                    escolha = leitor.nextLine().toLowerCase().charAt(0);
                    if (escolha == 'a') {
                        salaPreCalculo();
                    } else if (escolha == 'b') {
                        salaFundamentos();
                    } else if (escolha == 'c') {

                        retornoDisplayMessage ();
                    }
            }

        } while (escolha == 'a' && escolha == 'b' && escolha == 'c');
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
            System.out.println("(a)import java.util.Scanner\n(b)System.out.println();\n(c)static void (String x) {}\n(d)switch (opção) {}");
            System.out.print("Escolha a alternativa correta: ");
            opcao = leitor.nextLine().toLowerCase().charAt(0);

            opcaoInvalida();

            if (opcao == 'b') {
                acertou();
            } else if ((opcao == 'd') || (opcao == 'c') || (opcao == 'a')) {
                errou();
            }
        } while (opcao != 'b');

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
            System.out.println("RESPOSTA CORRETA B");
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
            System.out.println("RESPOSTA CORRETA A");
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

    public static void salaFundamentos() {

        //Questão 1   
        do {
            System.out.println("***SALA DE FUNDAMENTOS DE ADMINISTRAÇÃO***");
            System.out.println("*******Questão 1*******");
            System.out.println("Organizações existem há muitos e muitos anos atrás. Na pirâmide de Quéops, por exemplo, 100 mil pessoas foram empregadas para construi-la "
                    + "em apenas 20 anos. Administrar essa quantidade de empregados não é uma tarefa nada fácil não é mesmo? No entanto, pioneiros da escola clássica "
                    + "desenvolveram conceitos e técnicas para estruturar, controlar e organizar sua administração."
                    + "Os autores da escola clássica, responsável por sistematizar à administração, no século XX foram?");
            System.out.println("\t(a)Taylor, Ford e Max Webber\n\t(b)Ford, Taylor e Alexandre Magno\n\t(c)Dante, Ragnar e Pascoal\n\t(d)Ford e Taylor ");
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
            System.out.println("\t(a)Eficiência\n\t(b)Eficácia\n\t(c)Qualidade\n\t(d)Incompetência");
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
            System.out.println("\t(a)Operacional\n\t(b)Java\n\t(c)Toyota\n\t(d)Japonês");
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
            System.out.println("\t(a)Sim\n\t(b)Não\n\t(c)Talvez\n\t(d)Em alguns casos");
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
            System.out.println("\n");
            System.out.println("Opção incoreta! Você perdeu 1 ponto.");
            System.out.println("Você possui " + soma + " pontos!");
            System.out.println("\n");
        } else {
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
