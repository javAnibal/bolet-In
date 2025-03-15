package com.example.app006.models;

public class Caja {
   static int contadorCaja;
   private int idCaja;


    public Caja(int idCaja) {
        this.idCaja = contadorCaja;
    }


    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    @Override
    public String toString() {
        return String.format("Numero")
    }
}
