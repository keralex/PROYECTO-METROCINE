/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocine;

/**
 *
 * @author kerlis
 */
public class InterfazSucursal extends javax.swing.JFrame {

 
    public InterfazSucursal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cinta1 = new javax.swing.JLabel();
        Cinta2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setMaximumSize(new java.awt.Dimension(680, 620));
        setMinimumSize(new java.awt.Dimension(680, 620));
        setName("MetroCine\n"); // NOI18N
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(null);

        Cinta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocine/interfaz/Cinta.png"))); // NOI18N
        jPanel1.add(Cinta1);
        Cinta1.setBounds(480, 0, 390, 630);

        Cinta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocine/interfaz/Cinta.png"))); // NOI18N
        jPanel1.add(Cinta2);
        Cinta2.setBounds(-200, -10, 420, 630);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 30, 220, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cinta1;
    private javax.swing.JLabel Cinta2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
