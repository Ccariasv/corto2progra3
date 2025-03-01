package com.umg.modelo;

public class Moto extends Vehiculo {
    private String tipoManillar;

    public Moto(String marca, String modelo, int año, String tipoManillar) {
        super(marca, modelo, año);
        this.tipoManillar = tipoManillar;
    }

    public String getTipoManillar() {
        return tipoManillar;
    }

    public void setTipoManillar(String tipoManillar) {
        this.tipoManillar = tipoManillar;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Tipo de Manillar: " + tipoManillar;
    }
}
