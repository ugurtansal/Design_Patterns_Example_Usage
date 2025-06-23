package Game_Control_Mechanism;

 class WalkingState implements CharacterState {
    public void handle() {
        System.out.println("Character is walking.");
    }
}

 class RunningState implements CharacterState {
    public void handle() {
        System.out.println("Character is running.");
    }
}

 class JumpingState implements CharacterState {
    public void handle() {
        System.out.println("Character is jumping.");
    }
}
