package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        System.out.println(1);
        for (int i = 1; i <= printToInclusive; i++) {
            int a = 1;
            for (int j = 1; j <= i; j++) {
                a *= j;
            }
            System.out.println(a);
        }
    }
}
