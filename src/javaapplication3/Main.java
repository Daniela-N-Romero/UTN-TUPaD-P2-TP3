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
        
        Mascota m = new Mascota("Lolo","perro", 5);
        m.mostrarInfo();
        System.out.println("");
        
        m.cumplirAnios(3);
        
        m.mostrarInfo();
        
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("EJECUCION EJERCICIO 3:");
        System.out.println("");
        
        Libro l = new Libro("Harry Potter y la piedra filosofal", "J. K. Rowling", 1985);
        System.out.println(l.getTitulo());
        System.out.println(l.getAnioPublicacion());
        System.out.println(l.getAutor());
        System.out.println("");
        l.setAnioPublicacion(2028);
        l.setAnioPublicacion(1997);
        System.out.println(l.getTitulo());
        System.out.println(l.getAnioPublicacion());
        System.out.println(l.getAutor());
        
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("EJECUCION EJERCICIO 4:");
        System.out.println("");
        
        Gallina g1 = new Gallina(1,2,300);
        Gallina g2 = new Gallina(2,3,400);
        
        g1.mostrarEstado();
        g1.envejecer();
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.mostrarEstado();
        System.out.println("----");
        g2.mostrarEstado();
        g2.envejecer();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.mostrarEstado();
    }
}
