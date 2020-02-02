package net.voicebot.inittask.readers;

import net.voicebot.inittask.employee.Employee;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonTestReader implements Reader{

    @Override
    public List<Employee> read(String pathToFile){
        JSONParser jsonParser = new JSONParser();
        ClassLoader classLoader = JsonTestReader.class.getClassLoader();
        File f = new File(classLoader.getResource(pathToFile).getFile());

        List<Employee> emplist = new ArrayList<>();

        try (FileReader reader = new FileReader(f)) {

            //Read JSON file
            JSONObject obj = (JSONObject) jsonParser.parse(reader);
            JSONArray employees = (JSONArray) obj.get("employees");

            //printing out employees
            //System.out.println(employees);

            //Iterate over net.voicebot.inittask.employee array
            employees.forEach(emp -> parseEmployeeObject((JSONObject) emp, emplist));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return emplist;
    }

    private void parseEmployeeObject(JSONObject employee, List emplist) {
        Employee emp = new Employee(
                (Long) employee.get("id"),
                (String) employee.get("name"),
                (String) employee.get("surname"),
                (String) employee.get("job"),
                (String) employee.get("salary")
        );
        emplist.add(emp);
    }
}
