package swing05;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;

public class Ventana2 extends javax.swing.JFrame {

    ButtonGroup bgColor = new ButtonGroup();

    public Ventana2() {
        initComponents();
        crearGrupoColor();
        personalizar_JFrame();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana2.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        //this.setSize(500, 500);
        this.setTitle("GUI");
    }

    public void crearGrupoColor() {
        bgColor.add(rdo500);
        bgColor.add(rdo600);
        bgColor.add(rdo800);
        bgColor.add(rdo434);
        
        rdo500.setBackground(Color.DARK_GRAY);
        rdo600.setBackground(Color.DARK_GRAY);
        rdo800.setBackground(Color.DARK_GRAY);
        rdo434.setBackground(Color.DARK_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        rdo500 = new javax.swing.JRadioButton();
        rdo600 = new javax.swing.JRadioButton();
        rdo800 = new javax.swing.JRadioButton();
        rdo434 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CAMBIAR COLOR FONDO RADIOBUTTON");
        lblTitulo.setOpaque(true);

        rdo500.setForeground(new java.awt.Color(255, 255, 255));
        rdo500.setText("500x500");
        rdo500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo500ActionPerformed(evt);
            }
        });

        rdo600.setForeground(new java.awt.Color(255, 255, 255));
        rdo600.setText("600x600");
        rdo600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo600ActionPerformed(evt);
            }
        });

        rdo800.setForeground(new java.awt.Color(255, 255, 255));
        rdo800.setText("800x800");
        rdo800.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo800ActionPerformed(evt);
            }
        });

        rdo434.setForeground(new java.awt.Color(255, 255, 255));
        rdo434.setText("Tamaño Original");
        rdo434.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo434ActionPerformed(evt);
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
                    .addComponent(rdo434)
                    .addComponent(rdo800)
                    .addComponent(rdo600)
                    .addComponent(rdo500))
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(rdo500)
                .addGap(18, 18, 18)
                .addComponent(rdo600)
                .addGap(26, 26, 26)
                .addComponent(rdo800)
                .addGap(18, 18, 18)
                .addComponent(rdo434)
                .addGap(0, 64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdo500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo500ActionPerformed
        this.setSize(500, 500);
        rdo500.setBackground(Color.RED);
        rdo600.setBackground(Color.DARK_GRAY);
        rdo800.setBackground(Color.DARK_GRAY);
        rdo434.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_rdo500ActionPerformed

    private void rdo600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo600ActionPerformed
        this.setSize(600, 600);
        rdo600.setBackground(Color.RED);
        rdo500.setBackground(Color.DARK_GRAY);
        rdo800.setBackground(Color.DARK_GRAY);
        rdo434.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_rdo600ActionPerformed

    private void rdo800ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo800ActionPerformed
        this.setSize(800, 800);
        rdo800.setBackground(Color.RED);
        rdo500.setBackground(Color.DARK_GRAY);
        rdo600.setBackground(Color.DARK_GRAY);
        rdo434.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_rdo800ActionPerformed

    private void rdo434ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo434ActionPerformed
        this.setSize(434, 300);
        rdo434.setBackground(Color.DARK_GRAY);
        rdo500.setBackground(Color.DARK_GRAY);
        rdo600.setBackground(Color.DARK_GRAY);
        rdo800.setBackground(Color.DARK_GRAY);

    }//GEN-LAST:event_rdo434ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdo434;
    private javax.swing.JRadioButton rdo500;
    private javax.swing.JRadioButton rdo600;
    private javax.swing.JRadioButton rdo800;
    // End of variables declaration//GEN-END:variables
}
