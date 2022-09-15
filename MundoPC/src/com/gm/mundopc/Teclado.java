
package com.gm.mundopc;


public class Teclado extends DispositivoEntrada
{
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String Marca)
    {
        super(tipoEntrada, Marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado +" "+ super.toString()+ '}';
    }
    
    
    
    
}
