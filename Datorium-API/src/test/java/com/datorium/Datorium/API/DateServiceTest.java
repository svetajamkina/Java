package com.datorium.Datorium.API;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Calendar;

public class DateServiceTest {

    @Test
    void WHEN_AskingIsWeekend_THEN_Return_Result(){
        //Arrange
        var dateService = new DateService();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.SEPTEMBER, 19);
        //Act
        var isWeekend = dateService.IsWeekend(calendar);

        //Assert
        Assert.isTrue(!isWeekend, "This was not supposed to be a weekend!");
    }

    @Test
    void GIVEN_ItIsSaturday_WHEN_CallingIsWeekend_THEN_ReturnTrue(){
        //Arrange
        var dateService = new DateService();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.SEPTEMBER, 21);
        //Act
        var isWeekend = dateService.IsWeekend(calendar);

        //Assert
        Assert.isTrue(isWeekend, "This was supposed to be a weekend!");
    }

    @Test
    void GIVEN_ItIsSunday_WHEN_CallingIsWeekend_THEN_ReturnTrue(){
        //Arrange
        var dateService = new DateService();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.SEPTEMBER, 22);
        //Act
        var isWeekend = dateService.IsWeekend(calendar);

        //Assert
        Assert.isTrue(isWeekend, "This was supposed to be a weekend!");
    }

}