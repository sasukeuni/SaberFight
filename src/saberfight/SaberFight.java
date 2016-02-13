/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saberfight;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author sasukeuni
 */
public class SaberFight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(new Panel());
                frame.pack();
                frame.setVisible(true);
                
            }
        });

        /**
         * Detector de Tecla Presionada
         */
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
                .addKeyEventDispatcher(new KeyEventDispatcher() {
                    
                    @Override
                    public boolean dispatchKeyEvent(KeyEvent ke
                    ) {
                        synchronized (SaberFight.class) {
                            switch (ke.getID()) {
                                case KeyEvent.KEY_PRESSED:
                                    if (ke.getKeyCode() == KeyEvent.VK_A) {
                                        aPressed = true;
                                        
                                    }
                                    if (ke.getKeyCode() == KeyEvent.VK_D) {
                                        dPressed = true;
                                        
                                    }
                                    break;
                                
                                case KeyEvent.KEY_RELEASED:
                                    if (ke.getKeyCode() == KeyEvent.VK_A) {
                                        aPressed = false;
                                    }
                                    if (ke.getKeyCode() == KeyEvent.VK_D) {
                                        dPressed = false;
                                    }
                                    break;
                            }
                            return false;
                        }
                    }
                }
                );
        do {            
            Panel.setLeft();
            Panel.setRight();
        } while (Panel.Left.getText().equals("3")|| Panel.Right.getText().equals("3"));
        
    }
    private static boolean aPressed = false;
    private static boolean dPressed = false;
    
    public static boolean isAPressed() {
        synchronized (SaberFight.class) {
            return aPressed;
        }
    }
    
    public static boolean isDPressed() {
        synchronized (SaberFight.class) {
            return dPressed;
        }
    }
    
}
