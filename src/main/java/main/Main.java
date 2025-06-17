package main;

import hibernate.Connection;

public class Main {

    public static void main(String[] args) {
        Connection.initialize();
        Connection.addCity("Oudenaarde", "BEL", "Oost-Vlaanderen", 25000);
        Connection.listCity();
    }
}