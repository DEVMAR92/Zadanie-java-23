package app;

import data.CalandarConverter;

public class ConverterTest {
    public static void main(String[] args) {

        String day = CalandarConverter.convertDayToString(5);

        System.out.println(day);
    }
}
