package org.example.logic;

import java.awt.*;

public class GameLogic {
    private Ball ball;
    private Ball enemyObject;
    private Rectangle enemyObject_point;
    public void initialize() {
        ball = new Ball(20,20,50, 50);
        enemyObject = new Ball(340,20,50, 50);
        enemyObject_point = new Rectangle(340, 20, 50, 50);
    }
    public void update() {
        ball.move(0, Direction.RIGHT);
        if (ball.isCollided(enemyObject_point)) {
            enemyObject.setX(0);
            enemyObject.setY(0);
            enemyObject.setHeight(0);
            enemyObject.setWidth(0);

            enemyObject_point.add(0, 0);
        }
    }

    public Ball getBall() {
        return ball;
    }

    public Ball getEnemyObject() {
        return enemyObject;
    }


}
