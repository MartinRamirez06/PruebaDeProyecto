package org.example.persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionSingleton {
    private String baseDatos;
    public static conexionSingleton _instance;
    private Connection conection;

    private conexionSingleton(String database){
        this.baseDatos=database;
        try{
            conection= DriverManager.getConnection("jdbc:sqlite:Fauna_Marina.db");
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static conexionSingleton getInstance(String baseDatos){
        if (_instance==null){
            _instance=new conexionSingleton(baseDatos);

        }else {
            System.out.println("Ya fue creada");

        }
        return _instance;
    }

    public Connection getConection(){
        return conection;
    }
}