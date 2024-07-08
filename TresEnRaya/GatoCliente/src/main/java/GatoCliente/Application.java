package GatoCliente;

import GatoCliente.presentation.Controller;
import GatoCliente.presentation.Model;
import GatoCliente.presentation.View;
import GatoCliente.presentation.ViewNB;
import GatoCliente.presentation.gatoView;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");}
            catch (Exception ex) {};

        window = new JFrame();

        Model model= new Model();
        gatoView view = new gatoView();
        Controller controller =new Controller(view, model);
        window.setSize(530,320);
        window.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        window.setTitle("Arcade");
        try {
            window.setIconImage((new ImageIcon(Application.class.getResource("/logo.png"))).getImage());
        } catch (Exception e) {}
        window.setContentPane(view.getContentPane());
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }

    public static JFrame window;
}
