package org.medeirosgabriel.designpatterns.command;

public class SmartHouseLight {
    private boolean isOn = false;
    private String name;
    private int intensity = 50;

    public SmartHouseLight(String name) {
        this.name = name;
    }

    public String getPowerStatus() {
        return this.isOn ? "On" : "Off";
    }

    public boolean on() {
        this.isOn = true;
        return this.isOn;
    }

    public boolean off() {
        this.isOn = false;
        return this.isOn;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public int increaseIntensity() {
        if (this.intensity <= 100) {
            this.intensity ++;
        }
        return this.intensity;
    }

    public int decreaseIntensity() {
        if (this.intensity >= 0) {
            this.intensity --;
        }
        return this.intensity;
    }
}
