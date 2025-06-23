package Smart_Home_System;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeFacade {
    private List<Command> morningCommands = new ArrayList<>();
    private List<Command> nightCommands = new ArrayList<>();

    public void addMorningCommand(Command command) {
        morningCommands.add(command);
    }

    public void addNightCommand(Command command) {
        nightCommands.add(command);
    }

    public void activateMorningMode() {
        System.out.println("\n Morning mode activated:");
        for (Command c : morningCommands) c.execute();
    }

    public void activateNightMode() {
        System.out.println("\n Night mode activated:");
        for (Command c : nightCommands) c.execute();
    }
}
