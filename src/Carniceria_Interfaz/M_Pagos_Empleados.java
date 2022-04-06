package Carniceria_Interfaz;

/**
 *
 * @author MierderTheKat
 */
public class M_Pagos_Empleados extends javax.swing.JFrame {
    
    public M_Pagos_Empleados() {
        initComponents();
        
        L_Hrs_E.setVisible(false);
        TF_Hrs_E.setVisible(false);
        
        String matriz [] [] = new String [M_Login.ArrayE.size()] [2];
        
        for(int i=0; i<M_Login.ArrayE.size(); i++)
        {
            Agregar(matriz, i);
            
            Tabla.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "ID", "Nombre"
            }
            ){
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
            });
        }
    }
    
    public void Agregar(String[][] matriz, int i)
    {
        matriz [i] [0] = " " + M_Login.ArrayE.get(i).getId_Empleado();
        matriz [i] [1] = " " + M_Login.ArrayE.get(i).getNombre();    
    }
    
    public int Buscar_ID(String ID)
    {
        int a = 0;
        System.out.println("----ID's----");
        for(int i=0; i<M_Login.ArrayE.size(); i++)
        {
            System.out.println(M_Login.ArrayE.get(i).getId_Empleado()); // Imprimir ID's en Consola
            if(M_Login.ArrayE.get(i).getId_Empleado().equals(ID))
            {
                a = i;
            }
        }
        System.out.println("------------");
        if(M_Login.ArrayE.get(a).getId_Empleado().equals(ID))
        {
            TF_Informacion.setText("ID Encontrado");
        }
        else
        {
            TF_Informacion.setText("No se encontro el ID");
            TF_ID.setText("");
            TF_Hrs_E.setText("");
            TF_Pago.setText("");
            a = -1;
        }
        return a;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        L_ID = new javax.swing.JLabel();
        TF_ID = new javax.swing.JTextField();
        L_Hrs = new javax.swing.JLabel();
        TF_Hrs = new javax.swing.JTextField();
        Comprobar = new javax.swing.JButton();
        L_Hrs_E = new javax.swing.JLabel();
        TF_Hrs_E = new javax.swing.JTextField();
        L_Pago = new javax.swing.JLabel();
        TF_Pago = new javax.swing.JTextField();
        L_Informacion = new javax.swing.JLabel();
        L_Tiempo = new javax.swing.JLabel();
        TF_Informacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Pagos a Empleados");
        Label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 261, -1, -1));

        L_ID.setText("ID: ");
        getContentPane().add(L_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 58, -1, -1));

        TF_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 54, 80, -1));

        L_Hrs.setText("Horas trabajadas: ");
        getContentPane().add(L_Hrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 88, -1, -1));

        TF_Hrs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Hrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 84, 80, -1));

        Comprobar.setText("Comprobar");
        Comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarActionPerformed(evt);
            }
        });
        getContentPane().add(Comprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 136, -1, 24));

        L_Hrs_E.setText("Horas Extras: ");
        getContentPane().add(L_Hrs_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 191, -1, 22));

        TF_Hrs_E.setEditable(false);
        TF_Hrs_E.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Hrs_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 190, 50, -1));

        L_Pago.setText("Pago:");
        getContentPane().add(L_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 220, -1, 34));

        TF_Pago.setEditable(false);
        TF_Pago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 225, 100, -1));

        L_Informacion.setText("Informacion:");
        getContentPane().add(L_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, -1, 34));

        L_Tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Tiempo.setText("a la semana");
        getContentPane().add(L_Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 114, 80, -1));

        TF_Informacion.setEditable(false);
        TF_Informacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 265, 213, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 38, 187, 216));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        M_Inicial pantalla = new M_Inicial();
        pantalla.setVisible(true); //Se hace visible
        pantalla.setLocationRelativeTo(null);//Se centra
        pantalla.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void ComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarActionPerformed

        L_Hrs_E.setVisible(false);
        TF_Hrs_E.setVisible(false);
        TF_Hrs_E.setText("");
        TF_Pago.setText("");
        
        if(M_Login.ArrayE.isEmpty())
        {
            TF_Informacion.setText("No hay empleados registrados");
        }
        else if(TF_ID.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa el ID");
            TF_ID.setText("");
        }
        else if(TF_Hrs.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa las horas trabajadas");
            TF_Hrs.setText("");
        }
        else if(Integer.parseInt(TF_Hrs.getText()) < 0 || Integer.parseInt(TF_Hrs.getText()) > 96)
        {// son 96 hrs por semana (6 dias) como maximo, para que tenga 8 hrs libres

            if(Integer.parseInt(TF_Hrs.getText()) < 0)
            {
                TF_Informacion.setText("Horas trabajadas menores a 0");
            }
            else
            {
                TF_Informacion.setText("Horas trabajadas inhumanas");
            }
            TF_Hrs.setText("");
        }
        else
        {
            int N = Buscar_ID(TF_ID.getText());
            if(N >= 0)
            {
                System.out.println("--------------"+M_Login.ArrayE.get(N).getPuesto()+"--------------");
                //Ingresar datos al objeto
                System.out.println(TF_Hrs.getText()); // imprime en consola

                M_Login.ArrayE.get(N).Sueldo(Integer.parseInt(TF_Hrs.getText())); //llama el donde hace los calculos y se guarda
                TF_Pago.setText(M_Login.ArrayE.get(N).getSueldo() + ""); // lo pone en Text Field

                //para las horas extras
                int Extras = Integer.parseInt(TF_Hrs.getText()) - (Integer.parseInt(M_Login.ArrayE.get(N).getJornada())*6);
                if (Extras > 0)
                {
                    L_Hrs_E.setVisible(true);
                    TF_Hrs_E.setVisible(true);
                    TF_Hrs_E.setText(Extras + "");
                }
                else
                {
                    L_Hrs_E.setVisible(false);
                    TF_Hrs_E.setVisible(false);
                    TF_Hrs_E.setText("0");
                }
                TF_Informacion.setText("Operacion Realizada");
            }
            else
            {
                TF_ID.setText("");
                TF_Hrs_E.setText("");
                TF_Pago.setText("");
                TF_Informacion.setText("No se encontro el ID");
            }
        }
    }//GEN-LAST:event_ComprobarActionPerformed
    
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
            java.util.logging.Logger.getLogger(M_Pagos_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_Pagos_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_Pagos_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_Pagos_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Pagos_Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprobar;
    private javax.swing.JLabel L_Hrs;
    private javax.swing.JLabel L_Hrs_E;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_Informacion;
    private javax.swing.JLabel L_Pago;
    private javax.swing.JLabel L_Tiempo;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TF_Hrs;
    private javax.swing.JTextField TF_Hrs_E;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_Informacion;
    private javax.swing.JTextField TF_Pago;
    private javax.swing.JTable Tabla;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
