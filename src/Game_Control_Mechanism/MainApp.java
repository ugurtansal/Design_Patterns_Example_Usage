package Game_Control_Mechanism;

public class MainApp {
    public static void main(String[] args) {
        GameCharacter mario = new GameCharacter();

        // Level chosen
        LevelStrategy strategy = new HardLevel();
        GameEngine engine = new GameEngine(strategy);

        // Commands are added to the engine
        engine.addCommand(new WalkCommand());
        engine.addCommand(new RunCommand());
        engine.addCommand(new JumpCommand()); //this will fail if the level does not allow jumping
        engine.addCommand(new WalkCommand());

        //Game is run
        engine.run(mario);
    }
}
