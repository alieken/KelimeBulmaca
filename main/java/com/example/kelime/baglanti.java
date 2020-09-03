package com.example.kelime;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class baglanti {
    private String kullaniciadi = "root";
    private String parola = "";
    private String database_ismi = "bulmaca";
    private String host = "localhost";
   // private int port = 3306;
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public void baglanti() {
        //"jbdc:mysql://localhost:3306/prolab"
        String url = "jdbc:mysql://" + host + ":"+ "/" + database_ismi;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadi");
        }


        try {
            connection = DriverManager.getConnection(url, kullaniciadi, parola);
            System.out.println("Bağlantı basarili..");

        } catch (SQLException ex) {
            System.out.println("Baglanti basarisiz..!");
        }


    }
}
