public class Ch13UndergraduateStudent extends Ch13Student {
    public void computeCourseGrade() {
        int total = 0;

        for (int i = 0; i < NUM_OF_TESTS; i++) {
            total += test[i];
        }

        if (total / NUM_OF_TESTS >= 70) {
            courseGrade = "Pass";
        } else {
            courseGrade = "Fail";
        }
    }
}
