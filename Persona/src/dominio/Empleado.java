/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Empleado extends Persona {
  
  private  int idEmpleado;
  private double sueldo;
 private static int contadorEmpleado;
    public Empleado(int idEmpleado, double sueldo, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
       
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
        this.contadorEmpleado = Empleado.contadorEmpleado ++;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }


  
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
  
    
    
    
}
