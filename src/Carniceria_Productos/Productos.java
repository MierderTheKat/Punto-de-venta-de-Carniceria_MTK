package Carniceria_Productos;

import java.text.DecimalFormat;

/**
 *
 * @author MierderTheKat
 */
public abstract class Productos {
    
    protected String Id_Producto;
    protected String Nombre;
    protected String Tipo;
    protected double Kg;
    protected double Precio;
    protected double Ganancia;
    protected double GananciaTotal;
    DecimalFormat df = new DecimalFormat("#.00");
    
    public Productos(){}
    
    public Productos(String id_producto, String nombre, String tipo, double kg, double precio)
    {
        this.Id_Producto = id_producto;
        this.Nombre = nombre;
        this.Tipo = tipo;
        this.Kg = kg;
        this.Precio = precio;
        this.Ganancia = 0;
        this.GananciaTotal = 0;
    }
    
    //Metodos GET
    public String getId_Producto()
    {
        return this.Id_Producto;
    }
    public String getNombre()
    {
        return this.Nombre;
    }
    public String getTipo()
    {
        return this.Tipo;
    }
    public double getKg()
    {
        return this.Kg;
    }
    public double getPrecio()
    {
        return this.Precio;
    }
    public double getGanancia()
    {
        return this.Ganancia;
    }
    public double getGananciaTotal()
    {
        return this.GananciaTotal;
    }
    //Metodos SET
    public void setId_Producto(String id_producto)
    {
        this.Id_Producto = id_producto;
    }
    public void setNombre(String nombre)
    {
        this.Nombre = nombre;
    }
    public void setTipo(String tipo)
    {
        this.Tipo = tipo;
    }
    public void setKg(double kg)
    {
        this.Kg = kg;
    }
    public void setPrecio(double precio)
    {
        this.Precio = precio;
    }
    public void setGanancia(double Ganancia)
    {
        this.Ganancia = Ganancia;
    }
    public void setGananciaTotal(double GananciaTotal)
    {
        this.GananciaTotal = GananciaTotal;
    }
    
    public abstract void Venta(double kg);
}