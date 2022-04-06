package Carniceria_Interfaz;

import Carniceria_Empledos.*;

/**
 *
 * @author MierderTheKat
 */
public final class M_Agregar_Empleado extends javax.swing.JFrame {
    
    String ID_Editar;
    
    public M_Agregar_Empleado(){
        initComponents();
    }
    
    public M_Agregar_Empleado(String ID_editar){
        initComponents();
        this.ID_Editar = ID_editar;
        
        ocultarBotones();
        
        if(M_Login.ArrayE.isEmpty())
        {
            Label_Titulo.setText("Ingresa el ADMIN");
            CB_Puestos.setVisible(false);
            L_Puesto.setVisible(false);
            //---Administrador---
            mostrar_1();
            mostrar_2();
            mostrar_3();
            ocultar4();
            ocultarBotones();
            Regresar.setVisible(false);
            Agregar_ArrayEmpty.setVisible(true);
            L_SI.setText("¿Tiene titulo?");
            L_Extra1.setText("ID:");
            L_Extra2.setText("Contraseña:");
        }
        else if(ID_Editar.isEmpty())
        {
            ocultar1();
            ocultar2();
            ocultar3();
            ocultar4();
            CB_Puestos.setVisible(true);
            L_Puesto.setVisible(true);
            ocultarBotones();
        }
        else
        {
            CB_Puestos.setVisible(false);
            L_Puesto.setVisible(false);
            mostrar_Editar();
            ocultarBotones();
            Editar.setVisible(true);
        }
    }
    
    
    public void mostrar_Editar()
    {
        int a = ID_Buscar(ID_Editar);
        String b = M_Login.ArrayE.get(a).getPuesto();
        switch(b)
        {
            case "Administrador":
                //---Administrador---
                Label_Titulo.setText("Editar Administrador");
                mostrar_1();
                mostrar_2();
                mostrar_3();
                ocultar4();
                L_SI.setText("¿Tiene titulo?");
                L_Extra1.setText("ID:");
                L_Extra2.setText("Contraseña:");
                break;
            case "Cajero":
                //---Cajero---
                Label_Titulo.setText("Editar Cajero");
                ocultar1();
                mostrar_2();
                mostrar_3();
                ocultar4();
                L_Extra1.setText("ID:");
                L_Extra2.setText("Contraseña:");
                break;
            case "Carnicero":
                //---Carnicero---
                Label_Titulo.setText("Editar Carnicero");
                ocultar1();
                mostrar_2();
                mostrar_3();
                mostrar_4();
                L_Extra1.setText("ID:");
                L_Extra2.setText("Peso soportado:");
                L_Extra3.setText("Especialidad de Corte:");
                break;
        }
    }
    
    public void ocultarBotones()
    {
        Agregar.setVisible(false);
        Agregar_ArrayEmpty.setVisible(false);
        Editar.setVisible(false);
    }
    public void ocultar1()
    {
        L_SI.setVisible(false);
        CB_SI.setVisible(false);
    }
    public void ocultar2()
    {
        L_Extra1.setVisible(false);
        TF_Extra1.setVisible(false);
    }
    public void ocultar3()
    {
        L_Extra2.setVisible(false);
        TF_Extra2.setVisible(false);
    }
    public void ocultar4()
    {
        L_Extra3.setVisible(false);
        TF_Extra3.setVisible(false);
    }
    public void mostrar_1()
    {
        L_SI.setVisible(true);
        CB_SI.setVisible(true);
        Agregar.setVisible(true);
    }
    public void mostrar_2()
    {
        L_Extra1.setVisible(true);
        TF_Extra1.setVisible(true);
        Agregar.setVisible(true);
    }
    public void mostrar_3()
    {
        L_Extra2.setVisible(true);
        TF_Extra2.setVisible(true);
        Agregar.setVisible(true);
    }
    public void mostrar_4()
    {
        L_Extra3.setVisible(true);
        TF_Extra3.setVisible(true);
        Agregar.setVisible(true);
    }
    
    public boolean ID_Copia(String ID)
    {
        boolean a = false;
        if(M_Login.ArrayE.isEmpty()){}
        else
        {
            for(int i=0; i<M_Login.ArrayE.size(); i++)
            {
                if(M_Login.ArrayE.get(i).getId_Empleado().equals(ID))
                {
                    a=true;
                }
            }
        }
        return a;
    }
    
