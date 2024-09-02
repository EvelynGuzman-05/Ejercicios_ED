/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.ejerciciosed.ui;


import java.util.Scanner;

/**
 *
 * @author Evelyn Guzman
 */
public class Ejercicio1 {
/* 
   1. Determinar si un texto dato es un palíndromo o no.
   Hacer un programa que reciba como parámetro un texto, ya sea una palabra o una frase completa y determinar si es un palíndromo o no. 
   Mostrar en consola el resultado, si el texto ingresado es un “Palíndromo” o “No es un palíndromo”  
   Ejemplos: “Ana”, “Oso”, “Rotor”, “Somos”, “Reconocer”, “Seres” 
*/
 
public static boolean esPalindromo(String texto) {
String textoN = texto.replace(" ", "");
String textoNuevo = textoN.toLowerCase();
String textoReverso = new StringBuilder(textoNuevo).reverse().toString();
return textoNuevo.equals(textoReverso);
}


public static void main(String[] args) {
try{
Scanner sc = new Scanner(System.in);

System.out.println("Ingrese una palabra/frase: ");
String texto = sc.nextLine();

if (esPalindromo(texto)) {
 System.out.println("El texto ingresado es un palíndromo.");
} 
else {
 System.out.println("El texto ingresado no es un palíndromo.");
        }

    
    }
   catch(Exception ex){
   System.err.println("Ocurrio un error: " + ex.getMessage());
   
 }
}
}








    

    

    