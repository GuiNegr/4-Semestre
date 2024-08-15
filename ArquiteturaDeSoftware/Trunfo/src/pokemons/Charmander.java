package pokemons;


import cartas.Tipos.*;
import cartas.*;

public class Charmander  extends Pokemon {

    public Charmander() {
        super(80, 20, tipos.F);
    }

    public int bolaDeFogo(){
        return super.vida() / 2;
    }
}