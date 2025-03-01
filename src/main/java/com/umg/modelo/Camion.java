package com.umg.modelo;

public class Camion extends Vehiculo {
    private int capacidadCarga;

    public Camion(String marca, String modelo, int año, int capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Capacidad de carga: " + capacidadCarga + " kg";
    }
}
