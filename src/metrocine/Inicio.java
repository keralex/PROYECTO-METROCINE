/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocine;

/**
 *
 * @author Luis Aguado
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
         this.setLocationRelativeTo(null);
         
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(564, 575));
        setMinimumSize(new java.awt.Dimension(564, 575));
        setPreferredSize(new java.awt.Dimension(564, 575));
        setResizable(false);
        getContentPane().setLayout(null);

        BotonIniciar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BotonIniciar.setText("Iniciar");
        BotonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonIniciar);
        BotonIniciar.setBounds(230, 510, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocine/interfaz/Fondo.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(564, 575));
        jLabel1.setMinimumSize(new java.awt.Dimension(564, 575));
        jLabel1.setPreferredSize(new java.awt.Dimension(564, 575));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 570, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarActionPerformed
        // TODO add your handling code here
        InterfazSucursal ventana=new InterfazSucursal();
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_BotonIniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIniciar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
