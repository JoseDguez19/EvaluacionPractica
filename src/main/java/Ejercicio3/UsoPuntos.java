/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author ap550
 */
public class UsoPuntos {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = scanner.nextDouble();

        int puntos = Puntos.puntosCalidad(promedio);
        System.out.println("El estudiante tiene " + puntos + " puntos de calidad.");
    }
}
