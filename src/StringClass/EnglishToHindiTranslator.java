package StringClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class EnglishToHindiTranslator extends JFrame {
    private JTextField englishInput;
    private JLabel hindiOutput;
    private Map<String, String> dictionary;

    public EnglishToHindiTranslator() {
        // Initialize the dictionary
        dictionary = new HashMap<>();
        initializeDictionary();

        // Set up the frame
        setTitle("English to Hindi Translator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Input field for English text
        englishInput = new JTextField(20);
        add(englishInput);

        // Translate button
        JButton translateButton = new JButton("Translate");
        add(translateButton);

        // Output label for Hindi text
        hindiOutput = new JLabel("Hindi Translation: ");
        add(hindiOutput);

        // Action listener for the translate button
        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String englishText = englishInput.getText();
                String hindiText = translate(englishText);
                hindiOutput.setText("Hindi Translation: " + hindiText);
            }
        });
    }

    // Method to initialize the dictionary
    private void initializeDictionary() {
        dictionary.put("hello", "नमस्ते");
        dictionary.put("world", "दुनिया");
        dictionary.put("cat", "बिल्ली");
        dictionary.put("dog", "कुत्ता");
        dictionary.put("thank you", "धन्यवाद");
        // Add more words as needed
    }

    // Method to translate English text to Hindi
    private String translate(String englishText) {
        StringBuilder hindiText = new StringBuilder();
        String[] words = englishText.split(" ");
        for (String word : words) {
            String translatedWord = dictionary.get(word.toLowerCase());
            if (translatedWord != null) {
                hindiText.append(translatedWord).append(" ");
            } else {
                hindiText.append(word).append(" "); // If not found, keep the original word
            }
        }
        return hindiText.toString().trim();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EnglishToHindiTranslator translator = new EnglishToHindiTranslator();
            translator.setVisible(true);
        });
    }
}

