/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.ejerciciosed.ui;

import java.util.Scanner;

/**
 *
 * @author Evelyn Guzman
 */
public class Ejercicio3 {
    public static void main(String[] args) {
 /*
  3. Las primeras 2 secciones del RFC se generan a partir de la información de cada ciudadano.
  Hacer un sistema que pida la información necesaria.
  Apellido Paterno
  Apellido Materno
  Primer Nombre
  Fecha de Nacimiento (*este puede ser por partes)
  Año (Tiene que ser completo “1991”)
  Mes (Pidan solo el número del mes) 4 ó 12
  Día – 7 ó 25
  Debe de imprimir en consola el formato del RFC según la información ingresada. 
*/
 
 try{
     
Scanner sc = new Scanner(System.in);    
System.out.print("Ingrese su apellido paterno: ");
String apellidoPaterno = sc.nextLine();        
String[]paterno = new String[1];
paterno[0] = apellidoPaterno;
String p = paterno[0];
String dosLetras = p.substring(0, 2);
String mayusculaP = dosLetras.toUpperCase();
       

System.out.print("Ingrese su apellido materno: ");
String apellidoMaterno = sc.nextLine();
String[]materno = new String[1];
materno[0] = apellidoMaterno;
String m = materno[0];
String unaLetra = m.substring(0, 1);
String mayusculaM = unaLetra.toUpperCase();


System.out.print("Ingrese su primer nombre: ");
String nombre = sc.nextLine();
String[]nombreN = new String[1];
nombreN[0] = nombre;
String n = nombreN[0];
String unaLetraN = n.substring(0, 1);
String mayusculaN = unaLetraN.toUpperCase();



System.out.print("Ingrese su año de nacimiento(4 digitos): ");
int añoNacimiento = sc.nextInt();
int[]año = new int[1];
año[0] = añoNacimiento;
String añoN = String.valueOf(añoNacimiento);
String últimosDos = añoN.substring(añoN.length() - 2);

  

System.out.print("Ingrese su mes de nacimiento: ");
int mesNacimiento = sc.nextInt();
int[]mes = new int[1];
mes[0] = mesNacimiento;
String mesS = String.format("%02d", mesNacimiento);


        
System.out.print("Ingrese su día de nacimiento(2 digitos): ");
int díaNacimiento = sc.nextInt();
String díaS = String.valueOf(díaNacimiento);

if (díaS.length() ==2){

int[]día = new int[1];
día[0] = díaNacimiento;

}
else{
    System.out.println("El día de nacimento debe de contener dos digitos:)");
    sc.next();
}


System.out.println("Su RFC es: "+ mayusculaP + mayusculaM + mayusculaN+ últimosDos + mesS + díaNacimiento);
  
}
   catch(Exception ex){
   System.err.println("Ocurrio un error: " + ex.getMessage());
   
                          
   }
    }
}

    

