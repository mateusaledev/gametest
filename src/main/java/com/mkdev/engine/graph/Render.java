package com.mkdev.engine.graph;

import com.mkdev.engine.Window;
import com.mkdev.engine.scene.Scene;
import org.lwjgl.opengl.GL;

import static org.lwjgl.opengl.GL11C.*;

public class Render {

    private SceneRender sceneRender;

    public Render() {
        GL.createCapabilities();
        sceneRender = new SceneRender();
    }

    public void cleanup() {
        sceneRender.cleanup();
    }

    public void render(Window window, Scene scene) {
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        glViewport(0, 0, window.getWidth(), window.getHeight());

        sceneRender.render(scene);    }
}
