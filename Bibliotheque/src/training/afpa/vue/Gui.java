package training.afpa.vue;

import javax.swing.*;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.nio.file.WatchService;

public class Gui {

    /**
     *
     * @param locationX int
     * @param locationY int
     * @param width int
     * @param height int
     * @return JFrame
     */
    public static JFrame setFrame(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension minDim = new Dimension(700,300);
        frame.setMinimumSize(minDim);
        frame.setVisible(true);

        return frame;
    }


    /**
     * JPANEL
     * @param frame JFrame
     * @return JPanel
     */
    public static JPanel setPanel(JFrame frame){
        JPanel panel = new JPanel();
        panel.setBackground(new Color(40, 42, 54));
        frame.add(panel);
        panel.setLayout(null);

        return panel;
    }

    /**
     *
     * @param panel
     * @param sentence
     * @param positionY
     * @return
     */
    public static JLabel labelMaker(JPanel panel, String sentence,int positionX, int positionY){
        JLabel label = new JLabel(sentence);
        label.setBounds(positionX, positionY, 500, 20);
        label.setForeground(Color.WHITE);
        panel.add(label);
        return label;
    }

    /**
     *
     * @param panel
     * @param sentence
     * @param positionY
     * @param height
     * @return
     */
    public static JTextArea textAreaMaker(JPanel panel, String sentence,int positionX, int positionY,int width, int height){
        JTextArea textArea = new JTextArea(sentence);
        textArea.setBounds(positionX, positionY, width, height);
        textArea.setEditable(false);
        panel.add(textArea);

        return textArea;
    }

    /**
     *
     * @param panel
     * @param positionY
     * @return
     */
    public static JTextField textFieldMaker(JPanel panel,int positionX, int positionY){
        JTextField textField = new JTextField();
        textField.setBounds(positionX, positionY, 300, 20);
        panel.add(textField);

        return textField;
    }

    /**
     *
     * @param panel
     * @param sentence
     * @param positionY
     * @return
     */
    public static JButton buttonMaker(JPanel panel, String sentence, int positionY){
        JButton button = new JButton(sentence);
        button.setBounds(10, positionY, 300, 20);
        button.setBorder(null);
        panel.add(button);
        
        return button;
    }

    public static JTable tableMaker(JPanel panel, String[][] matrice, String[] tableHeaders,int x,int y,int width, int height){

        JTable table = new JTable(matrice, tableHeaders);
        
        table.setBackground(new Color(68, 71, 90));
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        table.setForeground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(500,10, 800,900);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane);

        return table;

    }

}