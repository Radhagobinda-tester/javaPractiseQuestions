package StringClass;


import javax.swing.*;
import java.awt.*;

public class cartoon extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200); // Face
        
        // Draw eyes
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 30, 30); // Left eye
        g.fillOval(170, 100, 30, 30); // Right eye
        
        // Draw smile
        g.setColor(Color.RED);
        g.drawArc(100, 120, 100, 50, 0, -180); // Smile
        
        // Draw tongue
        g.setColor(Color.PINK);
        g.fillOval(140, 150, 20, 10); // Tongue
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cartoon Drawing");
        cartoon Cartoon = new cartoon();
        
        frame.add(Cartoon);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

