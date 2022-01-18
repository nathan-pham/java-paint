package src.main;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class WindowScreen extends JPanel {
    
    private Window window;

    public WindowScreen(Window window) {

        setPreferredSize(new Dimension(window.SIZE, window.SIZE));
        this.window = window;

    }
    
    public void paintComponent(Graphics ctx) {
        
        super.paintComponent(ctx);

        ctx.setColor(Color.WHITE);
        ctx.fillRect(0, 0, window.SIZE, window.SIZE);

        ctx.setColor(Color.RED);
        for(int[] pixel : WindowState.pixels) {
            ctx.fillRect(pixel[0], pixel[1], 10, 10);
        }

        repaint();

    }

}
