package Carniceria_Interfaz;

import Carniceria_Productos.*;

/**
 *
 * @author MierderTheKat
 */
public final class M_Agregar_Producto extends javax.swing.JFrame {
    
    String ID_Editar;
    
    public M_Agregar_Producto() {
        initComponents();
    }
    
    public M_Agregar_Producto(String ID_editar){
        initComponents();
        this.ID_Editar = ID_editar;
        ocultarBotones();
        ocultar();
        
        if(ID_Editar.isEmpty())
        {
            ocultar();
            CB_Tipo.setVisible(true);
            L_Tipo.setVisible(true);
            ocultarBotones();
        }
        else
        {
            CB_Tipo.setVisible(false);
            L_Tipo.setVisible(false);
            TF_ID.setEditable(false);
            mostrar_Editar();
            mostrar();
            Agregar.setVisible(false);
            Editar.setVisible(true);
        }
    }
    
    public void mostrar_Editar()
    {
        int a = ID_Buscar(ID_Editar);
        
        TF_ID.setText(ID_Editar);
        TF_Nombre.setText(M_Login.ArrayP.get(a).getNombre());
        TF_Precio.setText(M_Login.ArrayP.get(a).getPrecio()+"");
        TF_Kg_Inv.setText(M_Login.ArrayP.get(a).getKg()+"");
        
        String b = M_Login.ArrayP.get(a).getTipo();
        switch(b)
        {
            case "Ternera":
                Label_Titulo.setText("Editar Ternera");
                break;
            case "Cerdo":
                Label_Titulo.setText("Editar Cerdo");
                break;
            case "Pollo":
                Label_Titulo.setText("Editar Pollo");
                break;
            case "Cordero":
                Label_Titulo.setText("Editar Cordero");
                break;
        }
    }
    
    public void ocultarBotones()
    {
        Agregar.setVisible(false);
        Editar.setVisible(false);
    }
    public void ocultar()
    {
        L_ID.setVisible(false);
        TF_ID.setVisible(false);
    }
    public void mostrar()
    {
        L_ID.setVisible(true);
        TF_ID.setVisible(true);
        Agregar.setVisible(true);
    }
    
    public boolean ID_Copia(String ID)
    {
        boolean a = false;
        if(M_Login.ArrayP.isEmpty()){}
        else
        {
            for(int i=0; i<M_Login.ArrayP.size(); i++)
            {
                if(M_Login.ArrayP.get(i).getId_Producto().equals(ID))
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
        if(M_Login.ArrayP.isEmpty())
        {
            TF_Informacion.setText("No hay Productos registrados");
        }
        else
        {
            for(int i=0; i<M_Login.ArrayP.size(); i++)
            {
                if(M_Login.ArrayP.get(i).getId_Producto().equals(ID))
                {
                    a = i;
                }
            }
        }
        return a;
    }
    
    public void setEditar(int a, String ID, String Nombre, double Kg, double Precio)
    {
        M_Login.ArrayP.get(a).setId_Producto(ID);
        M_Login.ArrayP.get(a).setNombre(Nombre);
        M_Login.ArrayP.get(a).setKg(Kg);
        M_Login.ArrayP.get(a).setPrecio(Precio);
    }
    
    public void regresar()
    {
        M_Editar_Producto pantalla = new M_Editar_Producto();
        pantalla.setVisible(true); //Se hace visible
        pantalla.setLocationRelativeTo(null);//Se centra
        pantalla.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        L_Nombre = new javax.swing.JLabel();
        TF_Nombre = new javax.swing.JTextField();
        L_Kg_Inv = new javax.swing.JLabel();
        TF_Kg_Inv = new javax.swing.JTextField();
        L_Precio = new javax.swing.JLabel();
        TF_Precio = new javax.swing.JTextField();
        L_Tipo = new javax.swing.JLabel();
        CB_Tipo = new javax.swing.JComboBox<>();
        L_ID = new javax.swing.JLabel();
        TF_ID = new javax.swing.JTextField();
        Editar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        L_Informacion = new javax.swing.JLabel();
        TF_Informacion = new javax.swing.JTextField();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Agregar Producto");
        Label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        L_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Nombre.setText("Nombre:");
        L_Nombre.setToolTipText("");
        getContentPane().add(L_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 54, 99, -1));

        TF_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 50, 116, -1));

