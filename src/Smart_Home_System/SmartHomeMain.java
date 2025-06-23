package Smart_Home_System;

public class SmartHomeMain {
    public static void main(String[] args) {
        // Cihazlar
        SmartDevice light = new SmartDevice("Lamba");
        SmartDevice curtain = new SmartDevice("Perde");
        SmartDevice tv = new SmartDevice("TV");

        // Komutlar
        Command lightOn = new TurnOnCommand(light);
        Command lightOff = new TurnOffCommand(light);

        Command curtainOn = new TurnOnCommand(curtain);
        Command curtainOff = new TurnOffCommand(curtain);

        Command tvOn = new TurnOnCommand(tv);
        Command tvOff = new TurnOffCommand(tv);

        // Facade
        SmartHomeFacade home = new SmartHomeFacade();
        home.addMorningCommand(lightOn);
        home.addMorningCommand(curtainOn);
        home.addMorningCommand(tvOn);

        home.addNightCommand(lightOff);
        home.addNightCommand(curtainOff);
        home.addNightCommand(tvOff);


        home.activateMorningMode();
        home.activateNightMode();
    }
}
