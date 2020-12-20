package Server;

import java.sql.*;
import java.util.ArrayList;

public class JavaMySQL {
    Persone persone = new Persone();

    public ArrayList<Persona> getResult() {
        try {
            //create my mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ServerPersone?user=root&password=Lorenzo02&serverTimezone=Europe/Rome"); //connection to server 
            Statement statement = conn.createStatement();

            String query = "SELECT Persone.* FROM Persone";

            ResultSet rs = statement.executeQuery(query); 

            while(rs.next()) {
                String nome = rs.getString("nome");
                String cognome = rs.getString("cognome");
                Persona p = new Persona(nome, cognome);
                persone.addPersona(p);
            }
        }catch(ClassNotFoundException | SQLException ex) {
            System.out.println("Errore db");
            ex.toString();
        }
        System.out.println(persone.toString());
        return persone.getArrayPersone();
    }
}
