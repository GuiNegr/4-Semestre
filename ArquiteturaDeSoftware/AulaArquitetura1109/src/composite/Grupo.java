package composite;

import java.util.ArrayList;

public class Grupo implements Interacao {

    private ArrayList<Interacao> grupo;

    public Grupo(){
        grupo = new ArrayList<>();
        grupo.add(new Personagem(100));
        grupo.add(new Personagem(200));
    }

    @Override
    public void dano(int dano) {
        for(Interacao p : grupo){
            p.dano(dano);
        }
    }

    @Override
    public void cura(int cura) {
        for(Interacao p : grupo){
            p.cura(cura);
        }
    }

    @Override
    public int vida() {
        int v = 0;
        for(Interacao p : grupo){
            v += p.vida();
        }
        return v;
    }

    public Interacao getPersonagem(int id){
        return grupo.get(0);
    }

    public void addPersonagem(Interacao novo){
        grupo.add(novo);
    }

    public void printVidas(){
        for(Interacao p : grupo){
            System.out.println(p.vida());
        }
    }
}
