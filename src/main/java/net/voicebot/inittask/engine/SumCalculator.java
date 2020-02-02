package net.voicebot.inittask.engine;

import net.voicebot.inittask.employee.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumCalculator {

    public static Map<String, BigDecimal> calculate(List<Employee> employees) {
        //creating empty map
        Map<String, BigDecimal> workingmap = new HashMap<>();

        //initializing the map with zeros instead of nulls
        employees.forEach(c -> workingmap.put(c.getJob(), BigDecimal.ZERO));

        //parsing the salaries to doubles and adding them to the map using 'job' as a key
        employees.forEach(c -> workingmap.put(c.getJob(),
                workingmap.get(c.getJob()).add(
                BigDecimal.valueOf(Double.parseDouble(c.getSalary().replace(',', '.')))).setScale(2, RoundingMode.HALF_UP)
                ));

        return workingmap;
    }
}
