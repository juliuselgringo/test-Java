import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;

public class JtableBasic{

    public static String[] header = {"pseudo", "age", "tel", "favorite color"};
    public static String[][] dataArray = {
        {"juju", "45", "06-12-78-95-14", "orange"},
        {"toto", "12", "00-00-00-00-00", "blanc"},
    };

    public JtableBasic(){
        super();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension dimMin = new Dimension(700,300);
        frame.setMinimumSize(dimMin);

        JPanel panel = new JPanel();
        panel.setBounds(10,10,300,100);
        panel.setLayout(null);
        panel.setBackground(new Color(40, 42, 54));
        frame.add(panel);

        JTable tableau = new JTable(dataArray,header);
         
        tableau.setBackground(new Color(68, 71, 90));
        tableau.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        tableau.setForeground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(tableau);
        scrollPane.setBounds(10,10,500,100);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        panel.add(scrollPane);

        JTextField textField = new JTextField();
        textField.setBounds(10, 200, 300, 20);
        panel.add(textField);

        JButton button1 = new JButton("Click Me");
        button1.setBounds(340,200,200,20);
        panel.add(button1);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBounds(10,230,300,20);
        panel.add(textArea);

        button1.addActionListener(e->{
            textArea.setText(textField.getText());
        });


        frame.setVisible(true);
    }

    public static void main(String[] args){
        new JtableBasic();
    }
}
    
