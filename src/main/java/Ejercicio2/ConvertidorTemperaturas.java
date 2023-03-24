/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author ap550
 */
public class ConvertidorTemperaturas {
    public static String convertirTemperatura(double temperatura, char medida) {
        double resultado;
        String medidaConvertida;

        if (medida == 'C') {
            resultado = (temperatura * 9/5) + 32;
            medidaConvertida = "grados Fahrenheit";
        } else if (medida == 'F') {
            resultado = (temperatura - 32) * 5/9;
            medidaConvertida = "grados centígrados";
        } else {
            return "La medida ingresada no es válida";
        }

        return temperatura + " " + medida + " equivalen a " + resultado + " " + medidaConvertida;
    }
}
