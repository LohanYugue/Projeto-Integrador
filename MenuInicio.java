package game;

import java.util.Scanner;

// menu inicial
public class MenuInicio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println(" ___                   _               _                                ");
        System.out.println("| __|  ___  __   ___  | |  __ _     __| |  ___     __   __ _   ___   ___");
        System.out.println("| _|  (_-< / _| / _ \\ | | / _` |   / _` | / _ \\   / _| / _` | / _ \\ (_-<");
        System.out.println("|___| /__/ \\__| \\___/ |_| \\__,_|   \\__,_| \\___/   \\__| \\__,_| \\___/ /__/");

        System.out.println("a)Jogar");
        hgdhkffkkkk
        System.out.println("b)Sair");
        char inicio = leitor.nextLine().toLowerCase().charAt(0);
        while ((inicio != 'a') && (inicio != 'b')) {
            System.out.println("a)Jogar");
            System.out.println("b)Sair");
            inicio = leitor.nextLine().toLowerCase().charAt(0);
        }
        switch (inicio) {
            case 'a'://colocar o jogo aqui
                break;
            case 'b':
                System.out.println("voce saiu");
                break;

        }
    }
}
