package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {
    CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

    @Test
    void testincreaseSales() {
        emp.increaseSales(-5);
        emp.increaseSales(10);
        assertEquals(10, emp.getSales());
    }

    @Test
    void testAnnualRaise() {
        //USE TWICE
        emp.annualRaise();
        emp.annualRaise();
        assertEquals(.0305, emp.getRate());
    }

    @Test
    void testholidayBonus() {
        assertEquals(0, emp.holidayBonus());
    }
}