/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop2.m6.grupal.Clases;

/**
 *
 * @author IRENYA FORTIN
 */

public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    
     public void DatosPersonas() {
        System.out.println("Dni: " + dni );
        System.out.println("Nombre: " + nombre );
        System.out.println("Apellido: " + apellido );
        System.out.println("Edad:"  + edad);
        System.out.println("Nacionalidad: " + nacionalidad );
    }
    
    public Persona(String dni, String nombre, String apellido, int edad, String nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
  
   
}



