package org.example.light;

public class Light {

    private boolean isOn;
    private int brightness = 0;

    public Light() {
        this.isOn = false;
        this.brightness = 0;

    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("The light is turned on ");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("The light is turned off ");
        }
    }

    public void dim() {
        if (isOn && brightness > 50) {
            brightness = 50;
            System.out.println("The light is now dimmed with a brightness of : " + brightness);
        }
    }
    public void brighten() {
        if (isOn && brightness < 100) {
            brightness = 100;
            System.out.println("The light is now brighten with a brightness of : " + brightness);
        }
    }
    public boolean isOn() {
        return isOn;
    }

    public int getBrightness() {
        return brightness;
    }
}


