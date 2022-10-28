package swing06;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaRectangulo extends JFrame implements Calculo {

    private double largo;
    private double ancho;

    public double getLargo() {
        return Double.parseDouble(txtLargo.getText());
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return Double.parseDouble(txtAncho.getText());
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public VentanaRectangulo() {
        initComponents();
        personalizar_JFrame();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(VentanaRectangulo.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setTitle("GUI");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblLargo = new javax.swing.JLabel();
        lblAncho = new javax.swing.JLabel();
        txtLargo = new javax.swing.JTextField();
        txtAncho = new javax.swing.JTextField();
        lblArea = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        cmdPerimetro = new javax.swing.JButton();
        lblPerimetro = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();
        cmdNuevo = new javax.swing.JButton();
        cmdArea = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CALCULO AREA Y PERIMETRO RECTANGULO");
        lblTitulo.setOpaque(true);

        lblLargo.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        lblLargo.setForeground(new java.awt.Color(255, 255, 255));
        lblLargo.setText("Largo");

        lblAncho.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        lblAncho.setForeground(new java.awt.Color(255, 255, 255));
        lblAncho.setText("Ancho");

        txtLargo.setBackground(new java.awt.Color(0, 0, 0));
        txtLargo.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtLargo.setForeground(new java.awt.Color(255, 255, 255));
        txtLargo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAncho.setBackground(new java.awt.Color(0, 0, 0));
        txtAncho.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtAncho.setForeground(new java.awt.Color(255, 255, 255));
        txtAncho.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblArea.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setText("Area");

        txtArea.setBackground(new java.awt.Color(0, 0, 0));
        txtArea.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtArea.setForeground(new java.awt.Color(255, 0, 0));
        txtArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtArea.setEnabled(false);

        cmdPerimetro.setBackground(new java.awt.Color(0, 0, 0));
        cmdPerimetro.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cmdPerimetro.setForeground(new java.awt.Color(255, 255, 255));
        cmdPerimetro.setText("PERIMETRO");
        cmdPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPerimetroActionPerformed(evt);
            }
        });

        lblPerimetro.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        lblPerimetro.setForeground(new java.awt.Color(255, 255, 255));
        lblPerimetro.setText("Perimetro");

        txtPerimetro.setBackground(new java.awt.Color(0, 0, 0));
        txtPerimetro.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtPerimetro.setForeground(new java.awt.Color(255, 0, 0));
        txtPerimetro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPerimetro.setEnabled(false);

        cmdNuevo.setBackground(new java.awt.Color(0, 0, 0));
        cmdNuevo.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cmdNuevo.setForeground(new java.awt.Color(255, 255, 255));
        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });

        cmdArea.setBackground(new java.awt.Color(0, 0, 0));
        cmdArea.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cmdArea.setForeground(new java.awt.Color(255, 255, 255));
        cmdArea.setText("AREA");
        cmdArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(cmdArea, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cmdPerimetro)
                .addGap(31, 31, 31)
                .addComponent(cmdNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPerimetro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLargo)
                            .addComponent(lblAncho)
                            .addComponent(lblArea))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLargo)
                            .addComponent(txtAncho)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLargo)
                    .addComponent(txtLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAncho)
                    .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetro)
                    .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdPerimetro)
                    .addComponent(cmdNuevo)
                    .addComponent(cmdArea))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPerimetroActionPerformed
        try {
            txtPerimetro.setText(perimetro() + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmdPerimetroActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtLargo.setText("");
        txtAncho.setText("");
        txtArea.setText("");
        txtPerimetro.setText("");
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAreaActionPerformed
        try {
            txtArea.setText(area() + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_cmdAreaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRectangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdArea;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdPerimetro;
    private javax.swing.JLabel lblAncho;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblLargo;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtLargo;
    private javax.swing.JTextField txtPerimetro;
    // End of variables declaration//GEN-END:variables

    @Override
    public double area() {
        return this.getLargo() * this.getAncho();
    }

    @Override
    public double perimetro() {
        return 2 * (this.getLargo() + this.getAncho());
    }

}
