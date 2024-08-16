package jogo;

import cartas.*;

public class Jogo  {

    static protected Pokemon player_one;
    static protected Pokemon player_two;
    
    public static void JogoInitializer(){
        System.out.println("---------------------------------------------------");
        System.out.println("---------WELCOME TO POKEMON LEGENDS JAVA-----------");
    }

    public static void teste(){
        System.out.println(player_one.getClass().getCanonicalName());
        System.out.println(player_two.getClass().getCanonicalName());
    }

    // COLOCAR OS TIPOS
    public static void turno(Pokemon Player_one_OutClass, Pokemon Player_two_OutClass){
        JogoInitializer();
        player_one = MenuEN.MenuChooserCharacter(Player_one_OutClass);
        player_two = MenuEN.MenuChooserCharacter(Player_two_OutClass);
        int[] choses = new int[2];
        while(player_one.vida() > 0 || player_two.vida() > 0){
            try{
                System.out.println("PLAYER ONE: "+player_one.getClass().getCanonicalName());
                System.out.println("| - - - - - - - - - - - - |");
                System.out.println("|"+player_one.vida()+"| HP - - - - - - - - |");
                System.out.println("| - - - - - - - - - - - - |");
                choses[0] = MenuEN.turn();
                if(choses[0] == 1 && choses[1] != 2){
                    System.out.println("OH MY GOD THE "+player_one.getClass().getCanonicalName() +" ATACKS");
                    Controller.ataque(player_one,player_two);
                    System.out.println("HE DID "+player_one.ataque()+" DMG");

                }
                else if (choses[0] == 2){
                    System.out.println("PLAYER DEFEND ATACK");
                    Controller.defesa(player_one,player_two);
                }
                else if (choses[0] == 3){
                    System.out.println("PLAYER ONE DID "+player_one.nameSpecial());
                    Controller.especial(player_one,player_two);
                }


                System.out.println("PLAYER TWO: "+player_two.getClass().getCanonicalName());
                System.out.println("| - - - - - - - - - - - - |");
                System.out.println("|"+player_two.vida()+"| HP - - - - - - - - |");
                System.out.println("| - - - - - - - - - - - - |");
                choses[1] = MenuEN.turn() ;
                if(choses[1] == 1 && choses[0] != 2) {
                    System.out.println("OH MY GOD THE "+player_two.getClass().getCanonicalName() +" ATACKS");
                    Controller.ataque(player_two,player_one);
                }
                else if (choses[1] == 3){
                    System.out.println("PLAYER ONE DID "+player_two.special());
                    Controller.especial(player_two,player_one);
                }
                if(player_one.vida() < 0 || player_two.vida() < 0){
                    break;
                }
            } catch (Exception e) {
                //só pra utilizar o catch, já que possivelmente a logica da defesa nao funcionaria de primeira, porque
                //de primeira o choses[1] vai ser 0
            }
        }
    }
}
