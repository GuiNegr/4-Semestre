package jogo;

import cartas.Pokemon;
import java.util.*;
public class StarterMenu {

    public static void LanguageMenu(){

        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pokemon();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("WHERES YOUR LANGUAGE?");
        System.out.println("QUAL É A SUA LINGUAGEM?");
        System.out.println("1 - PARA PORTUGUÊS ");
        System.out.println("2 - PARA INGLÊS");
        int op = sc.nextInt();

        if (op == 1){
            JogoPTBR.gameTurn(p1,p2);
        }
        else if(op == 2){
            Game.gameTurn(p1,p2);
        }
        else {
            System.out.println("WRONG ANSWER");
        }
    }
}
