package jogo;

import cartas.Pokemon;
import pokemons.Bulbassauro;
import pokemons.Charmander;
import pokemons.Pikachu;
import pokemons.Squirtle;

public class ChoseCharacter {


    protected static Pokemon choseCharacter(int select){
        Pokemon playerSelect;
        return switch (select) {
            case 1 -> playerSelect = new Bulbassauro();
            case 2 -> playerSelect = new Charmander();
            case 3 -> playerSelect = new Pikachu();
            case 4 -> playerSelect = new Squirtle();
            default -> null;
        };
    }
}
