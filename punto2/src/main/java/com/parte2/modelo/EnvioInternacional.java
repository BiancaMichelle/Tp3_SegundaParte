package com.parte2.modelo;

public class EnvioInternacional implements Envio{
    
    /** 
     * @param peso
     * @return double con el costo del envio segun el metodo internacional
     */
    @Override
    public double costo(double peso) {
        return 20.0 + peso * 3.5; // Costo base de 20 y 3.5 por kg
    }
    
    
    /** 
     * @return String con la cantidad de dias habiles que requerira la entrega
     */
    @Override
    public String tiempoEntrega() {
        return "7-15 días hábiles";
    }
}
