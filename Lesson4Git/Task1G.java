package Lesson4Git;

public class Task1G {
    public static void main(String[] args) {
        int rows = 10;
        String number = "";
        for (int i = 1; i <= rows; i++) {
            if (i < rows) {
                number += i + "\n";
            } else {
                number += i;
            }
        } System.out.println(number);
    }
}
