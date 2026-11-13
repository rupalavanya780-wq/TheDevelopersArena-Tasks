public class ReportGenerator {

    public static void generateReport(
            String[] studentNames,
            double[][] studentMarks,
            int studentCount,
            String[] subjects) {

        if (studentCount == 0) {
            System.out.println("\nNo student data is available for the report.");
            return;
        }

        System.out.println("\n========== PERFORMANCE REPORT ==========");
        System.out.println("Total students: " + studentCount);

        // Subject-wise averages
        System.out.println("\nSUBJECT-WISE AVERAGES");
        for (int subject = 0; subject < subjects.length; subject++) {
            double total = 0;
            for (int student = 0; student < studentCount; student++) {
                total += studentMarks[student][subject];
            }
            System.out.printf("%-15s : %.2f%n",
                    subjects[subject], total / studentCount);
        }

        // Overall class average
        double classTotal = 0;
        for (int student = 0; student < studentCount; student++) {
            classTotal += GradeCalculator.calculateAverage(studentMarks[student]);
        }
        System.out.printf("%nClass average: %.2f%n", classTotal / studentCount);

        // Grade distribution
        int a = 0, b = 0, c = 0, d = 0, f = 0;
        for (int student = 0; student < studentCount; student++) {
            String grade = GradeCalculator.getGrade(
                    GradeCalculator.calculateAverage(studentMarks[student]));

            switch (grade) {
                case "A": a++; break;
                case "B": b++; break;
                case "C": c++; break;
                case "D": d++; break;
                default: f++; break;
            }
        }

        System.out.println("\nGRADE DISTRIBUTION");
        System.out.println("A Grade: " + a);
        System.out.println("B Grade: " + b);
        System.out.println("C Grade: " + c);
        System.out.println("D Grade: " + d);
        System.out.println("F Grade: " + f);

        // Top performer
        int topIndex = 0;
        for (int student = 1; student < studentCount; student++) {
            double currentAverage =
                    GradeCalculator.calculateAverage(studentMarks[student]);
            double topAverage =
                    GradeCalculator.calculateAverage(studentMarks[topIndex]);

            if (currentAverage > topAverage) {
                topIndex = student;
            }
        }

        System.out.printf("%nTOP PERFORMER: %s (Average: %.2f, Grade: %s)%n",
                studentNames[topIndex],
                GradeCalculator.calculateAverage(studentMarks[topIndex]),
                GradeCalculator.getGrade(
                        GradeCalculator.calculateAverage(studentMarks[topIndex])));
        System.out.println("=========================================");
    }
}
