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
public class InterfazCliente extends javax.swing.JFrame {

    /**
     * Creates new form InterfazCliente
     */
    MetroCine cine;
    public InterfazCliente(MetroCine cine) {
        
        initComponents();
        this.cine=cine;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombrecliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 620));
        setMinimumSize(new java.awt.Dimension(680, 620));
        setPreferredSize(new java.awt.Dimension(680, 620));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(680, 620));
        jPanel1.setMinimumSize(new java.awt.Dimension(680, 620));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocine/interfaz/Cinta.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 0, 350, 620);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocine/interfaz/Cinta.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-200, 0, 350, 620);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 30, 100, 30);
        jPanel1.add(Nombrecliente);
        Nombrecliente.setBounds(130, 190, 210, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese el telefono");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 270, 220, 20);
        jPanel1.add(Telefono);
        Telefono.setBounds(130, 310, 210, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese la cedula");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 410, 220, 20);
        jPanel1.add(Cedula);
        Cedula.setBounds(130, 450, 210, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese el nombre del cliente");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 150, 220, 20);

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 560, 80, 23);

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(463, 10, 70, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(Nombrecliente.getText()!="" && Cedula.getText()!="" && Telefono.getText()!=""){
        if(isInteger(Cedula.getText()) && isInteger(Telefono.getText())){
          cine.getClientes().InsertarCliente(cine.getClientes().getRaiz(), new Cliente(Nombrecliente.getText(),Integer.parseInt(Cedula.getText()),Integer.parseInt(Telefono.getText())));
          
          JOptionPane.showMessageDialog(null, "Cliente Registrado Exitosamente", "", JOptionPane.DEFAULT_OPTION);
        }else{
           JOptionPane.showMessageDialog(null, "Ingreso mal un dato", "CUIDADO", JOptionPane.WARNING_MESSAGE);
            
            //pantalla emergente de error
        }
        
            
        Nombrecliente.setText("");
        Cedula.setText("");
        Telefono.setText("");  
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField Nombrecliente;
    private javax.swing.JTextField Telefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
