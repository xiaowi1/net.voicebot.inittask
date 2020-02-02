package readers;

import employee.Employee;

import java.util.List;

public interface Reader {
    List<Employee> read(String pathToFile);
}
