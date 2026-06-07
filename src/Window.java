import javax.swing.JFrame;
import java.awt.Dimension;

public class Window
{
    public Window()
    {
        JFrame frame = new JFrame("Jeroo Racer");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setLocation(100, 100);
        frame.setResizable(true);
        frame.add(new Backdrop());
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
        frame.toFront();
    }
}