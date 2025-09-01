package javaapplication3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniela Nahir Romero
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
        
    public Mascota(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Mi mascota es "+this.nombre+", su especie es "+especie+" y tiene "+edad+ " años.");
    }
    
    public void cumplirAnios(int anios){
        this.edad += anios;
        System.out.println(anios+" despues...");
    }
    
}
