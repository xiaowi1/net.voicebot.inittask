package net.voicebot.inittask.engine;

import net.voicebot.inittask.employee.Employee;
import net.voicebot.inittask.readers.Reader;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static net.voicebot.inittask.engine.SumCalculator.calculate;
import static net.voicebot.inittask.engine.SumPrinter.print;

public class Engine {
    public void runCalculations(Reader reader, String pathToFile) {
        List<Employee> employees = reader.read(pathToFile);
        Map<String, BigDecimal> calculateResult = calculate(employees);

        print(calculateResult);
    }
}
