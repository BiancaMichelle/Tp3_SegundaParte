package com.parte2.modelo;

public class EnvioExpres implements Envio {
    
    /** 
     * @param peso peso del paquete
     * @return double con el costo del envio
     */
    @Override
    public double costo(double peso) {
        return 10.0 + peso * 2.0; // Costo base de 10 y 2 por kg
    }
    
    
    /** 
     * @return String con la cantidad de dias habiles que requerira la entrega
     */
    @Override
    public String tiempoEntrega() {
        return "1-2 días hábiles";
    }
}
