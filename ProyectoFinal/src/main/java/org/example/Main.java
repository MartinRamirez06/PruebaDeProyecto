package org.example;

import org.example.Controlador.ControladorAnimal;
import org.example.Vista.VentanaAnimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaAnimal view=new VentanaAnimal("Proyecto Final");
        ControladorAnimal controller=new ControladorAnimal(view);

    }
}