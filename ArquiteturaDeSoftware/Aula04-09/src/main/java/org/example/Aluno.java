package org.example;

public class Aluno {
    private  String nome;
    private  String ra;
    private volatile static Aluno aux;

    private Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public static Aluno getInstance(String nome,String ra){
        if(aux == null){
            aux = new Aluno(nome,ra);
        }
        return aux;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }


    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }
}
