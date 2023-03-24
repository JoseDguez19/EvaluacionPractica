/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ap550
 */
public class UsoRectángulo {
    public static void main(String[] args) {
        Rectángulo rectangulo = new Rectángulo(20, 35);

        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("Área: " + rectangulo.calcularArea());
    }
}
