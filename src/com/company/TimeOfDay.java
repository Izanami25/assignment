package com.company;

public class TimeOfDay extends City {
    int hour;
    int minute;
    int minutesFromDayStart;
    public TimeOfDay(int minutesFromDayStart){
        this.minutesFromDayStart = minutesFromDayStart;
    }
    public void showcity(){
        System.out.println("Petropavlovsk");
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    boolean a = true;

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getMinutesFromDayStart() {
        return minutesFromDayStart;
    }
    public boolean isAM(){
        if(getHour()<=12 && getHour()>=0){
            return true;
        }
        else{
            return false;
        }
    }
}
