package com.umg.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutoVista extends JFrame {
    private JTextField txtMarca, txtModelo, txtAño, txtPuertas;
    private JButton btnGuardar;
    private VehiculoVistaPrincipal mainView;

    public AutoVista(VehiculoVistaPrincipal mainView) {
        this.mainView = mainView;
        setTitle("Registrar Auto");
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

        add(new JLabel("Cantidad de Puertas:"));
        txtPuertas = new JTextField();
        add(txtPuertas);

        btnGuardar = new JButton("Guardar");
        add(btnGuardar);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String info = "Auto - Marca: " + txtMarca.getText() + ", Modelo: " + txtModelo.getText() +
                        ", Año: " + txtAño.getText() + ", Puertas: " + txtPuertas.getText();
                mainView.agregarVehiculo(info);
                dispose();
            }
        });

        setVisible(true);
    }
}
