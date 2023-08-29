package hu.ignissen.aoc2022.day2;

public enum Outcome {
    WIN(6),
    LOSE(0),
    DRAW(3);

    private int value;

    Outcome(final int value) {
        this.value = value;
    }

    public static Outcome from(String string) {
        return switch (string) {
            case "Z" -> WIN;
            case "X" -> LOSE;
            case "Y" -> DRAW;
            default -> throw new IllegalArgumentException();
        };
    }

    public int getValue() {
        return value;
    }
}
