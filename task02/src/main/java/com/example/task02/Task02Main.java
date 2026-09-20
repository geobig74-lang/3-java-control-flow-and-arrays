package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(12));

    }

    static String getSeason(int monthNumber) {
        String[] seasons = {"зима", "весна", "лето", "осень"};
        int s = monthNumber % 12;
        return seasons[s / 3];
    }
}