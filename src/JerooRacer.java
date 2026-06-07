import javax.swing.SwingUtilities;

public class JerooRacer
{
    public static void main(String[] args)
    {
        System.out.println("Loading Window... \n" + "-------------------");

        SwingUtilities.invokeLater(() -> new Window());
        
        System.out.println("[Loaded Window]");
    }
}