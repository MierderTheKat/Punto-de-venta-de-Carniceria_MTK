package Carniceria_Interfaz;

import static Carniceria_Interfaz.M_Login.ArrayP;
import java.text.DecimalFormat;

/**
 *
 * @author MierderTheKat
 */
public final class M_Info_General extends javax.swing.JFrame {
    
    public M_Info_General() {
        initComponents();
        double a, b, c, d, total;
        a = Ganancia("Ternera");
        b = Ganancia("Cerdo");
        c = Ganancia("Pollo");
        d = Ganancia("Cordero");
        total = a + b + c + d;
        DecimalFormat df = new DecimalFormat("#.00");
        if(total < 1)
        {
            TF_Total.setText("0.00$");
            TF_Ternera.setText("0.00$");
            TF_Puerco.setText("0.00$");
            TF_Pollo.setText("0.00$");
            TF_Cordero.setText("0.00$");
        }
        else
        {
            TF_Total.setText(df.format(total) + "$");
            
            if(a<1)
            {
                TF_Ternera.setText("0.00$");
            }
            else
            {
                TF_Ternera.setText(df.format(a) + "$");
            }
            if(b<1)
            {
                TF_Puerco.setText("0.00$");
            }
            else
            {
                TF_Puerco.setText(df.format(b) + "$");
            }
            if(c<1)
            {
                TF_Pollo.setText("0.00$");
            }
            else
            {
                TF_Pollo.setText(df.format(c) + "$");
            }
            if(d<1)
            {
                TF_Cordero.setText("0.00$");
            }
            else
            {
                TF_Cordero.setText(df.format(d) + "$");
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        Label_Titulo = new javax.swing.JLabel();
        L_PagosPuesto = new javax.swing.JLabel();
        L_Horas = new javax.swing.JLabel();
        L_Admin = new javax.swing.JLabel();
        TF_Admin_Jornada = new javax.swing.JTextField();
        L_Caje = new javax.swing.JLabel();
        TF_Caje_Jornada = new javax.swing.JTextField();
        L_Carn = new javax.swing.JLabel();
        TF_Carn_Jornada = new javax.swing.JTextField();
        L_Sueldo = new javax.swing.JLabel();
        TF_Admin_Sueldo = new javax.swing.JTextField();
        TF_Caje_Sueldo = new javax.swing.JTextField();
        TF_Carn_Sueldo = new javax.swing.JTextField();
        L_Ganacias_Total = new javax.swing.JLabel();
        L_Ternera = new javax.swing.JLabel();
        TF_Ternera = new javax.swing.JTextField();
        L_Puerco = new javax.swing.JLabel();
        TF_Puerco = new javax.swing.JTextField();
        L_Pollo = new javax.swing.JLabel();
        TF_Pollo = new javax.swing.JTextField();
        L_Cordero = new javax.swing.JLabel();
        TF_Cordero = new javax.swing.JTextField();
        L_Total = new javax.swing.JLabel();
        TF_Total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 263, -1, -1));

        Label_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Informacion General");
        Label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        L_PagosPuesto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        L_PagosPuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_PagosPuesto.setText("Pagos por Puestos");
        getContentPane().add(L_PagosPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 400, 22));

