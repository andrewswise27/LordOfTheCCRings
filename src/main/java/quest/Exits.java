package quest;

public enum Exits {

    NORTH,
    SOUTH,
    EAST,
    WEST;

    public static Exits getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
