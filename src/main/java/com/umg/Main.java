package com.umg;

import com.umg.controlador.VehiculoController;
import com.umg.vista.VehiculoVistaPrincipal;

public class Main {
    public static void main(String[] args) {
        VehiculoVistaPrincipal vista = new VehiculoVistaPrincipal();
        new VehiculoController(vista);
    }
}
