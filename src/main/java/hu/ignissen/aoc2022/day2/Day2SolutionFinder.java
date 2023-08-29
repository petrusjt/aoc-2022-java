package hu.ignissen.aoc2022.day2;

import hu.ignissen.aoc2022.common.SolutionFinder;

import java.util.Arrays;

public class Day2SolutionFinder extends SolutionFinder {

    @Override
    protected int findSolution(final String input) {
        return Arrays.stream(input.split("\\n"))
                .mapToInt(match -> {
                    final var chosenSymbols = match.split(" ");
                    final var opponentSymbol = Symbol.from(chosenSymbols[0]);
                    final var playerSymbol = Symbol.from(chosenSymbols[1]);
                    if (playerSymbol.doesBeat(opponentSymbol)) {
                        return 6 + playerSymbol.getValue();
                    } else if (playerSymbol == opponentSymbol) {
                        return 3 + playerSymbol.getValue();
                    } else {
                        return playerSymbol.getValue();
                    }
                })
                .sum();
    }

    @Override
    protected int findPartTwoSolution(final String input) {
        return Arrays.stream(input.split("\\n"))
                .mapToInt(match -> {
                    final var opponentSymbolAndOutcome = match.split(" ");
                    final var opponentSymbol = Symbol.from(opponentSymbolAndOutcome[0]);
                    final var outcome = Outcome.from(opponentSymbolAndOutcome[1]);
                    if (outcome == Outcome.WIN) {
                        return outcome.getValue() + opponentSymbol.getSuperiorSymbol().getValue();
                    } else if (outcome == Outcome.DRAW) {
                        return outcome.getValue() + opponentSymbol.getValue();
                    } else {
                        return outcome.getValue() + opponentSymbol.getInferiorSymbol().getValue();
                    }
                })
                .sum();
    }

    @Override
    protected String getInputFileName() {
        return "day-2-input.txt";
    }
}
