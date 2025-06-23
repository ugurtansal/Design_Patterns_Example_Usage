package Game_Control_Mechanism;


     class WalkCommand implements Command {
        public void execute(GameCharacter character) {
            character.setState(new WalkingState());
            character.behave();
        }
    }

     class RunCommand implements Command {
        public void execute(GameCharacter character) {
            character.setState(new RunningState());
            character.behave();
        }
    }

     class JumpCommand implements Command {
        public void execute(GameCharacter character) {
            character.setState(new JumpingState());
            character.behave();
        }
    }

