package com.umg.controlador;

import com.umg.vista.VehiculoVistaPrincipal;

import java.util.ArrayList;
import java.util.List;

public class VehiculoController {
    private List<String> vehiculosRegistrados;

    public VehiculoController(VehiculoVistaPrincipal vista) {
        this.vehiculosRegistrados = new ArrayList<>();
    }


    public void registrarAuto(String marca, String modelo, int año, int cantidadPuertas, int velocidad) {
        String info = "Auto - Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Puertas: " + cantidadPuertas + ", Velocidad: " + velocidad;
        vehiculosRegistrados.add(info);
    }


    public void registrarMoto(String marca, String modelo, int año, String tipoManillar, int velocidad) {
        String info = "Moto - Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Manillar: " + tipoManillar + ", Velocidad: " + velocidad;
        vehiculosRegistrados.add(info);
    }


    public void registrarCamion(String marca, String modelo, int año, double capacidadCarga, int velocidad) {
        String info = "Camión - Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Carga: " + capacidadCarga + " kg" + ", Velocidad: " + velocidad;
        vehiculosRegistrados.add(info);
    }

    public List<String> obtenerVehiculosRegistrados() {
        return vehiculosRegistrados;
    }
}
