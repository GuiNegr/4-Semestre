package cartas;
import cartas.Tipos.*;

public class Pokemon implements MetodoPokemon{
    private int atk;
    private int hp;
    private Tipos type;
    private String special;

    public Pokemon() {
    }

    public Pokemon(int atk, int hp, Tipos type,String special) {
        this.atk = atk;
        this.hp = hp;
        this.type = type;
        this.special = special;
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
    public Tipos tipo() {
        return this.type;
    }
    @Override
    public int special(){

        return this.hp / 2;
    }
    public String nameSpecial(){
        return this.special;
    }
}
