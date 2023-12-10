package org.medeirosgabriel.designpatterns.memento;

import java.util.Date;

public class ConcreteMemento implements Memento {

    private String name;
    private Date date;
    private String filePath;
    private String fileFormat;

    public ConcreteMemento(String name, Date date, String filePath, String fileFormat) {
        this.name = name;
        this.date = date;
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return this.fileFormat;
    }

    public String getFilePath() {
        return this.filePath;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Date getDate() {
        return this.date;
    }
}
