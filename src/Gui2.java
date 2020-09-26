import javax.swing.*;
import java.awt.*;

public class Gui2 {

    public static void main(String[] args) {




        JFrame frame = new JFrame("Phonebook");
        frame.setSize(1000,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();


        panel1.setBackground(Color.LIGHT_GRAY);


        frame.add(panel1, BorderLayout.WEST); //поиск, удалить, редактировать, добавить
        frame.add(panel2,BorderLayout.EAST); //загрузить, дублировать, объединить




        JTextField search = new JTextField(30);
        JButton add = new JButton("Add contact");
        JButton delete = new JButton("Delete contact");
        JButton edit = new JButton("Edit contact");
        JButton download = new JButton("Download contact's");
        JButton duplicate = new JButton("Duplicate contact");
        JButton unite = new JButton("Unit contact");
        JLabel searchLabel = new JLabel("Search");

     /*   panel1.add(searchLabel);
        panel1.add(search);
        panel2.add(add);
        panel2.add(delete);
        panel2.add(edit);
        panel2.add(download);
        panel2.add(duplicate);
        panel2.add(unite);*/




        panel1.add(searchLabel,new GridBagConstraints(0, 0, 0, 0, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));

        panel1.add(search,new GridBagConstraints(1, 0, 0, 0, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));

        panel2.add(add,new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        panel2.add(delete,new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        panel2.add(edit,new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        panel2.add(download,new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        panel2.add(duplicate,new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        panel2.add(unite,new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));











        frame.setVisible(true);
    }

}
