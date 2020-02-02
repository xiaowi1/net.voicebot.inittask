package net.voicebot.inittask.engine;

import net.voicebot.inittask.employee.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumCalculatorTest {

    @Test
    public void putOnlyTeachersAndExpectOneMapEntry() {
        List<Employee> employees = Arrays.asList(
                new Employee(1L,"any", "any", "Teacher", "100"),
                new Employee(1L,"any", "any", "Teacher", "100"),
                new Employee(1L,"any", "any", "Teacher", "100"),
                new Employee(1L,"any", "any", "Teacher", "100")
        );

        Map<String, BigDecimal> calculateResult = SumCalculator.calculate(employees);

        Map<String, BigDecimal> expectResult = new HashMap<>();
        expectResult.put("Teacher", BigDecimal.valueOf(400).setScale(2, RoundingMode.HALF_UP));

        Assert.assertEquals(calculateResult.size(), 1);
        Assert.assertEquals(calculateResult, expectResult);
    }

//    @Test
//    public void namasdfasdfe() {
//        List<Employee> employees = Arrays.asList(
//                new Employee(1L,"any", "any", "Teacher", "100"),
//                new Employee(1L,"any", "any", "Teacher", "100"),
//                new Employee(1L,"any", "any", "Teacher", "100"),
//                new Employee(1L,"any", "any", "Teacher", "100")
//        );
//
//        Map<String, BigDecimal> calculateResult = SumCalculator.calculate(employees);
//
//        Map<String, BigDecimal> expectResult = new HashMap<>();
//        expectResult.put("Teacher", BigDecimal.valueOf(400).setScale(2, RoundingMode.HALF_UP));
//        expectResult.put("", BigDecimal.valueOf(400).setScale(2, RoundingMode.HALF_UP));
//
//        Assert.assertEquals(calculateResult, expectResult);
//
//    }
}
