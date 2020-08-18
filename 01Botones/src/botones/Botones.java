package botones;

import javax.swing.JFrame;

/**
 * Programación Orientada a Eventos
 * 1.- Un evento es resultado de la ejecución de una acción dentro de un entorno gráfico.
 * 2.- Los eventos son objetos. En una ventana, los eventos representan el hacer click sobre un botón,
       el movimiento del ratón, la captura de texto en un campo, etc.
 * 3.- Cualquier interfaz gráfica constantemente monitoriza los eventos en el sistema. La interfaz
       informa de estos eventos a los programas que se estan ejecutando. Cada programa determina que hay que
       hacer, si es que hay que hacer algo en respuesta a esos eventos.
 */

public class Botones {
/**
 * Para el manejo de eventos se requiere de un esquema compuesto por objetos:
 * 1.- Objeto origen de los eventos: Son los componentes gráficos (Botones, opciones de menú, cuadro de
 *     texto, etc) con los que interactua el usuario. Al efectuar una acción sobre el objeto( dar click, dar enter, etc)
       se crea(dispara) un objeto que encapsula dicha acción.
 * 2.- Objeto evento: Es el objeto que encapsula la información relacionada al objeto que originó su creación
       (su nombre, por ejemplo), así como a la acción realizada.
 * 3.- Objeto oyente de los eventos: Estos objetos tienen la función de "Estar atentos escuchando" si se
       dispara un evento. Cuando un evento se dispara y es "escuchado" por el oyente, este puede ejecutar
       alguna acción asociada al evento.
 */
    public static void main(String[] args) {
        /**
         * Debido a que en una interfaz gráfica pueden coexistir varios componentes gráficos que pueden
           disparar eventos, tambien pueden existir varios oyentes con funciones bien delimitadas.
           
         * Por lo anterior es muy importante asociar a cada origen su correspondiente oyente.
           Esta operacion se conoce como "registro del oyente al origen". Es claro que un oyente
           puede ser registrado a uno o varios componentes.
         */
        PanelBotones panel = new PanelBotones();            // Vista
        OyenteBotones oyente = new OyenteBotones(panel);    // Controlador u Oyente
        panel.addEventos(oyente);
        JFrame f = new JFrame("Ventana Botones");
        
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(f);
        f.add(panel);
        f.setVisible(true);
    }
    
}
