package org.medeirosgabriel.designpatterns.memento;

import java.util.Date;

public class ImageEditor {

    private String filePath;
    private String fileFormat;

    public ImageEditor(String filePath, String fileFormat) {
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }

    public void convertFormatTo(String format) {
        this.fileFormat = format;
        String newFilePath = this.filePath.split("[.]")[0] + String.format(".%s", this.fileFormat);
        this.filePath = newFilePath;
    }

    public Memento save() {
        Date date = new Date();
        String[] words = this.filePath.split("/");
        String name = words[words.length - 1].split("[.]")[0];
        return new ConcreteMemento(name, date, this.filePath, this.fileFormat);
    }

    public void restore(Memento memento) {
        ConcreteMemento concreteMemento = (ConcreteMemento) memento;
        this.filePath = concreteMemento.getFilePath();
        this.fileFormat = concreteMemento.getFileFormat();
    }

    @Override
    public String toString() {
        return "ImageEditor{" +
                "filePath='" + filePath + '\'' +
                ", fileFormat='" + fileFormat + '\'' +
                '}';
    }
}
