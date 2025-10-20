package main.app;

import main.task.GradesUtils;
import java.util.Arrays;

public class Main {

    static void main() {
        IO.println("\n------- Aufgabe 1 -------");
        int[] grades = {29, 37, 38, 41, 84, 67};
        IO.println(Arrays.toString(GradesUtils.getFailingGrades(grades)));
        IO.println(GradesUtils.getAverage(grades));
        IO.println(Arrays.toString(GradesUtils.getRoundedGrades(grades)));
        IO.println(GradesUtils.getMaxRoundedGrade(grades));
    }

}
