package com.parte2;

import com.parte2.modelo.Compra;
import com.parte2.modelo.EnvioExpres;
import com.parte2.modelo.EnvioInternacional;
import com.parte2.modelo.EnvioRegular;

public class Main {
    
    /** 
     * @param args argumentos del main
     */
    public static void main(String[] args) {
        Compra compra = new Compra(2.5); /* Se envia el peso en kg */ 
        
        //* Seleccionar y cambiar estrategias de envío */
        compra.setEnvio(new EnvioRegular());
        System.out.println("== Envío Regular ==");
        compra.procesarCompra();
        
        compra.setEnvio(new EnvioExpres());
        System.out.println("== Envío Expreso ==");
        compra.procesarCompra();
        
        compra.setEnvio(new EnvioInternacional());
        System.out.println("== Envío Internacional ==");
        compra.procesarCompra();
    }
}