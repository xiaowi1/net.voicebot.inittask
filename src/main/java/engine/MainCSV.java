package engine;

import employee.Employee;
import readers.ExcelReader;

import java.util.List;

public class MainCSV extends SumPrinter {
    public static void main(String[] args) {

        ExcelReader excelReader = new ExcelReader();
        List<Employee> employees = excelReader.ExcelTestReader();
        SumPrinter(employees);

    }
}
