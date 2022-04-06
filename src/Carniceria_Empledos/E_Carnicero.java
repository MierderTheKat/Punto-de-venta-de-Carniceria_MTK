package Carniceria_Empledos;

/**
 *
 * @author MierderTheKat
 */
public class E_Carnicero extends S_Empleados{
    
    private String Especialidad;
    private int Peso;
    
    public E_Carnicero(){}
    
    public E_Carnicero(String id_empleado, String nombre, String fech_nac, String puesto, String jornada, String especialidad, int peso)
    {
        super(id_empleado, nombre, fech_nac, puesto, jornada);
        Especialidad = especialidad;
        Peso = peso;
    }
    
    @Override
    public String getEspecialidad()
    {
        return this.Especialidad;
    }
    @Override
    public void setEspecialidad(String especialidad)
    {
        this.Especialidad = especialidad;
    }
    @Override
    public int getPeso()
    {
        return this.Peso;
    }
    @Override
    public void setPeso(int peso)
    {
        this.Peso = peso;
    }
    @Override
    public void Sueldo(int horas)
    {
        double sueldo = 0;
        int horas_extra = horas - 36;
        
        if(horas_extra > 0)
        {
            int dinero_extra = horas_extra * 240;
            sueldo = ((horas - horas_extra) * 120) + dinero_extra;
        }
        else if (horas_extra <= 0)
        {
          sueldo = (horas * 120);
        }
        System.out.println("\t\t\t\tSueldo:"+ sueldo + "$\n");
        this.Sueldo = sueldo;
    }
}