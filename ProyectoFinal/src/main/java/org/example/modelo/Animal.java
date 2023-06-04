package org.example.modelo;

public class Animal {
    private int id;
    private String Nombre;
    private String NombreCientifico;
    private String TipoDeDieta;
    private String TamaDeEspecie;
    private String LinkImagen;

    public Animal() {
    }

    public Animal(int anInt, String string, String rstString) {
    }

    public Animal(int id, String nombre, String nombreCientifico, String tipoDeDieta, String tamaDeEspecie, String linkImagen) {
        this.id = id;
        Nombre = nombre;
        NombreCientifico = nombreCientifico;
        TipoDeDieta = tipoDeDieta;
        TamaDeEspecie = tamaDeEspecie;
        LinkImagen = linkImagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNombreCientifico() {
        return NombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        NombreCientifico = nombreCientifico;
    }

    public String getTipoDeDieta() {
        return TipoDeDieta;
    }

    public void setTipoDeDieta(String tipoDeDieta) {
        TipoDeDieta = tipoDeDieta;
    }

    public String getTamaDeEspecie() {
        return TamaDeEspecie;
    }

    public void setTamaDeEspecie(String tamaDeEspecie) {
        TamaDeEspecie = tamaDeEspecie;
    }

    public String getLinkImagen() {
        return LinkImagen;
    }

    public void setLinkImagen(String linkImagen) {
        LinkImagen = linkImagen;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", NombreCientifico='" + NombreCientifico + '\'' +
                ", TipoDeDieta='" + TipoDeDieta + '\'' +
                ", TamaDeEspecie='" + TamaDeEspecie + '\'' +
                ", LinkImagen='" + LinkImagen + '\'' +
                '}';
    }
}
