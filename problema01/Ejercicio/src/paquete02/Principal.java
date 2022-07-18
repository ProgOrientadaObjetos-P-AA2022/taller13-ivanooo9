/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;
import paquete01.ListaTelevisores;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) {
       
        Televisor t1 = new Televisor();
        t1.establecerMarca("LG-14 pulgadas");
        t1.establecerPrecio(300.2);

        Televisor t2 = new Televisor();
        t2.establecerMarca("SAMSUMG-21 pulgadas");
        t2.establecerPrecio(1300.2);

        Televisor t3 = new Televisor();
        t3.establecerMarca("RIVIERA-29 pulgadas");
        t3.establecerPrecio(2300.5);

        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(t1);
        tvs.add(t2);
        tvs.add(t3);
        
        ListaTelevisores ltv = new ListaTelevisores();
        ltv.establecerTelevisor(tvs);
        ltv.totalPrecioTvs();
        ltv.obtenerTelevisorMasCaro();
        ltv.listaMarcasVendidas();
        
        System.out.println(ltv);
        /*
        for(int i=0; i< tvs.size(); i++){
            tvs.get(i).toString();
           
        }
        
        System.out.println("-----------------");
        System.out.printf("%.2f\n", ltv.totalPrecioTvs(tvs));
        System.out.printf("%s\n", ltv.listaMarcasVendidas(tvs));
        System.out.printf("Marca mas vendsida: /n %s/n", ltv.listaMarcasVendidas(tvs));

    */}
}
