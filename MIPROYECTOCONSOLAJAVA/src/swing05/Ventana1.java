package swing05;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;

public class Ventana1 extends javax.swing.JFrame {

    ButtonGroup bgColor = new ButtonGroup();

    public Ventana1() {
        initComponents();
        crearGrupoColor();
        personalizar_JFrame();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana1.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        //this.setSize(500, 500);
        this.setTitle("GUI");
    }

    public void crearGrupoColor() {
        bgColor.add(rdoRojo);
        bgColor.add(rdoVerde);
        bgColor.add(rdoAzul);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        rdoRojo = new javax.swing.JRadioButton();
        rdoVerde = new javax.swing.JRadioButton();
        rdoAzul = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CAMBIAR COLOR FONDO RADIOBUTTON");
        lblTitulo.setOpaque(true);

        rdoRojo.setForeground(new java.awt.Color(255, 255, 255));
        rdoRojo.setText("ROJO");
        rdoRojo.setOpaque(false);
        rdoRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoRojoActionPerformed(evt);
            }
        });

        rdoVerde.setForeground(new java.awt.Color(255, 255, 255));
        rdoVerde.setText("VERDE");
        rdoVerde.setOpaque(false);
        rdoVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoVerdeActionPerformed(evt);
            }
        });

        rdoAzul.setForeground(new java.awt.Color(255, 255, 255));
        rdoAzul.setText("AZUL");
        rdoAzul.setOpaque(false);
        rdoAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAzulActionPerformed(evt);
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
                    .addComponent(rdoAzul)
                    .addComponent(rdoVerde)
                    .addComponent(rdoRojo))
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(rdoRojo)
                .addGap(18, 18, 18)
                .addComponent(rdoVerde)
                .addGap(26, 26, 26)
                .addComponent(rdoAzul)
                .addGap(0, 82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoRojoActionPerformed
        this.getContentPane().setBackground(Color.RED);
    }//GEN-LAST:event_rdoRojoActionPerformed

    private void rdoVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoVerdeActionPerformed
        this.getContentPane().setBackground(Color.GREEN);
    }//GEN-LAST:event_rdoVerdeActionPerformed

    private void rdoAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAzulActionPerformed
        this.getContentPane().setBackground(Color.BLUE);
    }//GEN-LAST:event_rdoAzulActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdoAzul;
    private javax.swing.JRadioButton rdoRojo;
    private javax.swing.JRadioButton rdoVerde;
    // End of variables declaration//GEN-END:variables
}
