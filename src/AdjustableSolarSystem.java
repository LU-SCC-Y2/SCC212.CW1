import java.awt.*;
import java.awt.event.*;
/**
 * This class is a child class from the SolarSystem class, as it needs some of the methods from the parent class
 * to enable zooming and scrolling the window. 
 * @author JIAJUNKK on 20/10/2023
 * 
 */


public class AdjustableSolarSystem extends SolarSystem {
    private static final long serialVersionUID = 1L;
    private double zoomFactor;
    private int scrollX = 0;
    private int scrollY = 0;

    
    public AdjustableSolarSystem(int width, int height) {
        super(width, height);
        this.zoomFactor = 1.0;

        scroll();
        increaseSize();
        setFocusable(true);
        requestFocusInWindow();
    }

    /**
     * This method enables the user to increase the size of the screen by using the mouse or track pad. 
     */
    public void increaseSize() {
        addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (e.getWheelRotation() < 0) {
                    zoomFactor += 0.01;
                    if (zoomFactor > 2.0) {
                        zoomFactor = 2.0;
                    }
                } else {
                    zoomFactor -= 0.01;
                    if (zoomFactor < 0.5) {
                        zoomFactor = 0.5;
                    }
                }
                repaint();
            }
        });
    }
    
    /**
     * This method enables the user to scroll the screen by using the four arrow keys on the keyboard
     */
    public void scroll() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                	scrollX -= 10;
                } 
                else if (keyCode == KeyEvent.VK_RIGHT) {
                	scrollX += 10;
                }
                else if (keyCode == KeyEvent.VK_UP) {
                	scrollY -= 10;
                }
                else if (keyCode == KeyEvent.VK_DOWN) {
                	scrollY += 10;
                }
                repaint();
            }
        });
    }
    
    
    /**
     * Then this method will pass in the zoomFactors, scrollX, and scrollY so that this method can adjust the size and the 
     * positions of the solarObjects. See SolarSystem class for more details.
     */
    
    @Override
    public void paint(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.scale(zoomFactor, zoomFactor);
        g.translate(-scrollX, -scrollY);
        super.paint(g);
        g.translate(scrollX, scrollY);
    }
}