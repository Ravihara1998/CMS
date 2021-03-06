/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suraj ravihara
 */
public class Software extends javax.swing.JFrame {

    /**
     * Creates new form Software
     */
    public Software() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Bache = new javax.swing.JLabel();
        Software = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Home = new javax.swing.JButton();
        jButton_pdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 8, 79));
        setForeground(new java.awt.Color(51, 255, 255));
        setResizable(false);

        jLabel_Bache.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Bache.setText("(Bachelor of Information & Communication Technology...)");

        Software.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Software.setForeground(new java.awt.Color(51, 51, 255));
        Software.setText("Software Technology...");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("02");

        jButton_Home.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_Home.setForeground(new java.awt.Color(0, 0, 255));
        jButton_Home.setText("Home");
        jButton_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HomeActionPerformed(evt);
            }
        });

        jButton_pdf.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_pdf.setText("Module 01");
        jButton_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel_Bache, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jButton_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Software))))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel_Bache)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Software)
                    .addComponent(jLabel1))
                .addGap(55, 55, 55)
                .addComponent(jButton_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(jButton_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HomeActionPerformed
        new Home ().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton_HomeActionPerformed

    private void jButton_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pdfActionPerformed
        try{
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Resources\\Lab-sheet-07.pdf");
        }catch (Exception e)
        {
            JOptionpane.showMessageDialog(null,"Error");
        }
    }//GEN-LAST:event_jButton_pdfActionPerformed

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
            java.util.logging.Logger.getLogger(Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Software().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Software;
    private javax.swing.JButton jButton_Home;
    private javax.swing.JButton jButton_pdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Bache;
    // End of variables declaration//GEN-END:variables

    private static class JOptionpane {

        private static void showMessageDialog(Object object, String error) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public JOptionpane() {
        }
    }
}
