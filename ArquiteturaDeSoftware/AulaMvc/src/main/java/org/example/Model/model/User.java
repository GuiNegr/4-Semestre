package org.example.Model.model;

import java.util.Objects;

public class User {
    private String user;
    private String senha;
    private String nome;

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return Objects.equals(user, user1.user) && Objects.equals(senha, user1.senha) && Objects.equals(nome, user1.nome);
    }



    @Override
    public int hashCode() {
        return Objects.hash(user, senha, nome);
    }

    public User(String user, String senha, String nome) {
        this.user = user;
        this.senha = senha;
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
