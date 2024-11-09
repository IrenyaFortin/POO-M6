/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop2.m6.grupal.Clases;

/**
 *
 * @author IRENYA FORTIN
 */
public class Deportista extends Persona {
    private String deporte;

    public Deportista(String dni, String nombre, String apellido, int edad, String nacionalidad, String deporte) {
        super(dni, nombre, apellido, edad, nacionalidad);
        this.deporte = deporte;
    }
    
  public void mostrarDatos() {
        DatosPersonas(); 
        System.out.println("Deporte: " + deporte);
    }  

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
}
