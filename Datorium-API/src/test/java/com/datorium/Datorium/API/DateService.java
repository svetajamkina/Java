package com.datorium.Datorium.API;

import java.util.Calendar;

public class DateService {

    public boolean IsWeekend(Calendar calendar){
        // 1. Get the date - > day
        // 2. Check whether or not this day -> saturday or sunday

        var currentDay = calendar.get(Calendar.DAY_OF_WEEK);

        return (currentDay == Calendar.SATURDAY || currentDay == Calendar.SUNDAY);
    }
}