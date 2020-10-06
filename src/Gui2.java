import javax.swing.*;
import java.awt.*;

public class Gui2 extends JFrame{

    public Gui2(){
        JFrame frame;

        frame = new JFrame("Phonebook");
        frame.setSize(1000, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        Image image = Toolkit.getDefaultToolkit().getImage("C:/Users/cskac/Desktop/Phonebook_program/Phonebook/src/images/logo.png");
        frame.setIconImage(image);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();


        panel1.setBackground(new Color(33, 15, 53));
        panel2.setBackground(new Color(53, 29, 77));

        frame.add(panel1, BorderLayout.BEFORE_FIRST_LINE); //поиск, удалить, редактировать, добавить
        frame.add(panel2, BorderLayout.CENTER); //загрузить, дублировать, объединить


//кнопки
        JTextField search = new JTextField(30);
        JButton add = new JButton("Add contact");
        JButton delete = new JButton("Delete contact");
        JButton edit = new JButton("Edit contact");
        JButton download = new JButton("Download contact's");
        JButton duplicate = new JButton("Duplicate contact");
        JButton unite = new JButton("Unit contact's");
        JLabel searchLabel = new JLabel("Search");


        Font f1 = new Font("Roboto", Font.PLAIN, 13);
        searchLabel.setForeground(Color.WHITE);
        searchLabel.setFont(f1);


        panel1.add(searchLabel, new GridBagConstraints(0, 0, 0, 0, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        panel1.add(search, new GridBagConstraints(1, 0, 0, 0, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));

        panel2.add(add, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        panel2.add(delete, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        panel2.add(edit, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        panel2.add(download, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        panel2.add(duplicate, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        panel2.add(unite, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));


        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        add.setCursor(cursor);
        delete.setCursor(cursor);
        edit.setCursor(cursor);
        download.setCursor(cursor);
        duplicate.setCursor(cursor);
        unite.setCursor(cursor);

        frame.setVisible(true);
    }

}


