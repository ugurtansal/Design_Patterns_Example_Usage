package Smart_Home_System;

public class SmartDevice {
    private String name;
    private DeviceState state;

    public SmartDevice(String name) {
        this.name = name;
        this.state = new OffState(); //default state
    }

    public void setState(DeviceState state) {
        this.state = state;
    }

    public void turnOn() {
        System.out.print(name + ": ");
        state.turnOn();
        setState(new OnState());
    }

    public void turnOff() {
        System.out.print(name + ": ");
        state.turnOff();
        setState(new OffState());
    }
}
