/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nicho
 */
public class DifficultyMenuSpanishGUI extends javax.swing.JFrame {

    /**
     * Creates new form DifficultyMenuSpanishGUI
     */
    public DifficultyMenuSpanishGUI() {
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

        LanguageLearningGameTitle = new javax.swing.JLabel();
        EasyButton = new javax.swing.JButton();
        MediumButton = new javax.swing.JButton();
        HardButton = new javax.swing.JButton();
        PleaseSelectDifficultyText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LanguageLearningGameTitle.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LanguageLearningGameTitle.setText("Spanish Learning Game");

        EasyButton.setText("Easy");
        EasyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EasyButtonActionPerformed(evt);
            }
        });

        MediumButton.setText("Medium");
        MediumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediumButtonActionPerformed(evt);
            }
        });

        HardButton.setText("Hard");
        HardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardButtonActionPerformed(evt);
            }
        });

        PleaseSelectDifficultyText.setText("Please Select Difficulty");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LanguageLearningGameTitle)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HardButton)
                            .addComponent(MediumButton)
                            .addComponent(EasyButton))
                        .addGap(210, 210, 210))))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(PleaseSelectDifficultyText)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(LanguageLearningGameTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PleaseSelectDifficultyText)
                .addGap(21, 21, 21)
                .addComponent(EasyButton)
                .addGap(18, 18, 18)
                .addComponent(MediumButton)
                .addGap(18, 18, 18)
                .addComponent(HardButton)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EasyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EasyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EasyButtonActionPerformed

    private void MediumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediumButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MediumButtonActionPerformed

    private void HardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HardButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DifficultyMenuSpanishGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DifficultyMenuSpanishGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DifficultyMenuSpanishGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DifficultyMenuSpanishGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DifficultyMenuSpanishGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EasyButton;
    private javax.swing.JButton HardButton;
    private javax.swing.JLabel LanguageLearningGameTitle;
    private javax.swing.JButton MediumButton;
    private javax.swing.JLabel PleaseSelectDifficultyText;
    // End of variables declaration//GEN-END:variables
}