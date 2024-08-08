package Jogo;

import Cartas.*;

public class Jogo {

    private Carta jogador1;
    private Carta jogador2;

    public Jogo(Carta j1, Carta j2) {
        this.jogador1 = j1;
        this.jogador2 = j2;
    }

    public String tipoCarta(int j) {
        if (j == 1) {
            return jogador1.getClass().getCanonicalName();
        } else if (j == 2) {
            return jogador2.getClass().getCanonicalName();
        } else {
            return "Jogador não existe";
        }
    }

    public String tipoCarta(Carta j) {
        return j.getClass().getCanonicalName();
    }

    public int batalhaATK() {
        if (jogador1.getAtk() == jogador2.getAtk()) {
            return 0;
        } else if (jogador1.getAtk() > jogador2.getAtk()) {
            return 1;
        } else {
            return 2;
        }
    }
}
