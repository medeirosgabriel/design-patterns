package org.medeirosgabriel.designpatterns.command;

public class LightIntensityCommand implements SmartHouseCommand {

    private SmartHouseLight light;

    public LightIntensityCommand(SmartHouseLight light) {
         this.light = light;
    }

    @Override
    public void execute() {
        int intensity = this.light.increaseIntensity();
        System.out.println("Intensity: " + intensity);
    }

    @Override
    public void undo() {
        int intensity = this.light.decreaseIntensity();
        System.out.println("Intensity: " + intensity);
    }
}
