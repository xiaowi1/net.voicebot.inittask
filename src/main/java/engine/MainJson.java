package engine;

import employee.Employee;
import readers.JsonTestReader;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static engine.SumPrinter.print;


public class MainJson extends SumCalculator {
    public static void main(String[] args) {

        JsonTestReader jsonReader = new JsonTestReader();
        List<Employee> employees = jsonReader.jsonTestReader();
        Map<String, BigDecimal> calculateResult = calculate(employees);

        print(calculateResult);
    }
}