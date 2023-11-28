/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import prgs.conexion;

/**
 *
 * @author Usuario
 */
public class gui_grupos extends javax.swing.JFrame {

    /**
     * Creates new form gui_grupos
     */
    //establecemos la conexion con la base de datos
    conexion  miconex = new conexion();
        
    public gui_grupos() {
        initComponents();
           
        this.setLocationRelativeTo(null);//centrar 
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_grabar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lcodigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_editar.setText("EDITAR");

        btn_borrar.setText("BORRAR");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_grabar.setText("GRABAR");
        btn_grabar.setEnabled(false);
        btn_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.setEnabled(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        lcodigo.setText("CODIGO");

        jLabel1.setText("NOMBRE");

        txt_codigo.setEnabled(false);
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });

        txt_nombre.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btn_agregar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lcodigo)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_grabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcodigo)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_editar)
                    .addComponent(btn_borrar)
                    .addComponent(btn_grabar)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_salir))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
       generar_id();
       hab_text();
       des_botones();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        des_text();
        hab_botones();
        clear_text();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        //System.exit(0);
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed
        
        grabar();//primero grabar
        des_text();
        hab_botones();
        clear_text();
              
    }//GEN-LAST:event_btn_grabarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
       des_botones();
        
       this.txt_codigo.setEnabled(true);
       this.txt_codigo.requestFocus();
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // presione enter
        buscar_cod();
    }//GEN-LAST:event_txt_codigoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gui_grupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui_grupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui_grupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui_grupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui_grupos().setVisible(true);
            }
        });
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_grabar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lcodigo;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

private void hab_text()
{
     this.txt_nombre.setEnabled(true);
     
     //habilta los demas text si hay
      this.txt_nombre.requestFocus();
}
private void des_text()
{
     this.txt_nombre.setEnabled(false);
     this.txt_codigo.setEnabled(false);
}

private void des_botones()
{
     this.btn_agregar.setEnabled(false);
     this.btn_editar.setEnabled(false);
     this.btn_borrar.setEnabled(false);
     this.btn_grabar.setEnabled(true);
     this.btn_cancelar.setEnabled(true);
     this.btn_salir.setEnabled(false);
              
}

private void hab_botones()
{
     this.btn_agregar.setEnabled(true);
     this.btn_editar.setEnabled(true);
     this.btn_borrar.setEnabled(true);
     this.btn_grabar.setEnabled(false);
     this.btn_cancelar.setEnabled(false);
     this.btn_salir.setEnabled(true);
              
}

private void clear_text()
{
    txt_codigo.setText("");
    txt_nombre.setText(""); 
}

 private void generar_id()
   {     
       
        try 
        {
            miconex.sentencia = miconex.conexion.createStatement();
            miconex.resultado = miconex.sentencia.executeQuery("SELECT IFNULL(MAX(gru_codigo),0) + 1  AS nuevo FROM grupos");
            
            //etraer los datos de la variable
            while(miconex.resultado.next()==true)
            {
                this.txt_codigo.setText(miconex.resultado.getString("nuevo"));
            }
        } ///fin generar id
        catch (SQLException ex) {
            Logger.getLogger(gui_grupos.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   private void grabar()
   {            
        try {
            miconex.sentencia = miconex.conexion.createStatement();
            miconex.sentencia.executeUpdate("INSERT INTO grupos(gru_codigo,gru_descri) VALUES("+this.txt_codigo.getText()+",'"+this.txt_nombre.getText()+"')");
            
            JOptionPane.showMessageDialog(null, "El registro se ha insertado satisfactoriamente.", "CONFIRMACION", JOptionPane.INFORMATION_MESSAGE);         
        } catch (SQLException ex) {
            Logger.getLogger(gui_grupos.class.getName()).log(Level.SEVERE, null, ex);
        }
   }  
 
   private void buscar_cod()
    { 
        try {
            boolean encontro = false;
            
            miconex.sentencia = miconex.conexion.createStatement();
            miconex.resultado = miconex.sentencia.executeQuery("SELECT * FROM grupos WHERE gru_codigo ="+this.txt_codigo.getText());
            
            //etraer los datos de la variable
            while(miconex.resultado.next()==true)
            {
                this.txt_nombre.setText(miconex.resultado.getString("gru_descri"));
                //aca los demas atributos
                //this.txt_con_cod.setText(miconex.resultado.getString("xxx"));
                    
                encontro = true;
            }
            
            if(encontro==true)
            {
                
                int respuesta = JOptionPane.showConfirmDialog(this,"Deseas Borrar el Registro?","Confirmar",JOptionPane.YES_NO_OPTION);
                if(respuesta == JOptionPane.YES_OPTION)
                {
                    //borrar
                    miconex.sentencia = miconex.conexion.createStatement();
                    miconex.sentencia.executeUpdate("DELETE FROM grupos WHERE gru_codigo ="+this.txt_codigo.getText());
                    
                    JOptionPane.showMessageDialog(null, "El registro se ha borrado satisfactoriamente.", "Demosys", JOptionPane.INFORMATION_MESSAGE);
                    
                    hab_botones();
                    des_text();
                    clear_text();
                }
                else
                {
                    hab_botones();
                    des_text();
                    clear_text();
                    
                    //this.btn_cancelar.doClick();
                }
            } 
            else
            {
                JOptionPane.showMessageDialog(null, "No existe un registro con este codigo!", "Atencion", JOptionPane.ERROR_MESSAGE);
                this.txt_codigo.setText("");
                this.txt_codigo.requestFocus();
            }      
        } catch (SQLException ex) {
            Logger.getLogger(gui_grupos.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
 
}
