package models;

import java.util.ArrayList;

public class User {
    String username;
    private String password;
    ArrayList<Pin> pins;
    ArrayList<String> friends;
    boolean visible;

    public User(String username, String password, ArrayList<Pin> pins, ArrayList<String> friends, boolean visible){
        this.username = username;
        this.password = password;
        this.pins = pins;
        this.friends = friends;
        this.visible = visible;
    }

    public User(String username, String password, ArrayList<Pin> pins, ArrayList<String> friends){
        this.username = username;
        this.password = password;
        this.pins = pins;
        this.friends = friends;
    }
}
