package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {
    HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

    @Test
    void testIncreaseHours() {
        //negative test, doesnt run
        emp.increaseHours(-5);
        //testing postive number
        emp.increaseHours(10);
        assertEquals(10, emp.getHoursWorked());
    }

    @Test
    void testcalculateWeeklyPayReg() {
        emp.increaseHours(35);
        assertEquals(1149.75, emp.calculateWeeklyPay());
    }

    @Test
    void testcalculateWeeklyPayOvertime() {
        emp.increaseHours(45);
        double wage = emp.calculateWeeklyPay();
        assertEquals(1560.38,Math.round(wage * 100.0) / 100.0);
    }

    @Test
    void testAnnualRaise() {
        emp.annualRaise();
        assertEquals( 34.49, emp.getWage());
    }
}