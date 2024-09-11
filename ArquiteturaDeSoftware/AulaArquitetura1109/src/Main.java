import composite.*;

public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();

        grupo.getPersonagem(0).dano(18);

        grupo.addPersonagem((Interacao) new Grupo());

        System.out.println(grupo.vida());

        Grupo grp2 = new Grupo();

        grp2.addPersonagem((Interacao) new Grupo());

        grupo.addPersonagem(grp2);

    }
}