        L_Horas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Horas.setText("Horas al dia");
        getContentPane().add(L_Horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 63, 82, -1));

        L_Admin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Admin.setText("Administrador");
        getContentPane().add(L_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 89, -1, -1));

        TF_Admin_Jornada.setEditable(false);
        TF_Admin_Jornada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Admin_Jornada.setText("8hrs");
        TF_Admin_Jornada.setToolTipText("");
        getContentPane().add(TF_Admin_Jornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 85, 56, -1));

        L_Caje.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Caje.setText("Cajero");
        getContentPane().add(L_Caje, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 119, 81, -1));

        TF_Caje_Jornada.setEditable(false);
        TF_Caje_Jornada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Caje_Jornada.setText("8hrs");
        getContentPane().add(TF_Caje_Jornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 115, 56, -1));

        L_Carn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Carn.setText("Carnicero");
        getContentPane().add(L_Carn, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 149, 81, -1));

        TF_Carn_Jornada.setEditable(false);
        TF_Carn_Jornada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Carn_Jornada.setText("6hrs");
        getContentPane().add(TF_Carn_Jornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 145, 56, -1));

        L_Sueldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Sueldo.setText("Pago por hora");
        getContentPane().add(L_Sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 63, 88, -1));

        TF_Admin_Sueldo.setEditable(false);
        TF_Admin_Sueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Admin_Sueldo.setText("150$");
        getContentPane().add(TF_Admin_Sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 85, 62, -1));

        TF_Caje_Sueldo.setEditable(false);
        TF_Caje_Sueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Caje_Sueldo.setText("100$");
        getContentPane().add(TF_Caje_Sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 115, 62, -1));

        TF_Carn_Sueldo.setEditable(false);
        TF_Carn_Sueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Carn_Sueldo.setText("120$");
        getContentPane().add(TF_Carn_Sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 145, 62, -1));

        L_Ganacias_Total.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        L_Ganacias_Total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Ganacias_Total.setText("Ganacias totales por Producto");
        getContentPane().add(L_Ganacias_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 175, 394, 22));

        L_Ternera.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Ternera.setText("Ternera");
        getContentPane().add(L_Ternera, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 207, 81, -1));

        TF_Ternera.setEditable(false);
        TF_Ternera.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Ternera.setToolTipText("");
        getContentPane().add(TF_Ternera, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 203, 86, -1));

        L_Puerco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Puerco.setText("Puerco");
        getContentPane().add(L_Puerco, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 237, 81, -1));

        TF_Puerco.setEditable(false);
        TF_Puerco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Puerco.setToolTipText("");
        getContentPane().add(TF_Puerco, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 233, 86, -1));

        L_Pollo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Pollo.setText("Pollo");
        getContentPane().add(L_Pollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 207, 60, -1));

        TF_Pollo.setEditable(false);
        TF_Pollo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Pollo.setToolTipText("");
        getContentPane().add(TF_Pollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 203, 86, -1));

        L_Cordero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Cordero.setText("Cordero");
        getContentPane().add(L_Cordero, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 237, 60, -1));

        TF_Cordero.setEditable(false);
        TF_Cordero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Cordero.setToolTipText("");
        getContentPane().add(TF_Cordero, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 233, 86, -1));

        L_Total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Total.setText("TOTAL:");
        getContentPane().add(L_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 267, 72, -1));

        TF_Total.setEditable(false);
        TF_Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Total.setToolTipText("");
        getContentPane().add(TF_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 263, 86, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public double Ganancia(String Tipo)
    {
        double a = 0;
        for(int i=0; i<ArrayP.size(); i++)
        {
            if(ArrayP.get(i).getTipo().equals(Tipo))
            {
                a += ArrayP.get(i).getGananciaTotal();
            }
        }
        return a;
    }
    
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
            java.util.logging.Logger.getLogger(M_Info_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_Info_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_Info_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_Info_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Info_General().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_Admin;
    private javax.swing.JLabel L_Caje;
    private javax.swing.JLabel L_Carn;
    private javax.swing.JLabel L_Cordero;
    private javax.swing.JLabel L_Ganacias_Total;
    private javax.swing.JLabel L_Horas;
    private javax.swing.JLabel L_PagosPuesto;
    private javax.swing.JLabel L_Pollo;
    private javax.swing.JLabel L_Puerco;
    private javax.swing.JLabel L_Sueldo;
    private javax.swing.JLabel L_Ternera;
    private javax.swing.JLabel L_Total;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TF_Admin_Jornada;
    private javax.swing.JTextField TF_Admin_Sueldo;
    private javax.swing.JTextField TF_Caje_Jornada;
    private javax.swing.JTextField TF_Caje_Sueldo;
    private javax.swing.JTextField TF_Carn_Jornada;
    private javax.swing.JTextField TF_Carn_Sueldo;
    private javax.swing.JTextField TF_Cordero;
    private javax.swing.JTextField TF_Pollo;
    private javax.swing.JTextField TF_Puerco;
    private javax.swing.JTextField TF_Ternera;
    private javax.swing.JTextField TF_Total;
    // End of variables declaration//GEN-END:variables
}
