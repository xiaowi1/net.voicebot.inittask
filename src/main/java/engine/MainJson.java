package engine;

import employee.Employee;
import readers.JsonTestReader;
import java.util.List;


public class MainJson extends SumPrinter{
    public static void main(String[] args) {
        JsonTestReader jsonreader = new JsonTestReader();
        List<Employee> employees = jsonreader.JsonTestReader();
        SumPrinter(employees);

    }
}
