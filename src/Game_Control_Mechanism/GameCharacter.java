package Game_Control_Mechanism;

public class GameCharacter {
    private CharacterState state;

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void behave() {
        state.handle();
    }
}
