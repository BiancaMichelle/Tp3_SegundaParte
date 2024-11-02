package com.parte2.modelo;

public class EnvioRegular implements Envio {
    
    /** 
     * @param peso peso de lo que se requiere enviar
     * @return double con el costo del envio segun el peso
     */
    @Override
    public double costo(double peso) {
        return 5.0 + peso * 1.0;  // Costo base de 5 y 1 por kg
    }
    
    
    /** 
     * @return String con la cantidad de dias habiles que requerira la entrega
     */
    @Override
    public String tiempoEntrega() {
        return "5-7 días hábiles";
    }
}
