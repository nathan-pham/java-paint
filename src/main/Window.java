package src.main;

import javax.swing.JFrame;

import src.inputs.CustomMouseListener;

public class Window extends JFrame {

    private WindowScreen windowScreen;
    private CustomMouseListener mouseListener;

    public final int SIZE = 600;

    public Window() {

        setTitle("Java | Paint");
        setSize(SIZE, SIZE);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        windowScreen = new WindowScreen(this);
        add(windowScreen);
        pack();

        setVisible(true);

    }

    public void initInputs() {

        mouseListener = new CustomMouseListener();

        addMouseMotionListener(mouseListener);
        addMouseListener(mouseListener);

        requestFocus();

    }

    public WindowScreen getWindowScreen() {
        return windowScreen;
    }

    public static void main(String[] args) {
        Window window = new Window();
        window.initInputs();
    }

}