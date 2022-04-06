package Carniceria_Interfaz;

/**
 *
 * @author MierderTheKat
 */
public class M_Inicial extends javax.swing.JFrame {
    
    public M_Inicial() {
        initComponents();

        if(M_Login.Tipo == true)
        {
            Label_Modo.setText("Modo Admin");
        }
        else if(M_Login.Tipo == false)
        {
            Label_Modo.setText("Modo Cajero");
            L_Empleado.setVisible(false);
            Modificar_Producto.setVisible(false);
            Agregar_Empleado.setVisible(false);
            Informacion_Empleados.setVisible(false);
            Pagos_Empleado.setVisible(false);
        }
        else
        {
            Label_Modo.setText("NO ENTRO");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        Label_Modo = new javax.swing.JLabel();
        L_Productos = new javax.swing.JLabel();
        Vender = new javax.swing.JButton();
        Ver_Inventario = new javax.swing.JButton();
        Modificar_Producto = new javax.swing.JButton();
        L_Empleado = new javax.swing.JLabel();
        Pagos_Empleado = new javax.swing.JButton();
        Informacion_Empleados = new javax.swing.JButton();
        Agregar_Empleado = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Info_General = new javax.swing.JButton();
        L_Quieto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Menu Principal");
        Label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Label_Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        Label_Modo.setFont(new java.awt.Font("Lemon", 1, 18)); // NOI18N
        Label_Modo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Modo.setText("Modo");
        Label_Modo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Modo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Label_Modo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Label_Modo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 400, -1));

        L_Productos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        L_Productos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Productos.setText("Productos");
        L_Productos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(L_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 76, 177, 21));

        Vender.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Vender.setText("Vender");
        Vender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Vender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Vender.setMaximumSize(new java.awt.Dimension(102, 39));
        Vender.setName(""); // NOI18N
        Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderActionPerformed(evt);
            }
        });
        getContentPane().add(Vender, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 103, 177, 40));

        Ver_Inventario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Ver_Inventario.setText("Inventario");
        Ver_Inventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ver_Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver_InventarioActionPerformed(evt);
            }
        });
        getContentPane().add(Ver_Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 149, 177, 40));

        Modificar_Producto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Modificar_Producto.setText("Modificar Productos");
        Modificar_Producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Modificar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_ProductoActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 195, 177, 40));

        L_Empleado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        L_Empleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Empleado.setText("Empleados");
        L_Empleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(L_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 76, 177, 21));

        Pagos_Empleado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Pagos_Empleado.setText("Pago a Empleado");
        Pagos_Empleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pagos_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pagos_EmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(Pagos_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 103, 177, 40));

        Informacion_Empleados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Informacion_Empleados.setText("Ver Empleados");
        Informacion_Empleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Informacion_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Informacion_EmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(Informacion_Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 149, 177, 40));

        Agregar_Empleado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Agregar_Empleado.setText("Modificar Empleados");
        Agregar_Empleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Agregar_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_EmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 195, -1, 40));

        Salir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 247, -1, 40));

        Info_General.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Info_General.setText("Informacion General");
        Info_General.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Info_General.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Info_GeneralActionPerformed(evt);
            }
        });
        getContentPane().add(Info_General, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 247, 177, 40));

        L_Quieto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(L_Quieto, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 268, -1, 32));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderActionPerformed
        M_Ventas Pantalla = new M_Ventas();
        Pantalla.setVisible(true); //Se hace visible
        Pantalla.setLocationRelativeTo(null); //Se centra
        Pantalla.setResizable(false); //Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_VenderActionPerformed

    private void Agregar_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_EmpleadoActionPerformed
        M_Editar_Empleado Pantalla = new M_Editar_Empleado();
        Pantalla.setVisible(true); //Se hace visible
        Pantalla.setLocationRelativeTo(null); //Se centra
        Pantalla.setResizable(false); //Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_Agregar_EmpleadoActionPerformed

    private void Ver_InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver_InventarioActionPerformed
        M_Ver_Inventario Pantalla = new M_Ver_Inventario();
        Pantalla.setVisible(true); //Se hace visible
        Pantalla.setLocationRelativeTo(null); //Se centra
        Pantalla.setResizable(false); //Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_Ver_InventarioActionPerformed

    private void Informacion_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Informacion_EmpleadosActionPerformed
        M_Info_Empleados Pantalla = new M_Info_Empleados();
        Pantalla.setVisible(true); //Se hace visible
        Pantalla.setLocationRelativeTo(null); //Se centra
        Pantalla.setResizable(false); //Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_Informacion_EmpleadosActionPerformed

    private void Pagos_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pagos_EmpleadoActionPerformed
        M_Pagos_Empleados Pantalla = new M_Pagos_Empleados();
        Pantalla.setVisible(true); //Se hace visible
        Pantalla.setLocationRelativeTo(null); //Se centra
        Pantalla.setResizable(false); //Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_Pagos_EmpleadoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        M_Login pantalla = new M_Login();
        pantalla.setVisible(true); //Se hace visible
        pantalla.setLocationRelativeTo(null);//Se centra
        pantalla.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void Info_GeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Info_GeneralActionPerformed
        M_Info_General pantalla = new M_Info_General();
        pantalla.setVisible(true); //Se hace visible
        pantalla.setLocationRelativeTo(null);//Se centra
        pantalla.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_Info_GeneralActionPerformed

    private void Modificar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_ProductoActionPerformed
        M_Editar_Producto Pantalla = new M_Editar_Producto();
        Pantalla.setVisible(true); //Se hace visible
        Pantalla.setLocationRelativeTo(null); //Se centra
        Pantalla.setResizable(false); //Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_Modificar_ProductoActionPerformed
    
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
            java.util.logging.Logger.getLogger(M_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_Empleado;
    private javax.swing.JButton Info_General;
    private javax.swing.JButton Informacion_Empleados;
    private javax.swing.JLabel L_Empleado;
    private javax.swing.JLabel L_Productos;
    private javax.swing.JLabel L_Quieto;
    private javax.swing.JLabel Label_Modo;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JButton Modificar_Producto;
    private javax.swing.JButton Pagos_Empleado;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Vender;
    private javax.swing.JButton Ver_Inventario;
    // End of variables declaration//GEN-END:variables
}
