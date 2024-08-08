import Jogo.*;
import Cartas.*;

public class Main {
    public static void main(String[] args) {

        Carta j1 = new Bulbassauro();
        Carta j2 = new Pikachu();

        Jogo pokemon = new Jogo(j1 , j2);
        System.out.println(pokemon.batalhaATK());
    }
}