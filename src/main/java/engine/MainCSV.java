package engine;

import employee.Employee;
import readers.ExcelReader;

import java.util.List;

import static engine.SumPrinter.print;

public class MainCSV extends SumCalculator {
    public static void main(String[] args) {

        ExcelReader excelReader = new ExcelReader();
        List<Employee> employees = excelReader.excelTestReader();
        print(calculate(employees));

    }
}
