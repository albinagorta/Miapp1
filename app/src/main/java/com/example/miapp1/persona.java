package com.example.miapp1;

public class persona {
    private  int  id;
    private  String usu,pass;

    public persona() {
    }

    public persona(int id, String usu, String pass) {
        this.id = id;
        this.usu = usu;
        this.pass = pass;
    }

    public persona(String usu, String pass) {
        this.usu = usu;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
