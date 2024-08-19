package jogo;

import cartas.Pokemon;

import java.util.Scanner;

public class MenuPTBR {
    static private Scanner sc = new Scanner(System.in);

    public static Pokemon MenuChooserCharacter(Pokemon player_one){
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("--POR FAVOR ESCOLHA SEU POKEMON-----------------");
        System.out.println("-1 PARA O  BULBASSAURO---------------------");
        System.out.println("-2 PARA O  CHARMANDER-----------------------");
        System.out.println("-3 PARA O  PIKACHU--------------------------");
        System.out.println("-4 PARA O  SQUIRTLE-------------------------");
        System.out.println("POR FAVOR ESCOLHA A DECISÃO QUE VAI MUDAR SUA VIDA");
        System.out.println("-----------------------------------------------");
        System.out.println();
        player_one = ChoseCharacter.choseCharacter(sc.nextInt());
        return player_one;
    }

    public static int MenuChooserMoviments(){
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("--ESCOLHA SEUS MOVIMENTOS-----------------");
        System.out.println("-1 PARA ATACAR----------------------------------");
        System.out.println("-2 PARA DEFENDER-----------------------------------");
        System.out.println("-3 PARA FAZER O ESPECIAL----------------------");
        System.out.println("POR FAVOR ESCOLHA A DECISÃO QUE VAI MUDAR SUA VIDA");
        System.out.println("-----------------------------------------------");
        System.out.println();
        return sc.nextInt();

    }

    public static int turn(){
        System.out.println("TURNO DO PLAYER");
        return MenuPTBR.MenuChooserMoviments();
    }
}
