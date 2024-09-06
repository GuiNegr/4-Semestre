package org.example.View.Interface;

import org.example.Model.DAO.Database;
import org.example.Model.model.User;
import org.example.Model.service.VerificaBanco;

import java.util.Scanner;

public class Interface {
    static Scanner sc = new Scanner(System.in);
    public static Database data;
    public Interface(){
        this.data = new Database();
    }

    public void cad(){
        String[] usera = new String[3];
        System.out.println("Informe seu login");
        usera[0] = sc.nextLine();
        System.out.println("informe uma senha");
        usera[1] = sc.nextLine();
        System.out.println("informe seu nome");
        usera[2] = sc.nextLine();
        User us = new User(usera[2],usera[0],usera[1]);
        if(!VerificaBanco.verifica(us,this.data.getBanco())){
            System.out.println("ta cadastrado pae");
            this.data.setBanco(us);
        }
    }

    public void login(){
        String[] usera = new String[3];
        System.out.println("Informe seu login");
        usera[0] = sc.nextLine();
        System.out.println("informe uma senha");
        usera[1] = sc.nextLine();
        System.out.println("informe seu nome");
        usera[2] = sc.nextLine();
        User us = new User(usera[2],usera[0],usera[1]);
        if(VerificaBanco.verifica(us,this.data.getBanco())){
            System.out.println("ta logado pae");
        }
    }
    public void taAMostrado(){
        System.out.println(this.data);
    }
}
