package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryEmployeeTest {
    SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);

    @Test
    void testCalculateWeeklyPay() {
        assertEquals(1237.02, emp.calculateWeeklyPay());
    }

    @Test
    void testHolidayBonus() {

        assertEquals(2164.54, emp.holidayBonus());
    }
}