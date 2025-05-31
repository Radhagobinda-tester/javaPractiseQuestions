package StringClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class EnglishToHindiAlphabetTranslator extends JFrame {
    private JTextField englishInput;
    private JLabel hindiOutput;
    private Map<Character, String> alphabetMap;

    public EnglishToHindiAlphabetTranslator() {
        // Initialize the alphabet mapping
        alphabetMap = new HashMap<>();
        initializeAlphabetMap();

        // Set up the frame
        setTitle("English to Hindi Alphabet Translator");
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

    // Method to initialize the alphabet mapping
    private void initializeAlphabetMap() {
        alphabetMap.put('a', "अ");
        alphabetMap.put('b', "ब");
        alphabetMap.put('c', "क");
        alphabetMap.put('d', "द");
        alphabetMap.put('e', "इ");
        alphabetMap.put('f', "फ");
        alphabetMap.put('g', "ग");
        alphabetMap.put('h', "ह");
        alphabetMap.put('i', "ई");
        alphabetMap.put('j', "ज");
        alphabetMap.put('k', "क");
        alphabetMap.put('l', "ल");
        alphabetMap.put('m', "म");
        alphabetMap.put('n', "न");
        alphabetMap.put('o', "ओ");
        alphabetMap.put('p', "प");
        alphabetMap.put('q', "क्यू");
        alphabetMap.put('r', "र");
        alphabetMap.put('s', "स");
        alphabetMap.put('t', "ट");
        alphabetMap.put('u', "उ");
        alphabetMap.put('v', "व");
        alphabetMap.put('w', "व");
        alphabetMap.put('x', "एक्स");
        alphabetMap.put('y', "य");
        alphabetMap.put('z', "ज");
    }

    // Method to translate English text to Hindi
    private String translate(String englishText) {
        StringBuilder hindiText = new StringBuilder();
        for (char letter : englishText.toLowerCase().toCharArray()) {
            String translatedLetter = alphabetMap.get(letter);
            if (translatedLetter != null) {
                hindiText.append(translatedLetter);
            } else {
                hindiText.append(letter); // If not found, keep the original character
            }
        }
        return hindiText.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EnglishToHindiAlphabetTranslator translator = new EnglishToHindiAlphabetTranslator();
            translator.setVisible(true);
        });
    }
}
