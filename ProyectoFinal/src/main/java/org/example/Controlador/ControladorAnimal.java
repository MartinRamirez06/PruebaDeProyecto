package org.example.Controlador;

import org.example.Vista.VentanaAnimal;
import org.example.modelo.Animal;
import org.example.modelo.ModeloTablaAnimal;


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorAnimal extends MouseAdapter {
    private VentanaAnimal view;
    private ModeloTablaAnimal modelo;


    public ControladorAnimal(VentanaAnimal view) {
        this.view = view;
        modelo=new ModeloTablaAnimal();
        this.view.getTblAnimal().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==this.view.getBtnCargar()){
            modelo.cargarDatos();
            this.view.getTblAnimal().setModel(modelo);
            this.view.getTblAnimal().updateUI();
        }

        if (e.getSource()==this.view.getBtnAgregar()){
            Animal animal=new Animal();
            animal.setId(0);
            animal.setNombre(this.view.getTxtNombre().getText());
            animal.setNombreCientifico(this.view.getTxtNombreCientifico().getText());
            animal.setTipoDeDieta(this.view.getTxtTipoDeDieta().getText());
            animal.setTamaDeEspecie(this.view.getTxtTamaDeEspecie().getText());
            animal.setLinkImagen(this.view.getTxtLinkImagen().getText());
            if(modelo.agregarAnimal(animal)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblAnimal().updateUI();
            }else {
                JOptionPane.showMessageDialog(view,"No se pudo agregar a la base de datos.Por favor revise su conexion","Error al insertar",JOptionPane.ERROR_MESSAGE);
            }
        }
        this.view.limpiar();
    }
}
