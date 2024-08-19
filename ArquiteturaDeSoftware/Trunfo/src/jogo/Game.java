package jogo;

import cartas.*;

public class Game {

    static protected Pokemon player_one;
    static protected Pokemon player_two;

    private static void gameLogo() {
        System.out.println("---------------------------------------------------");
        System.out.println("---------WELCOME TO POKEMON LEGENDS JAVA-----------");
        System.out.println("-------FIRST ADO FROM ARQUITETURA DE SOFTWARE------");
        System.out.println("---------------------------------------------------");
    }

    protected static void gameTurn(Pokemon Player_one_OutClass, Pokemon Player_two_OutClass) {
        gameLogo();
        player_one = MenuEN.MenuChooserCharacter(Player_one_OutClass);
        player_two = MenuEN.MenuChooserCharacter(Player_two_OutClass);
        int[] choses = new int[2];

        while(player_one.vida() > 0 || player_two.vida() > 0){
            System.out.println("PLAYER ONE: "+player_one.getClass().getCanonicalName());
            System.out.println("| - - - - - - - - - - - - |");
            System.out.println("|"+player_one.vida()+"| HP - - - - - - - - |");
            System.out.println("| - - - - - - - - - - - - |");
            choses[0] = MenuEN.turn();
            if(choses[0] == 1 && choses[1] != 2){
                System.out.println("OH MY GOD THE "+player_one.getClass().getCanonicalName() +" ATACKS");
                if(Controller.isEffective(player_one,player_two)) {
                    Controller.ataque(player_one,player_two,2);
                    System.out.println("HE DID "+player_one.ataque() * 2 +" DMG");
                }
                else {
                    Controller.ataque(player_one, player_two);
                    System.out.println("HE DID " + player_one.ataque() + " DMG");
                }
            }
            else if (choses[0] == 3){
                System.out.println("PLAYER ONE DID "+player_one.nameSpecial());
                if(Controller.isEffective(player_one,player_two)) {
                    Controller.especial(player_one,player_two,2);
                    System.out.println("HE DID "+player_one.ataque() * 2 +" DMG");
                }
                else {
                    Controller.especial(player_one, player_two);
                    System.out.println("HE DID " + player_one.ataque() + " DMG");
                }

            }


            System.out.println("PLAYER TWO: "+player_two.getClass().getCanonicalName());
            System.out.println("| - - - - - - - - - - - - |");
            System.out.println("|"+player_two.vida()+"| HP - - - - - - - - |");
            System.out.println("| - - - - - - - - - - - - |");
            choses[1] = MenuEN.turn() ;
            if(choses[1] == 1 && choses[0] != 2) {
                System.out.println("OH MY GOD THE "+player_two.getClass().getCanonicalName() +" ATACKS");
                if(Controller.isEffective(player_two,player_one)) {
                    Controller.ataque(player_two,player_one,2);
                    System.out.println("HE DID "+player_two.ataque() * 2 +" DMG");
                }
                else {
                    Controller.ataque(player_two , player_one);
                    System.out.println("HE DID " + player_two.ataque() + " DMG");
                }
            }
            else if (choses[1] == 3){
                System.out.println("PLAYER ONE DID "+player_two.special());
                if(Controller.isEffective(player_two,player_one)) {
                    Controller.especial(player_two,player_one,2);
                    System.out.println("HE DID "+player_two.ataque() * 2 +" DMG");
                }
                else {
                    Controller.especial(player_two,player_one);
                    System.out.println("HE DID " + player_two.special());
                }
            }
            if(player_one.vida() < 0 || player_two.vida() < 0){
                break;
            }
        }

        if (player_one.vida() > 0 && player_two.vida() < 0){
            System.out.println("VICTORY "+player_one.getClass().getCanonicalName());
        }else if(player_two.vida() > 0 && player_one.vida() < 0){
            System.out.println("VICTORY "+player_two.getClass().getCanonicalName());
        }
        System.out.println("MADE BY GUILHERME NEGREIROS");
    }
    }

