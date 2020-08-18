package botones;

import javax.swing.JFrame;

/**
 *
 * @author DanielCruz
 */
public class Botones {

    public static void main(String[] args) {
        PanelBotones panel = new PanelBotones();            // Vista
        OyenteBotones oyente = new OyenteBotones(panel);    // Controlador
        panel.addEventos(oyente);
        JFrame f = new JFrame("Ventana Botones");
        
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(f);
        f.add(panel);
        f.setVisible(true);
    }
    
}
