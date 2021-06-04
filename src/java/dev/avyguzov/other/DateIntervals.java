package dev.avyguzov.other;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DateIntervals {
    public static List<String> solution(String period, String startDate, String endDate) throws Exception {
        ArrayList<String> result = new ArrayList<>();
        Predicate<LocalDate> specificPredicate;
        switch (period) {
            case "WEEK":
                specificPredicate = weekTest();
                break;
            case "MONTH":
                specificPredicate = monthTest();
                break;
            case "YEAR":
                specificPredicate = yearTest();
                break;
            case "REVIEW":
                specificPredicate = reviewTest();
                break;
            default:
                throw new Exception("Не знаю такого периода!");
        }

        String[] startDateString = startDate.split("-");
        String[] endDateString = endDate.split("-");
        LocalDate start = LocalDate.of(Integer.parseInt(startDateString[0]), Integer.parseInt(startDateString[1]), Integer.parseInt(startDateString[2]));
        LocalDate end = LocalDate.of(Integer.parseInt(endDateString[0]), Integer.parseInt(endDateString[1]), Integer.parseInt(endDateString[2]));

        LocalDate currentDate = start;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        while (!currentDate.isAfter(end)) {
            if (currentDate.equals(end) && !specificPredicate.test(currentDate)) {
                result.add(formatter.format(start) + " " + formatter.format(currentDate));
            } else if (specificPredicate.test(currentDate)) {
                result.add(formatter.format(start) + " " + formatter.format(currentDate));
                start = currentDate.plusDays(1);
            }
            currentDate = currentDate.plusDays(1);
        }

        return result;
    }

    public static Predicate<LocalDate> weekTest() {
        return localDate -> localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }

    public static Predicate<LocalDate> monthTest() {
        return localDate -> localDate.equals(localDate.withDayOfMonth(localDate.lengthOfMonth()));
    }

    public static Predicate<LocalDate> yearTest() {
        return localDate -> localDate.equals(localDate.withDayOfYear(localDate.lengthOfYear()));
    }

    public static Predicate<LocalDate> reviewTest() {
        return localDate -> localDate.equals(LocalDate.of(localDate.getYear(), Month.SEPTEMBER, 30)) ||
                localDate.equals(LocalDate.of(localDate.getYear(), Month.MARCH, 31));
    }

    public static void main(String[] args) {

    }
}
