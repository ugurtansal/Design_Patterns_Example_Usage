package Smart_Home_System;

 class TurnOnCommand implements Command {
    private SmartDevice device;

    public TurnOnCommand(SmartDevice device) {
        this.device = device;
    }

    public void execute() {
        device.turnOn();
    }
}

 class TurnOffCommand implements Command {
    private SmartDevice device;

    public TurnOffCommand(SmartDevice device) {
        this.device = device;
    }

    public void execute() {
        device.turnOff();
    }
}
