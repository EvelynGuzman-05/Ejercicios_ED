/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.ejerciciosed.ui;
import java.util.Random;

/**
 *
 * @author Evelyn Guzman
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        /*
  2. Generar una lista de 10 números al azar del 1 al 100.
  Mostrar en consola la lista de números generados.
  Mostrar en consola el promedio del arreglo de números.
  Mostrar en consola la cantidad de números primos.
  Mostrar en consola la cantidad de números pares.
  Mostrar en consola el número mayor.
  Mostrar en consola el número menor.
*/
        
try{
Random random = new Random(); 
int[] numeros = new int[10];


int suma = 0;
int mayor = 0;
int menor = Integer.MAX_VALUE;
int pares = 0;
int primos = 0;

for (int n = 0; n < numeros.length; n++) {
numeros[n] = random.nextInt(100) + 1;
suma += numeros[n];

if (numeros[n] > mayor){
    mayor = numeros[n];
}

if (numeros[n] < menor){
  menor = numeros[n];
}
if (numeros[n] % 2 == 0){
  pares++;
}
  else{
  primos ++;
          }
                
}
double promedio = suma / numeros.length;

System.out.print("Lista de números generados: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

System.out.println();
System.out.println("Promedio: " + promedio);
System.out.println("Cantidad de números primos: " + primos);
System.out.println("Cantidad de números pares: " + pares);
System.out.println("Número mayor: " + mayor);
System.out.println("Número menor: " + menor);
                
 
}
catch(Exception ex){
               System.err.println("Ocurrio un error: " + ex.getMessage());
              
               }
    
    
    }
}
