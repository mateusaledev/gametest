package com.mkdev.engine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Utils {

    public Utils() {
    }

    public static String readFile(String filePath) {
        String str;
        try {
            str = new String(Files.readAllBytes(Path.of(filePath)));
        } catch (IOException e) {
            throw new RuntimeException("Could not read file: " + filePath, e);
        }
        return str;
    }
}
