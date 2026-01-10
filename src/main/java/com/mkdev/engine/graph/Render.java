package com.mkdev.engine.graph;

import com.mkdev.engine.Window;
import com.mkdev.engine.scene.Scene;
import org.lwjgl.opengl.GL;

import static org.lwjgl.opengl.GL11C.*;

public class Render {

    public Render() {
        GL.createCapabilities();
    }

    public void cleanup() {
        // TA VAZIO MANÉ...
    }

    public void render(Window window, Scene scene) {
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    }
}
