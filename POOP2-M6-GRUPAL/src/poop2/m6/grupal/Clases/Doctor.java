/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop2.m6.grupal.Clases;

/**
 *
 * @author IRENYA FORTIN
 */
public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String dni, String nombre, String apellido, int edad, String nacionalidad, String especialidad) {
        super(dni, nombre, apellido, edad, nacionalidad);
        this.especialidad = especialidad;
    }
    
      public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

   public void mostrarDatos() {
        DatosPersonas(); 
        System.out.println("Especialidad: " + especialidad);
    }
}