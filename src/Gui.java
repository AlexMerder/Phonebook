import javax.swing.*;
import java.awt.*;

public class Gui {


    public static void main(String[] args) {
//создаем форму и указываем параметры
        JFrame frame = new JFrame("Phonebook");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        frame.add(panel, BorderLayout.CENTER);

        panel.setBackground(Color.LIGHT_GRAY);

        JTextField loginText = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JLabel loginLabel = new JLabel("LOGIN");
        JLabel passwordLabel = new JLabel("PASSWORD");
        JButton buttonSighIn = new JButton("Sigh in");
        JButton buttonRegistration = new JButton("Registration");


        panel.add(loginLabel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0, 0));
        panel.add(passwordLabel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0, 0));

        panel.add(loginText, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0, 0));
        panel.add(passwordField, new GridBagConstraints(1, 1, 1, 1, 0.0, 00.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0, 0));

        panel.add(buttonSighIn, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0, 0));
        panel.add(buttonRegistration, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0, 0));


        frame.setResizable(false);
        frame.setVisible(true);


    }
}
