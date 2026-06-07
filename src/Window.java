import javax.swing.JFrame;

public class Window
{
    public Window()
    {
        JFrame frame = new JFrame("Jeroo Racer");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocation(100, 100);
        frame.add(new Backdrop());
        // frame.setLocationRelativeTo(null);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
        frame.toFront();
    }
}