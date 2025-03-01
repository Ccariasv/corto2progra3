package com.umg.modelo;
public class Vehiculo implements movimiento {
    private String marca;
    private String modelo;
    private int año;
    private int velocidad;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidad = 0;
    }

    @Override
    public void acelerar() {
        velocidad += 10;
        System.out.println("El vehículo aceleró. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        if (velocidad > 0) {
            velocidad -= 10;
        }
        System.out.println("El vehículo frenó. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public void mostarInformacion() {

    }

    public String mostrarInfo() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Velocidad: " + velocidad + " km/h";
    }
}
