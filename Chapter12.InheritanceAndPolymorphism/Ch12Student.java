/**
 * Chapter 13 Sample Program: Student
 */

public class Ch12Student {
    protected final static int NUM_OF_TESTS = 3;

    protected String name;

    protected int[] test;

    protected String courseGrade;

    public Ch12Student() {
        this("No name");
    }

    public Ch12Student(String studentName) {
        name = studentName;
        test = new int[NUM_OF_TESTS];
        courseGrade = "*****";
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public String getName() {
        return name;
    }

    public int getTestScore(int testNum) {
        return test[testNum - 1];
    }

    public void setName(String studentName) {
        name = studentName;
    }

    public void setTestScore(int testNumber, int testScore) {
        test[testNumber - 1] = testScore;
    }
}