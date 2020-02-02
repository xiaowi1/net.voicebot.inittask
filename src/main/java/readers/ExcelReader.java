package readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) {

        String csvFile = "../net.voicebot.inittask/src/main/resources/employees(2).csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] emp = line.split(cvsSplitBy);

                System.out.println("Employee [job= " + emp[3] + " , salary=" + emp[4] + "]");

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

    }

}