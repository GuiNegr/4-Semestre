package org.example.Model.DAO;


import org.example.Model.model.User;

import java.awt.desktop.UserSessionEvent;
import java.util.ArrayList;
import java.util.List;

public class Database {
    List<User> banco;

    public Database() {
        this.banco = new ArrayList<User>();
    }

    public List<User> getBanco() {
        return banco;
    }

    public void setBanco(User user) {
        this.banco.add(user);
    }

    @Override
    public String toString() {
        return "Database{" +
                "banco=" + banco +
                '}';
    }
}
