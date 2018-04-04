/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocine;

import javax.swing.JOptionPane;

/**
 *
 * @author kerlis
 */
public class InterfazSucursal extends javax.swing.JFrame {
    private MetroCine cine;
    private Sucursal aux;
    private Sala sala;
    private int tickets;
    private Cliente cliente;
 
    public InterfazSucursal(MetroCine cine) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cine=cine;
        InsertarUbicacion(cine.getSucursales().getRaiz());
        this.tickets=0;
        
        acumulador.setText("  ");
        
    }
    
    private void InsertarUbicacion(Sucursal aux){
         if(aux != null){
            
            this.InsertarUbicacion(aux.gethIzquierdo());
            listaSucursales.addItem(aux.getUbicacion());            
            this.InsertarUbicacion(aux.gethDerecho()); 
            
        }
         
        
    }
    
    private void BuscarPorTipo(Sala aux){
         if(aux != null){
            
            this.BuscarPorTipo(aux.gethIzquierdo());
            if(aux.getTipo()==2 && "2D".equals((String)listaSalas.getSelectedItem())){
               listaPeliculas.addItem(aux.getPelicula().getNombre());
            } 
         
            else if(aux.getTipo()==3 && "3D".equals((String)listaSalas.getSelectedItem())){
                 listaPeliculas.addItem(aux.getPelicula().getNombre());
            }
            else if(aux.getTipo()==4 && "4DX".equals((String)listaSalas.getSelectedItem())){
                listaPeliculas.addItem(aux.getPelicula().getNombre());
            }
            
            this.BuscarPorTipo(aux.gethDerecho()); 
            
        }
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
        jLabel1 = new javax.swing.JLabel();
        listaSucursales = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        listaSalas = new javax.swing.JComboBox<>();
        listaPeliculas = new javax.swing.JComboBox<>();
        botonBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        listaGenero = new javax.swing.JComboBox<>();
        listaIdioma = new javax.swing.JComboBox<>();
        botonVolver = new javax.swing.JButton();
        Sumar = new javax.swing.JButton();
        Restar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        acumulador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setMinimumSize(new java.awt.Dimension(680, 640));
        setName("MetroCine\n"); // NOI18N
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(680, 620));
        jPanel1.setLayout(null);

        Cinta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocine/interfaz/Cinta.png"))); // NOI18N
        jPanel1.add(Cinta1);
        Cinta1.setBounds(480, 0, 390, 630);

        Cinta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metrocine/interfaz/Cinta.png"))); // NOI18N
        jPanel1.add(Cinta2);
        Cinta2.setBounds(-200, 0, 420, 630);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Orden de Compra");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 30, 220, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Por favor escoja la Pelicula:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 330, 220, 20);

        listaSucursales.setMaximumRowCount(4);
        listaSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSucursalesActionPerformed(evt);
            }
        });
        jPanel1.add(listaSucursales);
        listaSucursales.setBounds(140, 190, 140, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Por favor escoja la sucursal: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 160, 220, 20);

        listaSalas.setMaximumRowCount(4);
        listaSalas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4DX", "3D", "2D" }));
        listaSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSalasActionPerformed(evt);
            }
        });
        jPanel1.add(listaSalas);
        listaSalas.setBounds(140, 280, 150, 20);

        listaPeliculas.setMaximumRowCount(4);
        listaPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPeliculasActionPerformed(evt);
            }
        });
        jPanel1.add(listaPeliculas);
        listaPeliculas.setBounds(130, 440, 290, 20);

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonBuscar.setText("Enviar a Carrito");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar);
        botonBuscar.setBounds(160, 570, 180, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Por favor escoja tipo de sala: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 240, 220, 20);

        listaGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Generos", "Terror", "Comedia", "Drama", "Fantasia", "Accion" }));
        jPanel1.add(listaGenero);
        listaGenero.setBounds(130, 380, 120, 20);

        listaIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Idiomas", "Español", "Ingles" }));
        listaIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaIdiomaActionPerformed(evt);
            }
        });
        jPanel1.add(listaIdioma);
        listaIdioma.setBounds(280, 380, 130, 20);

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(botonVolver);
        botonVolver.setBounds(450, 40, 100, 23);

        Sumar.setText("+");
        Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarActionPerformed(evt);
            }
        });
        jPanel1.add(Sumar);
        Sumar.setBounds(230, 510, 41, 23);

        Restar.setText("-");
        Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarActionPerformed(evt);
            }
        });
        jPanel1.add(Restar);
        Restar.setBounds(330, 510, 40, 23);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero de entradas:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 480, 150, 17);

        acumulador.setText("      ");
        acumulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acumuladorActionPerformed(evt);
            }
        });
        jPanel1.add(acumulador);
        acumulador.setBounds(280, 510, 40, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese C.I del cliente:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 80, 190, 20);
        jPanel1.add(Cliente);
        Cliente.setBounds(140, 120, 200, 20);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(360, 120, 90, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSucursalesActionPerformed
        // TODO add your handling code here:
        if(listaPeliculas.getItemCount()>0){
            listaPeliculas.removeAllItems();
        }
        
        if(listaSucursales.getSelectedIndex()!=0){
            this.aux=cine.getSucursales().BuscarPorUbicacion(cine.getSucursales().getRaiz(), listaSucursales.getItemAt(listaSucursales.getSelectedIndex()));
            System.out.println(aux.getUbicacion());
        }
        
        
        
    }//GEN-LAST:event_listaSucursalesActionPerformed

    private void listaPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPeliculasActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_listaPeliculasActionPerformed

    private void listaIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaIdiomaActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
         Inicio inicio=new Inicio(cine);
        this.dispose();
        inicio.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here
        this.cliente.getCarro().setTicketsT(Integer.parseInt(acumulador.getText()));
      
      
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarActionPerformed
        // TODO add your handling code here:
       if(tickets>0){
           this.tickets--;
           
       }
       
        acumulador.setText(Integer.toString(tickets));
        this.cliente.getCarro().getTickets().Pop();
        
    }//GEN-LAST:event_RestarActionPerformed

    private void SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarActionPerformed
        // TODO add your handling code here:
       this.tickets++;
       this.cliente.getCarro().getTickets().Push(new Ticket(this.aux,aux.getSalas().BuscarPorPelicula(aux.getSalas().getRaiz(),(String)listaPeliculas.getSelectedItem()),this.cliente));
       acumulador.setText(Integer.toString(tickets));
    }//GEN-LAST:event_SumarActionPerformed

    private void acumuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acumuladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acumuladorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!Cliente.getText().equals("")){
            if(isInteger(Cliente.getText())){
               this.cliente= cine.getClientes().buscarCliente(cine.getClientes().getRaiz(), Integer.parseInt(Cliente.getText()));
            
            if(this.cliente==null){
            JOptionPane.showMessageDialog(null, "No se ha registrado dicho cliente", "CUIDADO", JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Proceda a ingresar los datos parabuscar su Pelicula", "", JOptionPane.DEFAULT_OPTION);
            } 
            }else{
               JOptionPane.showMessageDialog(null, "Debe ingresar SOLO numeros", "CUIDADO", JOptionPane.WARNING_MESSAGE);  
            }
            
            
        }else{
            JOptionPane.showMessageDialog(null, "No ha escrito la Cedula del cliente", "CUIDADO", JOptionPane.WARNING_MESSAGE); 
        }
        Cliente.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listaSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSalasActionPerformed
        // TODO add your handling code here:
        if(listaPeliculas.getItemCount()>0){
            listaPeliculas.removeAllItems();
        }
        
        this.BuscarPorTipo(aux.getSalas().getRaiz());
    }//GEN-LAST:event_listaSalasActionPerformed

  
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
    private javax.swing.JLabel Cinta1;
    private javax.swing.JLabel Cinta2;
    private javax.swing.JTextField Cliente;
    private javax.swing.JButton Restar;
    private javax.swing.JButton Sumar;
    private javax.swing.JTextField acumulador;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaGenero;
    private javax.swing.JComboBox<String> listaIdioma;
    private javax.swing.JComboBox<String> listaPeliculas;
    private javax.swing.JComboBox<String> listaSalas;
    private javax.swing.JComboBox<String> listaSucursales;
    // End of variables declaration//GEN-END:variables
}
