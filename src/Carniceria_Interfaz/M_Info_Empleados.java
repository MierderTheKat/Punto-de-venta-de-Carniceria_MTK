package Carniceria_Interfaz;

import java.text.DecimalFormat;

/**
 *
 * @author MierderTheKat
 */
public final class M_Info_Empleados extends javax.swing.JFrame {
    
    public M_Info_Empleados() {
        initComponents();
        
        String matriz [] [] = new String [M_Login.ArrayE.size()] [8];
        
        for(int i=0; i<M_Login.ArrayE.size(); i++)
        {
            String empleado = M_Login.ArrayE.get(i).getPuesto();
            switch(empleado)
            {
                case "Administrador":
                    Agregar(matriz,i);
                    matriz [i] [1] = M_Login.ArrayE.get(i).getContraseña(); // contraseña
                    if(M_Login.ArrayE.get(i).getTitulo() == true)
                    {
                        matriz [i] [6] = " Titulado";
                    }
                    else
                    {
                        matriz [i] [6] = " No Titulado";
                    }
                    matriz [i] [7] = "    --";
                    break;
                case "Cajero":
                    Agregar(matriz,i);
                    matriz [i] [1] = M_Login.ArrayE.get(i).getContraseña(); // contraseña
                    matriz [i] [6] = "    --";
                    matriz [i] [7] = "    --";
                    break;
                case "Carnicero":
                    Agregar(matriz,i);
                    matriz [i] [6] = " " + M_Login.ArrayE.get(i).getPeso()+"Kg";
                    matriz [i] [7] = " " + M_Login.ArrayE.get(i).getEspecialidad();
                    break;
                default:
                    System.out.println("Que haces aqui _ Info");
                    break;
            }
            
            Tabla.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "ID", "Contraseña", "Nombre", "Nacimiento", "Puesto", "Sueldo", "Pregunta", "Especialidad"
            }
            ){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
            });
        }
    }
    
        public void Agregar(String[][] matriz, int i)
        {
            DecimalFormat df = new DecimalFormat("#.00");
            matriz [i] [0] = " " + M_Login.ArrayE.get(i).getId_Empleado();
            matriz [i] [2] = " " + M_Login.ArrayE.get(i).getNombre();
            matriz [i] [3] = " " + M_Login.ArrayE.get(i).getFech_Nac();
            matriz [i] [4] = " " + M_Login.ArrayE.get(i).getPuesto();
            if(M_Login.ArrayE.get(i).getSueldo() < 1)
            {
                matriz [i] [5] = " 0.00$";
            }
            else
            {
                matriz [i] [5] = " " + df.format(M_Login.ArrayE.get(i).getSueldo()) + "$";
            }
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Informacion de Empleados");
        Label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 562, -1, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Contraseña", "Nombre", "Nacimiento", "Puesto", "Sueldo", "Pregunta", "Especialidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
            Tabla.getColumnModel().getColumn(4).setResizable(false);
            Tabla.getColumnModel().getColumn(5).setResizable(false);
            Tabla.getColumnModel().getColumn(6).setResizable(false);
            Tabla.getColumnModel().getColumn(7).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 800, 518));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        M_Inicial pantalla = new M_Inicial();
        pantalla.setVisible(true); //Se hace visible
        pantalla.setLocationRelativeTo(null);//Se centra
        pantalla.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
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
            java.util.logging.Logger.getLogger(M_Info_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_Info_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_Info_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_Info_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Info_Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JButton Regresar;
    private javax.swing.JTable Tabla;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
