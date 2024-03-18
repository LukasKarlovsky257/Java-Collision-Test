package org.example.graphics;

import org.example.logic.*;

import javax.swing.*;
import java.awt.*;

public class GameGraphics extends JFrame {
    GameLogic logic;
    Draw draw;
    public GameGraphics(GameLogic logic) throws HeadlessException{
        this.draw = new Draw();
        this.logic = logic;

        setSize(1080, 720);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Game");

        add(draw);

    }
    public void render(GameLogic logic) {
        this.logic = logic;
        repaint();
    }

    public class Draw extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.BLUE);
            g.fillOval(logic.getBall().getX(), logic.getBall().getY(), logic.getBall().getWidth(), logic.getBall().getHeight());
            g.setColor(Color.BLACK);
            g.fillOval(logic.getEnemyObject().getX(), logic.getEnemyObject().getY(), logic.getEnemyObject().getWidth(), logic.getEnemyObject().getHeight());
        }
    }


}
