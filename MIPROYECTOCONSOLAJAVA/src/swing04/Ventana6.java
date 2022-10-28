package swing04;

import java.awt.Color;
import java.awt.Toolkit;

public class Ventana6 extends javax.swing.JFrame {

    public Ventana6() {
        initComponents();
        personalizar_JFrame();
        txaContenido.setLineWrap(true);
        txaContenido.setWrapStyleWord(true);
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana6.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        //this.setSize(500, 500);

        this.setTitle("GUI");
        this.toFront();
    }

    public int cantidadPalabras(String cadena) {
        String[] palabra = cadena.split("[\\s]{1,}");
        return palabra.length;
    }

    public String cantidadLetras(String cadena) {
        //String patron = "[a-zA-ZÑñáéíóú]";
        int cletra = 0;
        int cnletra = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isAlphabetic(caracter)) {
                cletra++;
            } else {
                cnletra++;
            }
        }
        System.out.println(cnletra);
        return cletra + "," + cnletra;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaContenido = new javax.swing.JTextArea();
        cmdLimpiar = new javax.swing.JButton();
        cmdContador = new javax.swing.JButton();
        txtLetras = new javax.swing.JTextField();
        txtNoLetras = new javax.swing.JTextField();
        txtPalabras = new javax.swing.JTextField();
        lblLetras = new javax.swing.JLabel();
        lblPalabras = new javax.swing.JLabel();
        lblNoLetras = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CONTADOR DE LETRAS Y PALABRAS");
        lblTitulo.setOpaque(true);

        txaContenido.setBackground(new java.awt.Color(0, 0, 0));
        txaContenido.setColumns(20);
        txaContenido.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txaContenido.setForeground(new java.awt.Color(255, 255, 255));
        txaContenido.setRows(5);
        jScrollPane1.setViewportView(txaContenido);

        cmdLimpiar.setText("LIMPIAR");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        cmdContador.setText("CONTADOR");
        cmdContador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdContadorActionPerformed(evt);
            }
        });

        txtLetras.setBackground(new java.awt.Color(0, 0, 0));
        txtLetras.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtLetras.setForeground(new java.awt.Color(204, 204, 0));
        txtLetras.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNoLetras.setBackground(new java.awt.Color(0, 0, 0));
        txtNoLetras.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtNoLetras.setForeground(new java.awt.Color(204, 204, 0));
        txtNoLetras.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPalabras.setBackground(new java.awt.Color(0, 0, 0));
        txtPalabras.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtPalabras.setForeground(new java.awt.Color(204, 204, 0));
        txtPalabras.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblLetras.setBackground(new java.awt.Color(255, 204, 0));
        lblLetras.setForeground(new java.awt.Color(0, 0, 153));
        lblLetras.setText("CANTIDAD LETRAS");

        lblPalabras.setBackground(new java.awt.Color(255, 204, 0));
        lblPalabras.setForeground(new java.awt.Color(0, 0, 153));
        lblPalabras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabras.setText("CANTIDAD PALABRAS");

        lblNoLetras.setBackground(new java.awt.Color(255, 204, 0));
        lblNoLetras.setForeground(new java.awt.Color(0, 0, 153));
        lblNoLetras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoLetras.setText("CANTIDAD NO LETRAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(lblPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtNoLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNoLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(cmdContador, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLetras)
                    .addComponent(lblPalabras)
                    .addComponent(lblNoLetras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdLimpiar)
                    .addComponent(cmdContador))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdContadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdContadorActionPerformed
        String cadena = txaContenido.getText();

        int n = cantidadPalabras(cadena);
        String x = cantidadLetras(cadena);
        String[] numero = x.split(",");

        txtPalabras.setText(n + "");
        txtLetras.setText(numero[0]);
        txtNoLetras.setText(numero[1]);
    }//GEN-LAST:event_cmdContadorActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txaContenido.setText("");
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdContador;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblLetras;
    private javax.swing.JLabel lblNoLetras;
    private javax.swing.JLabel lblPalabras;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaContenido;
    private javax.swing.JTextField txtLetras;
    private javax.swing.JTextField txtNoLetras;
    private javax.swing.JTextField txtPalabras;
    // End of variables declaration//GEN-END:variables
}
