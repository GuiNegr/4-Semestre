package org.example.Model.service;

import org.example.Controller.Controller;
import org.example.Model.model.User;

import java.util.List;

public class VerificaBanco {

    public static boolean verifica(User user, List<User> users){
        return Controller.verifica(user,users);
    }
}
