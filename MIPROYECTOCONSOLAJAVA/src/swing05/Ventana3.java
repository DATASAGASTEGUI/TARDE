package swing05;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;

public class Ventana3 extends javax.swing.JFrame {

    ButtonGroup bgColor = new ButtonGroup();

    public Ventana3() {
        initComponents();
        crearGrupoColor();
        personalizar_JFrame();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana3.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        //this.setSize(500, 500);
        this.setTitle("GUI");
    }

    public void crearGrupoColor() {
        bgColor.add(rdoPares);
        bgColor.add(rdoImpares);
        bgColor.add(rdoPrimos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        rdoPares = new javax.swing.JRadioButton();
        rdoImpares = new javax.swing.JRadioButton();
        rdoPrimos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MENU RADIOBUTTON");
        lblTitulo.setOpaque(true);

        rdoPares.setForeground(new java.awt.Color(255, 255, 255));
        rdoPares.setText("PARES");
        rdoPares.setOpaque(false);
        rdoPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoParesActionPerformed(evt);
            }
        });

        rdoImpares.setForeground(new java.awt.Color(255, 255, 255));
        rdoImpares.setText("IMPARES");
        rdoImpares.setOpaque(false);
        rdoImpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoImparesActionPerformed(evt);
            }
        });

        rdoPrimos.setForeground(new java.awt.Color(255, 255, 255));
        rdoPrimos.setText("PRIMOS");
        rdoPrimos.setOpaque(false);
        rdoPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoPrimosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoPrimos)
                    .addComponent(rdoImpares)
                    .addComponent(rdoPares))
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(rdoPares)
                .addGap(18, 18, 18)
                .addComponent(rdoImpares)
                .addGap(26, 26, 26)
                .addComponent(rdoPrimos)
                .addGap(0, 82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoParesActionPerformed
        Ventana v1 = new Ventana("PARES");
        v1.setVisible(true);
        
        DefaultListModel dlm = v1.getModelo();
        dlm.clear();
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                dlm.addElement(i + "");
            }
        }
    }//GEN-LAST:event_rdoParesActionPerformed

    private void rdoImparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoImparesActionPerformed
        Ventana v2 = new Ventana("IMPARES");
        v2.setVisible(true);
        DefaultListModel dlm = v2.getModelo();
        dlm.clear();
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                dlm.addElement(i + "");
            }
        }
    }//GEN-LAST:event_rdoImparesActionPerformed

    private void rdoPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoPrimosActionPerformed
        new Ventana("PRIMOS").setVisible(true);
    }//GEN-LAST:event_rdoPrimosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdoImpares;
    private javax.swing.JRadioButton rdoPares;
    private javax.swing.JRadioButton rdoPrimos;
    // End of variables declaration//GEN-END:variables
}
