package com.umg.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CamionVista extends JFrame {
    private JTextField txtMarca, txtModelo, txtAño, txtCarga;
    private JButton btnGuardar;
    private VehiculoVistaPrincipal mainView;

    public CamionVista(VehiculoVistaPrincipal mainView) {
        this.mainView = mainView;
        setTitle("Registrar Camión");
        setSize(300, 250);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Marca:"));
        txtMarca = new JTextField();
        add(txtMarca);

        add(new JLabel("Modelo:"));
        txtModelo = new JTextField();
        add(txtModelo);

        add(new JLabel("Año:"));
        txtAño = new JTextField();
        add(txtAño);

        add(new JLabel("Capacidad de Carga:"));
        txtCarga = new JTextField();
        add(txtCarga);

        btnGuardar = new JButton("Guardar");
        add(btnGuardar);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String info = "Camión - Marca: " + txtMarca.getText() + ", Modelo: " + txtModelo.getText() +
                        ", Año: " + txtAño.getText() + ", Carga: " + txtCarga.getText();
                mainView.agregarVehiculo(info);
                dispose();
            }
        });

        setVisible(true);
    }
}
