/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, int calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
        
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre+", Apellido: "+this.apellido);
        System.out.println("Curso: "+this.curso+", Calificación: "+this.calificacion);
    }
    public void subirCalificacion(int puntos){
        int suma = calificacion + puntos;
        if (suma > 10){
            this.calificacion = 10;
            System.out.println("Se ha subido la calificación al máximo posible.");
        }else{
            calificacion = suma;
            System.out.println("Se ha subido la califación");
        }
    }
    
    public void bajarCalificacion(int puntos){
        int resta = calificacion - puntos;
        if (resta < 0){
            this.calificacion = 0;
            System.out.println("Se ha bajado la calificación al minimo posible.");
        }else{
            calificacion = resta;
            System.out.println("Se ha bajado la califación");
        }
    }
    

}
