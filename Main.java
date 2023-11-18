import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
    private static void createAndShowGUI() {
        JFrame jFrame = new JFrame("3 In a Row");
        //alskdjfiavbia
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 360);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World Swing");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(150, 100));

        label.setText("3 In a Row");

        jFrame.add(label);
        jFrame.setVisible(true);
      
    }
    
  public static void main(String[] args) {
    createAndShowGUI();
  }

  public Test(Graphics g) {

    g.drawRect(10, 10, 10, 10);

  }

}

