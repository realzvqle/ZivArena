package org.zivarena;

import static com.raylib.Raylib.*;

public class Enemy extends Object {
    private float speed = 200;
    public Enemy(float positionX, float positionY, float size, Color color) {
        super(positionX, positionY, size, size, color);
    }
    public void UpdateEnemy(Vector2 playerPos){
        UpdatePosition(playerPos);
        super.RenderObject();
    }
    public void UpdatePosition(Vector2 playerPos){
        if(super.position.x() - playerPos.x() > 25){
            super.position.x(super.position.x() - speed * GetFrameTime());
        }
        else if(super.position.x() - playerPos.x() < -25){
            super.position.x(super.position.x() + speed * GetFrameTime());
        }
        if(super.position.y() - playerPos.y() > 25){
            super.position.y(super.position.y() - speed * GetFrameTime());
        }
        else if(super.position.y() - playerPos.y() < -25){
            super.position.y(super.position.y() + speed * GetFrameTime());
        }
    }
}
