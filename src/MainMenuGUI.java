/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nicho
 */
public class MainMenuGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuGUI
     */
    public MainMenuGUI() {
        initComponents();
        setSize(600, 500);
    setResizable(false);
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
        SpanishQuizButton = new javax.swing.JButton();
        FrenchQuizButton = new javax.swing.JButton();
        ItalianQuizButton = new javax.swing.JButton();
        PleaseSelectQuizLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LanguageLearningGameTitle.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LanguageLearningGameTitle.setText("Language Learning Game");

        SpanishQuizButton.setText("Spanish");
        SpanishQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpanishQuizButtonActionPerformed(evt);
            }
        });

        FrenchQuizButton.setText("French");
        FrenchQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrenchQuizButtonActionPerformed(evt);
            }
        });

        ItalianQuizButton.setText("Italian");
        ItalianQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItalianQuizButtonActionPerformed(evt);
            }
        });

        PleaseSelectQuizLabel.setText("Please Select a Quiz Language");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(LanguageLearningGameTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FrenchQuizButton)
                            .addComponent(SpanishQuizButton)
                            .addComponent(ItalianQuizButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(PleaseSelectQuizLabel)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LanguageLearningGameTitle)
                .addGap(10, 10, 10)
                .addComponent(PleaseSelectQuizLabel)
                .addGap(24, 24, 24)
                .addComponent(SpanishQuizButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FrenchQuizButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ItalianQuizButton)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FrenchQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrenchQuizButtonActionPerformed
        // TODO add your handling code here:
        new DifficultyMenuFrenchGUI().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_FrenchQuizButtonActionPerformed

    private void SpanishQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpanishQuizButtonActionPerformed
        // TODO add your handling code here:
        new DifficultyMenuSpanishGUI().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_SpanishQuizButtonActionPerformed

    private void ItalianQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItalianQuizButtonActionPerformed
        // TODO add your handling code here:
        new DifficultyMenuItalianGUI().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_ItalianQuizButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FrenchQuizButton;
    private javax.swing.JButton ItalianQuizButton;
    private javax.swing.JLabel LanguageLearningGameTitle;
    private javax.swing.JLabel PleaseSelectQuizLabel;
    private javax.swing.JButton SpanishQuizButton;
    // End of variables declaration//GEN-END:variables
}
