
package jogo;

import java.util.Scanner;

public class questoes {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        char op;
        System.out.println("1-Organizações existem há muitos e muitos anos atrás."
        + " Na pirâmide de Quéops, por exemplo, 100 mil pessoas foram "
        + "empregadas para \nconstrui-la em apenas 20 anos. Administrar "
        + "essa quantidade de empregados não é uma tarefa nada fácil não é mesmo?\n"
        + "No entanto, pioneiros da escola clássica desenvolveram c"
        + "onceitos e técnicas para estruturar, controlar e organizar "
        + "sua administração.\n" + "Os autores da escola clássica, "
        + "responsável por sistematizar à administração, no século XX foram?\n\n"
        + "a)Taylor, Ford e Max Webber\n" +
        "b)Ford, Taylor e Alexandre Magno\n" +
        "c)Dante, Ragnar e Pascoal\n" +
        "d)Ford e Taylor \n" +
        "e)Fernandinho Beira-Mar, Temer e Bolsonaro");
        op = leitor.nextLine().toLowerCase().charAt(0);
        while (( op != 'a') && (op != 'b') && (op != 'c') && (op != 'd'))
        if (op == 'd') {
            System.out.println("Correto!");
        }
        else {
            System.out.println("errado!");
        }
    }
}
