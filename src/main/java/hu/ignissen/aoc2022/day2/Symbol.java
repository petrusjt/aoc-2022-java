package hu.ignissen.aoc2022.day2;

public enum Symbol {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private int value;

    Symbol(final int value) {
        this.value = value;
    }

    public static Symbol from(final String string) {
        return switch (string) {
            case "A", "X" -> ROCK;
            case "B", "Y" -> PAPER;
            case "C", "Z" -> SCISSORS;
            default -> throw new IllegalArgumentException();
        };
    }

    public boolean doesBeat(final Symbol symbol) {
        return symbol == getInferiorSymbol();
    }

    public Symbol getInferiorSymbol() {
        return switch (this) {
            case ROCK -> SCISSORS;
            case PAPER -> ROCK;
            case SCISSORS -> PAPER;
        };
    }

    public Symbol getSuperiorSymbol() {
        return switch (this) {
            case ROCK -> PAPER;
            case PAPER -> SCISSORS;
            case SCISSORS -> ROCK;
        };
    }

    public int getValue() {
        return value;
    }
}
