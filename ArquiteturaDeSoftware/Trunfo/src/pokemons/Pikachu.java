package pokemons;

import cartas.*;
import cartas.Tipos.*;
public class Pikachu  extends Pokemon {

    public Pikachu() {
        super(30, 100, Tipos.ELETRICO, "THUNDER SHOCK");
    }

    public int choque(){
        return super.vida() / 2;
    }
}