package org.zivarena;

import static com.raylib.Raylib.*;

public class Object {
    public Vector2 position;
    public Vector2 size;
    private Color color;
    public Object(float positionX, float positionY, float sizeX, float sizeY, Color color){
        this.position = new Vector2();
        this.size = new Vector2();
        this.position.x(positionX);
        this.position.y(positionY);
        this.size.x(sizeX);
        this.size.y(sizeY);
        this.color = color;
    }
    public void RenderObject(){
        DrawRectangleV(position, size, color);
    }
}
