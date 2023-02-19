package sg.com.fairtech.springrest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sg.com.fairtech.springrest.payroll.Employee;

@SpringBootTest(classes = EmployeeTest.class)
public class EmployeeTest {

    @Test
    void employeeTest() {
        Employee employee = new Employee("Gilbert", "HG", "Programmer");

        Assertions.assertEquals(employee.getFirstName(), "Gilbert");
        Assertions.assertEquals(employee.getLastName(), "HG");
        Assertions.assertEquals(employee.getRole(), "Programmer");
    }

}
