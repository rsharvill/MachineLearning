package learninggame;

import java.awt.*;

/**
 *
 * @author rachh Sep 12, 2018 10:40:52 AM
 */
public class GamePanel extends javax.swing.JPanel {
    
    Board theBoard;

    public GamePanel() {
        initComponents();
        theBoard = new Board();
        setLayout(null);
        setVisible(true);
    }

        public void paintComponent(Graphics g) {
        theBoard.paint(g);
        System.out.println("theBoard = " + theBoard);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        int x = evt.getX();
        int y = evt.getY();

        theBoard.handlePressed(x, y);

        
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
