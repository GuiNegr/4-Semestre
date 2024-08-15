package pokemons;


import cartas.Pokemon;
import cartas.Tipos.*;

public class Bulbassauro extends Pokemon {

    public Bulbassauro() {
        super(40, 120, tipos.G);
    }

    public int chicote(){
        return super.vida() / 2;
    }

}
