package Game_Control_Mechanism;

import java.util.ArrayList;
import java.util.List;

public class GameEngine {
    private List<Command> commandQueue = new ArrayList<>();
    private LevelStrategy strategy;

    public GameEngine(LevelStrategy strategy) {
        this.strategy = strategy;
    }

    public void addCommand(Command command) {
        // Apply only for JumpCommand
        if (command instanceof JumpCommand && !strategy.canJump()) {
            System.out.println(" You can't jump in this level!");
            return;
        }
        commandQueue.add(command);
    }

    public void run(GameCharacter character) {
        for (Command cmd : commandQueue) {
            cmd.execute(character);
        }
        commandQueue.clear();
    }
}
