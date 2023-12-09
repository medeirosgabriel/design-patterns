package org.medeirosgabriel.designpatterns.command;

import java.util.*;

public class SmartHouseApp {

    private Map<String, SmartHouseCommand> commands;

    public SmartHouseApp() {
        this.commands = new HashMap<>();
    }

    public void addCommand(String name, SmartHouseCommand command) {
        this.commands.put(name, command);
    }

    public void executeCommand(String name) {
        this.commands.get(name).execute();
    }

    public void undoCommand(String name) {
        this.commands.get(name).undo();
    }
}
