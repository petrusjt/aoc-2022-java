package hu.ignissen.aoc2022;

import hu.ignissen.aoc2022.day1.Day1SolutionFinder;
import hu.ignissen.aoc2022.day2.Day2SolutionFinder;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Day1SolutionFinder().findSolution());
        System.out.println(new Day1SolutionFinder().findPartTwoSolution());
        System.out.println(new Day2SolutionFinder().findSolution());
        System.out.println(new Day2SolutionFinder().findPartTwoSolution());
    }
}
