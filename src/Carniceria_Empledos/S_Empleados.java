package Carniceria_Empledos;

/**
 *
 * @author MierderTheKat
 */
public abstract class S_Empleados {
    
    protected String Id_Empleado;
    protected String Nombre;
    protected String Fech_Nac;
    protected String Puesto;
    protected String Jornada;
    protected double Sueldo;
    
    public S_Empleados(){}
    
    public S_Empleados(String id_empleado, String nombre, String fech_nac, String puesto, String jornada)
    {
        this.Id_Empleado = id_empleado;
        this.Nombre = nombre;
        this.Fech_Nac = fech_nac;
        this.Puesto = puesto;
        this.Jornada = jornada;
        this.Sueldo = 0;
    }
    
    //Metodos GET
    public String getId_Empleado()
    {
        return this.Id_Empleado;
    }
    public String getNombre()
    {
        return this.Nombre;
    }
    public String getFech_Nac()
    {
        return this.Fech_Nac;
    }
    public String getPuesto()
    {
        return this.Puesto;
    }
    public String getJornada()
    {
        return this.Jornada;
    }
    public double getSueldo()
    {
        return this.Sueldo;
    }
    //Metodos SET
    public void setId_Empleado(String id_empleado)
    {
        this.Id_Empleado = id_empleado;
    }
    public void setNombre(String nombre)
    {
        this.Nombre = nombre;
    }
    public void setFech_Nac(String fech_nac)
    {
        this.Fech_Nac = fech_nac;
    }
    public void setPuesto(String puesto)
    {
        this.Puesto = puesto;
    }
    public void setJornada(String jornada)
    {
        this.Jornada = jornada;
    }
    public void setSueldo(double sueldo)
    {
        this.Sueldo = sueldo;
    }
    
    //SETTERS y GETTERS clases
    
    public String getContraseña()
    {
        return "";
    }
    public boolean getTitulo()
    {
        return true;
    }
    public String getEspecialidad()
    {
        return "";
    }
    public int getPeso()
    {
        return 1;
    }
    
    public void setContraseña(String contraseña){}
    public void setTitulo(boolean titulo){}
    public void setEspecialidad(String especialidad){}
    public void setPeso(int peso){}
    
    //Abstracto
    public abstract void Sueldo(int horas);
    
}