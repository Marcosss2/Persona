/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;

/**
 *
 * @author Alumno Mañana
 */
public class Cliente  extends Persona{
   
    
 private int idCliente;
 private Date fecha;
 private boolean vip;
 private static int contadorClientes;
    public Cliente(int idCliente, Date fecha, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = Cliente.contadorClientes ++;
        this.fecha = fecha;
        this.vip = vip;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

 
    public int getIdCliente() {
        return idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isVip() {
        return vip;
    }
 
 
 
    
}
