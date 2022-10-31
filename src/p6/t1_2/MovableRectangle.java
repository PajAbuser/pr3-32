package p6.t1_2;

import p6.t1_1.MovableCircle;
import p6.t1_1.MovablePoint;

public class MovableRectangle implements Movable{

    private MovablePoint topLeft, bottomRight;
    private int xSpeed, ySpeed;

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.topLeft = new MovablePoint(x2,y2,xSpeed,ySpeed);
        this.xSpeed = xSpeed; this.ySpeed = ySpeed;
    }

    public boolean equalSpeed() {
        return xSpeed == ySpeed;
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveLeft() {

    }



}
