/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author ap550
 */
public class UsoConvertidorTemperaturas {
    public static void main(String[] args) {
        double temperatura = 15;
        char medida = 'C';

        String resultado = ConvertidorTemperaturas.convertirTemperatura(temperatura, medida);
        System.out.println(resultado);
    }
}
