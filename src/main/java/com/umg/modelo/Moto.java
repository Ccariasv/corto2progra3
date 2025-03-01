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
    public void acelerar() {
        super.acelerar();
        System.out.println("La moto aceleró lentamente.");
    }

    @Override
    public void frenar() {
        super.frenar();
        System.out.println("la moto frenó con mucha distancia.");
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Tipo de Manillar: " + tipoManillar;
    }
}
