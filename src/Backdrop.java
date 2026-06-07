import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Backdrop extends JPanel
{
    public Backdrop()
    {
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(0, 0, 40, 40);
    }
}