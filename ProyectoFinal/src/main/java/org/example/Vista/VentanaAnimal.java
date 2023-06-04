package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaAnimal extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblNombreCientifico;
    private JLabel lblTipoDeDieta;
    private JLabel lblTamaDeEspecie;
    private JLabel lblLinkImagen;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtNombreCientifico;
    private JTextField txtTipoDeDieta;
    private JTextField txtTamaDeEspecie;
    private JTextField txtLinkImagen;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JTable TblAnimal;
    private JPanel panel1;//Formulario para captura los datos
    private JPanel panel2;//Mostrar el formulario
    private JPanel panel3;//Imagen
    private JPanel panel4;
    public VentanaAnimal(String title) throws HeadlessException {
        super(title);
        this.setSize(1000,800);
        layout=new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1=new JPanel(new FlowLayout());
        panel1.setBackground(new Color(239,200,200));
        lblId=new JLabel("Id:");
        lblNombre=new JLabel("Nombre Casual:");
        lblNombreCientifico=new JLabel("Nombre Cientifico:");
        lblTipoDeDieta=new JLabel("Tipo de Dieta:");
        lblTamaDeEspecie=new JLabel("Altura de la especie:");
        lblLinkImagen=new JLabel("Link de Imagen:");
        txtId=new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);//Para que no se pueda usar este control
        txtNombre=new JTextField(15);
        txtNombreCientifico=new JTextField(15);
        txtTipoDeDieta=new JTextField(10);
        txtTamaDeEspecie=new JTextField(10);
        txtLinkImagen=new JTextField(45);
        btnAgregar=new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblNombreCientifico);
        panel1.add(txtNombreCientifico);
        panel1.add(lblTipoDeDieta);
        panel1.add(txtTipoDeDieta);
        panel1.add(lblTamaDeEspecie);
        panel1.add(txtTamaDeEspecie);
        panel1.add(lblLinkImagen);
        panel1.add(txtLinkImagen);
        panel1.add(btnAgregar);
        //panel2
        panel2=new JPanel(new FlowLayout());
        panel2.setBackground(new Color(209,241,141));
        btnCargar=new JButton("Cargar");
        panel2.add(btnCargar);
        TblAnimal=new JTable();
        scrollPane=new JScrollPane();
        panel2.add(TblAnimal);
        panel2.add(scrollPane);

        //panel3
        panel3=new JPanel(new FlowLayout());
        panel3.setBackground(new Color(200,239,232));
        //panel4
        panel4=new JPanel(new FlowLayout());
        panel4.setBackground(new Color(213,200,239));


        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);


    }
    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblNombreCientifico() {
        return lblNombreCientifico;
    }

    public void setLblNombreCientifico(JLabel lblNombreCientifico) {
        this.lblNombreCientifico = lblNombreCientifico;
    }

    public JLabel getLblTipoDeDieta() {
        return lblTipoDeDieta;
    }

    public void setLblTipoDeDieta(JLabel lblTipoDeDieta) {
        this.lblTipoDeDieta = lblTipoDeDieta;
    }

    public JLabel getLblTamaDeEspecie() {
        return lblTamaDeEspecie;
    }

    public void setLblTamaDeEspecie(JLabel lblTamaDeEspecie) {
        this.lblTamaDeEspecie = lblTamaDeEspecie;
    }

    public JLabel getLblLinkImagen() {
        return lblLinkImagen;
    }

    public void setLblLinkImagen(JLabel lblLinkImagen) {
        this.lblLinkImagen = lblLinkImagen;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtNombreCientifico() {
        return txtNombreCientifico;
    }

    public void setTxtNombreCientifico(JTextField txtNombreCientifico) {
        this.txtNombreCientifico = txtNombreCientifico;
    }

    public JTextField getTxtTipoDeDieta() {
        return txtTipoDeDieta;
    }

    public void setTxtTipoDeDieta(JTextField txtTipoDeDieta) {
        this.txtTipoDeDieta = txtTipoDeDieta;
    }

    public JTextField getTxtTamaDeEspecie() {
        return txtTamaDeEspecie;
    }

    public void setTxtTamaDeEspecie(JTextField txtTamaDeEspecie) {
        this.txtTamaDeEspecie = txtTamaDeEspecie;
    }

    public JTextField getTxtLinkImagen() {
        return txtLinkImagen;
    }

    public void setTxtLinkImagen(JTextField txtLinkImagen) {
        this.txtLinkImagen = txtLinkImagen;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JTable getTblAnimal() {
        return TblAnimal;
    }

    public void setTblAnimal(JTable tblAnimal) {
        TblAnimal = tblAnimal;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }
    public void limpiar(){
        txtNombre.setText("");
        txtNombreCientifico.setText("");
        txtTipoDeDieta.setText("");
        txtTamaDeEspecie.setText("");
        txtLinkImagen.setText("");
    }
}

