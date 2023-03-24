/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author ap550
 */
public class Puntos {
    public static int puntosCalidad(double promedio) {
        if (promedio >= 90 && promedio <= 100) {
            return 4;
        } else if (promedio >= 80 && promedio <= 89) {
            return 3;
        } else if (promedio >= 70 && promedio <= 79) {
            return 2;
        } else if (promedio >= 60 && promedio <= 69) {
            return 1;
        } else {
            return 0;
        }
    }
}
