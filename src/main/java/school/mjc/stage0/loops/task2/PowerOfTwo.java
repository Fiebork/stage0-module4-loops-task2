package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int a = 1;
            for (int i = 0; i <= power; i++) {
                System.out.println(a);
                a *= 2;
            }
        }
    }
}
