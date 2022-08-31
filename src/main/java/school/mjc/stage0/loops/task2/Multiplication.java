package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive != 0) {
            int a = 0;
            for (int i = 0; i <= Math.abs(multiplyByAndToInclusive); i++) {
                System.out.println(a);
                a += multiplyByAndToInclusive;
            }
        }
    }
}
