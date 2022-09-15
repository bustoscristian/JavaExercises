package domain;


public class Orden 
{
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private static final int max_productos = 10;
    private int contadorProductos;
    
    public Orden() 
    {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.max_productos];
    }
    
    public void agregarProducto(Producto producto)
    {
        if(this.contadorProductos < max_productos)
        {
            this.productos[this.contadorProductos++] = producto;
        }
        else
        {
            System.out.println("Se superó el máximo de productos permitidos: " + Orden.max_productos);
        }
    }
    
    public double calcularTotal()
    {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) 
        {
            Producto producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden()
    {
        System.out.println("ID Orden: "+this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la Orden: $"+totalOrden);
        System.out.println("Productos de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) 
        {
            System.out.println(this.productos[i]);
        }
    }
}
