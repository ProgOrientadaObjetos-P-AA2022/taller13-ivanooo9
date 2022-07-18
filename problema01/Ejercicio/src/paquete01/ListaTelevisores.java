/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;


import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class ListaTelevisores {
    
     private ArrayList<Televisor> t;
    private double totalPrecio;
    private double TvCaro;
    private String marcas;
    
    
    
    public void establecerTelevisor(ArrayList<Televisor> lst){
        t = lst;
    }
    
    
     public void totalPrecioTvs(){
        totalPrecio = 0;
        for (int i = 0; i < t.size(); i++) {
            totalPrecio = totalPrecio + t.get(i).obtenerPrecio();
        }
        }
     
    public void televisorMasCaro(){
        TvCaro = 0;
        for(int i=0; i< t.size(); i++){
            if(t.get(i).obtenerPrecio() <  TvCaro){
                TvCaro = t.get(i).obtenerPrecio();
            }
        }
       
    }
    
    public void listaMarcasVendidas(){
        marcas = "";
        for (int i = 0; i < t.size(); i++) {
            marcas= String.format("%s%s\n", marcas, t.get(i).obtenerMarca());
        }
        
    }
    
    public double obtenerTotalPrecioTvs(){
        return totalPrecio;
    }
    
     public double obtenerTelevisorMasCaro(){
        return TvCaro;
    }
     
      public String obtenerListadosMasVendidos(){
        return marcas;
    }
    @Override
public String toString(){
    String cadena = String.format("Total precio TVs: %.2f\n"
    + "TV mas caro: %.2f\n"
    + "Marcas mas vendidas:\n%s\n",
    obtenerTotalPrecioTvs(),
    obtenerTelevisorMasCaro(),
    obtenerListadosMasVendidos());
    return cadena;
    }
}
