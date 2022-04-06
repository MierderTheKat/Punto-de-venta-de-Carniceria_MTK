package Carniceria_Productos;

/**
 *
 * @author MierderTheKat
 */
public class P_Ternera extends Productos{
    
    public P_Ternera(){}
    
    public P_Ternera(String id_producto, String nombre, String tipo, double kg, double precio)
    {
        super(id_producto, nombre, tipo, kg, precio);
    }
    
    @Override
    public void Venta(double kg)
    {
        double Venta = (kg * this.Precio);
        System.out.println("\t\t\t\tCosto total:"+ Venta + "$\n");
        Venta = Double.parseDouble(df.format(Venta));
        kg = Double.parseDouble(df.format(kg));
        this.Kg = (Kg - kg);
        this.Ganancia = Venta;
        this.GananciaTotal += Venta;
    }
}