package main.task;

public class GradeUtils {

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

}
