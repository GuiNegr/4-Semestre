package jogo;

import cartas.Pokemon;
import cartas.Tipos;

public class Controller {

    protected static void ataque(Pokemon j1, Pokemon j2,int effective){
        j2.defesa(j1.ataque() * effective);
    }

    protected static void especial(Pokemon j1, Pokemon j2,int effective){
        j2.defesa(j1.special() * effective);
    }

    protected static void defesa(Pokemon j1, Pokemon j2,int effective){
        j2.defesa(j1.ataque() / effective);
    }

    protected static void ataque(Pokemon j1, Pokemon j2){
        j2.defesa(j1.ataque());
    }

    protected static void especial(Pokemon j1, Pokemon j2){
        j2.defesa(j1.special() );
    }

    protected static void defesa(Pokemon j1, Pokemon j2){
        j2.defesa(j1.ataque() / 4);
    }




    protected static boolean isEffective(Pokemon j1, Pokemon j2){
        if(j1.tipo().equals(Tipos.AGUA) && j2.tipo().equals(Tipos.ELETRICO)){
            return true;
        }
        else if(j1.tipo().equals(Tipos.ELETRICO) && j2.tipo().equals(Tipos.FOGO)){
            return true;
        }
        else if(j1.tipo().equals(Tipos.FOGO) && j2.tipo().equals(Tipos.GRAMA)){
            return true;
        }
        else if (j1.tipo().equals(Tipos.GRAMA) && j2.tipo().equals(Tipos.AGUA)){
            return true;
        }
        else return false;
    }
}
