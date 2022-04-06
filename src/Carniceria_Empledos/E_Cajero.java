package Carniceria_Empledos;

/**
 *
 * @author MierderTheKat
 */
public class E_Cajero extends S_Empleados{
    
    private String Contraseña;
    
    public E_Cajero(){}
    
    public E_Cajero(String id_empleado, String nombre, String fech_nac, String puesto, String jornada, String contraseña)
    {
        super(id_empleado, nombre, fech_nac, puesto, jornada);
        Contraseña = contraseña;
    }
    
    @Override
    public String getContraseña()
    {
        return this.Contraseña;
    }
    @Override
    public void setContraseña(String contraseña)
    {
        this.Contraseña = contraseña;
    }
    
    @Override
    public void Sueldo(int horas)
    {
        double sueldo = 0;
        int horas_extra = horas - 48;
        
        if(horas_extra > 0)
        {
            int dinero_extra = horas_extra * 200;
            sueldo = ((horas - horas_extra) * 100) + dinero_extra;
        }
        else if (horas_extra <= 0)
        {
          sueldo = (horas * 100);
        }
        System.out.println("\t\t\t\tSueldo:"+ sueldo + "$\n");
        this.Sueldo = sueldo;
    }
}