package Carniceria_Interfaz;

/**
 *
 * @author MierderTheKat
 */
public final class M_Editar_Producto extends javax.swing.JFrame {
    
    public M_Editar_Producto() {
        initComponents();
        
        ocultarTODO();
        if(M_Login.ArrayP.isEmpty())
        {
            TF_Informacion.setText("No hay productos agregados");
        }
        else
        {   
            String matriz [] [] = new String [M_Login.ArrayP.size()] [2];
            Matriz(matriz);
        }
    }
    
    public void Matriz(String[][] matriz)
    {
    for(int i=0; i<M_Login.ArrayP.size(); i++)
    {
        String carne = M_Login.ArrayP.get(i).getTipo();
        switch(carne)
        {
            case "Ternera":
                Agregar_M("Ternera",matriz);
                break;
            case "Cerdo":
                Agregar_M("Cerdo",matriz);
                break;
            case "Pollo":
                Agregar_M("Pollo",matriz);
                break;
            case "Cordero":
                Agregar_M("Cordero",matriz);
                break;
            default:
                System.out.println("Que haces aqui _ Edit");
                break;
        }
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
        matriz,
        new String [] {
            "ID", "Nombre"}
        ){
        boolean[] canEdit = new boolean [] {
            false, false
        };
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }});
    }
    }
    
    public void Agregar_M(String Tipo, String[][] matriz)
    {
        if(M_Login.ArrayP.isEmpty()){}
        else
        {
            for(int i=0; i<M_Login.ArrayP.size(); i++)
            {
                if(M_Login.ArrayP.get(i).getTipo().equals(Tipo))
                {
                    matriz [i] [0] = " " + M_Login.ArrayP.get(i).getId_Producto();
                    matriz [i] [1] = " " + M_Login.ArrayP.get(i).getNombre();
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        CB_Elegir = new javax.swing.JComboBox<>();
        L_ID = new javax.swing.JLabel();
        TF_ID = new javax.swing.JTextField();
        L_Extra = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Editar = new javax.swing.JButton();
        L_Informacion = new javax.swing.JLabel();
        TF_Informacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Modificar Inventario");
        Label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 399, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 261, -1, -1));

        CB_Elegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elije una Opcion", "Agregar Producto", "Editar Producto", "Eliminar Producto" }));
        CB_Elegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_ElegirActionPerformed(evt);
            }
        });
        getContentPane().add(CB_Elegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 85, -1, -1));

        L_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_ID.setText("Inserte ID");
        getContentPane().add(L_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 137, 72, -1));

        TF_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 159, 72, -1));

        L_Extra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Extra.setText("Producto a Eliminar:");
        getContentPane().add(L_Extra, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 163, -1, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 38, 195, 216));

        Editar.setText("Cambiar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 195, -1, -1));

        L_Informacion.setText("Informacion:");
        getContentPane().add(L_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 260, -1, 34));

        TF_Informacion.setEditable(false);
        TF_Informacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 265, 222, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void ocultarTODO()
    {
        L_Extra.setVisible(false);
        TF_ID.setVisible(false);
        L_ID.setVisible(false);
        Editar.setVisible(false);
    }
    public void mostrarTODO()
    {
        L_Extra.setVisible(true);
        TF_ID.setVisible(true);
        L_ID.setVisible(true);
        Editar.setVisible(true);
    }
    
    public int ID_Buscar(String ID)
    {
        int a = 0;
        if(M_Login.ArrayP.isEmpty())
        {
            TF_Informacion.setText("No hay productos registrados");
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
    
    public void ID_Eliminar(String ID)
    {
        int a = ID_Buscar(ID);
        
        if(M_Login.ArrayP.get(a).getId_Producto().equals(ID))
        {
            TF_Informacion.setText("El Producto " + M_Login.ArrayP.get(a).getNombre()+ " ha sido eliminado");
            M_Login.ArrayP.remove(a);
            String matriz [] [] = new String [M_Login.ArrayP.size()] [2];
            Matriz(matriz);
        }
        else 
        {
           TF_Informacion.setText("No se encontro el ID: " + ID);
        }
        TF_ID.setText("");
    }
    
    public void ID_Editar(String ID)
    {
        int a = ID_Buscar(ID);
        
        if(M_Login.ArrayP.get(a).getId_Producto().equals(ID))
        {
            TF_Informacion.setText("Llendo a pantalla Editar");
            M_Agregar_Producto Pantalla = new M_Agregar_Producto(ID);
            Pantalla.setVisible(true); //Se hace visible
            Pantalla.setLocationRelativeTo(null); //Se centra
            Pantalla.setResizable(false); //Evita que estiren la pantalla
            this.dispose();
        }
        else 
        {
            TF_Informacion.setText("No se encontro el ID: " + ID);
        }
        TF_ID.setText("");
    }
    
    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        M_Inicial pantalla = new M_Inicial();
        pantalla.setVisible(true); //Se hace visible
        pantalla.setLocationRelativeTo(null);//Se centra
        pantalla.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void CB_ElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_ElegirActionPerformed
        TF_ID.setText("");
        int a = CB_Elegir.getSelectedIndex();
        switch(a)
        {
            case 1:
            //---Agregar---
                M_Agregar_Producto Pantalla = new M_Agregar_Producto("");
                Pantalla.setVisible(true); //Se hace visible
                Pantalla.setLocationRelativeTo(null); //Se centra
                Pantalla.setResizable(false); //Evita que estiren la pantalla
                this.dispose();
                break;
            case 2:
                //---Editar---
                Label_Titulo.setText("Editar Producto");
                mostrarTODO();
                L_Extra.setText("Producto a Editar:");
                Editar.setText("Editar");
                break;
            case 3:
                //---Eliminar---
                Label_Titulo.setText("Eliminar Producto");
                mostrarTODO();
                L_Extra.setText("Producto a Eliminar:");
                Editar.setText("Eliminar");
                break;
            default:
                System.out.println("");
                Label_Titulo.setText("Elije una opcion");
                L_Extra.setVisible(false);
                L_Extra.setText("");
                L_ID.setVisible(false);
                TF_ID.setVisible(false);
                TF_ID.setText("");
                Editar.setVisible(false);
                Editar.setText("");
                break;
        }
    }//GEN-LAST:event_CB_ElegirActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed

        int a = CB_Elegir.getSelectedIndex();

        if(M_Login.ArrayP.isEmpty())
        {
            TF_Informacion.setText("No se han agregado productos");
        }
        else if(TF_ID.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa el ID");
        }
        else
        {
            switch(a)
            {
                case 2:
                //---Editar---
                ID_Editar(TF_ID.getText());
                break;
                case 3:
                //---Eliminar---
                ID_Eliminar(TF_ID.getText());
                break;
                default:
                break;
            }
        }
    }//GEN-LAST:event_EditarActionPerformed

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
            java.util.logging.Logger.getLogger(M_Editar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_Editar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_Editar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_Editar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Editar_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Elegir;
    private javax.swing.JButton Editar;
    private javax.swing.JLabel L_Extra;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_Informacion;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_Informacion;
    private javax.swing.JTable Tabla;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
