package org.zivarena;

import java.util.ArrayList;
import java.util.List;

import static com.raylib.Colors.RED;
import static com.raylib.Raylib.*;
public class Enemies {
    private List<Enemy> enemies;
    public Enemies(){
        enemies = new ArrayList<>();
        for(int i = 0; i < 90; i++){
            enemies.add(new Enemy(GetRandomValue(0, GetScreenWidth()), GetRandomValue(0, GetScreenHeight()),
                    25, RED));
        }
    }
    public void UpdateEnemies(Vector2 playerPos){
        for(Enemy enemy : enemies){
            enemy.UpdateEnemy(playerPos);
        }
    }
}
