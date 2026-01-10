package com.mkdev.game;

import com.mkdev.engine.*;
import com.mkdev.engine.IAppLogic;
import com.mkdev.engine.Window;
import com.mkdev.engine.graph.Render;
import com.mkdev.engine.scene.Scene;

public class Main implements IAppLogic {
    // The window handle
    private long window;

    public static void main(String[] args) {
        Main main = new Main();
        Engine gameEng = new Engine("My Game", new Window.WindowOptions(), main);
        gameEng.start();
    }

    @Override
    public void cleanup() {
        // NADICA DI NADA
    }

    @Override
    public void init(Window window, Scene scene, Render render) {
        // Nothing to be done yet
    }

    @Override
    public void input(Window window, Scene scene, long diffTimeMillis) {
        // Nothing to be done yet
    }

    @Override
    public void update(Window window, Scene scene, long diffTimeMillis) {
        // Nothing to be done yet
    }
}