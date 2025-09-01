/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Daniela Nahir Romero
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    public Gallina(int idGallina,int edad,int huevosPuestos){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    
    public void ponerHuevo(){
        this.huevosPuestos += 1;
        System.out.println("La gallina ha puesto un huevo.");
    }
    
    public void envejecer(){
        this.edad += 1;
        System.out.println("La gallina envejeció un año.");
    }
    
    public void mostrarEstado(){
        System.out.println("Gallina: "+this.idGallina);
        System.out.println("Edad: "+this.edad);        
        System.out.println("Huevos puestos: "+this.huevosPuestos);
    }
}
