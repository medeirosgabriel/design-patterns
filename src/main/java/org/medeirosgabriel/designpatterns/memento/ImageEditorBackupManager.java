package org.medeirosgabriel.designpatterns.memento;

import java.util.ArrayList;
import java.util.Stack;

public class ImageEditorBackupManager {
    private Stack<Memento> mementos;
    private ImageEditor imageEditor;

    public ImageEditorBackupManager(ImageEditor imageEditor) {
        this.mementos = new Stack<>();
        this.imageEditor = imageEditor;
    }

    public void backup() {
        this.mementos.push(this.imageEditor.save());
        System.out.println("ImageEditor status saved");
    }

    public void undo() {
        if (this.mementos.isEmpty()) {
            System.out.println("Backup: No Mementos");
        } else {
            Memento memento = this.mementos.pop();
            this.imageEditor.restore(memento);
            System.out.println(String.format("Backup: %s was successfully restored", memento.getName()));
        }
    }

    public void showMementos() {
        ArrayList<Memento> mementos = (ArrayList<Memento>) this.mementos.stream().toList();
        for (Memento m : mementos) {
            System.out.println(m.getName());
        }
    }

}
