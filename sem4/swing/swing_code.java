import javax.swing.*;

public class swing_code {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(130, 100, 100, 40); //x-axis, y-axis, width and height.
        f.add(b);
        f.setSize(1000, 500); //size of the frame.
        f.setLayout(null);
        f.setVisible(true);
    }
}
