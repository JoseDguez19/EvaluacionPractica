/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ap550
 */
public class Rectángulo {
    private double longitud;
    private double anchura;

    public Rectángulo() {
        this.longitud = 1;
        this.anchura = 1;
    }

    public Rectángulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    public double getLongitud() {
        return this.longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAnchura() {
        return this.anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double calcularPerimetro() {
        return 2 * (this.longitud + this.anchura);
    }

    public double calcularArea() {
        return this.longitud * this.anchura;
    }
}