        L_Kg_Inv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Kg_Inv.setText("Kg en Inventario:");
        getContentPane().add(L_Kg_Inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 84, 99, -1));

        TF_Kg_Inv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Kg_Inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 80, 116, -1));

        L_Precio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Precio.setText("Precio por Kg:");
        getContentPane().add(L_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 110, 99, 24));

        TF_Precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 110, 116, -1));

        L_Tipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Tipo.setText("Tipo de carne:");
        getContentPane().add(L_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 151, 99, -1));

        CB_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Ternera", "Cerdo", "Pollo", "Cordero" }));
        CB_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_TipoActionPerformed(evt);
            }
        });
        getContentPane().add(CB_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 146, 116, -1));

        L_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_ID.setText("ID:");
        getContentPane().add(L_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 178, 99, 24));

        TF_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 178, 115, -1));

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 80, -1));

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 80, -1));

        L_Informacion.setText("Informacion:");
        getContentPane().add(L_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 262, -1, 32));

        TF_Informacion.setEditable(false);
        TF_Informacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 266, 222, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 262, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CB_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_TipoActionPerformed
        int a = CB_Tipo.getSelectedIndex();
        switch(a)
        {
            case 0:
                TF_ID.setText("");
                TF_Nombre.setText("");
                TF_Kg_Inv.setText("");
                TF_Precio.setText("");
        }
        
        if(TF_Nombre.getText().isEmpty() || TF_Kg_Inv.getText().isEmpty() || TF_Precio.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa todos los datos");
            CB_Tipo.setSelectedIndex(0);
            ocultar();
            Agregar.setVisible(false);
        }
        else if(Double.parseDouble(TF_Kg_Inv.getText()) < 0 || Double.parseDouble(TF_Kg_Inv.getText()) > 1000)
        {
            if(Double.parseDouble(TF_Kg_Inv.getText()) < 0)
            {
                TF_Informacion.setText("Los Kg son menores a 0");
            }
            else
            {
                TF_Informacion.setText("No caben tantos Kg en el almacen");
            }
            TF_Kg_Inv.setText("");
        }
        else if(Double.parseDouble(TF_Precio.getText()) < 5 || Double.parseDouble(TF_Precio.getText()) > 1000 )
        {
            if(Double.parseDouble(TF_Precio.getText()) < 6)
            {
                TF_Informacion.setText("Precio Bajo");
            }
            else
            {
                TF_Informacion.setText("Precio Muy Alto");
            }
            TF_Precio.setText("");
        }
        else
        {
            mostrar();
        }
    }//GEN-LAST:event_CB_TipoActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        String ID, Nombre;
        double Kg, Precio;
        int a = ID_Buscar(ID_Editar);
        
        if(TF_Precio.getText().isEmpty() || TF_ID.getText().isEmpty() || TF_Nombre.getText().isEmpty() || TF_Kg_Inv.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa todos los datos");
        }
        else if(Double.parseDouble(TF_Kg_Inv.getText()) < 0 || Double.parseDouble(TF_Kg_Inv.getText()) > 1000)
        {
            if(Double.parseDouble(TF_Kg_Inv.getText()) < 0)
            {
                TF_Informacion.setText("Los Kg son menores a 0");
            }
            else
            {
                TF_Informacion.setText("No caben tantos Kg en el almacen");
            }
            TF_Kg_Inv.setText("");
        }
        else if(Double.parseDouble(TF_Precio.getText()) < 5 || Double.parseDouble(TF_Precio.getText()) > 1000 )
        {
            if(Double.parseDouble(TF_Precio.getText()) < 6)
            {
                TF_Informacion.setText("Precio Bajo");
            }
            else
            {
                TF_Informacion.setText("Precio Muy Alto");
            }
            TF_Precio.setText("");
        }
        else
        {
            switch(M_Login.ArrayP.get(a).getTipo())
            {
                case "Ternera":
                    System.out.println("---Ternera---");
                    
                    ID = TF_ID.getText();
                    System.out.println("ID: "+ID); //ID del Producto
                    Nombre = TF_Nombre.getText();
                    System.out.println("Nombre: "+Nombre); //Nombre del Producto
                    Kg = Double.parseDouble(TF_Kg_Inv.getText());
                    System.out.println("Kg en Inventario: "+Kg); //Kg del Producto
                    Precio = Double.parseDouble(TF_Precio.getText());
                    System.out.println("Precio: "+Precio); //Precio del Producto

                    //Ingresar datos al objeto
                    setEditar(a, ID, Nombre, Kg, Precio);
                    regresar();
                break;
                case "Cerdo":
                    System.out.println("---Cerdo---");
                    
                    ID = TF_ID.getText();
                    System.out.println("ID: "+ID); //ID del Producto
                    Nombre = TF_Nombre.getText();
                    System.out.println("Nombre: "+Nombre); //Nombre del Producto
                    Kg = Double.parseDouble(TF_Kg_Inv.getText());
                    System.out.println("Kg en Inventario: "+Kg); //Kg del Producto
                    Precio = Double.parseDouble(TF_Precio.getText());
                    System.out.println("Precio: "+Precio); //Precio del Producto

                    //Ingresar datos al objeto
                    setEditar(a, ID, Nombre, Kg, Precio);
                    regresar();
                break;
                case "Pollo":
                    System.out.println("---Pollo---");

                    ID = TF_ID.getText();
                    System.out.println("ID: "+ID); //ID del Producto
                    Nombre = TF_Nombre.getText();
                    System.out.println("Nombre: "+Nombre); //Nombre del Producto
                    Kg = Double.parseDouble(TF_Kg_Inv.getText());
                    System.out.println("Kg en Inventario: "+Kg); //Kg del Producto
                    Precio = Double.parseDouble(TF_Precio.getText());
                    System.out.println("Precio: "+Precio); //Precio del Producto

                    //Ingresar datos al objeto
                    setEditar(a, ID, Nombre, Kg, Precio);
                    regresar();
                    break;
                case "Cordero":
                    System.out.println("---Cordero---");

                    ID = TF_ID.getText();
                    System.out.println("ID: "+ID); //ID del Producto
                    Nombre = TF_Nombre.getText();
                    System.out.println("Nombre: "+Nombre); //Nombre del Producto
                    Kg = Double.parseDouble(TF_Kg_Inv.getText());
                    System.out.println("Kg en Inventario: "+Kg); //Kg del Producto
                    Precio = Double.parseDouble(TF_Precio.getText());
                    System.out.println("Precio: "+Precio); //Precio del Producto

                    //Ingresar datos al objeto
                    setEditar(a, ID, Nombre, Kg, Precio);
                    regresar();
                    break;
                default:
                    System.out.println("Como llegaste aqui - Edit");
                break;
            }
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        String ID, Nombre;
        double Kg, Precio;
        int a = CB_Tipo.getSelectedIndex();


        if(TF_Nombre.getText().isEmpty() || TF_Kg_Inv.getText().isEmpty() || TF_Precio.getText().isEmpty() || TF_ID.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa todos los datos");
        }
        else if(Double.parseDouble(TF_Kg_Inv.getText()) < 0 || Double.parseDouble(TF_Kg_Inv.getText()) > 1000)
        {
            if(Double.parseDouble(TF_Kg_Inv.getText()) < 0)
            {
                TF_Informacion.setText("Los Kg son menores a 0");
            }
            else
            {
                TF_Informacion.setText("No caben tantos Kg en el almacen");
            }
            TF_Kg_Inv.setText("");
        }
        else if(Double.parseDouble(TF_Precio.getText()) < 5 || Double.parseDouble(TF_Precio.getText()) > 1000 )
        {
            if(Double.parseDouble(TF_Precio.getText()) < 6)
            {
                TF_Informacion.setText("Precio Bajo");
            }
            else
            {
                TF_Informacion.setText("Precio Muy Alto");
            }
            TF_Precio.setText("");
        }
        else if(ID_Copia(TF_ID.getText())==true)
        {
            TF_Informacion.setText("ID '"+TF_ID.getText()+"' en uso");
            TF_ID.setText("");
        }
        else if(TF_ID.getText().length() < 4)
        {
            TF_Informacion.setText("ID demasiado pequeño");
            TF_ID.setText("");
        }
        else
        {
            switch(a)
            {
                case 1:
                    System.out.println("---Ternera---");
                    
                    ID = TF_ID.getText();
                    System.out.println("ID: "+ID); //ID del Producto
                    Nombre = TF_Nombre.getText();
                    System.out.println("Nombre: "+Nombre); //Nombre del Producto
                    Kg = Double.parseDouble(TF_Kg_Inv.getText());
                    System.out.println("Kg em Inventario: "+Kg); //Kg del Producto
                    Precio = Double.parseDouble(TF_Precio.getText());
                    System.out.println("Precio: "+Precio); //Precio del Producto

                    //Ingresar datos al objeto
                    Productos T = new P_Ternera(ID, Nombre, "Ternera", Kg, Precio);
                    M_Login.ArrayP.add(T);

                    CB_Tipo.setSelectedIndex(0);
                    TF_Informacion.setText(T.getNombre() + " añadido/a");
                break;
                case 2:
                    System.out.println("---Cerdo---");
                    
                    ID = TF_ID.getText();
                    System.out.println("ID: "+ID); //ID del Producto
                    Nombre = TF_Nombre.getText();
                    System.out.println("Nombre: "+Nombre); //Nombre del Producto
                    Kg = Double.parseDouble(TF_Kg_Inv.getText());
                    System.out.println("Kg em Inventario: "+Kg); //Kg del Producto
                    Precio = Double.parseDouble(TF_Precio.getText());
                    System.out.println("Precio: "+Precio); //Precio del Producto

                    //Ingresar datos al objeto
                    Productos C = new P_Cerdo(ID, Nombre, "Cerdo", Kg, Precio);
                    M_Login.ArrayP.add(C);

                    CB_Tipo.setSelectedIndex(0);
                    TF_Informacion.setText(C.getNombre() + " añadido/a");
                break;
                case 3:
                    System.out.println("---Pollo---");

                    ID = TF_ID.getText();
                    System.out.println("ID: "+ID); //ID del Producto
                    Nombre = TF_Nombre.getText();
                    System.out.println("Nombre: "+Nombre); //Nombre del Producto
                    Kg = Double.parseDouble(TF_Kg_Inv.getText());
                    System.out.println("Kg en Inventario: "+Kg); //Kg del Producto
                    Precio = Double.parseDouble(TF_Precio.getText());
                    System.out.println("Precio: "+Precio); //Precio del Producto

                    //Ingresar datos al objeto
                    Productos P = new P_Pollo(ID, Nombre, "Pollo", Kg, Precio);
                    M_Login.ArrayP.add(P);

                    CB_Tipo.setSelectedIndex(0);
                    TF_Informacion.setText(P.getNombre() + " añadido/a");
                    break;
                case 4:
                    System.out.println("---Cordero---");

                    ID = TF_ID.getText();
                    System.out.println("ID: "+ID); //ID del Producto
                    Nombre = TF_Nombre.getText();
                    System.out.println("Nombre: "+Nombre); //Nombre del Producto
                    Kg = Double.parseDouble(TF_Kg_Inv.getText());
                    System.out.println("Kg en Inventario: "+Kg); //Kg del Producto
                    Precio = Double.parseDouble(TF_Precio.getText());
                    System.out.println("Precio: "+Precio); //Precio del Producto

                    //Ingresar datos al objeto
                    Productos Co = new P_Cordero(ID, Nombre, "Cordero", Kg, Precio);
                    M_Login.ArrayP.add(Co);

                    CB_Tipo.setSelectedIndex(0);
                    TF_Informacion.setText(Co.getNombre() + " añadido/a");
                    break;
                default:
                System.out.println("");
                ocultar();
                TF_Nombre.setText("");
                TF_Kg_Inv.setText("");
                TF_Precio.setText("");
                Agregar.setVisible(false);
                break;
            }
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        regresar();
    }//GEN-LAST:event_RegresarActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(M_Agregar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_Agregar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_Agregar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_Agregar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Agregar_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> CB_Tipo;
    private javax.swing.JButton Editar;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_Informacion;
    private javax.swing.JLabel L_Kg_Inv;
    private javax.swing.JLabel L_Nombre;
    private javax.swing.JLabel L_Precio;
    private javax.swing.JLabel L_Tipo;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_Informacion;
    private javax.swing.JTextField TF_Kg_Inv;
    private javax.swing.JTextField TF_Nombre;
    private javax.swing.JTextField TF_Precio;
    // End of variables declaration//GEN-END:variables
}
