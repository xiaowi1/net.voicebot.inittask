package net.voicebot.inittask.engine;

import net.voicebot.inittask.employee.Employee;
import net.voicebot.inittask.readers.Reader;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


public class Engine {
    public void runCalculations(Reader reader, String pathToFile) {
        List<Employee> employees = reader.read(pathToFile);
        SumCalculator sumCalculator = new SumCalculator();
        Map<String, BigDecimal> calculateResult = sumCalculator.calculate(employees);
        SumPrinter sumPrinter = new SumPrinter();
        sumPrinter.print(calculateResult);
    }
}
