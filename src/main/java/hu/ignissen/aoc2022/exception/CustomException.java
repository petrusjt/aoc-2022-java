package hu.ignissen.aoc2022.exception;

/**
 * So SonarLint would shut up about using a custom exception
 * */
public class CustomException extends RuntimeException {
    public CustomException(Exception e) {
        super(e);
    }
}
