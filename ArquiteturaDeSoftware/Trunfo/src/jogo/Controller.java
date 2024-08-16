package jogo;

import cartas.Pokemon;

public class Controller {

    public static void ataque(Pokemon j1, Pokemon j2){
        j2.defesa(j1.ataque());
    }

    public static void especial(Pokemon j1, Pokemon j2){
        j2.defesa(j1.special());
    }

    public static void defesa(Pokemon j1, Pokemon j2){
        j2.defesa(j1.ataque() / 4);
    }

    public static void ataqueEffective(Pokemon j1, Pokemon j2){
        j2.defesa(j1.ataque() * 2);
    }

    public static void especialEffective (Pokemon j1, Pokemon j2){
        j2.defesa(j1.special() * 2);
    }
    public static void defesaISEffective(Pokemon j1, Pokemon j2){
        j2.defesa(j1.ataque() / 8);
    }

}
