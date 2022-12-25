package Lesson4Git;

public class Task2G {
    public static void main(String[] args) {
        double depositAmount = 1500.0;
        double annualDepositPercent = 7.0;
        int depositTerm = 5;
        final int ONE_HUNDRED_PERCENT = 100;
        double totalDepositAmount = depositAmount;
        for (int i = 1; i <= depositTerm; i++) {
            totalDepositAmount += totalDepositAmount * annualDepositPercent / ONE_HUNDRED_PERCENT;
        }
        System.out.println(Math.round(totalDepositAmount * 100.00) / 100.00);
    }
}
