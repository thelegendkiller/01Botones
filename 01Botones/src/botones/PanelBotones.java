package botones;

/**
 *
 * @author DanielCruz
 */
public class PanelBotones extends javax.swing.JPanel {

    public PanelBotones() {
        initComponents();
    }
    
    public void addEventos(OyenteBotones oyente) {
        this.botonAzul.addActionListener(oyente);
        this.botonRojo.addActionListener(oyente);
        this.botonVerde.addActionListener(oyente);
        
        this.botonAzul.setName("azul");
        this.botonRojo.setName("rojo");
        this.botonVerde.setName("verde");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNorte = new javax.swing.JPanel();
        botonAzul = new javax.swing.JButton();
        botonRojo = new javax.swing.JButton();
        botonVerde = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        panelNorte.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        botonAzul.setText("Cambiar a color Azul");
        panelNorte.add(botonAzul);

        botonRojo.setText("Cambiar a color Rojo");
        panelNorte.add(botonRojo);

        botonVerde.setText("Cambiar a color Verde");
        panelNorte.add(botonVerde);

        add(panelNorte, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAzul;
    private javax.swing.JButton botonRojo;
    private javax.swing.JButton botonVerde;
    private javax.swing.JPanel panelNorte;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JPanel getPanelNorte() {
        return panelNorte;
    }

}
