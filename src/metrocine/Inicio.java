/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocine;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Aguado
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
 private MetroCine cine;
    
    public Inicio(MetroCine cine){
        initComponents();
         this.setLocationRelativeTo(null);
         this.cine=cine;
         
    }

  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        Vender = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        botonPeliculas = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(564, 575));
        setResizable(false);
        getContentPane().setLayout(null);

        Vender.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Vender.setForeground(new java.awt.Color(255, 0, 0));
        Vender.setText("Orden de Compra");
        Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderActionPerformed(evt);
            }
        });
        getContentPane().add(Vender);
        Vender.setBounds(50, 450, 200, 30);

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Modificar Sucursales");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 330, 200, 30);

        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 0));
        jButton2.setText("Registrar Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 410, 200, 30);

        botonPeliculas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonPeliculas.setForeground(new java.awt.Color(255, 0, 0));
        botonPeliculas.setText("Modificar Peliculas");
        botonPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPeliculasActionPerformed(evt);
            }
        });
        getContentPane().add(botonPeliculas);
        botonPeliculas.setBounds(50, 370, 200, 31);

        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("Carrito de Compra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(50, 490, 200, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kerlis Aguado");
        jPanel1.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Luis Torres");
        jPanel1.add(jLabel3);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(390, 460, 160, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocine/interfaz/Fondo.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(564, 575));
        jLabel1.setMinimumSize(new java.awt.Dimension(564, 575));
        jLabel1.setPreferredSize(new java.awt.Dimension(564, 575));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 560, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderActionPerformed
        // TODO add your handling code here
        if(cine.getClientes().estaVacio()){
             JOptionPane.showMessageDialog(null, "No ha registrado Clientes", "CUIDADO", JOptionPane.WARNING_MESSAGE); 
        }else{
         InterfazSucursal ventana=new InterfazSucursal(cine);
        this.dispose();
        ventana.setVisible(true);   
        }
        
    }//GEN-LAST:event_VenderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InterfazModificar ventana=new InterfazModificar(cine);
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        InterfazCliente ventana=new InterfazCliente(cine);
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPeliculasActionPerformed
        // TODO add your handling code here:
        InterfazPelicula ventana=new InterfazPelicula(cine);
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_botonPeliculasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(cine.getClientes().estaVacio()){
             JOptionPane.showMessageDialog(null, "No ha registrado Clientes", "CUIDADO", JOptionPane.WARNING_MESSAGE); 
        }else{
        InterfazCarrito ventana=new InterfazCarrito(cine);
        this.dispose();
        ventana.setVisible(true);    
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Vender;
    private javax.swing.JButton botonPeliculas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
