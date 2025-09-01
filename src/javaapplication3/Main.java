/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Main {
    
    public static void main(String[] args){
        
        
        System.out.println("EJECUCION EJERCICIO 1:");
        System.out.println("");
        Estudiante e = new Estudiante("Laura", "Ramirez", "BBDD II", 9);
               
        
        e.mostrarInfo();
        System.out.println("");
        
        e.bajarCalificacion(3);
        e.mostrarInfo();
        System.out.println("");
        
        e.subirCalificacion(2);
        e.mostrarInfo();
        System.out.println("");
                
        e.subirCalificacion(4);
        e.mostrarInfo();
        System.out.println("");
        
        e.bajarCalificacion(15);
        e.mostrarInfo();
        
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("EJECUCION EJERCICIO 2:");
        System.out.println("");
        
        
        
    }
}
