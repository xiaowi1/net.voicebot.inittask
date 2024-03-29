package net.voicebot.inittask.engine;

import net.voicebot.inittask.readers.JsonTestReader;
import net.voicebot.inittask.readers.Reader;

import static net.voicebot.inittask.common.ProjectConstants.PATH_TO_JSON;


public class MainJson extends SumCalculator {
    public static void main(String[] args) {
        Reader jsonReader = new JsonTestReader();
        Engine engine = new Engine();
        engine.runCalculations(jsonReader, PATH_TO_JSON);
    }
}