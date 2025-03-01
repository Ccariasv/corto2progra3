package com.umg.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MotoVista extends JFrame {
    private JTextField txtMarca, txtModelo, txtAño, txtManillar, txtVelocidad;
    private JButton btnGuardar;
    private VehiculoVistaPrincipal mainView;

    public MotoVista(VehiculoVistaPrincipal mainView) {
        this.mainView = mainView;
        setTitle("Registrar Moto");
        setSize(300, 250);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Marca:"));
        txtMarca = new JTextField();
        add(txtMarca);

        add(new JLabel("Modelo:"));
        txtModelo = new JTextField();
        add(txtModelo);

        add(new JLabel("Año:"));
        txtAño = new JTextField();
        add(txtAño);

        add(new JLabel("Tipo de Manillar:"));
        txtManillar = new JTextField();
        add(txtManillar);

        add(new JLabel("velocidad:"));
        txtVelocidad = new JTextField();
        add(txtVelocidad);

        btnGuardar = new JButton("Guardar");
        add(btnGuardar);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String info = "Moto - Marca: " + txtMarca.getText() + ", Modelo: " + txtModelo.getText() +
                        ", Año: " + txtAño.getText() + ", Manillar: " + txtManillar.getText() + ", Velocidad: " + txtVelocidad.getText();
                mainView.agregarVehiculo(info);
                dispose();
            }
        });

        setVisible(true);
    }
}
