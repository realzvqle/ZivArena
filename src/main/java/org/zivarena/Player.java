package org.zivarena;

import static com.raylib.Raylib.*;
import static com.raylib.Colors.*;

public class Player extends Object{
    private float speed = 400;
    public Player(float positionX, float positionY, float size) {
        super(positionX, positionY, size, size, BLUE);
    }
    public void UpdatePlayerSpeed(float speed){
        this.speed = speed;
    }
    public void UpdatePlayer(){
        super.RenderObject();
        this.UpdateControls();
    }
    private void UpdateControls(){
        if(IsKeyDown(KEY_W)){
            super.position.y(super.position.y() - speed * GetFrameTime());
        }
        if(IsKeyDown(KEY_S)){
            super.position.y(super.position.y() + speed * GetFrameTime());
        }
        if(IsKeyDown(KEY_A)){
            super.position.x(super.position.x() - speed * GetFrameTime());
        }
        if(IsKeyDown(KEY_D)){
            super.position.x(super.position.x() + speed * GetFrameTime());
        }
        if(super.position.x() >= GetScreenWidth() - super.size.x()) super.position.x(GetScreenWidth() - super.size.x());
        if(super.position.y() >= GetScreenHeight() - super.size.y()) super.position.y(GetScreenHeight() - super.size.y());
        if(super.position.x() <= 0) super.position.x(0);
        if(super.position.y() <= 0) super.position.y(0);

    }

}
