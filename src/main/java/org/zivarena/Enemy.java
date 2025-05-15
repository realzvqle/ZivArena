package org.zivarena;

import static com.raylib.Raylib.*;

public class Enemy extends Object {
    private float speed = 200;
    private final float speedOffsetx;
    private final float speedOffsety;
    public Enemy(float positionX, float positionY, float size, Color color) {
        super(positionX, positionY, size, size, color);
        speedOffsetx = GetRandomValue(-100, 100);
        speedOffsety = GetRandomValue(-100, 100);
    }
    public void UpdateEnemy(Vector2 playerPos){
        UpdatePosition(playerPos);
        super.RenderObject();
    }
    public void UpdateSpeed(float speed){
        this.speed = speed;
    }
    public void UpdatePosition(Vector2 playerPos){
        if(super.position.x() - playerPos.x() > 25){
            super.position.x(super.position.x() - (speed + speedOffsetx) * GetFrameTime());
        }
        else if(super.position.x() - playerPos.x() < -25){
            super.position.x(super.position.x() + (speed + speedOffsetx) * GetFrameTime());
        }
        if(super.position.y() - playerPos.y() > 25){
            super.position.y(super.position.y() - (speed + speedOffsety) * GetFrameTime());
        }
        else if(super.position.y() - playerPos.y() < -25){
            super.position.y(super.position.y() + (speed + speedOffsety) * GetFrameTime());
        }
    }
}
