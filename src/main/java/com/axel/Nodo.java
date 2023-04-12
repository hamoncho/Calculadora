package com.axel;

public class Nodo {
    private String valor;
    private Nodo conexion_iz;
    private Nodo conexion_de;

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo getConexionIz() {
        return this.conexion_iz;
    }

    public void setConexionIz(Nodo conexion_iz) {
        this.conexion_iz = conexion_iz;
    }

    public Nodo getConexionDe() {
        return this.conexion_de;
    }

    public void setConexionDe(Nodo conexion_de) {
        this.conexion_de = conexion_de;
    }

    public boolean esNumero() {
        char aux = this.valor.charAt(0);

        return aux == '0' ||
            aux == '1' ||
            aux == '2' ||
            aux == '3' ||
            aux == '4' ||
            aux == '5' ||
            aux == '6' ||
            aux == '7' ||
            aux == '8' ||
            aux == '9';
    }

    public boolean esOperador() {
        char aux = this.valor.charAt(0);

        return aux == '+' ||
            aux == '-' ||
            aux == '*' ||
            aux == '/' ||
            aux == '^';
    }
}
