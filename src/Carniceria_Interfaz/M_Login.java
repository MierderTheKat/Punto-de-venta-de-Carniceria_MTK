package Carniceria_Interfaz;

import Carniceria_Empledos.*;
import Carniceria_Productos.*;
import java.util.ArrayList;

/**
 *
 * @author MierderTheKat
 */
public class M_Login extends javax.swing.JFrame {

    public static ArrayList<S_Empleados> ArrayE = new ArrayList(); //creo el array list
    public static ArrayList<Productos> ArrayP = new ArrayList(); //creo el array list
    public static boolean Tipo; //el tipo de usuario
    
    public M_Login() {
        initComponents();
        
        if(ArrayP.isEmpty())
        {
            int a=15, b=24;
            for(int i=0; i<2; i++)
            {
                //                                (id_producto,  nombre,        tipo,   Kg, Precio)
                Productos Ternera = new P_Ternera("ter"+(i+1), "Tera-"+(i+1), "Ternera", b, a);
                ArrayP.add(Ternera);
                Productos Cerdo = new P_Cerdo("cer"+(i+1), "Cedo-"+(i+1), "Cerdo", b, a);
                ArrayP.add(Cerdo);
                Productos Pollo = new P_Pollo("pol"+(i+1), "Polo-"+(i+1), "Pollo", b, a);
                ArrayP.add(Pollo);
                Productos Cordero = new P_Cordero("cor"+(i+1), "Cero-"+(i+1), "Cordero", b, a);
                ArrayP.add(Cordero);
                a = a + 7;
                b = b + 9;
            }
        }
    }
    
    public void Buscar_ID(String ID)
    {
        int a = 0;
        System.out.println("----ID's----");
        for(int i=0; i<ArrayE.size(); i++)
        {
            System.out.println(ArrayE.get(i).getId_Empleado()+" Contra: "+ArrayE.get(i).getContraseña()); // Imprimir ID's en Consola
            if(ArrayE.get(i).getId_Empleado().equals(ID))
            {
                a = i;
            }
        }
        System.out.println("------------");
        
        if(ArrayE.get(a).getId_Empleado().equals(ID))
        {
            TF_Informacion.setText("ID Encontrado");
            if(ArrayE.get(a).getContraseña().equals(PF_Contraseña.getText()))
            {
                boolean tipo = false;
                if(ArrayE.get(a).getPuesto().equals("Administrador"))
                {
                    tipo = true;
                }
                else
                {
                    tipo = false;
                }
                Tipo = tipo;
                M_Inicial pantalla = new M_Inicial();
                pantalla.setVisible(true); //Se hace visible
                pantalla.setLocationRelativeTo(null);//Se centra
                pantalla.setResizable(false);//Evita que estiren la pantalla
                this.dispose();
            }
            else
            {
                TF_Informacion.setText("Contraseña incorrecta");
            }
        }
        else
        {
            TF_Informacion.setText("No se encontro el ID");
            TF_ID.setText("");
            PF_Contraseña.setText("");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        L_P_ID = new javax.swing.JLabel();
        L_P_Contraseña = new javax.swing.JLabel();
        TF_ID = new javax.swing.JTextField();
        L_Informacion = new javax.swing.JLabel();
        TF_Informacion = new javax.swing.JTextField();
        Verificar = new javax.swing.JButton();
        PF_Contraseña = new javax.swing.JPasswordField();
        L_P_Contraseña1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Login");
        Label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 400, -1));

        L_P_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_P_ID.setText("ID:");
        getContentPane().add(L_P_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 120, 69, 24));

        L_P_Contraseña.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_P_Contraseña.setText("Francisco Javier Rivera                                              Ing. Software  2A     ");
        getContentPane().add(L_P_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 24));

        TF_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 120, 150, -1));

        L_Informacion.setText("Informacion:");
        getContentPane().add(L_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, -1, 34));

        TF_Informacion.setEditable(false);
        TF_Informacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 265, 311, -1));

        Verificar.setText("Verificar");
        Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        PF_Contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PF_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 163, 150, -1));

        L_P_Contraseña1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_P_Contraseña1.setText("Contraseña:");
        getContentPane().add(L_P_Contraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 162, -1, 24));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarActionPerformed
        
        if(TF_ID.getText().isEmpty() || PF_Contraseña.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa primero los datos");
        }
        else if(ArrayE.isEmpty())
        {
            if(TF_ID.getText().equals("admin") && PF_Contraseña.getText().equals("admin"))
            {
                Tipo = true;
                M_Agregar_Empleado pantalla = new M_Agregar_Empleado("");
                pantalla.setVisible(true); //Se hace visible
                pantalla.setLocationRelativeTo(null);//Se centra
                pantalla.setResizable(false);//Evita que estiren la pantalla
                this.dispose();
            }
            else if(TF_ID.getText().equals("admin"))
            {
                TF_Informacion.setText("Contraseña incorrecta");
                PF_Contraseña.setText("");
            }
            else if(PF_Contraseña.getText().equals("admin"))
            {
                TF_Informacion.setText("ID Incorrecto");
                TF_ID.setText("");
            }
            else
            {
                TF_Informacion.setText("Datos Incorrectos");
                TF_ID.setText("");
                PF_Contraseña.setText("");
            }
        }
        else 
        {
            Buscar_ID(TF_ID.getText());
        }    
    }//GEN-LAST:event_VerificarActionPerformed
    
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
            java.util.logging.Logger.getLogger(M_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_Informacion;
    private javax.swing.JLabel L_P_Contraseña;
    private javax.swing.JLabel L_P_Contraseña1;
    private javax.swing.JLabel L_P_ID;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JPasswordField PF_Contraseña;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_Informacion;
    private javax.swing.JButton Verificar;
    // End of variables declaration//GEN-END:variables
}
