package weekTwelve.fileIO;

public class Move {
    // Fields/variables
    private String moveName;
    private int movePower;
    private int moveSpeed;
    // <Place comments here>
    public Move(String moveName, int movePower, int moveSpeed) {
        this.moveName = moveName;
        this.movePower = movePower;
        this.moveSpeed = moveSpeed;
    }
    // Behaviors
    public String getMoveName() {
        return moveName;
    }
    public int getMovePower() {
        return movePower;
    }
    public int getMoveSpeed() {
        return moveSpeed;
    }
    // <Run-time polymorphism (aka overriding)
    @Override
    public String toString() {
        return String.format("Move: %s\n" + "Power: %d\n" + "Speed: %d\n", moveName, movePower, moveSpeed);
    }
}
