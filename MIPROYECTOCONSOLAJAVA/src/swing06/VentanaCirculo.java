package swing06;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaCirculo extends JFrame implements Calculo {

    private double radio;

    public double getRadio() {
        return Double.parseDouble(txtRadio.getText());
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public VentanaCirculo() {
        initComponents();
        personalizar_JFrame();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(VentanaRectangulo.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setTitle("GUI");
    }
    
    public double redondear2decimales(double x) {
        double y = (int)Math.ceil(x * 100.0)/100.0;
        return y;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        cmdArea = new javax.swing.JButton();
        cmdPerimetro = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        lblRadio = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtPerimetro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CALCULO AREA Y PERIMETRO CIRCULO");
        lblTitulo.setOpaque(true);

        txtRadio.setBackground(new java.awt.Color(0, 0, 0));
        txtRadio.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtRadio.setForeground(new java.awt.Color(255, 255, 255));
        txtRadio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdArea.setBackground(new java.awt.Color(0, 0, 0));
        cmdArea.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cmdArea.setForeground(new java.awt.Color(255, 255, 255));
        cmdArea.setText("AREA");
        cmdArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAreaActionPerformed(evt);
            }
        });

        cmdPerimetro.setBackground(new java.awt.Color(0, 0, 0));
        cmdPerimetro.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cmdPerimetro.setForeground(new java.awt.Color(255, 255, 255));
        cmdPerimetro.setText("PERIMETRO");
        cmdPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPerimetroActionPerformed(evt);
            }
        });

        cmdNuevo.setBackground(new java.awt.Color(0, 0, 0));
        cmdNuevo.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cmdNuevo.setForeground(new java.awt.Color(255, 255, 255));
        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });

        lblRadio.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        lblRadio.setForeground(new java.awt.Color(255, 255, 255));
        lblRadio.setText("Radio");

        lblArea.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setText("Area");

        lblPerimetro.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        lblPerimetro.setForeground(new java.awt.Color(255, 255, 255));
        lblPerimetro.setText("Perimetro");

        txtArea.setBackground(new java.awt.Color(0, 0, 0));
        txtArea.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtArea.setForeground(new java.awt.Color(255, 0, 0));
        txtArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtArea.setEnabled(false);
        txtArea.setOpaque(false);

        txtPerimetro.setBackground(new java.awt.Color(0, 0, 0));
        txtPerimetro.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtPerimetro.setForeground(new java.awt.Color(255, 0, 0));
        txtPerimetro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPerimetro.setEnabled(false);
        txtPerimetro.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRadio)
                            .addComponent(lblArea)
                            .addComponent(lblPerimetro))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdArea, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cmdPerimetro)
                        .addGap(31, 31, 31)
                        .addComponent(cmdNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRadio)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblArea)
                        .addGap(18, 18, 18)
                        .addComponent(lblPerimetro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdPerimetro)
                    .addComponent(cmdNuevo)
                    .addComponent(cmdArea))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(255, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAreaActionPerformed
        try {
            txtArea.setText(redondear2decimales(area()) + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmdAreaActionPerformed

    private void cmdPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPerimetroActionPerformed
        try {
            txtPerimetro.setText(redondear2decimales(perimetro()) + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmdPerimetroActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtRadio.setText("");
        txtArea.setText("");
        txtPerimetro.setText("");
    }//GEN-LAST:event_cmdNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCirculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdArea;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdPerimetro;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables

    @Override
    public double area() {
        return Math.PI * Math.pow(this.getRadio(), 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * this.getRadio();
    }
}
