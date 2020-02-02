package engine;

import readers.ExcelReader;
import readers.Reader;

import static common.ProjectConstants.PATH_TO_CSV;
import static common.ProjectConstants.PATH_TO_JSON;

public class MainCSV extends SumCalculator {
    public static void main(String[] args) {
        Reader excelReader = new ExcelReader();
        Engine engine = new Engine();
        engine.runCalculations(excelReader, PATH_TO_CSV);
    }
}
