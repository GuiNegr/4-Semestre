import cartas.*;
import jogo.Jogo;
import jogo.MenuEN;
import pokemons.Bulbassauro;
import pokemons.Pikachu;

public class Main {
    public static void main(String[] args) {

        Pokemon j1 = new Pokemon();
        Pokemon j2 = new Pokemon();

        Jogo.turno(j1,j2);
    }
}