package src.inputs;

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import src.main.WindowState;

public class CustomMouseListener implements MouseMotionListener, MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mousePressed(MouseEvent e) {

        WindowState.mouseButton = e.getButton();

        if (WindowState.mouseButton == MouseEvent.BUTTON3) {
            WindowState.pixels.clear();
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        WindowState.mouseButton = -1;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent e) {

        if(WindowState.mouseButton == MouseEvent.BUTTON1) {
            WindowState.pixels.add(new int[] {e.getX(), e.getY()});
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}