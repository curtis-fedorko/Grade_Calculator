package fedorko.curtis.myapplication.Model;

import java.util.*;
public class FGC {
    public double gradeLeft;
    Scanner sc = new Scanner(System.in);
    public double desiredgrade;

    public double whatINeed(double currgrade, double gradeWant, double percLeft) {
        percLeft = percLeft / 100;
        double percenttowards = 1 - percLeft;
        double whatyouneed = Math.abs((percenttowards * currgrade) - gradeWant) / (percLeft);
        return whatyouneed;
    }

    public double calcGradeAssignment(double[] grades, double[] percents) {
        double sumpercent = 0;
        double sumGrade = 0;
        for (int i = 0; i < grades.length; i++) {
            sumGrade += grades[i] * (percents[i] / 100);
            sumpercent += percents[i];
        }
        sumpercent /= 100;
        return (sumGrade / sumpercent);
    }

    public double calcPartOfGrade(double percofgrade, double[] grades) {
        double perceach = percofgrade / grades.length;
        double grade = 0;
        perceach /= 100;
        for (int i = 0; i < grades.length; i++) {
            grade += grades[i] * perceach;
        }
        return grade;
    }

}
