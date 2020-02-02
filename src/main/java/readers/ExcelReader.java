package readers;

import employee.Employee;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {

    public List<Employee> ExcelTestReader() {

        String csvFile = "../net.voicebot.inittask/src/main/resources/employees(2).csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        List<Employee> employeeList2 = new ArrayList<>();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] emp = line.split(cvsSplitBy);
                //ignoring the first line
                if (emp[0].equals("id")) {
                    continue;
                }
                //creating employees and adding them to the list
                employeeList2.add(new Employee(Long.valueOf(emp[0].strip())
                        , emp[1].strip().substring(1, emp[1].strip().length() - 1)
                        , emp[2].strip().substring(1, emp[2].strip().length() - 1)
                        , emp[3].strip().substring(1, emp[3].strip().length() - 1)
                        , emp[4].strip().substring(1, emp[4].strip().length() - 1)));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//          printing employees:
//        employeeList2.forEach(z -> {
//            System.out.print(z.getName() + " ");
//            System.out.print(z.getJob()  + " ");
//            System.out.print(z.getSalary()  + " ");
//        });
        return employeeList2;
    }

}