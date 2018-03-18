
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {
    
    
    public NewJFrame() {
        initComponents();
        Deshabilitado();
    }   
    double ancho;
    double alto;
    double radio;
    double diametro;
    double radioesfera;
    double diametroesfera;
    double arista;
    double diagonal;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxfiguras = new javax.swing.JComboBox<>();
        jTextDATO1 = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonComenzar = new javax.swing.JButton();
        jTextDATO2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabelVariable1 = new javax.swing.JLabel();
        jLabelVariable2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 31, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CALCULE ÁREA y VOLUMEN DE FIGURAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 64, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Elije la figura que deseas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 92, -1, -1));

        jComboBoxfiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cuadrado", "Circunferencia", "Esfera", "Cubo" }));
        jComboBoxfiguras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxfigurasItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxfiguras, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 118, 122, 31));

        jTextDATO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDATO1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextDATO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 197, 95, 28));

        jButtonCalcular.setText("CALCULAR");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 243, -1, 37));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CALCULE PROMEDIO DE DATOS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 339, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese los 10 datos (Uno por uno):");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 374, -1, -1));

        jButtonComenzar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonComenzar.setText("Comenzar");
        jButtonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComenzarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 407, 113, 32));

        jTextDATO2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDATO2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextDATO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 197, 91, 28));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 298, -1, -1));

        jLabelVariable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelVariable1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelVariable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 168, 85, 23));

        jLabelVariable2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelVariable2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelVariable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 167, 91, 24));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/12ad44f695d5bb9b83c32395534feef0.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Deshabilitado(){
        jTextDATO1.setEnabled(false);
        jTextDATO2.setEnabled(false);
        jButtonCalcular.setEnabled(false);       
        
    }
    
    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
   
        switch(jComboBoxfiguras.getSelectedIndex()){
            case 0:
                Deshabilitado();
            break;
            
            case 1: //CUADRADO
                if((jTextDATO1.getText()).equals("") || (jTextDATO2.getText()).equals("")){
                    JOptionPane.showMessageDialog(null,"No ingresó todos valores solicitados");
                }else{
                ancho=Double.parseDouble(jTextDATO1.getText());
                alto=Double.parseDouble(jTextDATO2.getText());
  
                JOptionPane.showMessageDialog(null,"AREA: "+ ancho*alto);                            
                jTextDATO2.setText("");
                jTextDATO1.setText("");
                }
                jTextDATO1.setEnabled(true);
                jTextDATO2.setEnabled(true);
            break;
            
            case 2: //CIRCUNFERENCIA
                if((jTextDATO1.getText()).equals("") && (jTextDATO2.getText()).equals("")){
                    JOptionPane.showMessageDialog(null,"No ingresó valores");
                } else {
                if((jTextDATO2.getText()).equals("")){
                    radio=Double.parseDouble(jTextDATO1.getText());
                    JOptionPane.showMessageDialog(null,"AREA: "+(Math.PI*radio*radio));
                    jTextDATO2.setText("");
                    jTextDATO1.setText(""); 
                    
                }else if ((jTextDATO1.getText()).equals("")){
                    diametro=Double.parseDouble(jTextDATO2.getText());
                    JOptionPane.showMessageDialog(null,"AREA: "+(Math.PI*diametro*diametro)/4);
                    jTextDATO2.setText("");
                    jTextDATO1.setText(""); 
                    
                }
                }
                jTextDATO1.setEnabled(true);
                jTextDATO2.setEnabled(true);
            break;
            
            case 3: //ESFERA
                if((jTextDATO1.getText()).equals("") && (jTextDATO2.getText()).equals("")){
                    JOptionPane.showMessageDialog(null,"No ingresó valores");
                }
                if((jTextDATO2.getText()).equals("")){
                    radioesfera=Double.parseDouble(jTextDATO1.getText());
                    JOptionPane.showMessageDialog(null,"VOLUMEN: "+((2.0*3.1416*(Math.pow(radioesfera, 3.0)))/3.0));
                    jTextDATO2.setText("");
                    jTextDATO1.setText("");
                    
                }else if((jTextDATO1.getText()).equals("")){
                    diametroesfera=(Double.parseDouble(jTextDATO2.getText()))/2;
                    JOptionPane.showMessageDialog(null,"VOLUMEN: "+((2.0*Math.PI*Math.pow(diametroesfera,3.0))/3.0));
                    jTextDATO2.setText("");
                    jTextDATO1.setText(""); 
                    
                }
                jTextDATO1.setEnabled(true);
                jTextDATO2.setEnabled(true);
                
            break;
            
            case 4: //CUBO
                if((jTextDATO1.getText()).equals("") && (jTextDATO2.getText()).equals("")){
                    JOptionPane.showMessageDialog(null,"No ingresó valores");
                } 

                    if((jTextDATO2.getText()).equals("")){
                        arista=Double.parseDouble(jTextDATO1.getText());
                        JOptionPane.showMessageDialog(null,"VOLUMEN: "+Math.pow(arista,3.0));            
                        jTextDATO2.setText("");
                        jTextDATO1.setText("");
                    
                    } else if((jTextDATO1.getText()).equals("")){
                        diagonal=Double.parseDouble(jTextDATO2.getText());
                        JOptionPane.showMessageDialog(null,"VOLUMEN: "+Math.pow(diagonal/Math.pow(3.0,1.0/2.0),3.0));                
                        jTextDATO2.setText("");
                        jTextDATO1.setText("");
                    
                    }
                jTextDATO1.setEnabled(true);
                jTextDATO2.setEnabled(true);
            break;  
        } 
        
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComenzarActionPerformed
        
        Double vector[] = new Double[10];
        Boolean acertado;
        for (int i=0; i<10;i++){
           do {
               try{
                   vector[i]=Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Ingrese su dato Nº " +(i+1)));
                    acertado=true;
                }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
                    acertado=false;
                }
               
           } while(acertado==false);
        }
        double suma=0;
        for (int i=0;i<10;i++){
            suma=suma+vector[i];
        }
        JOptionPane.showMessageDialog(null,"El promedio es: " +suma/10);
    }//GEN-LAST:event_jButtonComenzarActionPerformed

    private void jComboBoxfigurasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxfigurasItemStateChanged
        
        int figura=jComboBoxfiguras.getSelectedIndex();
        
        switch(figura){
            case 0:
                Deshabilitado();
            break;
            
            case 1: //CUADRADO
                jButtonCalcular.setEnabled(true);
                jTextDATO1.setEnabled(true);
                jTextDATO2.setEnabled(true);               
                jLabelVariable1.setText("ANCHO");
                jLabelVariable2.setText("LARGO");
                
                
            break;
        
            case 2: //CIRCUNFERENCIA
                jButtonCalcular.setEnabled(true);
                jTextDATO1.setEnabled(true);
                jTextDATO2.setEnabled(true);                
                jLabelVariable1.setText("RADIO");
                jLabelVariable2.setText("DIAMETRO");

            break;
            
            case 3: // ESFERA
                jButtonCalcular.setEnabled(true);
                jTextDATO1.setEnabled(true);
                jTextDATO2.setEnabled(true);               
                jLabelVariable1.setText("RADIO");
                jLabelVariable2.setText("DIAMETRO");

            break;  
            
            case 4: //CUBO
                jButtonCalcular.setEnabled(true);
                jTextDATO1.setEnabled(true);
                jTextDATO2.setEnabled(true);
                jLabelVariable1.setText("ARISTA");
                jLabelVariable2.setText("DIAGONAL");
  
            break;

        }

        
    }//GEN-LAST:event_jComboBoxfigurasItemStateChanged

    private void jTextDATO1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDATO1KeyTyped
        
        int figura=jComboBoxfiguras.getSelectedIndex();
        char numero1;
        switch(figura){
                      
            case 1: //CUADRADO
                numero1=evt.getKeyChar();
                if((!Character.isDigit(numero1))&&(numero1!='.'))evt.consume();
            
            break;
        
            case 2: //CIRCUNFERENCIA
                numero1=evt.getKeyChar();
                if(!"".equals(numero1)){
                jTextDATO2.setEnabled(false);}    
                if((!Character.isDigit(numero1))&&(numero1!='.'))evt.consume();
            
            break;
            
            case 3: // ESFERA
                numero1=evt.getKeyChar();
                if(!"".equals(numero1)){
                jTextDATO2.setEnabled(false);}    
                if((!Character.isDigit(numero1))&&(numero1!='.'))evt.consume();

            break;  
            
            case 4: //CUBO
                numero1=evt.getKeyChar();
                if(!"".equals(numero1)){
                jTextDATO2.setEnabled(false);}    
                if((!Character.isDigit(numero1))&&(numero1!='.'))evt.consume();
  
            break;

        }
        
    }//GEN-LAST:event_jTextDATO1KeyTyped

    private void jTextDATO2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDATO2KeyTyped
      
        int figura=jComboBoxfiguras.getSelectedIndex();
        char numero2;
        switch(figura){
                      
            case 1: //CUADRADO
                numero2=evt.getKeyChar();
                if((!Character.isDigit(numero2))&&(numero2!='.'))evt.consume();
            
            break;
        
            case 2: //CIRCUNFERENCIA
                numero2=evt.getKeyChar();
                if(!"".equals(numero2)){
                jTextDATO1.setEnabled(false);}    
                if((!Character.isDigit(numero2))&&(numero2!='.'))evt.consume();
            
            break;
            
            case 3: // ESFERA
                numero2=evt.getKeyChar();
                if(!"".equals(numero2)){
                jTextDATO1.setEnabled(false);}    
                if((!Character.isDigit(numero2))&&(numero2!='.'))evt.consume();

            break;  
            
            case 4: //CUBO
                numero2=evt.getKeyChar();
                if(!"".equals(numero2)){
                jTextDATO1.setEnabled(false);}    
                if((!Character.isDigit(numero2))&&(numero2!='.'))evt.consume();
  
            break;
        }
    }//GEN-LAST:event_jTextDATO2KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principal menu=new Principal();
       this.dispose();
       menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);               
            }
        });
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonComenzar;
    private javax.swing.JComboBox<String> jComboBoxfiguras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelVariable1;
    private javax.swing.JLabel jLabelVariable2;
    private javax.swing.JTextField jTextDATO1;
    private javax.swing.JTextField jTextDATO2;
    // End of variables declaration//GEN-END:variables

}
