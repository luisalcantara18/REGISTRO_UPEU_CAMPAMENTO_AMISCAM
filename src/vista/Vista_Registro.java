/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import javax.swing.JButton;

/**
 *
 * @author Luis Alcántara
 */
public class Vista_Registro extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Registro
     */
    public Vista_Registro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BUTON_REGI = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NyA = new javax.swing.JTextField();
        DNI = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        CICLO = new javax.swing.JTextField();
        facultades = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/campamento-2.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres y Apellidos :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 86, 150, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 130, 30, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 170, 50, 15);

        BUTON_REGI.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        BUTON_REGI.setText("REGISTRARCE");
        BUTON_REGI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTON_REGIActionPerformed(evt);
            }
        });
        jPanel1.add(BUTON_REGI);
        BUTON_REGI.setBounds(190, 360, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Facultad :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 210, 80, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Escuela :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 250, 70, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Codigo Alumno :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 284, 120, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sexo :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 320, 50, 15);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("REGISTRO  \" AMISCAM \" \" UPEU \"");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(130, 30, 300, 21);
        jPanel1.add(NyA);
        NyA.setBounds(160, 80, 290, 30);

        DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIActionPerformed(evt);
            }
        });
        jPanel1.add(DNI);
        DNI.setBounds(160, 120, 290, 30);
        jPanel1.add(Edad);
        Edad.setBounds(160, 160, 70, 30);
        jPanel1.add(CICLO);
        CICLO.setBounds(160, 280, 290, 30);

        facultades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar FACULTAD", "FIA", "FACHIED", "FACTEO", "FCS" }));
        facultades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultadesActionPerformed(evt);
            }
        });
        jPanel1.add(facultades);
        facultades.setBounds(160, 200, 290, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar SEXO", "HOMBRE", "MUJER", "OTROS" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(160, 320, 290, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecicione ESCUELA", "ING DE SISTEMAS", "ING DE ALIMENTOS", "ING AMBIENTAL", "ARQUITECTURA", "PSICOLOGIA", "TEOCLOGIA", "SIENCIAS DE LA COMUNICACION", "DISEÑO GRAFICO", "ING CIVIL. ETC" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(160, 240, 290, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/stock-photo-62026879.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(-180, -140, 770, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNIActionPerformed

    private void BUTON_REGIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTON_REGIActionPerformed
      JButton BUTON_REGIA = new JButton("BUTON_REGIA");
// en este ejemplo el color de fondo es amarillo
BUTON_REGIA.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_BUTON_REGIActionPerformed

    private void facultadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultadesActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Vista_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTON_REGI;
    private javax.swing.JTextField CICLO;
    private javax.swing.JTextField DNI;
    private javax.swing.JTextField Edad;
    private javax.swing.JTextField NyA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox facultades;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}