package org.example.logic;

import java.awt.*;

public class GameLogic {
    private Ball ball;
    private Ball enemyObject;
    private Rectangle enemyObject_point;
    private Line line1;
    private Line line2;

    public GameLogic() {
    }

    public void initialize() {
        ball = new Ball(20,20,50, 50);
        enemyObject = new Ball(340,20,50, 50);
        enemyObject_point = new Rectangle(340, 20, 50, 50);
        line1 = new Line(10, 0, 10, 1000);
        line2 = new Line(1125, 0, 1125, 1000);
    }
    public void update() {
        ball.move(0, Direction.RIGHT);
        if (ball.isCollided(enemyObject_point)) {
            enemyObject.move(10, Direction.RIGHT);
            enemyObject_point.add(0, 0);
        }
        if (enemyObject.getX() == line1.getX1()) {
            enemyObject.move(10, Direction.RIGHT);
        } else if (enemyObject.getX() == line2.getX1()) {
            enemyObject.move(10, Direction.LEFT);
        }
    }

    public Ball getBall() {
        return ball;
    }

    public Ball getEnemyObject() {
        return enemyObject;
    }

    public Line getLine1() {
        return line1;
    }

    public Line getLine2() {
        return line2;
    }

}
