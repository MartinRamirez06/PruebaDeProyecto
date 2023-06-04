package org.example.modelo;

import org.example.persistencia.AnimalDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaAnimal implements TableModel {
    public static final int COLUMNS=6;
    private ArrayList<Animal> datos;
    private AnimalDAO adao;

    public ModeloTablaAnimal() {
        adao=new AnimalDAO();
        datos=new ArrayList<>();
    }

    public ModeloTablaAnimal(ArrayList<Animal> datos) {
        this.datos = datos;
        adao=new AnimalDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "NombreCientifico";
            case 3:
                return "TipoDeDieta";
            case 4:
                return "TamaDeEspecie";
            case 5:
                return "LinkImagen";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Animal tmp=datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getNombreCientifico();
            case 3:
                return tmp.getTipoDeDieta();
            case 4:
                return tmp.getTamaDeEspecie();
            case 5:
                return tmp.getLinkImagen();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int colIndex) {
        switch (colIndex){
            case 0:
                //datos.get(rowIndex).setId(0);
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setNombreCientifico((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setTipoDeDieta((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setTamaDeEspecie((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setLinkImagen((String) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try {
            ArrayList<Animal> tirar=adao.obtenerTodo();
            System.out.println(tirar);
            datos=adao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
    public boolean agregarAnimal(Animal animal){
        boolean resultado= false;
        try{
            if(adao.insertar(animal)){
                datos.add(animal);
                resultado=true;

            }else {
                resultado=false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
}