public class GradeCalculator {

    public static double calculateAverage(double[] marks) {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }

    public static double findHighest(double[] marks) {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        double highest = marks[0];
        for (double mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }

    public static double findLowest(double[] marks) {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        double lowest = marks[0];
        for (double mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }
        return lowest;
    }

    // Grade boundaries: A = 90-100, B = 80-89.99,
    // C = 70-79.99, D = 60-69.99, F = below 60.
    public static String getGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
