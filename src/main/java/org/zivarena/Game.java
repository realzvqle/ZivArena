package org.zivarena;

import static com.raylib.Colors.BLACK;
import static com.raylib.Colors.RED;
import static com.raylib.Raylib.ClearBackground;
import static com.raylib.Raylib.CloseWindow;

public class Game {
    private final Window window;
    Player player;
    Enemies enemies;
    public Game(){
        window = new Window(1600, 900, "Zvqles Arena");
        player = new Player(window.w() / 2, window.h() / 2, 25);
        enemies = new Enemies();
    }
    public void StartGameLoop(){
        while(window.WindowLoop()){
            ClearBackground(BLACK);
            player.UpdatePlayer();
            enemies.UpdateEnemies(player.position);
            window.Swap();
        }
    }
    public void CleanUp(){
        CloseWindow();
    }
}
