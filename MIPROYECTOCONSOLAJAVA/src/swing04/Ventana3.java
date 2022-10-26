package swing04;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;

public class Ventana3 extends javax.swing.JFrame {
    
    DefaultListModel dlm = new DefaultListModel();

    public Ventana3() {
        initComponents();
        lstPalabras.setModel(dlm);
        personalizar_JFrame();
        txaContenido.setLineWrap(true);
        txaContenido.setWrapStyleWord(true);
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana3.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        //this.setSize(500, 500);
        this.setTitle("GUI");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaContenido = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPalabras = new javax.swing.JList<>();
        cmdObtenerPalabras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("LISTA DE PALABRAS DE UN TEXTAREA");
        lblTitulo.setOpaque(true);

        txaContenido.setBackground(new java.awt.Color(0, 0, 0));
        txaContenido.setColumns(20);
        txaContenido.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txaContenido.setForeground(new java.awt.Color(255, 255, 0));
        txaContenido.setRows(5);
        jScrollPane1.setViewportView(txaContenido);

        lstPalabras.setBackground(new java.awt.Color(0, 0, 0));
        lstPalabras.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        lstPalabras.setForeground(new java.awt.Color(204, 204, 0));
        lstPalabras.setEnabled(false);
        jScrollPane2.setViewportView(lstPalabras);

        cmdObtenerPalabras.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cmdObtenerPalabras.setText("OBTENER LISTA DE PALABRAS");
        cmdObtenerPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdObtenerPalabrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(cmdObtenerPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(cmdObtenerPalabras)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdObtenerPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdObtenerPalabrasActionPerformed
        dlm.clear();
        String contenido = txaContenido.getText();
        String[] palabra = contenido.split("[\\s]{1,}");
        for(String s: palabra) {
            dlm.addElement(s);
        }
    }//GEN-LAST:event_cmdObtenerPalabrasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdObtenerPalabras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstPalabras;
    private javax.swing.JTextArea txaContenido;
    // End of variables declaration//GEN-END:variables
}
