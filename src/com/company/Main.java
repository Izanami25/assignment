package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TimeOfDay day = new TimeOfDay(50);
        Scanner a = new Scanner(System.in);
        day.minutesFromDayStart = a.nextInt();
        day.setHour(13);
        day.setMinute(15);
        System.out.println(day.getHour() + ":" + day.getMinute());
        day.isAM();
        if(day.isAM()){
            System.out.println("True;");
        }
        else{
            System.out.println("False;");
        }
        System.out.println("Minutes from day start: " + day.getMinutesFromDayStart());
        day.showcity();
    }
}
