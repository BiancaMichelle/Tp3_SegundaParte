package com.parte2.modelo;

public interface Envio {
    /**
     * @param peso indica el peso del paquete a enviar
     * @return retornara el consto del evido dependiendo del metodo del mismo
     */
    double costo(double peso);
    /**
     * @return un string que indicara la cantidad de dias habiles de entrega segun el envio seleccionado
     */
    String tiempoEntrega();
}

