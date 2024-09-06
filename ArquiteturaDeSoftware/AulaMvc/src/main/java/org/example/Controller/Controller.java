package org.example.Controller;

import org.example.Model.model.User;

import java.util.List;

public class Controller {
    public static boolean verifica(User user, List<User> users){
        return users.contains(user);
    }
}
