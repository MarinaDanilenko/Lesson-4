package Lesson4;

public class Task4 {
    public static void main(String[] args) {
        int firstMultiplier = 1;
        int secondMultiplier = 1;
        while (firstMultiplier <= 10) {
            while (secondMultiplier <= 10) {
                System.out.println(firstMultiplier * secondMultiplier + " ");
                firstMultiplier++;
                secondMultiplier++;
            }
            System.out.println();
        }
    }
}

