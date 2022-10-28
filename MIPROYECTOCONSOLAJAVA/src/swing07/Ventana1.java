package swing07;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Ventana1 extends javax.swing.JFrame {

    String[] cabecera = {"ID ALUMNO", "NOMBRE", "NOTA1", "NOTA2", "NOTA3","PROMEDIO"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);

    public Ventana1() {
        initComponents();
        personalizar_JFrame();
        personalizar_JTable();
        cargarDatosTable();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana1.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setTitle("GUI");
    }

    public void personalizar_JTable() {
        tblContenido.setModel(dtm);
        tblContenido.setFont(new java.awt.Font("Lucida Console", 0, 14)); // Cambia la fuente de letra, el estilo y el tamaño de letra
        tblContenido.setBackground(Color.BLACK); // Cambia el color de fondo del table
        tblContenido.setForeground(Color.WHITE); // Cambia el color de letra
        tblContenido.setGridColor(Color.BLUE); // Cambia el color del grid
        tblContenido.setRowHeight(20);

        //tblContenido.setShowGrid(false); // Muestra el grid con true y lo oculta con false
        tblContenido.setShowHorizontalLines(false); // Muestra la línea horizontal del grid con true y lo oculta con false
        tblContenido.setShowVerticalLines(true); // Muestra la línea vertical del grid con true y lo oculta con false	

        tblContenido.getTableHeader().setBackground(Color.BLACK); // Cambia el color de fondo de la cabecera
        tblContenido.getTableHeader().setForeground(Color.WHITE); // Cambia el color de letra de la cabecera
        tblContenido.getTableHeader().setFont(new java.awt.Font("Courier New", 0, 14)); // Cambia la fuente, estilo y tamaño de letra de la cabecera
        tblContenido.getTableHeader().setBorder(new LineBorder(new Color(255, 162, 232))); // Cambia de color el border de la cabecera

    }

    public void cargarDatosTable() {
        List<Alumno> alumnos_al = new ArrayList<Alumno>();
        alumnos_al.add(new Alumno("A01", "Luis", 5, 7, 8));
        alumnos_al.add(new Alumno("A02", "Miguel", 6, 7, 8));
        alumnos_al.add(new Alumno("A03", "Carlos", 5, 7, 1));
        alumnos_al.add(new Alumno("A04", "Vanessa", 4, 7, 8));
        alumnos_al.add(new Alumno("A05", "Melissa", 2, 7, 4));
        alumnos_al.add(new Alumno("A06", "Arturo", 5, 8, 8));
        alumnos_al.add(new Alumno("A07", "Gerson", 5, 7, 8));
        alumnos_al.add(new Alumno("A08", "María", 5, 9, 7));
        alumnos_al.add(new Alumno("A09", "Ismael", 4, 7, 9));
        alumnos_al.add(new Alumno("A10", "Jose", 2, 6, 8));
        alumnos_al.add(new Alumno("A11", "Jose", 3, 6, 3));
        alumnos_al.add(new Alumno("A12", "Jose", 5, 7, 9));
        alumnos_al.add(new Alumno("A13", "Jose", 7, 6, 3));
        alumnos_al.add(new Alumno("A14", "Jose", 8, 2, 4));
        alumnos_al.add(new Alumno("A15", "Jose", 9, 6, 3));

        String[] fblanco = {"", "", "", "", "",""};

        for (int i = 0; i < alumnos_al.size(); i++) {
            Alumno a = alumnos_al.get(i);
            dtm.addRow(fblanco);
            dtm.setValueAt(a.getIdAlumno(), i, 0);
            dtm.setValueAt(a.getNombre(), i, 1);
            dtm.setValueAt(a.getNota1(), i, 2);
            dtm.setValueAt(a.getNota2(), i, 3);
            dtm.setValueAt(a.getNota3(), i, 4);
            dtm.setValueAt(a.promedio(), i, 5);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContenido = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MOSTRAR DATOS JTABLE");
        lblTitulo.setOpaque(true);

        tblContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblContenido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblContenido;
    // End of variables declaration//GEN-END:variables
}
