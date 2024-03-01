package view;

import javax.swing.*;
import java.awt.*;


public class TetrisFrame extends JFrame {
    private final JLabel statusBar;
    private final TetrisBoard board;

    public TetrisFrame() {
        statusBar = new JLabel(" 0");
        board = new TetrisBoard(this);
    }

    public void init() {
        setLayout(new BorderLayout());
        add(statusBar, BorderLayout.SOUTH);
        add(board, BorderLayout.CENTER);
        board.start();
        setSize(200, 400);
        setPreferredSize(new Dimension(200, 400));
        setTitle("Tetris");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(false);
    }


    JLabel getStatusBar() {
        return statusBar;
    }
}