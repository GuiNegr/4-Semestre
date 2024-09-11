package composite;

public class Personagem implements Interacao {
    private int hp;

    public Personagem(int hp) {
        this.hp = hp;
    }

    @Override
    public void dano(int dano) {
        this.hp -= dano;
    }

    @Override
    public void cura(int cura) {
        this.hp += cura;
    }

    @Override
    public int vida() {
        return this.hp;
    }
}
