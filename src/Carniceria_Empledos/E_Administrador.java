package Carniceria_Empledos;

/**
 *
 * @author MierderTheKat
 */
public class E_Administrador extends S_Empleados{
    
    private String Contraseña;
    private boolean Titulo;
    
    public E_Administrador(){}
    
    public E_Administrador(String id_empleado, String nombre, String fech_nac, String puesto, String jornada, String contraseña, boolean titulo)
    {
        super(id_empleado, nombre, fech_nac, puesto, jornada);
        Contraseña = contraseña;
        Titulo = titulo;
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
    public boolean getTitulo()
    {
        return this.Titulo;
    }
    @Override
    public void setTitulo(boolean titulo)
    {
        this.Titulo = titulo;
    }
    
    @Override
    public void Sueldo(int horas)
    {
        double sueldo = 0;
        int horas_extra = horas - 48;
        
        if(horas_extra > 0)
        {
            int dinero_extra = horas_extra * 300;
            sueldo = ((horas - horas_extra) * 150) + dinero_extra;
        }
        else if (horas_extra <= 0)
        {
          sueldo = (horas * 150);
        }
        System.out.println("\t\t\t\tSueldo:"+ sueldo + "$\n");
        this.Sueldo = sueldo;
    }
}