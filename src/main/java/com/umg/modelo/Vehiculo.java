package com.umg.modelo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int fabricaciono;

    public Vehiculo(String marca, String modelo, int año) {
    }

    public String mostrarInfo() {
        return marca + " " + modelo + " (" + fabricaciono + ")";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFabricaciono() {
        return fabricaciono;
    }

    public void setFabricaciono(int fabricaciono) {
        this.fabricaciono = fabricaciono;
    }
}
