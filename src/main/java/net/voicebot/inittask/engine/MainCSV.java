package net.voicebot.inittask.engine;

import net.voicebot.inittask.readers.CSVReader;
import net.voicebot.inittask.readers.Reader;

import static net.voicebot.inittask.common.ProjectConstants.PATH_TO_CSV;

public class MainCSV extends SumCalculator {
    public static void main(String[] args) {
        Reader excelReader = new CSVReader();
        Engine engine = new Engine();
        engine.runCalculations(excelReader, PATH_TO_CSV);
    }
}
