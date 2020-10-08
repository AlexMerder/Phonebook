import Database.DataBaseConnector;

import javax.swing.*;

public class MainClass{

public static DataBaseConnector dataBaseConnector;

public static void main(String[] args) {
        //Создаем подключение к базе данных
        try {
        dataBaseConnector = new DataBaseConnector();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Произошла ошибка при подключении к базе данных", "", JOptionPane.ERROR_MESSAGE);
        return;
        }

        //Создаем поставщик ресурсов и загружаем ресурсы (используемые приложением иконки)


        //Запускаем графический интерфейс
        new Gui();
        }

        }