    public int ID_Buscar(String ID)
    {
        int a = 0;
        if(M_Login.ArrayE.isEmpty())
        {
            TF_Informacion.setText("No hay empleados registrados");
        }
        else
        {
            for(int i=0; i<M_Login.ArrayE.size(); i++)
            {
                if(M_Login.ArrayE.get(i).getId_Empleado().equals(ID))
                {
                    a = i;
                }
            }
        }
        return a;
    }
    
    public void setEditar(int a, String ID, String Nombre, String FechNac)
    {
        M_Login.ArrayE.get(a).setId_Empleado(ID);
        M_Login.ArrayE.get(a).setNombre(Nombre);
        M_Login.ArrayE.get(a).setFech_Nac(FechNac);
    }
    
    public void regresar()
    {
        M_Editar_Empleado pantalla = new M_Editar_Empleado();
        pantalla.setVisible(true); //Se hace visible
        pantalla.setLocationRelativeTo(null);//Se centra
        pantalla.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        L_Puesto = new javax.swing.JLabel();
        CB_Puestos = new javax.swing.JComboBox<>();
        L_Nombre = new javax.swing.JLabel();
        TF_Nombre = new javax.swing.JTextField();
        L_FecNac = new javax.swing.JLabel();
        TF_FecNac = new javax.swing.JTextField();
        Regresar = new javax.swing.JButton();
        L_Informacion = new javax.swing.JLabel();
        TF_Informacion = new javax.swing.JTextField();
        L_SI = new javax.swing.JLabel();
        CB_SI = new javax.swing.JCheckBox();
        L_Extra1 = new javax.swing.JLabel();
        TF_Extra1 = new javax.swing.JTextField();
        TF_Extra2 = new javax.swing.JTextField();
        L_Extra2 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Agregar_ArrayEmpty = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        TF_Extra3 = new javax.swing.JTextField();
        L_Extra3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Agregar Empleado");
        Label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 402, -1));

        L_Puesto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Puesto.setText("Puesto");
        getContentPane().add(L_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 109, 180, -1));

        CB_Puestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Administrador", "Cajero", "Carnicero" }));
        CB_Puestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_PuestosActionPerformed(evt);
            }
        });
        getContentPane().add(CB_Puestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 104, 116, -1));

        L_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Nombre.setText("Ingresa el Nombre:");
        L_Nombre.setToolTipText("");
        getContentPane().add(L_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 180, -1));

        TF_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 44, 124, -1));

        L_FecNac.setText("Ingresa la Fecha de Nacimiento:");
        getContentPane().add(L_FecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, -1, -1));

        TF_FecNac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_FecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 74, 124, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 264, -1, -1));

        L_Informacion.setText("Informacion:");
        getContentPane().add(L_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 268, -1, 24));

        TF_Informacion.setEditable(false);
        TF_Informacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 268, 224, -1));

        L_SI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_SI.setText("Boolean");
        getContentPane().add(L_SI, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 139, 76, 18));

        CB_SI.setText("Si");
        getContentPane().add(CB_SI, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 139, -1, 18));

        L_Extra1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Extra1.setText("Pregunta Extra 1");
        getContentPane().add(L_Extra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 136, 107, 24));

        TF_Extra1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Extra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 136, 115, -1));

        TF_Extra2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Extra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 166, 115, -1));

        L_Extra2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Extra2.setText("Pregunta Extra 2");
        getContentPane().add(L_Extra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 166, 107, 24));

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 226, -1, -1));

        Agregar_ArrayEmpty.setText("Agregar Admin");
        Agregar_ArrayEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_ArrayEmptyActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar_ArrayEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 226, -1, -1));

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 226, -1, -1));

        TF_Extra3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Extra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 196, 115, -1));

        L_Extra3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Extra3.setText("Especialidad de Corte");
        getContentPane().add(L_Extra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 196, 126, 24));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        regresar();
    }//GEN-LAST:event_RegresarActionPerformed

    private void CB_PuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_PuestosActionPerformed
        CB_SI.setSelected(false);
        TF_Extra1.setText("");
        TF_Extra2.setText("");
        TF_Extra3.setText("");
        int a = CB_Puestos.getSelectedIndex();
        
        if(TF_Nombre.getText().isEmpty() || TF_FecNac.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa primero los datos");
            CB_Puestos.setSelectedIndex(0);
            ocultar1();
            ocultar2();
            ocultar3();
            ocultar4();
            Agregar.setVisible(false);
        }
        else
        {
            switch(a)
            {
                case 1:
                    //---Administrador---
                    mostrar_1();
                    mostrar_2();
                    mostrar_3();
                    ocultar4();
                    L_SI.setText("¿Tiene titulo?");
                    L_Extra1.setText("ID:");
                    L_Extra2.setText("Contraseña:");
                    break;
                case 2:
                    //---Cajero---
                    ocultar1();
                    mostrar_2();
                    mostrar_3();
                    ocultar4();
                    L_Extra1.setText("ID:");
                    L_Extra2.setText("Contraseña:");
                    break;
                case 3:
                    //---Carnicero---
                    ocultar1();
                    mostrar_2();
                    mostrar_3();
                    mostrar_4();
                    L_Extra1.setText("ID:");
                    L_Extra2.setText("Peso soportado:");
                    L_Extra3.setText("Especialidad de Corte:");
                    break;
                default:
                    System.out.println("");
                    ocultar1();
                    ocultar2();
                    ocultar3();
                    ocultar4();
                    TF_Nombre.setText("");
                    TF_FecNac.setText("");
                    TF_Extra1.setText("");
                    TF_Extra2.setText("");
                    TF_Extra3.setText("");
                    CB_SI.setContentAreaFilled(false);
                    Agregar.setVisible(false);
                    break;
            }
        }
    }//GEN-LAST:event_CB_PuestosActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        String ID, Contraseña, Nombre, FechNac;
        int a = CB_Puestos.getSelectedIndex();
        
        if(TF_Nombre.getText().isEmpty() || TF_FecNac.getText().isEmpty() || TF_Extra1.getText().isEmpty() || TF_Extra2.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa todos los datos");
        }
        else if(TF_Extra1.getText().length() < 4)
        {
            TF_Informacion.setText("ID demasiado pequeño");
            TF_Extra1.setText("");
        }
        else if(ID_Copia(TF_Extra1.getText())==true)
        {
            TF_Informacion.setText("ID '"+TF_Extra1.getText()+"' en uso");
            TF_Extra1.setText("");
        }
        else
        {
            switch(a)
            {
                case 1:
                    //System.out.println("---Administrador---");
                    
                    System.out.println("---Administrador---");
                    ID = TF_Extra1.getText();
                    System.out.println("ID: "+ID); //ID del empleado
                    Contraseña = TF_Extra2.getText();
                    System.out.println("Contraseña: "+Contraseña); //Contraseña del empleado

                    Nombre = TF_Nombre.getText();
                    System.out.println("Nombre: "+Nombre); //Nombre
                    FechNac = TF_FecNac.getText();
                    System.out.println("Fecha: "+FechNac); //Fecha de nacimiento
                    boolean titulo = CB_SI.isSelected();
                    System.out.println("Titulo : "+titulo); //Titulo

                    //Ingresar datos al objeto
                    S_Empleados R = new E_Administrador(ID, Nombre, FechNac, "Administrador", "8", Contraseña, titulo);
                    M_Login.ArrayE.add(R);

                    CB_Puestos.setSelectedIndex(0);
                    TF_Informacion.setText(R.getNombre() + " fue añadido/a     con ID: "+ID);
                    break;
                case 2:
                    //System.out.println("---Cajero---");
                    
                    System.out.println("---Cajero---");
                    ID = TF_Extra1.getText();
                    System.out.println("ID: "+ID); //ID del empleado
                    Contraseña = TF_Extra2.getText();
                    System.out.println("Contraseña: "+Contraseña); //Contraseña del empleado

                    Nombre = TF_Nombre.getText();
                    System.out.println("Nombre: "+Nombre); //Nombre
                    FechNac = TF_FecNac.getText();
                    System.out.println("Fecha: "+FechNac); //Fecha de nacimiento

                    //Ingresar datos al objeto
                    S_Empleados P = new E_Cajero(ID, Nombre, FechNac, "Cajero", "8", Contraseña);
                    M_Login.ArrayE.add(P);

                    CB_Puestos.setSelectedIndex(0);
                    TF_Informacion.setText(P.getNombre() + " fue añadido/a     con ID: "+ID);
                    break;
                case 3:
                    //System.out.println("---Carnicero---");
                    
                    if(TF_Extra3.getText().isEmpty())
                    {
                        TF_Informacion.setText("Ingresa todos los datos");
                    }
                    else if(Integer.parseInt(TF_Extra2.getText()) < 6 || Integer.parseInt(TF_Extra2.getText()) > 80 )
                    {
                        if(Integer.parseInt(TF_Extra2.getText()) < 6)
                        {
                            TF_Informacion.setText("Peso de carga insuficiente");
                        }
                        else
                        {
                            TF_Informacion.setText("Peso de carga inhumano");
                        }
                        TF_Extra2.setText("");
                    }
                    else
                    {
                        System.out.println("---Carnicero---");

                        ID = TF_Extra1.getText();
                        System.out.println("ID: "+ID); //ID del empleado
                        Nombre = TF_Nombre.getText();
                        System.out.println("Nombre: "+Nombre); //Nombre
                        FechNac = TF_FecNac.getText();
                        System.out.println("Fecha: "+FechNac); //Fecha de nacimiento
                        int peso = Integer.parseInt(TF_Extra2.getText());
                        System.out.println("Peso: "+peso+"Kg"); //Peso que carga
                        String Especialidad = TF_Extra3.getText();
                        System.out.println("Especialidad: "+Especialidad); //Especialidad

                        //Ingresar datos al objeto
                        S_Empleados Car = new E_Carnicero(ID, Nombre, FechNac, "Carnicero", "8", Especialidad, peso);
                        M_Login.ArrayE.add(Car);

                        CB_Puestos.setSelectedIndex(0);
                        TF_Informacion.setText(Car.getNombre() + " fue añadido/a     con ID: "+ID);
                    }
                    break;
                default:
                    System.out.println("");
                    ocultar1();
                    ocultar2();
                    ocultar3();
                    ocultar4();
                    TF_Nombre.setText("");
                    TF_FecNac.setText("");
                    CB_SI.setContentAreaFilled(false);
                    Agregar.setVisible(false);
                    break;
            }
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void Agregar_ArrayEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_ArrayEmptyActionPerformed
        String ID, Contraseña, Nombre, FechNac;
        System.out.println("---Administrador---");
        if(TF_Extra1.getText().isEmpty() || TF_Extra2.getText().isEmpty() || TF_Nombre.getText().isEmpty() || TF_FecNac.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa todos los datos");
        }
        else if(TF_Extra1.getText().length() < 4)
        {
            TF_Informacion.setText("ID demasiado pequeño");
            TF_Extra1.setText("");
        }
        else
        {
            ID = TF_Extra1.getText();
            System.out.println("ID: "+ID); //ID del empleado
            Contraseña = TF_Extra2.getText();
            System.out.println("Contraseña: "+Contraseña); //Contraseña del empleado

            Nombre = TF_Nombre.getText();
            System.out.println("Nombre: "+Nombre); //Nombre
            FechNac = TF_FecNac.getText();
            System.out.println("Fecha: "+FechNac); //Fecha de nacimiento
            boolean titulo = CB_SI.isSelected();
            System.out.println("Titulo : "+titulo); //Titulo

            //Ingresar datos al objeto
            S_Empleados R = new E_Administrador(ID, Nombre, FechNac, "Administrador", "8", Contraseña, titulo);
            M_Login.ArrayE.add(R);
            
            M_Inicial pantalla = new M_Inicial();
            pantalla.setVisible(true); //Se hace visible
            pantalla.setLocationRelativeTo(null);//Se centra
            pantalla.setResizable(false);//Evita que estiren la pantalla
            this.dispose();
        }
    }//GEN-LAST:event_Agregar_ArrayEmptyActionPerformed
    
    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        String ID, Contraseña, Nombre, FechNac, Puesto;
        int a = ID_Buscar(ID_Editar);
        
        if(TF_Extra1.getText().isEmpty() || TF_Extra2.getText().isEmpty() || TF_Nombre.getText().isEmpty() || TF_FecNac.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa todos los datos");
        }
        else if(ID_Copia(TF_Extra1.getText())==true)
        {
            TF_Informacion.setText("ID '"+TF_Extra1.getText()+"' en uso");
            TF_Extra1.setText("");
        }
        else if(TF_Extra1.getText().length() < 4)
        {
            TF_Informacion.setText("ID demasiado pequeño");
            TF_Extra1.setText("");
        }
        else
        {
            Puesto = M_Login.ArrayE.get(a).getPuesto();
            switch(Puesto)
            {
                case "Administrador":
                    System.out.println("---Administrador---");
                    ID = TF_Extra1.getText();
                    System.out.println("ID: "+ID); //ID del empleado
                    Contraseña = TF_Extra2.getText();
                    System.out.println("Contraseña: "+Contraseña); //Contraseña del empleado

                    Nombre = TF_Nombre.getText();
                    System.out.println("Nombre: "+Nombre); //Nombre
                    FechNac = TF_FecNac.getText();
                    System.out.println("Fecha: "+FechNac); //Fecha de nacimiento
                    boolean titulo = CB_SI.isSelected();
                    System.out.println("Titulo : "+titulo); //Titulo

                    //Ingresar datos al objeto
                    setEditar(a, ID, Nombre, FechNac);
                    M_Login.ArrayE.get(a).setTitulo(titulo);
                    M_Login.ArrayE.get(a).setContraseña(Contraseña);
                    regresar();
                    break;
                case "Cajero":
                    System.out.println("---Cajero---");
                    ID = TF_Extra1.getText();
                    System.out.println("ID: "+ID); //ID del empleado
                    Contraseña = TF_Extra2.getText();
                    System.out.println("Contraseña: "+Contraseña); //Contraseña del empleado

                    Nombre = TF_Nombre.getText();
                    System.out.println("Nombre: "+Nombre); //Nombre
                    FechNac = TF_FecNac.getText();
                    System.out.println("Fecha: "+FechNac); //Fecha de nacimiento

                    //Ingresar datos al objeto
                    setEditar(a, ID, Nombre, FechNac);
                    M_Login.ArrayE.get(a).setContraseña(Contraseña);
                    regresar();
                    break;
                case "Carnicero":
                    //System.out.println("---Carnicero---");
                    
                    if(TF_Extra3.getText().isEmpty())
                    {
                        TF_Informacion.setText("Ingresa todos los datos");
                    }
                    else if(Integer.parseInt(TF_Extra2.getText()) < 6 || Integer.parseInt(TF_Extra2.getText()) > 80 )
                    {
                        if(Integer.parseInt(TF_Extra2.getText()) < 6)
                        {
                            TF_Informacion.setText("Peso de carga insuficiente");
                        }
                        else
                        {
                            TF_Informacion.setText("Peso de carga inhumano");
                        }
                        TF_Extra2.setText("");
                    }
                    else
                    {
                        System.out.println("---Carnicero---");
                        
                        ID = TF_Extra1.getText();
                        System.out.println("ID: "+ID); //ID del empleado
                        Nombre = TF_Nombre.getText();
                        System.out.println("Nombre: "+Nombre); //Nombre
                        FechNac = TF_FecNac.getText();
                        System.out.println("Fecha: "+FechNac); //Fecha de nacimiento
                        int peso = Integer.parseInt(TF_Extra2.getText());
                        System.out.println("Peso: "+peso+"Kg"); //Peso que carga
                        String Especialidad = TF_Extra3.getText();
                        System.out.println("Especialidad: "+Especialidad); //Especialidad
                        
                        //Ingresar datos al objeto
                        setEditar(a, ID, Nombre, FechNac);
                        M_Login.ArrayE.get(a).setPeso(peso);
                        M_Login.ArrayE.get(a).setEspecialidad(Especialidad);
                        regresar();
                    }
                    break;
                default:
                    System.out.println("Como llegaste aqui");
                    break;
            }
        }
    }//GEN-LAST:event_EditarActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Agregar_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Agregar_ArrayEmpty;
    private javax.swing.JComboBox<String> CB_Puestos;
    private javax.swing.JCheckBox CB_SI;
    private javax.swing.JButton Editar;
    private javax.swing.JLabel L_Extra1;
    private javax.swing.JLabel L_Extra2;
    private javax.swing.JLabel L_Extra3;
    private javax.swing.JLabel L_FecNac;
    private javax.swing.JLabel L_Informacion;
    private javax.swing.JLabel L_Nombre;
    private javax.swing.JLabel L_Puesto;
    private javax.swing.JLabel L_SI;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TF_Extra1;
    private javax.swing.JTextField TF_Extra2;
    private javax.swing.JTextField TF_Extra3;
    private javax.swing.JTextField TF_FecNac;
    private javax.swing.JTextField TF_Informacion;
    private javax.swing.JTextField TF_Nombre;
    // End of variables declaration//GEN-END:variables
}
