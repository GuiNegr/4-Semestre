package pokemons;


import cartas.Pokemon;
import cartas.Tipos.*;
public class Squirtle  extends Pokemon {

    public Squirtle() {
        super(90, 10, tipos.A);
    }

    public int agua(){
        return super.vida() / 2;
    }
}
