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
    private MetroCine cine;
 
    public InterfazSucursal() {
        initComponents();
        this.setLocationRelativeTo(null);
        cine=new MetroCine();
        InsertarUbicacion(cine.getSucursales().getRaiz());
        
        
    }
    
    private void InsertarUbicacion(Sucursal aux){
         if(aux != null){
            
            this.InsertarUbicacion(aux.gethIzquierdo());
            listaSucursales.addItem(aux.getUbicacion());            
            this.InsertarUbicacion(aux.gethDerecho()); 
            
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
        listaSucursales = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        listaSalas = new javax.swing.JComboBox<String>();
        listaPeliculas = new javax.swing.JComboBox<String>();
        botonBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        listaGenero = new javax.swing.JComboBox<String>();
        listaIdioma = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setMaximumSize(new java.awt.Dimension(680, 640));
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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 30, 220, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Por favor escoja la Pelicula:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 330, 220, 20);

        listaSucursales.setMaximumRowCount(4);
        listaSucursales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cualquiera" }));
        listaSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSucursalesActionPerformed(evt);
            }
        });
        jPanel1.add(listaSucursales);
        listaSucursales.setBounds(140, 160, 140, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Por favor escoja la sucursal: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 100, 220, 20);

        listaSalas.setMaximumRowCount(4);
        listaSalas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cualquiera", "4DX", "3D", "2D", " " }));
        jPanel1.add(listaSalas);
        listaSalas.setBounds(140, 270, 150, 20);

        listaPeliculas.setMaximumRowCount(4);
        listaPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPeliculasActionPerformed(evt);
            }
        });
        jPanel1.add(listaPeliculas);
        listaPeliculas.setBounds(130, 460, 290, 20);

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonBuscar.setText("Buscar");
        jPanel1.add(botonBuscar);
        botonBuscar.setBounds(160, 570, 90, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Por favor escoja tipo de sala: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 220, 220, 20);

        listaGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Generos", " " }));
        jPanel1.add(listaGenero);
        listaGenero.setBounds(130, 380, 120, 20);

        listaIdioma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Idiomas", " " }));
        listaIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaIdiomaActionPerformed(evt);
            }
        });
        jPanel1.add(listaIdioma);
        listaIdioma.setBounds(280, 380, 130, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSucursalesActionPerformed
        // TODO add your handling code here:
        Sucursal aux=cine.getSucursales().BuscarPorUbicacion(cine.getSucursales().getRaiz(), listaSucursales.getItemAt(listaSucursales.getSelectedIndex()));
        System.out.println(aux.getUbicacion());
        
    }//GEN-LAST:event_listaSucursalesActionPerformed

    private void listaPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPeliculasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPeliculasActionPerformed

    private void listaIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaIdiomaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cinta1;
    private javax.swing.JLabel Cinta2;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaGenero;
    private javax.swing.JComboBox<String> listaIdioma;
    private javax.swing.JComboBox<String> listaPeliculas;
    private javax.swing.JComboBox<String> listaSalas;
    private javax.swing.JComboBox<String> listaSucursales;
    // End of variables declaration//GEN-END:variables
}
