package Carniceria_Interfaz;

import java.text.DecimalFormat;

/**
 *
 * @author MierderTheKat
 */
public final class M_Ventas extends javax.swing.JFrame {
    
    DecimalFormat df = new DecimalFormat("#.00");
    
    public M_Ventas() {
        initComponents();
        
        ocultar2();
        ocultar3();
        if(M_Login.ArrayP.isEmpty())
        {
            TF_Informacion.setText("No hay productos agregados");
            ocultar1();
        }
        else
        {   
            String matriz [] [] = new String [M_Login.ArrayP.size()] [4];
            Matriz(matriz);
        }
    }
    public void ocultar1()
    {
        L_ID.setVisible(false);
        TF_ID.setVisible(false);
        L_Kg.setVisible(false);
        TF_Kg.setVisible(false);
        L_Costo.setVisible(false);
        TF_Costo.setVisible(false);
        Calcular_Precio.setVisible(false);
    }
    public void ocultar2()
    {
        TF_Costo.setVisible(false);
        L_Costo.setVisible(false);
        TF_Pago.setVisible(false);
        L_Pago.setVisible(false);
        Calcular_Cambio.setVisible(false);
        Cancelar.setVisible(false);
    }
    public void ocultar3()
    {
        TF_Cambio.setVisible(false);
        L_Cambio.setVisible(false);
    }
    public void mostrar2()
    {
        TF_Costo.setVisible(true);
        L_Costo.setVisible(true);
        TF_Pago.setVisible(true);
        L_Pago.setVisible(true);
        Calcular_Cambio.setVisible(true);
        Cancelar.setVisible(true);
    }
    public void mostrar3()
    {
        TF_Cambio.setVisible(true);
        L_Cambio.setVisible(true);
    }
    public void regreso()
    {
        ocultar2();
        mostrar3();
        
        TF_ID.setText("");
        TF_Kg.setText("");
        TF_ID.setEditable(true);
        TF_Kg.setEditable(true);
        TF_Pago.setText("");
        TF_Informacion.setText("");
    }
    
