package cartas;
import cartas.Tipos.*;

public class Pokemon implements MetodoPokemon{
    private int atk;
    private int hp;
    private tipos type;



    public Pokemon(int atk, int hp, tipos type) {
        this.atk = atk;
        this.hp = hp;
        this.type = type;
    }



    @Override
    public void defesa(int dano) {
        this.hp = this.hp - dano;
    }

    @Override
    public int ataque() {
        return this.atk;
    }

    @Override
    public int vida() {
        return this.hp;
    }

    @Override
    public tipos tipo() {
        return this.type;
    }
}
