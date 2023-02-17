import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JWindow;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(400, 500, 300, 300); // baslangic konumu ve boyutunu belirtiyor
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Carpiya basinca programin exit atmasini sagliyor
        //frame.setResizable(false);
        JPanel window = new JPanel();
        window.setLayout(new BoxLayout(window, BoxLayout.PAGE_AXIS));

        JLabel text = new JLabel("Hello World");
        //text.setText("Hello World");
        //text.setBounds(200, 250, 100, 100);
        window.add(text);

        JButton button = new JButton("Button");
        button.addActionListener(new ActionListener(){
            int sayac = 0;
            public void actionPerformed(ActionEvent e){
                System.out.println("Butona bastin");
                text.setText(sayac + "");
                sayac = sayac + 1;
            }
        });
        window.add(button);

        JTextField textField = new JTextField(1);
        window.add(textField);

        JButton buton2 = new JButton("Yaziyi oku");
        buton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(textField.getText());
            }
        });
        window.add(buton2);

        frame.add(window);
        frame.setVisible(true); // Frame'in gorunur olmasini sagliyor
    }
}
