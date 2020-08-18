package botones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Esta es la clase OyenteBotones, la cual actuara como oyente.
 * En este tipo de oyentes, se les puede poner una clase adaptadora, ya que implementan
   las interfaces y que se pueden utilizar para construir oyentes.*/
public class OyenteBotones implements ActionListener {

    private final PanelBotones panel; // Aquí inicizamos a la clase PanelBotones
    
    public OyenteBotones(PanelBotones panel) { // Aquí le presentamos el panel al oyente
        this.panel = panel;
    }
    
    /**
     * Aquí tenemos un evento llamado ActionEvent, que este tiene a su interfaz Oyente llamada
       ActionListener y trae como método asociado al actionPerformed(ActionEvent e)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Aquí tenemos una iteracción, ya que el panel al tener 3 botones, necesitamos conocer su origen
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
