package Game_Control_Mechanism;

 class EasyLevel implements LevelStrategy {
    public boolean canJump() {
        return true; //Every character can jump easily
    }
}

 class HardLevel implements LevelStrategy {
    public boolean canJump() {
        return Math.random() > 0.7; // Jumping is harder
    }
}
