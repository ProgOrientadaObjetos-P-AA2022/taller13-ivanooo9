/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author reroes
 */
public class extends MatriculaCampamento{
    private double tarifa;
   
    
    public void establecerTarifa(){
        tarifa = 100.2 + 30.2 + 90.2;
    }
        
    public double obtenerTarifa(){
        return tarifa;
    }
    
    public String toString(){
        String cadena = String.format("Campamento - Tarifa : %.2f",
              obtenerTarifa());
        return cadena;
    }
    
}
