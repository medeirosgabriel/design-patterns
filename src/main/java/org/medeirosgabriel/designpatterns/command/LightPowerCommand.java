package org.medeirosgabriel.designpatterns.command;

public class LightPowerCommand implements SmartHouseCommand {

    private SmartHouseLight light;

    public LightPowerCommand(SmartHouseLight light) {
         this.light = light;
    }

    @Override
    public void execute() {
        if (this.light.getIsOn()) {
            System.out.println("The light is already On!");
        } else {
            this.light.on();
            System.out.println("The light is On!");
        }
    }

    @Override
    public void undo() {
        if (!this.light.getIsOn()) {
            System.out.println("The light is already Off!");
        } else {
            this.light.off();
            System.out.println("The light is Off!");
        }
    }
}
