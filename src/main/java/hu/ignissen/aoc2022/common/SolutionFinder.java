package hu.ignissen.aoc2022.common;

import hu.ignissen.aoc2022.exception.CustomException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public abstract class SolutionFinder {

    public final int findSolution() {
        final var input = getInput(getInputFileName());
        return findSolution(input);
    }

    public final int findPartTwoSolution() {
        final var input = getInput(getInputFileName());
        return findPartTwoSolution(input);
    }

    protected abstract int findSolution(final String input);

    protected int findPartTwoSolution(final String input) {
        throw new UnsupportedOperationException();
    }

    private String getInput(final String fileName) {
        try {
            return new String(Objects.requireNonNull(getClass().getClassLoader()
                    .getResourceAsStream(fileName)).readAllBytes(), StandardCharsets.UTF_8).replace("\r", "");
        } catch (IOException e) {
            throw new CustomException(e);
        }
    }

    protected abstract String getInputFileName();
}
