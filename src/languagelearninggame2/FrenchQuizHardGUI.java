package languagelearninggame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Question {
    String text;
    String[] options;
    int correctAnswerIndex;

    public Question(String text, String[] options, int correctAnswerIndex) {
        this.text = text;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }
}

public class FrenchQuizHardGUI extends JFrame {
    private int currentQuestionIndex = 0;
    private Question[] questions;
    private JRadioButton[] answerButtons;
    private ButtonGroup buttonGroup;
    private JTextArea questionArea;
    private JButton submitButton;
    private JButton backToMenuButton;
    private int score = 0;

    private final DatabaseCode databaseCode = new DatabaseCode();
    private final String language = "French";

    public FrenchQuizHardGUI() {
       
        initComponents();
       
        setTitle("French Hard Quiz");
        setSize(600, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
       
        this.questions = new Question[]{
    new Question("What is the French word for \"unfortunately\"?", 
        new String[]{"Malheureusement", "Soudainement", "Heureusement", "Rapidement"}, 0),
    new Question("How do you say \"I would like\" in French?", 
        new String[]{"Je pourrais", "Je devrais", "J'aurais", "Je voudrais"}, 3),
    new Question("What does the French phrase \"prendre le taureau par les cornes\" mean in English?", 
        new String[]{"Take the bull by the horns", "Make a mountain out of a molehill", "Put the cart before the horse", "Bite off more than you can chew"}, 0),
    new Question("Which of these words means \"to improve\" in French?", 
        new String[]{"Améliorer", "Déménager", "Arrêter", "Réussir"}, 0),
    new Question("How do you say \"It's raining cats and dogs\" in French?", 
        new String[]{"Il pleut des cordes", "Il fait un froid de canard", "Il fait du vent", "Il neige beaucoup"}, 0)
};

        
        questionArea = new JTextArea(5, 30);
        questionArea.setEditable(false);
        questionArea.setWrapStyleWord(true);
        questionArea.setLineWrap(true);
        questionArea.setText(questions[currentQuestionIndex].text);
        questionArea.setFont(new Font("Arial", Font.BOLD, 16));

        answerButtons = new JRadioButton[4];
        buttonGroup = new ButtonGroup();

      
        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i] = new JRadioButton(questions[currentQuestionIndex].options[i]);
            buttonGroup.add(answerButtons[i]);
        }

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD, 14));
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAnswerSubmission();
            }
        });

        
        backToMenuButton = new JButton("Back to Main Menu");
        backToMenuButton.setFont(new Font("Arial", Font.BOLD, 14));
        backToMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenuGUI().setVisible(true);
                dispose();
            }
        });

        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

       
        JPanel questionPanel = new JPanel();
        questionPanel.add(new JScrollPane(questionArea));
        mainPanel.add(questionPanel, BorderLayout.NORTH);

        
        JPanel answerPanel = new JPanel();
        answerPanel.setLayout(new GridLayout(4, 1));
        for (JRadioButton answerButton : answerButtons) {
            answerPanel.add(answerButton);
        }
        mainPanel.add(answerPanel, BorderLayout.CENTER);

     
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);
        buttonPanel.add(backToMenuButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void updateAnswerButtons() {
        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i].setText(questions[currentQuestionIndex].options[i]);
            answerButtons[i].setSelected(false);
        }
    }

    private void handleAnswerSubmission() {
        
        int selectedAnswerIndex = -1;
        for (int i = 0; i < answerButtons.length; i++) {
            if (answerButtons[i].isSelected()) {
                selectedAnswerIndex = i;
                break;
            }
        }

        if (selectedAnswerIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select an answer!");
            return;
        }

      
        if (selectedAnswerIndex == questions[currentQuestionIndex].correctAnswerIndex) {
            score++;
            JOptionPane.showMessageDialog(this, "Correct!");
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect! The correct answer was: " 
                + questions[currentQuestionIndex].options[questions[currentQuestionIndex].correctAnswerIndex]);
        }

    
        currentQuestionIndex++;
        if (currentQuestionIndex < questions.length) {
            questionArea.setText(questions[currentQuestionIndex].text);
            updateAnswerButtons();
        } else {
            showFinalScore();
        }
    }

    private void showFinalScore() {
        String message = "Quiz finished! Your score: " + score + "/" + questions.length;

        if (score == questions.length) {
            message += "\nExcellent! You got all the answers right. Good job!";
        } else if (score >= (questions.length / 2)) {
            message += "\nGood job! You got some of the answers correct.";
        } else {
            message += "\nYou need to study more. Keep practicing!";
        }

       
        databaseCode.insertScore(language, score, questions.length);

        JOptionPane.showMessageDialog(this, message);
        
        dispose();
        new MainMenuGUI().setVisible(true);
    }

    
}
