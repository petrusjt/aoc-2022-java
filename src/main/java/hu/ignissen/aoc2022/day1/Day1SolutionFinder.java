package hu.ignissen.aoc2022.day1;

import hu.ignissen.aoc2022.common.SolutionFinder;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Comparator;

public class Day1SolutionFinder extends SolutionFinder {

    private static final String INPUT_FILE_NAME = "day-1-input.txt";

    @Override
    protected int findSolution(final String input) {
        return Arrays.stream(input.split("\\n{2}"))
                .map(elfString -> Arrays.stream(elfString.split("\\n"))
                        .filter(StringUtils::isNotBlank)
                        .map(String::strip)
                        .mapToInt(Integer::valueOf)
                        .sum()
                )
                .max(Integer::compare)
                .orElseThrow();
    }

    @Override
    public int findPartTwoSolution(final String input) {
        return Arrays.stream(input.replace("\r", "").split("\\n{2}"))
                .map(elfString -> Arrays.stream(elfString.split("\\n"))
                        .filter(StringUtils::isNotBlank)
                        .map(String::strip)
                        .mapToInt(Integer::valueOf)
                        .sum()
                )
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToInt(it -> it)
                .sum();
    }

    @Override
    protected String getInputFileName() {
        return INPUT_FILE_NAME;
    }
}
