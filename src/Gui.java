import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Gui {

    public Gui(){
        JFrame frame = new JFrame("Phonebook");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        Image image = Toolkit.getDefaultToolkit().getImage("C:/Users/cskac/Desktop/Phonebook_program/Phonebook/src/images/logo.png");
        frame.setIconImage(image);





        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        frame.add(panel, BorderLayout.CENTER);

        panel.setBackground(new Color(33, 15, 53));


        JTextField loginText = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JLabel loginLabel = new JLabel("LOGIN");
        JLabel passwordLabel = new JLabel("PASSWORD");
        JButton buttonSighIn = new JButton("Sigh in");
        JButton buttonRegistration = new JButton("Registration");

        Font f1 = new Font("Roboto", Font.PLAIN, 13);
        Font f2 = new Font("Roboto", Font.PLAIN, 10);


        loginLabel.setForeground(Color.white);
        passwordLabel.setForeground(Color.white);
        loginText.setBackground(new Color(47, 25, 71));
        passwordField.setBackground(new Color(47, 25, 71));
        buttonRegistration.setBackground(new Color(119, 50, 229));
        buttonSighIn.setBackground(new Color(119, 50, 229));
        buttonRegistration.setForeground(new Color(253, 241, 251));
        buttonSighIn.setForeground(Color.white);
        loginText.setBackground(Color.white);
        passwordField.setBackground(Color.white);


        loginLabel.setFont(f1);
        passwordLabel.setFont(f1);
        buttonRegistration.setFont(f2);
        buttonSighIn.setFont(f2);


        panel.add(loginLabel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));
        panel.add(passwordLabel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));

        panel.add(loginText, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));
        panel.add(passwordField, new GridBagConstraints(1, 1, 1, 1, 0.0, 00.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));

        panel.add(buttonSighIn, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        panel.add(buttonRegistration, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));


        frame.setResizable(false);
        frame.setVisible(true);

        class ButtonActionListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = loginText.getText();
                if (text1.equals("admin")){
                    System.out.println("OK");
                }
                char[] text2 = passwordField.getPassword();
                String password = Arrays.toString(text2);
                if (password.equals("8991")){
                    System.out.println("OK");
                }






            }
        }

        buttonSighIn.addActionListener(new ButtonActionListener());


    }
}


