package main.task;

public class GradesUtils {

    public static int[] getFailingGrades(int[] grades) {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 40) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 40) {
                result[index++] = grades[i];
            }
        }

        return result;
    }

    public static double getAverage(int[] grades) {
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        double average = (double) sum / grades.length;
        return Math.round(average * 100.0) / 100.0;
    }

    private static int roundGrade(int grade) {
        if (grade < 38) {
            return grade;
        }

        int remainder = grade % 5;
        int nextMultiple = grade + (5 - remainder);

        if (nextMultiple - grade < 3) {
            return nextMultiple;
        } else {
            return grade;
        }
    }

    public static int[] getRoundedGrades(int[] grades) {
        int[] result = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            result[i] = roundGrade(grades[i]);
        }

        return result;
    }

    public static int getMaxRoundedGrade(int[] grades) {
        int max = 0;

        for (int i = 0; i < grades.length; i++) {
            int rounded = roundGrade(grades[i]);
            if (rounded > max) {
                max = rounded;
            }
        }

        return max;
    }

}
