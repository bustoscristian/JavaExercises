
package mundopc;

import com.gm.mundopc.*;


public class MundoPC 
{
    public static void main(String[] args) 
    {
        Monitor monitorHP     = new Monitor("HP", 24);
        Raton ratonLogitech   = new Raton("USB", "Logitech");
        Teclado tecladoHyperx = new Teclado("USB", "HyperX");
        Computadora computadora1 = new Computadora("PC 1", monitorHP, tecladoHyperx, ratonLogitech);
        
        Monitor monitorIqual     = new Monitor("Iqual", 26);
        Raton ratonHyperX   = new Raton("USB", "HyperX");
        Teclado tecladoRazer = new Teclado("USB", "Razer");
        Computadora computadora2 = new Computadora("PC 2", monitorIqual, tecladoRazer, ratonHyperX);
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        
        orden1.mostrarOrden();
    }
}
