package engine;

import readers.JsonTestReader;
import readers.Reader;

import static common.ProjectConstants.PATH_TO_JSON;


public class MainJson extends SumCalculator {
    public static void main(String[] args) {
        Reader jsonReader = new JsonTestReader();
        Engine engine = new Engine();
        engine.runCalculations(jsonReader, PATH_TO_JSON);
    }
}