package botones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author DanielCruz
 */
public class OyenteBotones implements ActionListener {

    private final PanelBotones panel;
    
    public OyenteBotones(PanelBotones panel) {
        this.panel = panel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton origen = (JButton) e.getSource();
        
        switch(origen.getName()) {
            case "azul": {
                panel.setBackground(Color.BLUE);
                panel.getPanelNorte().setBackground(Color.BLUE);
                break;
            }
            
            case "rojo": {
                panel.setBackground(Color.RED);
                panel.getPanelNorte().setBackground(Color.RED);
                break;
            }
            
            case "verde": {
                panel.setBackground(Color.GREEN);
                panel.getPanelNorte().setBackground(Color.GREEN);
                break;
            }
        }
    }
    
}
