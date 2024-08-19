package jogo;
import cartas.Pokemon;

import java.util.*;

public class MenuEN {
    static private Scanner sc = new Scanner(System.in);

    protected static Pokemon MenuChooserCharacter(Pokemon player_one){
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("--PLEASE CHOSE YOUR CHARACTER-----------------");
        System.out.println("-1 TO CHOOSE BULBASSAURO---------------------");
        System.out.println("-2 TO CHOOSE CHARMANDER-----------------------");
        System.out.println("-3 TO CHOOSE PIKACHU--------------------------");
        System.out.println("-4 TO CHOOSE SQUIRTLE-------------------------");
        System.out.println("PLAYER MAKE YOUR DECISION ABOUT YOUR LIFE CHOISES NOW!");
        System.out.println("-----------------------------------------------");
        System.out.println();
        player_one = ChoseCharacter.choseCharacter(sc.nextInt());
        return player_one;
    }

    protected static int MenuChooserMoviments(){
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("--PLEASE CHOSE YOUR MOVIMENTS-----------------");
        System.out.println("-1 TO ATACK-----------------------------------");
        System.out.println("-2 TO DEFEND-----------------------------------");
        System.out.println("-3 TO DO SPECIAL MOVIMENT----------------------");
        System.out.println("PLAYER MAKE YOUR DECISION ABOUT YOUR LIFE CHOISES NOW!");
        System.out.println("-----------------------------------------------");
        System.out.println();
        return sc.nextInt();

    }

    protected static int turn(){
        System.out.println("PLAYER TURN");
        return MenuEN.MenuChooserMoviments();
    }
}
