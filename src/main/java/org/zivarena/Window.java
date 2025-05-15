package org.zivarena;


import static com.raylib.Raylib.*;

class Window {
    private String title;
    private Boolean isRunning = true;
    public Window(int sizeX, int sizeY, String title){
        SetConfigFlags(FLAG_WINDOW_RESIZABLE);
        SetTraceLogLevel(LOG_ERROR);
        this.title = title;
        InitWindow(sizeX, sizeY, TitlePlusFPS(this.title));
    }
    public Boolean WindowLoop(){
        if(WindowShouldClose()) isRunning = false;
        BeginDrawing();
        SetWindowTitle(TitlePlusFPS(this.title));
        return isRunning;
    }
    public void Swap(){
        EndDrawing();
    }
    public void UpdateTitle(String title){
        this.title = title;
    }
    public float w(){
        return GetScreenWidth();
    }
    public float h(){
        return GetScreenHeight();
    }
    private String TitlePlusFPS(String title){
        return title + " | " + GetFPS() + " FPS";
    }
}

