package org.medeirosgabriel.designpatterns.memento;

import org.medeirosgabriel.designpatterns.flyweight.forest.Forest;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor("image.png", "png");
        ImageEditorBackupManager backupManager = new ImageEditorBackupManager(imageEditor);

        backupManager.backup();
        imageEditor.convertFormatTo("gif");
        System.out.println(imageEditor.toString());

        backupManager.backup();
        imageEditor.convertFormatTo("bmp");
        System.out.println(imageEditor.toString());

        backupManager.backup();
        imageEditor.convertFormatTo("jpg");
        System.out.println(imageEditor.toString());

        backupManager.undo();
        System.out.println(imageEditor.toString());

        backupManager.undo();
        System.out.println(imageEditor.toString());

        backupManager.undo();
        System.out.println(imageEditor.toString());

        backupManager.undo();
        System.out.println(imageEditor.toString());
    }
}