package com.umg.vista;

import javax.swing.*;
import java.awt.*;


public class VehiculoVistaPrincipal extends JFrame {
    private JTextArea txtSalida;

    public VehiculoVistaPrincipal() {
        setTitle("Gestión de Vehículos");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu menuVehiculo = new JMenu("Registrar Vehículo");
        JMenuItem menuAuto = new JMenuItem("Registrar Auto");
        JMenuItem menuMoto = new JMenuItem("Registrar Moto");
        JMenuItem menuCamion = new JMenuItem("Registrar Camión");

        menuVehiculo.add(menuAuto);
        menuVehiculo.add(menuMoto);
        menuVehiculo.add(menuCamion);
        menuBar.add(menuVehiculo);
        setJMenuBar(menuBar);

        txtSalida = new JTextArea();
        txtSalida.setEditable(false);
        add(new JScrollPane(txtSalida), BorderLayout.CENTER);


        menuAuto.addActionListener(e -> new AutoVista(this));
        menuMoto.addActionListener(e -> new MotoVista(this));
        menuCamion.addActionListener(e -> new CamionVista(this));
        setVisible(true);
    }

    public void agregarVehiculo(String info) {
        txtSalida.append(info + "\n");
    }

    public static void main(String[] args) {
        new VehiculoVistaPrincipal();
    }
}
