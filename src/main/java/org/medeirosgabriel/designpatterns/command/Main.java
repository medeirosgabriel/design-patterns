package org.medeirosgabriel.designpatterns.command;

import org.medeirosgabriel.designpatterns.bridge.Radio;
import org.medeirosgabriel.designpatterns.bridge.TV;

public class Main {

    public static void main(String[] args) {
        SmartHouseLight bedroomLight = new SmartHouseLight("Bedroom Light");
        SmartHouseLight bathroomLight = new SmartHouseLight("Bedroom Light");

        LightPowerCommand lightPowerCommand1 = new LightPowerCommand(bedroomLight);
        LightPowerCommand lightPowerCommand2 = new LightPowerCommand(bathroomLight);
        LightIntensityCommand lightIntensityCommand1 = new LightIntensityCommand(bedroomLight);

        SmartHouseApp app = new SmartHouseApp();
        app.addCommand("btn-1", lightPowerCommand1);
        app.addCommand("btn-2", lightPowerCommand2);
        app.addCommand("btn-3", lightIntensityCommand1);

        app.executeCommand("btn-1");
        app.executeCommand("btn-1");
        app.undoCommand("btn-2");
        
        for (int i = 0; i < 20; i++) {
            app.executeCommand("btn-3");
        }
    }
}
