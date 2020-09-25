import javax.swing.*;
import java.awt.*;

public class Gui2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Phonebook");
        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.RED);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.GRAY);
        panel5.setBackground(Color.GREEN);

        frame.add(panel1,BorderLayout.PAGE_START);
        frame.add(panel2,BorderLayout.PAGE_END);
        frame.add(panel3,BorderLayout.LINE_START);
        frame.add(panel4,BorderLayout.LINE_END);
        frame.add(panel5,BorderLayout.CENTER);




        JTextField text = new JTextField("Search");
        JButton add = new JButton("Add contact");
        JButton delete = new JButton("Delete contact");
        JButton edit = new JButton("Edit contact");
        JButton download = new JButton("Download contact's");
        JButton duplicate = new JButton("Duplicate contact");
        JButton unite = new JButton("Unit contact");

        panel5.add(text,BorderLayout.WEST);
        panel4.add(download);
        panel4.add(duplicate);
        panel4.add(unite);

        panel3.add(add);
        panel3.add(delete);
        panel3.add(edit);











        frame.setVisible(true);
    }

}
