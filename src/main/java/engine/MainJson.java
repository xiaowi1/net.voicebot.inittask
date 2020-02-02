package engine;

import employee.Employee;
import readers.JsonTestReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainJson {
    public static void main(String[] args) {
        JsonTestReader jsonreader = new JsonTestReader();
        List<Employee> employees = jsonreader.JsonTestReader();

        //creating empty map
        Map<String, Double> workingmap = new HashMap<>();

        //initializing the map with zeros instead of nulls
        employees.forEach(c -> workingmap.put(c.getJob(),0.0));

        //parsing the salaries to doubles and adding them to the map using 'job' as a key
        employees.forEach(c -> workingmap.put(c.getJob(),
                Double.parseDouble(c.getSalary().replace(',','.'))+workingmap.get(c.getJob())));

        //prining the sums
        System.out.println(workingmap.entrySet());
    }
}
