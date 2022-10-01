/**
 * Created by mashatel on 10/01/2022.
 */
import java.awt.*;
import javax.swing.*;


public class H7 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,400);
        JLabel label=new JLabel("hello tasneem");
        label.setBackground(Color.green);
        label.setOpaque(true);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
