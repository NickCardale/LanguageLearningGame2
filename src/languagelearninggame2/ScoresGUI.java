package languagelearninggame2;
// this class was mostly ChatGPT genrated as I could not Figure out how to print database information on the GUI
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ScoresGUI extends javax.swing.JFrame {

    public ScoresGUI() {
        initComponents();
        setSize(600, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        
        // Load scores from the database
        loadScoresFromDatabase();
    }

    private void loadScoresFromDatabase() {
        DatabaseCode db = new DatabaseCode();
        List<String> scores = db.getAllScores();

        // Create a DefaultTableModel
        DefaultTableModel model = new DefaultTableModel(new String[]{"Language", "Score", "Time"}, 0);
        
        // Populate the model with data from the scores list
        for (String score : scores) {
            String[] parts = score.split(", ");
            String language = parts[0].split(": ")[1]; // Extracting the language
            String scoreValue = parts[1].split(": ")[1]; // Extracting the score
            String time = parts[2].split(": ")[1]; // Extracting the time
            model.addRow(new Object[]{language, scoreValue, time});
        }
        
        // Set the model to the ScoresTable
        ScoresTable.setModel(model);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        LanguageLearningGameTitle = new javax.swing.JLabel();
        BackToMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ScoresTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LanguageLearningGameTitle.setFont(new java.awt.Font("Arial", 1, 36)); 
        LanguageLearningGameTitle.setText("Scores");

        BackToMenu.setText("Back To Main Menu");
        BackToMenu.addActionListener(evt -> {
            new MainMenuGUI().setVisible(true);
            this.dispose();
        });

        ScoresTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] {"Language", "Score", "Time"}));
        jScrollPane1.setViewportView(ScoresTable);

        // Layout setup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(LanguageLearningGameTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(BackToMenu)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
            .addGap(31)
            .addComponent(LanguageLearningGameTitle)
            .addGap(18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18)
            .addComponent(BackToMenu)
            .addGap(37)
        );

        pack();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new ScoresGUI().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BackToMenu;
    private javax.swing.JLabel LanguageLearningGameTitle;
    private javax.swing.JTable ScoresTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
