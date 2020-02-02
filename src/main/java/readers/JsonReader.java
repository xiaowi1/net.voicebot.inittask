package readers;

import employee.Employee;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {


    public static void main(String[] args) throws Exception {

        final String filename = "employee (2).json";

        JSONObject jsonObject = JsonFileReader(filename);
        Employee emp = new Employee(
                (Long) jsonObject.get("id"),
                (String) jsonObject.get("name"),
                (String) jsonObject.get("surname"),
                (String) jsonObject.get("job"),
                (String) jsonObject.get("salary")
        );
        System.out.println(emp.getName());

    }

    public static JSONObject JsonFileReader(String filename) throws Exception {
        ClassLoader classLoader = JsonReader.class.getClassLoader();
        File f = new File(classLoader.getResource(filename).getFile());
        JSONParser jsonParser = new JSONParser();
        return (JSONObject) jsonParser.parse(new FileReader(f));
    }
}