    public void Matriz(String [] [] matriz )
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
                    "ID", "Nombre", "Kg", "Precio"
                }
                ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
                });
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
                    matriz [i] [3] = " " + df.format(M_Login.ArrayP.get(i).getPrecio()) + "$";
                    if(M_Login.ArrayP.get(i).getKg() <= 0)
                    {
                        matriz [i] [2] = " 0.00Kg";
                    }
                    else
                    {
                        matriz [i] [2] = " " + df.format(M_Login.ArrayP.get(i).getKg()) + "Kg";
                    }
                }
            }
        }
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
    
    public double Venta(int a, double kg)
    {
        double Venta = (kg * M_Login.ArrayP.get(a).getPrecio());
        return Venta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Calcular_Precio = new javax.swing.JButton();
        L_ID = new javax.swing.JLabel();
        TF_ID = new javax.swing.JTextField();
        L_Kg = new javax.swing.JLabel();
        TF_Kg = new javax.swing.JTextField();
        L_Costo = new javax.swing.JLabel();
        TF_Costo = new javax.swing.JTextField();
        L_Informacion = new javax.swing.JLabel();
        TF_Informacion = new javax.swing.JTextField();
        L_Pago = new javax.swing.JLabel();
        TF_Pago = new javax.swing.JTextField();
        L_Cambio = new javax.swing.JLabel();
        TF_Cambio = new javax.swing.JTextField();
        Calcular_Cambio = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Punto de Ventas");
        Label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 265, -1, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Kg", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(2).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 35, 247, 229));

        Calcular_Precio.setText("Precio");
        Calcular_Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcular_PrecioActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 98, 100, -1));

        L_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_ID.setText("ID:");
        getContentPane().add(L_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, 33, -1));

        TF_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 38, 100, -1));

        L_Kg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Kg.setText("Kg:");
        getContentPane().add(L_Kg, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 72, 33, -1));

        TF_Kg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Kg, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 68, 100, -1));

        L_Costo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Costo.setText("Costo:");
        getContentPane().add(L_Costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, 38, -1));

        TF_Costo.setEditable(false);
        TF_Costo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 136, 89, -1));

        L_Informacion.setText("Informacion:");
        getContentPane().add(L_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 264, -1, 34));

        TF_Informacion.setEditable(false);
        TF_Informacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 269, 222, -1));

        L_Pago.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Pago.setText("Pagó:");
        getContentPane().add(L_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 170, 34, -1));

        TF_Pago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 166, 89, -1));

        L_Cambio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Cambio.setText("Cambio:");
        getContentPane().add(L_Cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 238, -1, -1));

        TF_Cambio.setEditable(false);
        TF_Cambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 234, 81, -1));

        Calcular_Cambio.setText("Cambio");
        Calcular_Cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcular_CambioActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular_Cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 196, 89, -1));

        Cancelar.setText("X");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 196, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        M_Inicial pantalla = new M_Inicial();
        pantalla.setVisible(true); //Se hace visible
        pantalla.setLocationRelativeTo(null);//Se centra
        pantalla.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed
    
    private void Calcular_PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcular_PrecioActionPerformed
        
        ocultar2();
        ocultar3();
        int a = ID_Buscar(TF_ID.getText());
        if(TF_ID.getText().isEmpty() || TF_Kg.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa todos lo datos");
        }
        else if(M_Login.ArrayP.get(a).getId_Producto().equals(TF_ID.getText()))
        {
            double b = Double.parseDouble(TF_Kg.getText());
            if(M_Login.ArrayP.get(a).getKg() <= 0)
            {
                TF_Informacion.setText("No hay " + M_Login.ArrayP.get(a).getNombre() + " en inventario");
            }
            else if(b <= M_Login.ArrayP.get(a).getKg())
            {
                TF_ID.setEditable(false);
                TF_Kg.setEditable(false);
                TF_Costo.setText(df.format(Venta(a, Double.parseDouble(TF_Kg.getText())))+"$");
                mostrar2();
            }
            else
            {
                
                TF_Informacion.setText("Solo quedan " + df.format(M_Login.ArrayP.get(a).getKg()) + "Kg en inventario");
            }
        }
        else
        {
            TF_Informacion.setText("No se encontro el ID: " + TF_ID.getText());
            TF_ID.setText("");
        }
    }//GEN-LAST:event_Calcular_PrecioActionPerformed

    private void Calcular_CambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcular_CambioActionPerformed
        int a = ID_Buscar(TF_ID.getText());
        
        if(TF_Pago.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa el pago del producto");
        }
        else
        {
            double b = Double.parseDouble(TF_Pago.getText());
            if(b >= Venta(a, Double.parseDouble(TF_Kg.getText())))
            {
                M_Login.ArrayP.get(a).Venta(Double.parseDouble(TF_Kg.getText()));
                b = b - M_Login.ArrayP.get(a).getGanancia();
                if(b <= 0)
                {
                    TF_Cambio.setText("0.00$");
                }
                else
                {
                    TF_Cambio.setText(df.format(b) + "$");
                }
                regreso();
                String matriz [] [] = new String [M_Login.ArrayP.size()] [4];
                Matriz(matriz);
            }
            else
            {
                b = Venta(a, Double.parseDouble(TF_Kg.getText())) - b;
                TF_Informacion.setText("Faltan:  " + df.format(b) + "$");
            }
        }
    }//GEN-LAST:event_Calcular_CambioActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        regreso();
        ocultar3();
    }//GEN-LAST:event_CancelarActionPerformed
    
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
            java.util.logging.Logger.getLogger(M_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular_Cambio;
    private javax.swing.JButton Calcular_Precio;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel L_Cambio;
    private javax.swing.JLabel L_Costo;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_Informacion;
    private javax.swing.JLabel L_Kg;
    private javax.swing.JLabel L_Pago;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TF_Cambio;
    private javax.swing.JTextField TF_Costo;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_Informacion;
    private javax.swing.JTextField TF_Kg;
    private javax.swing.JTextField TF_Pago;
    private javax.swing.JTable Tabla;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
