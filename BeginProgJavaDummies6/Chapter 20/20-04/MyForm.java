import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyForm");
        frame.setContentPane(new MyForm().jpanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    private JPanel jpanel1;
}
