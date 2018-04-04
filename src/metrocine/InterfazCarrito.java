/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocine;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class InterfazCarrito extends javax.swing.JFrame {

    /**
     * Creates new form InterfazCarrito
     */
    private MetroCine cine;
    private Cliente cliente;
    public InterfazCarrito(MetroCine cine) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cine=cine;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Tickets = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(680, 640));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 0, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(680, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(680, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 640));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocine/interfaz/Cinta.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-190, 0, 350, 690);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocine/interfaz/Cinta.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(470, 0, 230, 690);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Carrito de Compra");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 30, 170, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese C.I del Cliente:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 100, 180, 17);

        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        jPanel1.add(Cliente);
        Cliente.setBounds(150, 140, 170, 20);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 140, 90, 23);

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(453, 40, 80, 23);

        Tickets.setText("       ");
        Tickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketsActionPerformed(evt);
            }
        });
        jPanel1.add(Tickets);
        Tickets.setBounds(170, 230, 30, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tickets:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 204, 90, 20);

        jButton3.setText("Comprar");
        jPanel1.add(jButton3);
        jButton3.setBounds(290, 530, 90, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!Cliente.getText().equals("")){
            if(isInteger(Cliente.getText())){
               this.cliente= cine.getClientes().buscarCliente(cine.getClientes().getRaiz(), Integer.parseInt(Cliente.getText()));
               
            if(this.cliente==null){
            JOptionPane.showMessageDialog(null, "No se ha registrado dicho cliente", "CUIDADO", JOptionPane.WARNING_MESSAGE);
            }else{
                System.out.println("existe"+this.cliente.getTelefono());
                System.out.println(cliente.getCarro().getTickets());
                Tickets.setText(String.valueOf(this.cliente.getCarro().getTicketsT()));
               
            } 
            }else{
               JOptionPane.showMessageDialog(null, "Debe ingresar SOLO numeros", "CUIDADO", JOptionPane.WARNING_MESSAGE);  
            }
            
            
        }else{
            JOptionPane.showMessageDialog(null, "No ha escrito la Cedula del cliente", "CUIDADO", JOptionPane.WARNING_MESSAGE); 
        }
        Cliente.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TicketsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Inicio inicio=new Inicio(cine);
        this.dispose();
        inicio.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

public  boolean isInteger(String s) {
      boolean isValidInteger = false;
      try
      {
         Integer.parseInt(s);
 
         // s is a valid integer
 
         isValidInteger = true;
      }
      catch (NumberFormatException ex)
      {
         // s is not an integer
      }
 
      return isValidInteger;
   }    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cliente;
    private javax.swing.JTextField Tickets;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
