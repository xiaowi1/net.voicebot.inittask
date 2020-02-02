package engine;

import employee.Employee;
import readers.Reader;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static common.ProjectConstants.PATH_TO_JSON;
import static engine.SumCalculator.calculate;
import static engine.SumPrinter.print;

public class Engine {
    public void runCalculations(Reader reader, String pathToFile) {
        List<Employee> employees = reader.read(pathToFile);
        Map<String, BigDecimal> calculateResult = calculate(employees);

        print(calculateResult);
    }
}
