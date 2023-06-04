package org.example.persistencia;

import org.example.modelo.Animal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AnimalDAO implements interfazDAO {
    public AnimalDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert="INSERT INTO FaunaMarina(Nombre,NombreCientifico,TipoDeDieta,TamaDeEspecie,LinkImagen) VALUES(?,?,?,?,?)";
        int rowCount=0;
        PreparedStatement pstm=conexionSingleton.getInstance("FaunaMarina.db").getConection().prepareStatement(sqlInsert);
        pstm.setString(1,((Animal)obj).getNombre());
        pstm.setString(2,((Animal)obj).getNombreCientifico());
        pstm.setString(3,((Animal)obj).getTipoDeDieta());
        pstm.setString(4,((Animal)obj).getTamaDeEspecie());
        pstm.setString(5,((Animal)obj).getLinkImagen());
        rowCount = pstm.executeUpdate();
        return rowCount>0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate="UPDATE FaunaMarina SET Nombre=?,NombreCientifico=?,TipoDeDieta=?,TamaDeEspecie=?,LinkImagen=? WHERE id=?;";
        int rowCount=0;
        PreparedStatement pstm=conexionSingleton.getInstance("Fauna_Marina.db").getConection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Animal)obj).getNombre());
        pstm.setString(2,((Animal)obj).getNombreCientifico());
        pstm.setString(3,((Animal)obj).getTipoDeDieta());
        pstm.setString(4,((Animal)obj).getTamaDeEspecie());
        pstm.setString(5,((Animal)obj).getLinkImagen());
        pstm.setInt(6,((Animal) obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount>0;
    }

    @Override
    public boolean delate(String id) throws SQLException {
        String sqlDelete="DELETE FROM FaunaMarina WHERE id=?; ";
        int rowCount=0;
        PreparedStatement pstm=conexionSingleton.getInstance("Fauna_Marina.db").getConection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount= pstm.executeUpdate();
        return rowCount>0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql= "SELECT * FROM FaunaMarina";
        ArrayList<Animal> resultado=new ArrayList<>();
        Statement stm= conexionSingleton.getInstance("Fauna_Marina.db").getConection().createStatement();
        ResultSet rst= stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Animal(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));
        }
        return resultado;
    }

    @Override
    public Object BuscarPorId(String id) throws SQLException {
        String sql= "SELECT * FROM FaunaMarina WHERE id=?;";
        Animal animal=null;
        PreparedStatement pstm= conexionSingleton.getInstance("Fauna_Marina.db").getConection().prepareStatement(sql);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet rst=pstm.executeQuery();
        if (rst.next()){
            animal =new Animal(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
            return animal;
        }
        return null;
    }
}