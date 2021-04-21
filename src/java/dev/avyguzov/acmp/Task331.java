package dev.avyguzov.acmp;

import java.util.Scanner;

// https://acmp.ru/index.asp?main=task&id_task=331
public class Task331 {
    public static String solution(String departureTime, String travelTime) {
        String[] departureTimeArr = departureTime.split(":");
        int departureInMinutes = Integer.parseInt(departureTimeArr[0]) * 60 + Integer.parseInt(departureTimeArr[1]);
        String[] travelTimeArr = travelTime.split(" ");
        int minutesInTravel = Integer.parseInt(travelTimeArr[0]) * 60 + Integer.parseInt(travelTimeArr[1]);

        int resultInMinutes = minutesInTravel + departureInMinutes;
        int resultHour = resultInMinutes / 60 % 24;
        int resultMinutes = resultInMinutes % 60;

        return (resultHour < 10 ? "0" + resultHour : resultHour) + ":"
                + (resultMinutes < 10 ? "0" + resultMinutes : resultMinutes);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String departureTime = s.nextLine();
        String travelTime = s.nextLine();

        System.out.println(solution(departureTime, travelTime));
        s.close();
    }
}
