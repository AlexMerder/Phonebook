import javax.swing.*;
import java.awt.*;

public class Gui {


    public static void main(String[] args) {
//создаем форму и указываем параметры
        JFrame frame = new JFrame("Phonebook - Sigh in");
        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        JPanel panel = new JPanel();
        frame.add(panel,BorderLayout.CENTER);



        JTextField text = new JTextField("Login",10);
        JTextField text2 = new JTextField("Password",10);

        panel.add(text,BorderLayout.CENTER);
        panel.add(text2,BorderLayout.SOUTH);

        text.setBackground(Color.BLUE);
        text2.setBackground(Color.BLUE);




        frame.setVisible(true);




    }
}
