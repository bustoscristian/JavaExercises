
package com.gm.mundopc;


public class Orden 
{
    private final int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int maxComputadoras = 10;

    public Orden() 
    {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.maxComputadoras];
    }
    
    public void agregarComputadora(Computadora computadora)
    {
        if(this.contadorComputadoras < this.maxComputadoras)
        {
           this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else
        {
            System.out.println("Superó el limite de computadoras permitidas: "+this.computadoras);
        }
          
    }
    
    public void mostrarOrden()
    {
        System.out.println("ID Orden: "+this.idOrden);
        System.out.println("Cantidad de Ordenes: "+this.contadorOrdenes);
        System.out.println("Cantidad de Computadoras: "+this.contadorComputadoras);
        System.out.println("--Computadoras--");
        for (int i = 0; i < this.contadorComputadoras; i++) 
        {
            System.out.println(this.computadoras[i]); 
        }
    }
}
