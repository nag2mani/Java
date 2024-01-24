import javax.swing.*;

public class swingImage {
    public static void main(String[] args) {
                JFrame f = new JFrame();
                ImageIcon i = new ImageIcon("/home/nag2mani/Pictures/Screenshots/pr.jpg");
                JButton b = new JButton("Click", i);
                b.setBounds(130, 100, 500, 500); //x-axis, y-axis, width and height.
                f.add(b);
                f.setSize(1000, 1000); //size of the frame.
                f.setLayout(null);
                f.setVisible(true);
        }
}
